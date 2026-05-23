import cenas.CenaBairroEnchentes01;
import cenas.CenaDistritoSucatas;
import cenas.CenaDistritoSucatas02;
import cenas.CenaDistritoSucatas03;
import personagens.Jogador;

public class Jogo {

    public static void main(String[] args) {
        Jogador jogador = Jogador.criarJogador();
        System.out.println(jogador.toString());

        final CenaBairroEnchentes01 cenaBairroEnchentes01 = new CenaBairroEnchentes01(jogador);
        final CenaDistritoSucatas cenaDistritoSucatas = new CenaDistritoSucatas();
        final CenaDistritoSucatas02 cenaDistritoSucatas02 = new CenaDistritoSucatas02();
        final CenaDistritoSucatas03 cenaDistritoSucatas03 = new CenaDistritoSucatas03();

        cenaBairroEnchentes01.iniciarCena(jogador);
        cenaDistritoSucatas.iniciarCena(jogador);
        cenaDistritoSucatas02.iniciarCena(jogador);
        cenaDistritoSucatas03.iniciarCena(jogador);
    }
}
