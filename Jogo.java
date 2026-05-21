import cenas.CenaPrincipal01;
import personagens.Jogador;

public class Jogo {

    public static void main(String[] args) {
        Jogador jogador = Jogador.criarJogador();
        System.out.println(jogador.toString());

        final CenaPrincipal01 cenaPrincipal01 = new CenaPrincipal01();
        cenaPrincipal01.iniciarCena(jogador);
    }
}
