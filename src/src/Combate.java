
import java.util.Scanner;

/**
 * CLASSE: Combate
 * CONCEITO POO: Classe com métodos estáticos (utilitária)
 * SISTEMA DE SORTE: Uso de Math.random() para dano variável
 */

public class Combate {
    
    public static void iniciar(Jogador j, Inimigo i, Scanner sc) {
        System.out.println("\n⚔️⚔️⚔️ COMBATE INICIADO ⚔️⚔️⚔️");
        System.out.println("🎯 Inimigo: " + i.getNome() + " (Vida: " + i.getVida() + ")");
        System.out.println("🎲 Sistema de sorte ativado! Dano varia aleatoriamente.\n");
        
        while (j.temEnergia() && i.estaVivo()) {
            
            System.out.println("\n[ " + i.getNome() + " ] Vida: " + i.getVida() + "/" + i.getVidaMaxima());
            System.out.println("[ Você ] Energia: " + j.getEnergia() + "/100");
            System.out.println("[ Dados ] 🎲 Força base: " + j.getForca() + " | Força total com equipamento: " + j.getForcaTotal());
            
            System.out.println("\n📋 AÇÕES:");
            System.out.println("   1 - ⚔️ Ataque Normal (dano: 1 a " + (5 + j.getForcaTotal()) + ")");
            System.out.println("   2 - 💥 Ataque Especial (dano: 2 a " + (15 + j.getForcaTotal() * 2) + ", custo 15 energia)");
            System.out.println("   3 - 🧪 Usar Item");
            System.out.println("   4 - 🏃 Fugir (chance: " + (30 + j.getDestreza() * 5) + "%)");
            System.out.println("   5 - 📊 Ver status do combate");
            System.out.print("Escolha: ");
            
            int escolha;
            try {
                escolha = Integer.parseInt(sc.next());
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada inválida!");
                continue;
            }
            
            boolean acaoRealizada = false;
            
            switch (escolha) {
                case 1:
                    // ATAQUE NORMAL COM SORTE - USANDO ForçaTotal
                    int danoBase = 5 + j.getForcaTotal();
                    int danoAtaque = 1 + (int)(Math.random() * danoBase);
                    i.receberDano(danoAtaque);
                    System.out.println("⚔️ ATAQUE NORMAL! 🎲 Dano: " + danoAtaque + " (Força base: " + j.getForca() + " + equipamento: " + (j.getForcaTotal() - j.getForca()) + ")");
                    acaoRealizada = true;
                    break;
                    
                case 2:
                    // ATAQUE ESPECIAL COM SORTE - USANDO ForçaTotal
                    if (j.getEnergia() >= 15) {
                        int danoEspecialBase = 15 + (j.getForcaTotal() * 2);
                        int danoEspecial = 2 + (int)(Math.random() * danoEspecialBase);
                        i.receberDano(danoEspecial);
                        j.consumirEnergia(15);
                        System.out.println("💥 ATAQUE ESPECIAL! 🎲 Dano: " + danoEspecial + "! (-15 energia)");
                        acaoRealizada = true;
                    } else {
                        System.out.println("❌ Energia insuficiente! Precisa de 15 energia.");
                    }
                    break;
                    
                case 3:
                    // USAR ITEM
                    if (j.getInventario().tamanho() > 0) {
                        System.out.println("\n📦 Itens disponíveis:");
                        j.getInventario().listar();
                        System.out.print("Qual item usar? (0 para cancelar): ");
                        int idx;
                        try {
                            idx = Integer.parseInt(sc.next()) - 1;
                            if (idx >= 0) {
                                Item item = j.getInventario().usar(idx);
                                if (item != null) {
                                    if (item instanceof ItemEquipavel) {
                                        item.usar(j, i);
                                        acaoRealizada = true;
                                    } else {
                                        item.usar(j, i);
                                        acaoRealizada = true;
                                    }
                                }
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("❌ Inválido!");
                        }
                    } else {
                        System.out.println("📦 Inventário vazio!");
                    }
                    break;
                    
                case 4:
                    // FUGIR
                    int chanceFuga = 30 + j.getDestreza() * 5;
                    int dadoFuga = 1 + (int)(Math.random() * 100);
                    System.out.println("🎲 Dado de fuga: " + dadoFuga + " (precisa <= " + chanceFuga + ")");
                    if (dadoFuga <= chanceFuga) {
                        System.out.println("🏃 Você fugiu do combate!");
                        return;
                    } else {
                        System.out.println("😰 Falha ao fugir!");
                        acaoRealizada = true;
                    }
                    break;
                    
                case 5:
                    System.out.println("\n📊 STATUS DE COMBATE:");
                    System.out.println("   💪 Força base: " + j.getForca());
                    System.out.println("   ⚔️ Bônus de arma: " + (j.getArma() != null ? j.getArma().getBonusForca() : 0));
                    System.out.println("   💥 Força total: " + j.getForcaTotal());
                    System.out.println("   🧠 Inteligência total: " + j.getInteligenciaTotal());
                    acaoRealizada = false;
                    break;
                    
                default:
                    System.out.println("❌ Opção inválida!");
            }
            
            // TURNO DO INIMIGO
            if (acaoRealizada && i.estaVivo()) {
                System.out.println("\n--- Turno do Inimigo ---");
                
                if (Math.random() < 0.3) {
                    i.usarHabilidade(j);
                } else {
                    int danoBaseInimigo = i.atacar();
                    int variacao = (int)(Math.random() * (danoBaseInimigo * 0.6)) - (int)(danoBaseInimigo * 0.3);
                    int danoFinal = Math.max(1, danoBaseInimigo + variacao);
                    
                    j.consumirEnergia(danoFinal);
                    System.out.println("🤖 " + i.getNome() + " atacou! 🎲 Dano: " + danoFinal + "!");
                }
            }
        }
        
        // RESULTADO DO COMBATE
        if (!i.estaVivo()) {
            System.out.println("\n✅ VITÓRIA! " + i.getNome() + " foi derrotado!");
            int recompensa = 20 + (int)(Math.random() * 20);
            j.recuperarEnergia(recompensa);
            System.out.println("🎁 Recompensa: +" + recompensa + " energia!");
        } else if (!j.temEnergia()) {
            System.out.println("\n💀 DERROTA! Você ficou sem energia...");
        }
    }
}
