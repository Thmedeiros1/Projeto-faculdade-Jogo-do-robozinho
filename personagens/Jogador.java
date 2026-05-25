package personagens;

import construtoresDeCenas.Cena;
import personagens.itens.Inventario;
import personagens.itens.Item;
import personagens.itens.ItemConsumivel;
import personagens.itens.ItemEquipavel;

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
		nome = Cena.scanner.nextLine();
		
	    System.out.println("\nDistribua " + pontos + " pontos entre os atributos:");
	    System.out.println("   Força: Aumenta seu ataque");
	    System.out.println("   Vigor: Aumenta sua vida máxima");
	    System.out.println("   restante irá a para fortitude: Aumenta sua defesa"); 

	    System.out.println(" Força: ");
		while(forca < 0 || forca > pontos) {
			// "Tratamento de Exceções"
			try {
				forca = Integer.parseInt(Cena.scanner.nextLine());
				if (forca < 0 || forca > pontos) {
					System.out.println("Entrada inválida! Digite um número igual ou menor que a quantidade de pontos.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida! Digite um número.");
			}
		}
		pontos -= forca;

	    System.out.println(" vigor: ");
		while(vigor < 0 || vigor > pontos) {
			// "Tratamento de Exceções"
			try {
				vigor = Integer.parseInt(Cena.scanner.nextLine());
				if (vigor < 0 || vigor > pontos) {
					System.out.println("Entrada inválida! Digite um número igual ou menor que a quantidade de pontos.");
				}
			} catch (NumberFormatException e) {
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

	public boolean menuInventario() {
		if (this.getInventario().getItens().isEmpty()) {
            System.out.println("Inventário vazio!");
            return false;
        }
        System.out.println("\nItens disponíveis: ");
        this.getInventario().listar();
        System.out.print("Qual item usar? (0 para cancelar): ");
        int idx;
        // "Tratamento de Excessões"
        try {
            idx = Integer.parseInt(Cena.scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Inválido!");
            return false;
        }
        if (idx == 0) {
            return false;
        }
        // "Tratamento de Excessões"
        // "Polimorfismo de Classes"
        try {
            Item item = this.getInventario().getItens().get(idx - 1);
            if (item instanceof ItemConsumivel) {
                ((ItemConsumivel) item).consumir(this);
                return true;
            } else
			if (item instanceof ItemEquipavel) {
				inventario.equiparItem((ItemEquipavel)(item));
				return true;
			}
            else {
                System.out.println("Item inválido para consumo");
				return false;
			}
		}
		catch(IndexOutOfBoundsException e) {
            System.out.println("Opção de item inválida");
			return false;
        }
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
