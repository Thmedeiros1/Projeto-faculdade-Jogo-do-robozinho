package personagens;

import java.util.InputMismatchException;
import construtoresDeCenas.Cena;
import personagens.itens.Inventario;

// "Herança"
public class Jogador extends Personagem {
	// "Encapsulamento"
	private Inventario inventario;

	// "Método Construtor"
    public Jogador(String nome, int forca, int vigor, int fortitude) {
        super(nome, forca, vigor, fortitude); 
		this.inventario = new Inventario();
    }

	// "Método Estático"
    public static Jogador criarJogador() {
		String nome;
		int forca = -1;
		int vigor = -1;
		int fortitude = -1;
		int pontos = 10;

		System.out.println("Insira o nome do protagonista: ");
		nome = Cena.scanner.next();
		
	    System.out.println("\nDistribua " + pontos + " pontos entre os atributos:");
	    System.out.println("   Força: Aumenta seu ataque");
	    System.out.println("   Vigor: Aumenta sua vida máxima");
	    System.out.println("   restante irá a para fortitude: Aumenta sua defesa"); 

	    System.out.println(" Força: ");
		while(forca < 0 || forca > pontos) {
			// "Tratamento de Exceções"
			try {
				forca = Cena.scanner.nextInt();
				if (forca < 0 || forca > pontos) {
					System.out.println("Entrada inválida! Digite um número igual ou menor que a quantidade de pontos.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida! Digite um número.");
			}
		}
		pontos -= forca;

	    System.out.println(" vigor: ");
		while(vigor < 0 || vigor > pontos) {
			// "Tratamento de Exceções"
			try {
				vigor = Cena.scanner.nextInt();
				if (vigor < 0 || vigor > pontos) {
					System.out.println("Entrada inválida! Digite um número igual ou menor que a quantidade de pontos.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida! Digite um número.");
			}
		}
        pontos -= vigor;
        fortitude = pontos;
        System.out.println( "Fortitude (automática): " + fortitude);

	    return new Jogador(nome, forca, vigor, fortitude);
	}

	public Inventario getInventario() {
		return inventario;
	}

	// "Sobrescrita"
	@Override
	public int getAtaque() {
		if (this.getInventario().getArma() != null) {
			return super.getAtaque() + this.getInventario().getArma().getAtributoAtaque();
		} else {
			return super.getAtaque();
		}
	}

	// "Sobrescrita"
	@Override
	public int getDefesa() {
		if (this.getInventario().getArmadura() != null) {
			return super.getDefesa() + this.getInventario().getArmadura().getAtributoDefesa();
		} else {
			return super.getDefesa();
		}
	}

	// "Sobrescrita"
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\n__STATUS__" + "\nForça: " + this.getForca() + "\nVigor: " + this.getVigor() + "\nFortitude: " + this.getFortitude();
	}
}
