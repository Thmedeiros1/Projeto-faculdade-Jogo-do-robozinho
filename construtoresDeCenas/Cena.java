package construtoresDeCenas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import construtoresDeCenas.acoes.Acao;
import cenas.CenaAleatoria01;
import personagens.Jogador;

public abstract class Cena {

    private static ArrayList<Integer> cenasAleatorias = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    protected ArrayList<ElementoCena> elementos;
    private int elementoAtual = 0;
    private Scanner scanner = new Scanner(System.in);

    public Cena() {
        this.elementos = new ArrayList<>();
    }

    public void iniciarCena(Jogador jogador) {
        while (elementoAtual != -1 && elementoAtual < elementos.size()) {
            ElementoCena elemento = elementos.get(elementoAtual);

            if (elemento instanceof Dialogo) {
                Dialogo dialogo = (Dialogo) elemento;
                System.out.println(dialogo.texto);
                System.out.println("(Insira qualquer tecla para continuar...)");
                scanner.nextLine();
                elementoAtual++;
            } else 
            if (elemento instanceof PontoDeEscolha) {
                PontoDeEscolha escolha = (PontoDeEscolha) elemento;
                System.out.println(escolha.pergunta);

                for (int i = 0; i < escolha.opcoes.size(); i++) {
                    System.out.println((i + 1) + ": " + escolha.opcoes.get(i).texto);
                }

                int numOpcoes = escolha.opcoes.size();
                // Talvez seja bom criar uma classe que tenha 
                // esse tratamento de excessões, por enquanto vou deixar aqui
                int escolhaUsuario = getEscolhaUsuario(numOpcoes);
                Opcao opcaoEscolhida = escolha.opcoes.get(escolhaUsuario - 1);
                elementoAtual = opcaoEscolhida.proximoElemento;
            } else
            if (elemento instanceof Acao) {
                Acao acao = (Acao) elemento;
                elementoAtual = acao.executar(jogador);
            } else
            if (elemento instanceof FimCena) {
                elementoAtual = -1;
            }
        }
        // Aqui podemos por a chamada ao menu de próximas opções do usuário
        // Como ver o inventário, status...
        System.out.println("A cena atual acabou!");
        scanner.close();
    }

    private int getEscolhaUsuario(int numOpcoes) {
        int escolha = -1;
        while (escolha < 1 || escolha > numOpcoes) {
            System.out.print("Digite o número da sua escolha: ");
            try {
                escolha = Integer.parseInt(scanner.nextLine());
                if (escolha < 1 || escolha > numOpcoes) {
                    System.out.println("Opção inválida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida.");
            }
        }
        return escolha;
    }

    public static Cena getCenaAleatoria() {
        int numeroAleatorio = (int)((Math.random() * cenasAleatorias.size()));
        switch(numeroAleatorio) {
            // Criar um case para cada cena aleatória
            // Atualmente só tem case 0 como exemplo
            case 0:
                cenasAleatorias.remove(numeroAleatorio);
                return (Cena) new CenaAleatoria01();
            default:
                return (Cena) new CenaAleatoria01();
        }
    }
}
