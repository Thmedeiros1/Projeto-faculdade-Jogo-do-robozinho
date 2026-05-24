package personagens.itens;

import personagens.Jogador;

// "Herança"
public class ItemCura extends ItemConsumivel {
    // "Método Construtor"
    public ItemCura(String nome, String descricao, int valor) {
        super(nome, descricao, valor);
    }

    // "Implementação do Método Abstrato"
    public void consumir(Jogador jogador) {
        jogador.receberCura(this.getValor());
        System.out.println("Você se cura em " + this.getValor() + " pontos de vida!");
    }
}