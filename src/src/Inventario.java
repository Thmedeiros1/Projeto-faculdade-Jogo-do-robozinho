
import java.util.ArrayList;

/**
 * CLASSE: Inventario
 * CONCEITO POO: Encapsulamento (ArrayList privado)
 */
public class Inventario {
    
    private ArrayList<Item> itens = new ArrayList<>();
    
    public void adicionar(Item i) {
        itens.add(i);
        System.out.println("📦 +1 " + i.getNome() + " adicionado ao inventário!");
    }
    
    public void listar() {
        if (itens.isEmpty()) {
            System.out.println("📦 Inventário vazio.");
            return;
        }
        for (int i = 0; i < itens.size(); i++) {
            System.out.println("   " + (i + 1) + " - " + itens.get(i).getNome());
        }
    }
    
    public Item usar(int indice) {
        if (indice < 0 || indice >= itens.size()) return null;
        Item item = itens.remove(indice);
        System.out.println("📦 Usando: " + item.getNome());
        return item;
    }
    
    public boolean vazio() { 
        return itens.isEmpty(); 
    }
    
    public int tamanho() { 
        return itens.size(); 
    }
}
