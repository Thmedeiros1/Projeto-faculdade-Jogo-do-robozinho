package personagens.itens;

public class ItemEquipavel extends Item {
    private int atributoAtaque;
    private int atributoDefesa;

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
