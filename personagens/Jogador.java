import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogador extends Personagem {
    public Jogador(String nome, int forca, int inteligencia, int destreza) {
        super(nome, forca, inteligencia, destreza); 
    }

    public static Jogador criarJogador() {
		Scanner scanner = new Scanner(System.in);
		String nome;
		int forca = -1;
		int inteligencia = -1;
		int destreza = -1;
		int pontos = 10;

		System.out.println("Insira o nome do protagonista: ");
		nome = scanner.next();
		
	    System.out.println("\n📊 Distribua " + pontos + " pontos entre os atributos:");
	    System.out.println("   Força: combate e trabalho pesado");
	    System.out.println("   Inteligência: análises e diálogos");
	    System.out.println("   restante irá a para Destreza: agilidade e cordenação"); 

	    System.out.println(" Força: ");
		while(forca < 0 || forca > pontos) {
			try {
				forca = scanner.nextInt();
				if (forca < 0 || forca > pontos) {
					System.out.println("❌ Entrada inválida! Digite um número igual ou menor que a quantidade de pontos.");
				}
			} catch (InputMismatchException e) {
				System.out.println("❌ Entrada inválida! Digite um número.");
			}
		}
		pontos -= forca;

	    System.out.println(" Inteligencia: ");
		while(inteligencia < 0 || inteligencia > pontos) {
			try {
				inteligencia = scanner.nextInt();
				if (inteligencia < 0 || inteligencia > pontos) {
					System.out.println("❌ Entrada inválida! Digite um número igual ou menor que a quantidade de pontos.");
				}
			} catch (InputMismatchException e) {
				System.out.println("❌ Entrada inválida! Digite um número.");
			}
		}
        pontos -= inteligencia;
        destreza = pontos;
        System.out.println( "Destreza (automática): " + destreza);

	    return new Jogador(nome, forca, inteligencia, destreza);
	}

	public String toString() {
		return "Nome: " + this.getNome() + "\n__STATUS__" + "\nForça: " + this.getForca() + "\nInteligência: " + this.getInteligencia() + "\nDestreza: " + this.getDestreza();
	}
    /* 
    Jogador precisa ter um inventário para guardar Items e equipáveis
    Jogador precisa de atributos que representem Equipamentos atualmente equipados
    Jogador precisa de métodos para equipar esses equipamentos
    Precisamos sobrescrever os getters de forca, inteligencia e destreza para contar os equipamentos
    */
}
