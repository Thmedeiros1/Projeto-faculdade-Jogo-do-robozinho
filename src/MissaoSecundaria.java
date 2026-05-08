
import java.util.Scanner;

public class MissaoSecundaria {
    
    public static void biologo(Jogador j, Scanner sc, Mapa mapa) {
        System.out.println("\n👨‍🔬 Dr. Carlos, o Biólogo:");
        System.out.println("\"Bem-vindo! Estou tentando restaurar a flora nativa.\"");
        System.out.println("\"Preciso de ajuda para coletar amostras de solo saudável.\"");
        
        System.out.println("\nO que você faz?");
        System.out.println("1 - Ajudar o biólogo (coletar amostras)");
        System.out.println("2 - Pedir uma recompensa adiantada");
        System.out.println("3 - Recusar a missão");
        
        int escolha;
        try {
            escolha = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("❌ Inválido!");
            return;
        }
        
        switch (escolha) {
            case 1:
                System.out.println("\n🔬 Coletando amostras...");
                j.consumirEnergia(10);
                
                // TESTE DE INTELIGÊNCIA
                if (j.getInteligencia() >= 6) {
                    System.out.println("✅ Você identifica as áreas mais férteis com facilidade!");
                    mapa.completarMissaoSecundaria(j);
                } else if (j.getForca() >= 6) {
                    System.out.println("💪 Você usa força bruta para cavar e encontrar boas amostras!");
                    mapa.completarMissaoSecundaria(j);
                } else {
                    System.out.println("❌ Você não conseguiu coletar amostras boas.");
                    System.out.println("   Tente novamente depois de aumentar seus atributos.");
                }
                break;
            case 2:
                System.out.println("\n👨‍🔬 \"Aqui está uma semente rara como incentivo.\"");
                j.getInventario().adicionar(new ItemEquipavel("Semente Rara", TipoItem.CURA, 0, 2, 2, "ACESSORIO"));
                mapa.completarMissaoSecundaria(j);
                break;
            default:
                System.out.println("\n👨‍🔬 \"Que pena... O planeta precisa de heróis.\"");
        }
    }
    
    public static void recicladora(Jogador j, Scanner sc, Mapa mapa) {
        System.out.println("\n🔧 Máquina de Reciclagem Quebrada:");
        System.out.println("\"Sistema de reciclagem offline. Necessário reparo urgente.\"");
        
        System.out.println("\nO que você faz?");
        System.out.println("1 - Tentar consertar (requer Força ou Inteligência)");
        System.out.println("2 - Usar peças de reposição do inventário");
        System.out.println("3 - Abandonar");
        
        int escolha;
        try {
            escolha = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("❌ Inválido!");
            return;
        }
        
        switch (escolha) {
            case 1:
                j.consumirEnergia(15);
                
                if (j.getInteligencia() >= 5 || j.getForca() >= 7) {
                    System.out.println("✅ Você conseguiu reparar a máquina!");
                    System.out.println("   A cidade agora recicla melhor seus resíduos.");
                    mapa.completarMissaoSecundaria(j);
                } else {
                    System.out.println("❌ Você não tem habilidade suficiente para o reparo.");
                }
                break;
            case 2:
                System.out.println("🔧 Usando peças sobressalentes...");
                mapa.completarMissaoSecundaria(j);
                break;
            default:
                System.out.println("📢 Missão abandonada.");
        }
    }
    
    public static void dadosPerdidos(Jogador j, Scanner sc, Mapa mapa) {
        System.out.println("\n📀 Sistema Central de Dados:");
        System.out.println("\"Arquivos ambientais corrompidos. Recuperação necessária.\"");
        
        System.out.println("\nO que você faz?");
        System.out.println("1 - Recuperar dados (combate contra vírus)");
        System.out.println("2 - Usar conhecimento (requer Inteligência 6+)");
        System.out.println("3 - Ignorar");
        
        int escolha;
        try {
            escolha = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("❌ Inválido!");
            return;
        }
        
        switch (escolha) {
            case 1:
                System.out.println("\n⚠️ Vírus detectado! Combate iniciado.");
                Inimigo virus = new Inimigo("Vírus Cibernético", 45, 12, "Corrupção de Dados");
                Combate.iniciar(j, virus, sc);
                
                if (virus.estaVivo()) {
                    System.out.println("❌ Você foi derrotado pelo vírus!");
                } else {
                    System.out.println("✅ Dados recuperados com sucesso!");
                    mapa.completarMissaoSecundaria(j);
                }
                break;
            case 2:
                if (j.getInteligencia() >= 6) {
                    System.out.println("🧠 Você decifra o código e recupera os dados!");
                    mapa.completarMissaoSecundaria(j);
                } else {
                    System.out.println("❌ Inteligência insuficiente para decifrar o código.");
                }
                break;
            default:
                System.out.println("📢 Os dados permanecem perdidos.");
        }
    }
}
