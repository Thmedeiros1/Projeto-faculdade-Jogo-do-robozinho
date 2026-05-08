
/**
 * CLASSE: ItemEquipavel
 * CONCEITO POO: HERANÇA (extends Item)
 *               SOBRESCRITA de métodos
 *               POLIMORFISMO
 */
public class ItemEquipavel extends Item {
    
    // Atributos específicos de equipamento
    private int bonusForca;
    private int bonusInteligencia;
    private String slot; // "ARMA", "ARMADURA", "ACESSORIO"
    
    /**
     * MÉTODO CONSTRUTOR - Sobrecarga
     */
    public ItemEquipavel(String nome, TipoItem tipo, int valor, 
                         int bonusForca, int bonusInteligencia, String slot) {
        super(nome, tipo, valor); // Chama construtor da classe pai
        this.bonusForca = bonusForca;
        this.bonusInteligencia = bonusInteligencia;
        this.slot = slot;
    }
    
    /**
     * SOBRESCRITA do método usar - POLIMORFISMO
     */
    @Override
    public void usar(Jogador j, Inimigo i) {
        if (slot.equals("ARMA")) {
            j.equiparArma(this);
        } else if (slot.equals("ARMADURA")) {
            j.equiparArmadura(this);
        }
        System.out.println("✨ Equipado: " + nome + " (Força +" + bonusForca + ", Int +" + bonusInteligencia + ")");
    }
    
    // GETTERS
    public int getBonusForca() { return bonusForca; }
    public int getBonusInteligencia() { return bonusInteligencia; }
    public String getSlot() { return slot; }
}