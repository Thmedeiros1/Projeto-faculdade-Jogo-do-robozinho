package construtoresDeCenas.acoes;

import personagens.Jogador;
import personagens.itens.Item;

public class AcaoDarItem extends Acao {
    private Item item;
    private int proximoElemento;

    public AcaoDarItem(Item item, int proximoElemento) {
        this.item = item;
        this.proximoElemento = proximoElemento;
    }

    @Override
    public int executar(Jogador jogador) {
        System.out.println("Você recebeu: " + item.getNome());
        jogador.getInventario().adicionarItem(this.item);
        return this.proximoElemento;
    }
}
