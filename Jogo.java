import cenas.*;
import construtoresDeCenas.Cena;
import construtoresDeCenas.GameOverException;
import personagens.Jogador;

public class Jogo {
        // Método static void main, o método que inicializa o jogo (programa)
        public static void main(String[] args) {
        // "Tratamento de Exceções" (try... catch... finally...)
        try {

            // "Instanciação"
            Jogador jogador = Jogador.criarJogador();
            System.out.println(jogador.toString());

            // "Classes Finais"
            final CenaPrincipal01 cenaPrincipal01 = new CenaPrincipal01(jogador);

            cenaPrincipal01.iniciarCena(jogador);
        } 
        // GameOverException é uma excessão que pode ser jogada pela classe Combate
        // Caso o jogador perca o combate (forçando o programa a encerrar)
        catch (GameOverException e) {
            System.out.println("FIM DE JOGO");
        } 
        // Quando o jogo acabar, seja pelo usuário finalizando-o 
        // ou sendo derrotado, o scanner é fechado.
        finally {
            Cena.scanner.close();
        }
    }
}