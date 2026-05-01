import java.util.Scanner;

public class Jogo {

    private Scanner scanner = new Scanner(System.in);
    private Jogador jogador;
    private Mapa mapa;
    private boolean jogoAtivo = true;

    public Jogo() {
        this.mapa = new Mapa();
    }

    public void iniciar() {
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║   🌍 EcoCore: Despertar Ambiental - 2457 d.C.    ║");
        System.out.println("║   Um RPG textual sobre sustentabilidade          ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");

        criarJogador();

        // LOOP PRINCIPAL DO JOGO
        while (jogoAtivo && jogador.temBackups() && jogador.getProgresso() < 5) {
            exibirHUD();
            mapa.exibir(jogador, scanner, this);

            // VERIFICA SE MORREU (energia <= 0)
            if (jogador.getEnergia() <= 0) {
                System.out.println("\n💀 " + jogador.getNome() + " foi destruído! Energia zerada.");
                
                if (jogador.temBackups()) {
                    System.out.println("🔄 Acionando sistema de backup...");
                    jogador.usarBackup();
                    
                    // Pergunta se quer continuar
                    System.out.print("\nDeseja continuar com o backup? (1-Sim / 2-Não): ");
                    int continuar;
                    try {
                        continuar = Integer.parseInt(scanner.next());
                        if (continuar != 1) {
                            System.out.println("👋 Jogo encerrado!");
                            jogoAtivo = false;
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Opção inválida! Continuando...");
                    }
                } else {
                    System.out.println("💀 SEM BACKUPS! Fim do jogo.");
                    jogoAtivo = false;
                    break;
                }
            }
        }

        finalJogo();
        scanner.close();
    }

    // TRATAMENTO DE EXCEÇÃO: NumberFormatException
    private int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada inválida! Digite um número.");
                scanner.nextLine();
            }
        }
    }

    private void criarJogador() {
        System.out.print("\n🤖 Nome do seu robô EcoCore: ");
        String nome = scanner.next();
        jogador = new Jogador(nome);

        int pontos = 10;
        System.out.println("\n📊 Distribua " + pontos + " pontos entre os atributos:");
        System.out.println("   Força: combate e trabalho pesado");
        System.out.println("   Inteligência: análises e diálogos");
        System.out.println("   restante irá a para Destreza: agilidade e cordenação");

        int forca = lerInteiro(" Força: ");
        pontos -= forca;

        int inteligencia = lerInteiro(" Inteligência: ");
        pontos -= inteligencia;

        int destreza = pontos;
        System.out.println(" Destreza (automática): " + destreza);

        jogador.setAtributos(forca, inteligencia, destreza);
        System.out.println("\n✅ Jogador criado! Boa sorte, " + jogador.getNome() + "!");
    }

    private void exibirHUD() {
        System.out.println("\n╔═══════════════════════════════════════════════════════════════╗");
        System.out.println("║ STATUS DE " + jogador.getNome().toUpperCase());
        System.out.println("╠═══════════════════════════════════════════════════════════════╣");
        System.out.println("║ 🔋 Energia: " + jogador.getEnergia() + "/100");
        System.out.println("║ 💾 Backups: " + jogador.getBackups());
        System.out.println("║ 📍 Progresso: " + jogador.getProgresso() + "/5");
        System.out.println("║ 🌱 Sustentabilidade: " + jogador.getSustentabilidade());
        System.out.println("║ 💪 Força: " + jogador.getForca() + " | 🧠 Int: " + jogador.getInteligencia() + " | ⚡ Des: " + jogador.getDestreza());
        
        // Mostrar equipamentos
        System.out.println("╠═══════════════════════════════════════════════════════════════╣");
        System.out.println("║ 🎒 EQUIPAMENTOS:");
        if (jogador.getArma() != null) {
            System.out.println("║    ⚔️ Arma: " + jogador.getArma().getNome() + " (+" + jogador.getArma().getBonusForca() + " força)");
        } else {
            System.out.println("║    ⚔️ Arma: Nenhuma");
        }
        if (jogador.getArmadura() != null) {
            System.out.println("║    🛡️ Armadura: " + jogador.getArmadura().getNome() + " (+" + jogador.getArmadura().getBonusInteligencia() + " inteligência)");
        } else {
            System.out.println("║    🛡️ Armadura: Nenhuma");
        }
        
        // Mostrar quantidade de itens no inventário
        System.out.println("║    📦 Itens no inventário: " + jogador.getInventario().tamanho());
        System.out.println("╚═══════════════════════════════════════════════════════════════╝");
    }

    public void executarMissao(int missaoIndex, Scanner sc) {
        switch(missaoIndex) {
            case 0: Missao.agua(jogador, sc); break;
            case 1: Missao.ar(jogador, sc); break;
            case 2: Missao.solo(jogador, sc); break;
            case 3: Missao.biodiversidade(jogador, sc); break;
            case 4: Missao.carbono(jogador, sc); break;
            default: System.out.println("Missão inválida!");
        }
    }

    private void finalJogo() {
        System.out.println("\n╔═══════════════════════════════════════════════════╗");
        System.out.println("║                    🎮 FINAL 🎮                    ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");

        int progresso = jogador.getProgresso();
        int sust = jogador.getSustentabilidade();

        if (progresso >= 5 && sust >= 80 && jogador.temFlag("DESCOBRIU_VERDADE")) {
            System.out.println("\n🌟 FINAL LENDÁRIO 🌟");
            System.out.println("Você descobriu a verdade: os humanos criaram os robôs");
            System.out.println("para aprenderem com seus erros.");
            
        } else if (progresso >= 5 && sust >= 50) {
            System.out.println("\n🌎 FINAL VERDE 🌎");
            System.out.println("A Terra foi restaurada! Os humanos retornam com nova consciência.");
            
        } else if (progresso >= 5) {
            System.out.println("\n🤖 FINAL REALISTA 🤖");
            System.out.println("Você se torna professor de uma nova geração de IAs.");
            
        } else if (sust < 0) {
            System.out.println("\n💀 FINAL CORROMPIDO 💀");
            System.out.println("Você se tornou um poluidor. O planeta está perdido.");
            
        } else {
            System.out.println("\n☠ FINAL TRÁGICO ☠");
            System.out.println("\"Salvar o planeta é salvar a si mesmo.\"");
        }

        System.out.println("\n📊 ESTATÍSTICAS FINAIS:");
        System.out.println("   • Missões: " + progresso + "/5");
        System.out.println("   • Sustentabilidade: " + sust);
        System.out.println("   • Conquistas: " + jogador.getFlagsDesbloqueadas());
    }

    public Jogador getJogador() { return jogador; }
    public void setJogoAtivo(boolean ativo) { this.jogoAtivo = ativo; }
}
