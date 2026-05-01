
import java.util.Scanner;

public class Mapa {
    
    private boolean missoesSecundariasAtivas = false;
    private String missaoSecundariaNome = "";
    private int progressoMissaoSec = 0;
    
    public void exibir(Jogador j, Scanner sc, Jogo jogo) {
        System.out.println("\n🗺️🗺️🗺️ MAPA DA METRÓPOLE 🗺️🗺️🗺️");
        System.out.println("   Escolha uma ação:");
        
        System.out.println("\n📋 MENU PRINCIPAL:");
        System.out.println("   1 - ⚔️ Missão Principal (progresso: " + j.getProgresso() + "/5)");
        
        if (missoesSecundariasAtivas) {
            System.out.println("   2 - 📜 Missão Secundária Ativa: " + missaoSecundariaNome);
        } else {
            System.out.println("   2 - 🔍 Procurar Missão Secundária");
        }
        
        System.out.println("   3 - 🧭 Explorar área");
        System.out.println("   4 - 📊 Estatísticas e Inventário");
        System.out.println("   5 - 💤 Descansar (recupera 10 energia)");
        System.out.println("   0 - 🚪 Sair do jogo");
        
        System.out.print("\nEscolha: ");
        
        int escolha;
        try {
            escolha = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("❌ Opção inválida!");
            return;
        }
        
        switch (escolha) {
            case 0:
                System.out.println("\n👋 Encerrando jogo... Até a próxima, guardião do planeta!");
                jogo.setJogoAtivo(false);
                System.exit(0);
                break;
            case 1:
                if (j.getProgresso() < 5) {
                    jogo.executarMissao(j.getProgresso(), sc);
                } else {
                    System.out.println("🎉 Você já completou todas as missões principais!");
                }
                break;
            case 2:
                gerenciarMissoesSecundarias(j, sc);
                break;
            case 3:
                explorarArea(j, sc);
                break;
            case 4:
                exibirEstatisticasCompletas(j, sc);
                break;
            case 5:
                System.out.println("\n💤 Você descansou e recuperou energias!");
                j.recuperarEnergia(10);
                System.out.println("   +10 energia!");
                break;
            default:
                System.out.println("❌ Opção inválida!");
        }
    }
    
    private void gerenciarMissoesSecundarias(Jogador j, Scanner sc) {
        if (!missoesSecundariasAtivas) {
            // PROCURAR NOVA MISSÃO SECUNDÁRIA
            System.out.println("\n🔍 Procurando por missões secundárias...");
            
            int missaoEncontrada = (int)(Math.random() * 4);
            
            switch (missaoEncontrada) {
                case 0:
                    missaoSecundariaNome = "🧬 Ajudar o Biológo";
                    missoesSecundariasAtivas = true;
                    progressoMissaoSec = 0;
                    System.out.println("📢 Nova missão: " + missaoSecundariaNome);
                    System.out.println("   Um biólogo precisa de ajuda para catalogar espécies raras.");
                    break;
                case 1:
                    missaoSecundariaNome = "🔧 Consertar Recicladora";
                    missoesSecundariasAtivas = true;
                    progressoMissaoSec = 0;
                    System.out.println("📢 Nova missão: " + missaoSecundariaNome);
                    System.out.println("   Uma máquina de reciclagem quebrada precisa de reparos.");
                    break;
                case 2:
                    missaoSecundariaNome = "📚 Recuperar Dados Perdidos";
                    missoesSecundariasAtivas = true;
                    progressoMissaoSec = 0;
                    System.out.println("📢 Nova missão: " + missaoSecundariaNome);
                    System.out.println("   Documentos importantes foram perdidos na Zona Tóxica.");
                    break;
                default:
                    System.out.println("   Nenhuma missão disponível no momento. Tente novamente mais tarde.");
            }
        } else {
            // EXECUTAR MISSÃO SECUNDÁRIA ATIVA
            executarMissaoSecundaria(j, sc);
        }
    }
    
    private void executarMissaoSecundaria(Jogador j, Scanner sc) {
        System.out.println("\n📜 MISSAO SECUNDÁRIA: " + missaoSecundariaNome);
        
        switch (missaoSecundariaNome) {
            case "🧬 Ajudar o Biológo":
                MissaoSecundaria.biologo(j, sc, this);
                break;
            case "🔧 Consertar Recicladora":
                MissaoSecundaria.recicladora(j, sc, this);
                break;
            case "📚 Recuperar Dados Perdidos":
                MissaoSecundaria.dadosPerdidos(j, sc, this);
                break;
            default:
                System.out.println("⚠️ Erro: Missão não encontrada!");
                missoesSecundariasAtivas = false;
        }
    }
    
    public void completarMissaoSecundaria(Jogador j) {
        System.out.println("\n🎉 MISSÃO SECUNDÁRIA COMPLETA! 🎉");
        
        // RECOMPENSAS GENEROSAS
        int recompensaEnergia = 30 + (int)(Math.random() * 30);
        int recompensaSust = 25;
        
        j.recuperarEnergia(recompensaEnergia);
        j.alterarSustentabilidade(recompensaSust);
        
        // AUMENTA ATRIBUTOS PERMANENTEMENTE
        j.alterarForca(1);
        j.alterarInteligencia(1);
        
        System.out.println("🏆 RECOMPENSAS:");
        System.out.println("   🔋 +" + recompensaEnergia + " energia");
        System.out.println("   🌱 +" + recompensaSust + " sustentabilidade");
        System.out.println("   💪 +1 Força permanente!");
        System.out.println("   🧠 +1 Inteligência permanente!");
        
        // Resetar missão
        missoesSecundariasAtivas = false;
        missaoSecundariaNome = "";
        progressoMissaoSec = 0;
    }
    
