
import java.util.Scanner;

public class Evento {

    public static void ambientalAvancado(Jogador j, Scanner sc) {

        System.out.println("\nResíduos pesados bloqueiam a via.");

        System.out.println("1-Remover (força) 2-Ignorar");
        int e = sc.nextInt();

        if (e == 1) {
            if (j.getForca() >= 6) {
                System.out.println("Você limpou a área!");
                j.alterarSustentabilidade(15);
            } else {
                System.out.println("Falhou.");
                j.alterarSustentabilidade(-5);
            }
        }
    }

    public static void sucata(Jogador j) {

        System.out.println("\nVocê encontrou peças úteis.");

        j.getInventario().adicionar(
                new Item("Kit Cura", TipoItem.CURA, 20));
    }

    public static void npcImportante(Jogador j, Scanner sc) {

        System.out.println("\nUm engenheiro pede ajuda.");

        System.out.println("1-Ajudar 2-Ignorar");
        int e = sc.nextInt();

        if (e == 1) {
            if (j.getInteligencia() >= 5) {
                System.out.println("Projeto sustentável criado!");
                j.alterarSustentabilidade(20);
            } else {
                System.out.println("Faltou conhecimento.");
            }
        }
    }

    public static void inimigo(Jogador j, Scanner sc) {

        Inimigo i = new Inimigo("Drone Poluidor", 40, 10);
        Combate.iniciar(j, i, sc);
    }

    public static void decisaoFinal(Jogador j, Scanner sc) {

        System.out.println("\nÚltima decisão:");

        System.out.println("1-Salvar natureza");
        System.out.println("2-Expandir indústria");

        int e = sc.nextInt();

        if (e == 1) j.alterarSustentabilidade(30);
        else j.alterarSustentabilidade(-30);
    }
}
