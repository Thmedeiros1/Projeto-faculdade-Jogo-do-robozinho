package personagens.itens;

import personagens.Jogador;

public abstract class ItemConsumivel extends Item {
    public ItemConsumivel(String nome, String descricao, int valor) {
        super(nome, descricao, valor);
    }

    public abstract void consumir(Jogador jogador);
}
