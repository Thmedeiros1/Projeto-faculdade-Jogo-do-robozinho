import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Cena {

    private static ArrayList<Integer> cenasAleatorias = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    private ArrayList<String> dialogos;
    private int dialogoAtual = 0;
    private Scanner scanner = new Scanner(System.in);

    public Cena(ArrayList<String> d) {
        dialogos = d;
    }

    public void iniciarCena() {
        while (dialogoAtual < dialogos.size()) {
            System.out.println(dialogos.get(dialogoAtual));
            System.out.println("(Insira qualquer tecla...)");
            scanner.next();
            dialogoAtual++;
        }
        scanner.close();
    }

    public static Cena getCenaAleatoria() {
        /**  
        * Pega o array estático definido nessa classe
        * Calcula um número aleatório entre zero e o tamanho do array
        * Criamos um switch-case para cada cena aleatória que fizermos
        * Retiramos do array o elemento que foi utilizado neste uso do método
        * E o case vai retornar uma nova instância da cena aleatória
        
        * OBS.: Lembrando que este método vai ser usado na classe Main do jogo
        * algo como: Cena.getCenaAleatoria().iniciarCena();
        */


        int numeroAleatorio;
        numeroAleatorio = (int)((Math.random() * cenasAleatorias.size()));
        switch(numeroAleatorio) {
            // Criar um case para cada cena aleatória
            case 1:
                cenasAleatorias.remove(numeroAleatorio);
                return (Cena) new CenaAleatoria01();
            default:
                return (Cena) new CenaAleatoria01();
        }
    }
}