    private void explorarArea(Jogador j, Scanner sc) {
        System.out.println("\n🔍 Explorando a metrópole...");
        
        // GASTO DE ENERGIA PARA EXPLORAR
        j.consumirEnergia(5);
        System.out.println("   -5 energia para explorar");
        
        int achado = (int)(Math.random() * 5);
        
        switch (achado) {
            case 0:
                System.out.println("📦 Você encontrou uma bateria escondida!");
                j.recuperarEnergia(20);
                System.out.println("   +20 energia!");
                break;
            case 1:
                System.out.println("📜 Você encontrou documentos históricos!");
                j.getInventario().adicionar(new Item("Documentos Antigos", TipoItem.CURA, 10));
                j.alterarInteligencia(1);
                System.out.println("   🧠 +1 Inteligência!");
                break;
            case 2:
                System.out.println("⚠️ Drone hostil detectado!");
                Inimigo i = new Inimigo("Drone Patrulheiro", 35, 10, "Rajada Elétrica");
                Combate.iniciar(j, i, sc);
                break;
            case 3:
                System.out.println("🏪 Você encontrou uma loja ambulante!");
                Loja.visitar(j, sc);
                break;
            default:
                System.out.println("🍃 A área está calma. Você ganhou experiência!");
                j.alterarSustentabilidade(5);
                System.out.println("   🌱 +5 sustentabilidade!");
        }
        
        // BÔNUS DE GANHAR STATUS ALEATORIAMENTE
        if (Math.random() < 0.2) {
            int tipoBonus = (int)(Math.random() * 3);
            switch (tipoBonus) {
                case 0:
                    j.alterarForca(1);
                    System.out.println("💪 Bônus: Força aumentou em 1!");
                    break;
                case 1:
                    j.alterarInteligencia(1);
                    System.out.println("🧠 Bônus: Inteligência aumentou em 1!");
                    break;
                case 2:
                    j.alterarDestreza(1);
                    System.out.println("⚡ Bônus: Destreza aumentou em 1!");
                    break;
            }
        }
    }
    
    private void exibirEstatisticasCompletas(Jogador j, Scanner sc) {
        System.out.println("\n╔═══════════════════════════════════════════════════════════════╗");
        System.out.println("║                    📊 ESTATÍSTICAS COMPLETAS                  ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════╣");
        System.out.println("║ Nome: " + String.format("%-62s", j.getNome()));
        System.out.println("╠═══════════════════════════════════════════════════════════════╣");
        System.out.println("║ 🔋 Energia: " + String.format("%-66s", j.getEnergia() + "/100"));
        System.out.println("║ 💾 Backups: " + String.format("%-66s", j.getBackups()));
        System.out.println("║ 📍 Progresso: " + String.format("%-64s", j.getProgresso() + "/5"));
        System.out.println("║ 🌱 Sustentabilidade: " + String.format("%-58s", j.getSustentabilidade()));
        System.out.println("╠═══════════════════════════════════════════════════════════════╣");
        System.out.println("║ ATRIBUTOS:");
        System.out.println("║    💪 Força: " + String.format("%-66s", j.getForca() + " (Total: " + j.getForcaTotal() + ")"));
        System.out.println("║    🧠 Inteligência: " + String.format("%-61s", j.getInteligencia() + " (Total: " + j.getInteligenciaTotal() + ")"));
        System.out.println("║    ⚡ Destreza: " + String.format("%-66s", j.getDestreza()));
        System.out.println("╠═══════════════════════════════════════════════════════════════╣");
        System.out.println("║ EQUIPAMENTOS:");
        System.out.println("║    ⚔️ Arma: " + String.format("%-67s", (j.getArma() != null ? j.getArma().getNome() + " (+" + j.getArma().getBonusForca() + " força)" : "Nenhuma")));
        System.out.println("║    🛡️ Armadura: " + String.format("%-65s", (j.getArmadura() != null ? j.getArmadura().getNome() + " (+" + j.getArmadura().getBonusInteligencia() + " int)" : "Nenhuma")));
        System.out.println("╠═══════════════════════════════════════════════════════════════╣");
        System.out.println("║ REPUTAÇÃO:");
        System.out.println("║    👨‍🔬 Engenheiros: " + String.format("%-61s", j.getReputacao("ENGENHEIROS")));
        System.out.println("║    🏭 Indústria: " + String.format("%-65s", j.getReputacao("INDUSTRIA")));
        System.out.println("╠═══════════════════════════════════════════════════════════════╣");
        System.out.println("║ CONQUISTAS: " + String.format("%-65s", j.getFlagsDesbloqueadas()));
        System.out.println("╚═══════════════════════════════════════════════════════════════╝");
        
        System.out.println("\n📦 Deseja ver seu inventário? (1-Sim / 2-Não)");
        try {
            int verInv = Integer.parseInt(sc.next());
            if (verInv == 1) {
                j.getInventario().listar();
            }
        } catch (NumberFormatException e) {
            System.out.println("Opção inválida!");
        }
    }
}
