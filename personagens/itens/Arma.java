package personagens.itens;

// "Herança"
public class Arma extends ItemEquipavel {
    // "Método Construtor"
    public Arma(String nome, String descricao, int valor, int ataque, int defesa) {
        super(nome, descricao, valor, ataque, defesa);
    }
}
