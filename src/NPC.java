
import java.util.Scanner;

/**
 * CLASSE: NPC
 * CONCEITO POO: Personagens Não-Jogadores com diálogos
 */
public class NPC {
    
    public static void engenheiro(Jogador j, Scanner sc) {
        System.out.println("\n Engenheiro Ambiental:");
        System.out.println("\"Olá! Sou responsável pelo banco de sementes.\"");
        System.out.println("\"Preciso de ajuda para reintroduzir espécies nativas.\"");
        
        System.out.println("\nOpções:");
        System.out.println("1 - Ajudar o engenheiro (+20 sustentabilidade)");
        System.out.println("2 - Pedir recompensa primeiro");
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
                System.out.println("\n \"Obrigado! Com sua ajuda, o ecossistema volta a florescer!\"");
                j.alterarSustentabilidade(20);
                j.alterarReputacao("ENGENHEIROS", 10);
                j.adicionarFlag("AJUDOU_ENGENHEIRO");
                break;
            case 2:
                System.out.println("\n \"Aqui está uma semente rara como recompensa.\"");
                j.alterarSustentabilidade(15);
                j.getInventario().adicionar(new Item("Semente Rara", TipoItem.CURA, 15));
                break;
            default:
                System.out.println("👨‍ \"Que pena... A natureza precisa de heróis.\"");
        }
    }
}
