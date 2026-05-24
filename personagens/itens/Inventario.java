package personagens.itens;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Item> itens;
    private Arma arma;
    private Armadura armadura;
    
    public Inventario() {
        this.itens = new ArrayList<>();
        this.arma = null;
        this.armadura = null;
    }

    public void adicionarItem(Item item) {
        System.out.println(item.getNome() + " foi adicionado ao inventário.");
        this.itens.add(item);
    }

    public void removerItem(Item item) {
        this.itens.remove(item);
    }

    public void listar() {
        if (itens.isEmpty()) {
            System.out.println("Inventário vazio");
            return;
        }
        for (int i = 0; i < itens.size(); i++) {
            Item item = itens.get(i);
            String tipo;
            if (item instanceof ItemEquipavel) {
                tipo = " [EQUIPÁVEL]";
            } else if (item instanceof ItemCura) {
                tipo = " [CONSUMÍVEL - CURA]";
            } else {
                tipo = " [MOEDA DE TROCA]";
            }
            System.out.println("   " + (i + 1) + " - " + item.getNome() + tipo);
        }
    }

    public void equiparItem(ItemEquipavel itemParaEquipar) {
        if (itemParaEquipar instanceof Arma) {
            equiparArma((Arma) itemParaEquipar);
        } else
        if (itemParaEquipar instanceof Armadura) {
            equiparArmadura((Armadura) itemParaEquipar);
        }
    }

    public void desequiparItem(ItemEquipavel itemEquipado) {
        if (itemEquipado == null) {
            return;
        }

        if (itemEquipado instanceof Arma) {
            this.arma = null;
        } else
        if (itemEquipado instanceof Armadura) {
            this.armadura = null;
        }

        adicionarItem(itemEquipado);
        System.out.println(itemEquipado.getNome() + " desequipado.");
    }

    private void equiparArma(Arma novaArma) {
        if(this.arma != null) {
            desequiparItem(this.arma);
        }
        this.arma = novaArma;
        removerItem(novaArma);
        System.out.println(novaArma.getNome() + " equipado como arma.");
    }

    private void equiparArmadura(Armadura novaArmadura) {
        if(this.armadura != null) {
            desequiparItem(this.armadura);
        }
        this.armadura = novaArmadura;
        removerItem(novaArmadura);
        System.out.println(novaArmadura.getNome() + " equipado como armadura.");
    }

    public Arma getArma() {
        return arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }
    
    public ArrayList<Item> getItens() {
        return itens;
    }
}
