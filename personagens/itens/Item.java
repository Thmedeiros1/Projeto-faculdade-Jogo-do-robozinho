package personagens.itens;

// "Classe Abstrata"
public abstract class Item {
    // "Encapsulamento"
    private String nome;
    private String descricao;
    private int valor;

    // "Método Construtor"
    public Item(String nome, String descricao, int valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getValor() {
        return valor;
    }
}

