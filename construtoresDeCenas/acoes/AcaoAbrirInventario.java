package construtoresDeCenas.acoes;

import personagens.Jogador;

// "Herança"
public class AcaoAbrirInventario extends Acao {
    // "Encapsulamento"
    private int proximoElemento;
    // "Método Construtor"
    public AcaoAbrirInventario(int proximoElemento) {
        super();
        this.proximoElemento = proximoElemento;
    }

    public int executar(Jogador jogador) {
        System.out.println("\nVocê abre sua mochila...");
        jogador.menuInventario();
        return this.proximoElemento;
    }
}
