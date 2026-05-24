package personagens.itens;

import personagens.Jogador;

public class ItemCura extends ItemConsumivel {
    public ItemCura(String nome, String descricao, int valor) {
        super(nome, descricao, valor);
    }

    public void consumir(Jogador jogador) {
        jogador.receberCura(this.getValor());
        System.out.println("Você se cura em " + this.getValor() + " pontos de vida!");
    }
}