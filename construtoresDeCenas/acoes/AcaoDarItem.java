package construtoresDeCenas.acoes;

import personagens.Jogador;
import personagens.itens.Item;

// "Herança"
public class AcaoDarItem extends Acao {
    // Encapsulamento
    private Item item;
    private int proximoElemento;

    // "Método Construtor"
    public AcaoDarItem(Item item, int proximoElemento) {
        this.item = item;
        this.proximoElemento = proximoElemento;
    }

    // "Implementação do Método Abstrato"
    public int executar(Jogador jogador) {
        System.out.println("Você recebeu: " + item.getNome());
        jogador.getInventario().adicionarItem(this.item);
        return this.proximoElemento;
    }
}
