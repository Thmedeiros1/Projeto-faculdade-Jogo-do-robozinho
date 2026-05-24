package personagens.itens;

// "Classe Abstrata" e "Herança"
public abstract class ItemEquipavel extends Item {
    // "Encapsulamento"
    private int atributoAtaque;
    private int atributoDefesa;

    // "Método Construtor"
    public ItemEquipavel(String nome, String descricao, int valor, int atributoAtaque, int atributoDefesa) {
        super(nome, descricao, valor);
        this.atributoAtaque = atributoAtaque;
        this.atributoDefesa = atributoDefesa;
    }

    public int getAtributoAtaque() {
        return this.atributoAtaque;
    }

    public int getAtributoDefesa() {
        return this.atributoDefesa;
    }
}
