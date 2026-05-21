package personagens.itens;

public class ItemEquipavel extends Item {
    private int atributoAtaque;
    private int atributoDefesa;
    private int atributoVida;

    public ItemEquipavel(String nome, String descricao, int valor, int atributoAtaque, int atributoDefesa, int atributoVida) {
        super(nome, descricao, valor);
        this.atributoAtaque = atributoAtaque;
        this.atributoDefesa = atributoDefesa;
        this.atributoVida = atributoVida;
    }

    public int getAtributoAtaque() {
        return this.atributoAtaque;
    }

    public int getAtributoDefesa() {
        return this.atributoDefesa;
    }

    public int getAtributoVida() {
        return this.atributoVida;
    }
}
