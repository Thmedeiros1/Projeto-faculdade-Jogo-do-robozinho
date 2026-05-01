
import java.util.Scanner;

/**
 * CLASSE: Loja
 * CONCEITO POO: Classe utilitária com métodos estáticos
 */
public class Loja {
    
    private static Item[] itensDisponiveis = {
        new Item("Bateria Pequena", TipoItem.ENERGIA, 20),
        new Item("Bateria Grande", TipoItem.ENERGIA, 40),
        new Item("Kit de Análise", TipoItem.ATAQUE, 15),
        new Item("Semente Rara", TipoItem.CURA, 10),
        new ItemEquipavel("Lança Reciclada", TipoItem.ATAQUE, 0, 5, 0, "ARMA"),
        new ItemEquipavel("Armadura de Sucata", TipoItem.CURA, 0, 0, 3, "ARMADURA")
    };
    
    private static int[] precos = {15, 30, 10, 20, 25, 25};
    
    public static void visitar(Jogador j, Scanner sc) {
        System.out.println("\n LOJA DE RECICLAGEM ");
        System.out.println(" Você tem " + j.getSustentabilidade() + " pontos de sustentabilidade.");
        
        while (true) {
            System.out.println("\n ITENS DISPONÍVEIS:");
            for (int i = 0; i < itensDisponiveis.length; i++) {
                System.out.println("   " + (i+1) + " - " + itensDisponiveis[i].getNome() + " | " + precos[i] + " sust");
            }
            System.out.println("   0 - Sair da loja");
            
            System.out.print("Comprar: ");
            int escolha;
            try {
                escolha = Integer.parseInt(sc.next());
            } catch (NumberFormatException e) {
                System.out.println("❌ Inválido!");
                continue;
            }
            
            if (escolha == 0) break;
            if (escolha < 1 || escolha > itensDisponiveis.length) {
                System.out.println("❌ Opção inválida!");
                continue;
            }
            
            int preco = precos[escolha-1];
            if (j.getSustentabilidade() >= preco) {
                j.alterarSustentabilidade(-preco);
                Item item = itensDisponiveis[escolha-1];
                j.getInventario().adicionar(item);
                System.out.println(" Comprado: " + item.getNome());
            } else {
                System.out.println(" Sustentabilidade insuficiente!");
            }
        }
    }
}
