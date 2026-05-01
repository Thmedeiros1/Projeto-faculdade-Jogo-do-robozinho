
import java.util.Scanner;

/**
 * CLASSE: Combate
 * CONCEITO POO: Classe com métodos estáticos (utilitária)
 * SISTEMA DE SORTE: Uso de Math.random() para dano variável
 */
public class Combate {
    
    /**
     * MÉTODO ESTÁTICO - inicia combate por turnos com sistema de sorte
     */
    public static void iniciar(Jogador j, Inimigo i, Scanner sc) {
        System.out.println("\n⚔️⚔️⚔️ COMBATE INICIADO ⚔️⚔️⚔️");
        System.out.println("🎯 Inimigo: " + i.getNome() + " (Vida: " + i.getVida() + ")");
        System.out.println("🎲 Sistema de sorte ativado! Dano varia aleatoriamente.\n");
        
        while (j.temEnergia() && i.estaVivo()) {
            
            System.out.println("\n[ " + i.getNome() + " ] Vida: " + i.getVida() + "/" + i.getVidaMaxima());
            System.out.println("[ Você ] Energia: " + j.getEnergia() + "/100");
            System.out.println("[ Dados ] 🎲 Força base: " + j.getForcaTotal());
            
            System.out.println("\n📋 AÇÕES:");
            System.out.println("   1 - ⚔️ Ataque Normal (dano: 1 a " + (5 + j.getForcaTotal()) + ")");
            System.out.println("   2 - 💥 Ataque Especial (dano: 2 a " + (15 + j.getForcaTotal() * 2) + ", custo 15 energia)");
            System.out.println("   3 - 🧪 Usar Item");
            System.out.println("   4 - 🏃 Fugir (chance: " + (30 + j.getDestreza() * 5) + "%)");
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
                    // ATAQUE NORMAL COM SORTE: dano entre 1 e (5 + força)
                    int danoBase = 5 + j.getForcaTotal();
                    int danoAtaque = 1 + (int)(Math.random() * danoBase);
                    i.receberDano(danoAtaque);
                    System.out.println("⚔️ ATAQUE NORMAL! 🎲 Dado rolou: " + danoAtaque + "!");
                    System.out.println("   Causou " + danoAtaque + " de dano!");
                    acaoRealizada = true;
                    break;
                    
                case 2:
                    // ATAQUE ESPECIAL COM SORTE: dano entre 2 e (15 + força*2)
                    if (j.getEnergia() >= 15) {
                        int danoEspecialBase = 15 + (j.getForcaTotal() * 2);
                        int danoEspecial = 2 + (int)(Math.random() * danoEspecialBase);
                        i.receberDano(danoEspecial);
                        j.consumirEnergia(15);
                        System.out.println("💥 ATAQUE ESPECIAL! 🎲 Dado rolou: " + danoEspecial + "!");
                        System.out.println("   Causou " + danoEspecial + " de dano! (-15 energia)");
                        acaoRealizada = true;
                    } else {
                        System.out.println("❌ Energia insuficiente para ataque especial! (Precisa de 15)");
                    }
                    break;
                    
                case 3:
                    // USAR ITEM
                    if (j.getInventario().tamanho() > 0) {  // ← CORRIGIDO
                        System.out.println("\n📦 Itens disponíveis:");
                        j.getInventario().listar();
                        System.out.print("Qual item usar? (0 para cancelar): ");
                        int idx;
                        try {
                            idx = Integer.parseInt(sc.next()) - 1;
                            if (idx >= 0) {
                                Item item = j.getInventario().usar(idx);
                                if (item != null) item.usar(j, i);
                                acaoRealizada = true;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("❌ Inválido!");
                        }
                    } else {
                        System.out.println("📦 Inventário vazio!");
                    }
                    break;
                    
                case 4:
                    // FUGIR COM SORTE
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
                    
                default:
                    System.out.println("❌ Opção inválida!");
            }
            
            // TURNO DO INIMIGO (também com sorte!)
            if (acaoRealizada && i.estaVivo()) {
                System.out.println("\n--- Turno do Inimigo ---");
                
                // Chance de usar habilidade especial (30%)
                if (Math.random() < 0.3) {
                    i.usarHabilidade(j);
                } else {
                    // Dano do inimigo também tem variação de sorte! (+- 30%)
                    int danoBaseInimigo = i.atacar();
                    int variacao = (int)(Math.random() * (danoBaseInimigo * 0.6)) - (int)(danoBaseInimigo * 0.3);
                    int danoFinal = Math.max(1, danoBaseInimigo + variacao);
                    
                    j.consumirEnergia(danoFinal);
                    System.out.println("🤖 " + i.getNome() + " atacou! 🎲 Dano: " + danoFinal + "!");
                    System.out.println("   Você perdeu " + danoFinal + " energia!");
                }
            }
        }
        
        // RESULTADO DO COMBATE
        if (!i.estaVivo()) {
            System.out.println("\n✅ VITÓRIA! " + i.getNome() + " foi derrotado!");
            int recompensa = 20 + (int)(Math.random() * 20); // recompensa variável
            j.recuperarEnergia(recompensa);
            System.out.println("🎁 Recompensa: +" + recompensa + " energia!");
        } else if (!j.temEnergia()) {
            System.out.println("\n💀 DERROTA! Você ficou sem energia...");
        }
    }
}
