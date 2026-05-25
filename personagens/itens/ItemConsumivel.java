package personagens.itens;

import personagens.Jogador;

// "Classe Abstrata" e "Herança"
public abstract class ItemConsumivel extends Item {
    // "Método Construtor"
    public ItemConsumivel(String nome, String descricao, int valor) {
        super(nome, descricao, valor);
    }

    // "Método Abstrato"
    public abstract void consumir(Jogador jogador);
}
