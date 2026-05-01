
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
            Item item = itens.get(i);
            String tipo = (item instanceof ItemEquipavel) ? " [EQUIPÁVEL]" : " [CONSUMÍVEL]";
            System.out.println("   " + (i + 1) + " - " + item.getNome() + tipo);
        }
    }
    
    public Item usar(int indice) {
        if (indice < 0 || indice >= itens.size()) return null;
        Item item = itens.remove(indice);
        System.out.println("📦 Usando: " + item.getNome());
        return item;
    }
    
    public void equiparItem(int indice, Jogador j) {
        if (indice < 0 || indice >= itens.size()) {
            System.out.println("❌ Índice inválido!");
            return;
        }
        
        Item item = itens.get(indice);
        if (item instanceof ItemEquipavel) {
            itens.remove(indice);
            item.usar(j, null);
            System.out.println("✅ Item equipado com sucesso!");
        } else {
            System.out.println("❌ Este item não pode ser equipado! Use durante o combate.");
        }
    }
    
    public boolean vazio() { 
        return itens.isEmpty(); 
    }
    
    public int tamanho() { 
        return itens.size(); 
    }
}
