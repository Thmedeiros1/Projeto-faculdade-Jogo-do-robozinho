import cenas.*;
import construtoresDeCenas.Cena;
import construtoresDeCenas.GameOverException;
import personagens.Jogador;

public class Jogo {
        public static void main(String[] args) {
        try {
            Jogador jogador = Jogador.criarJogador();
            System.out.println(jogador.toString());

            final CenaPrincipal01 cenaPrincipal01 = new CenaPrincipal01();
            final CenaBairroEnchentes01 cenaBairroEnchentes01 = new CenaBairroEnchentes01(jogador);
            final CenaDistritoSucatas cenaDistritoSucatas = new CenaDistritoSucatas();
            final CenaDistritoSucatas02 cenaDistritoSucatas02 = new CenaDistritoSucatas02();
            final CenaDistritoSucatas03 cenaDistritoSucatas03 = new CenaDistritoSucatas03();

            cenaPrincipal01.iniciarCena(jogador);
            cenaBairroEnchentes01.iniciarCena(jogador);
            cenaDistritoSucatas.iniciarCena(jogador);
            cenaDistritoSucatas02.iniciarCena(jogador);
            cenaDistritoSucatas03.iniciarCena(jogador);
        } catch (GameOverException e) {
            System.out.println("FIM DE JOGO");
        } finally {
            Cena.scanner.close();
        }
    }
}