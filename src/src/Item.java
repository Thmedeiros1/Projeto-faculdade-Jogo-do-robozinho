
/**
 * CLASSE: Item
 * CONCEITO POO: Classe base para itens (será estendida por ItemEquipavel)
 *               Uso de ENUM (TipoItem)
 */
public class Item {
    
    protected String nome;
    protected TipoItem tipo;
    protected int valor;
    
    /**
     * MÉTODO CONSTRUTOR
     */
    public Item(String nome, TipoItem tipo, int valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    /**
     * MÉTODO: usar - Pode ser sobrescrito (SOBRESCRITA/POLIMORFISMO)
     */
    public void usar(Jogador j, Inimigo i) {
        switch (tipo) {
            case CURA:
                j.recuperarEnergia(valor);
                System.out.println(" Usou " + nome + "! Recuperou " + valor + " energia.");
                break;
            case ATAQUE:
                i.receberDano(valor);
                System.out.println("⚔ Usou " + nome + "! Causou " + valor + " de dano!");
                break;
            case ENERGIA:
                j.recuperarEnergia(valor);
                System.out.println(" Usou " + nome + "! +" + valor + " energia!");
                break;
        }
    }
    
    // GETTERS
    public String getNome() { return nome; }
    public TipoItem getTipo() { return tipo; }
    public int getValor() { return valor; }
}
