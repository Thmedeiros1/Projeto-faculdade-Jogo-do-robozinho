package construtoresDeCenas;


import personagens.Inimigo;
import personagens.Jogador;
import personagens.itens.Item;

// "Herança"
public class Combate extends ElementoCena {
    // "Encapsulamento"
    private Inimigo inimigo;
    private Item recompensa;

    // "Método Construtor"
    public Combate(Inimigo inimigo, Item recompensa) {
        this.inimigo = inimigo;
        this.recompensa = recompensa;
    }
    
    public void iniciar(Jogador jogador) {
        System.out.println("\nCOMBATE INICIADO");
        System.out.println("Inimigo: " + inimigo.getNome() + " (Vida: " + inimigo.getVida() + ")");
        
        while (jogador.estaVivo() && inimigo.estaVivo()) {
            boolean acaoRealizada = false;

            System.out.println("\n[ " + inimigo.getNome() + " ] Vida: " + inimigo.getVida() + "/" + inimigo.getVidaMax());
            System.out.println("[ Você ] Vida: " + jogador.getVida() + "/" + jogador.getVidaMax());
            System.out.println("[ Dados ] Ataque: " + jogador.getAtaque() + " / Defesa: " + jogador.getDefesa());
            
            System.out.println("\nAÇÕES:");
            System.out.println("   1 - Atacar");
            System.out.println("   2 - Ver o inventário");
            
            int escolha = -1;
            while (escolha < 0) {
                System.out.print("Escolha: ");
                // "Tratamento de Excessões"
                try {
                    escolha = Integer.parseInt(Cena.scanner.next());
                } catch (NumberFormatException e) {
                    System.out.println("Opção inválida!");
                }
            }
                    
            switch (escolha) {
                case 1:
                    int danoCausado = jogador.getAtaque() - inimigo.getDefesa();
                    if (danoCausado < 0) {
                        danoCausado = 0;
                    }
                    inimigo.receberDano(danoCausado);
                    System.out.println("ATAQUE! Dano: " + danoCausado + " (! utilizando " + 
                        (jogador.getInventario().getArma() != null ? jogador.getInventario().getArma().getNome() 
                            : "força bruta!)"));
                    acaoRealizada = true;
                    break;
                case 2:
                    acaoRealizada = jogador.menuInventario();
                    break;
                default:
                    System.out.println("❌ Opção inválida!");
            }

            // Turno do inimigo
            if (acaoRealizada && inimigo.estaVivo()) {
                int danoCausado = inimigo.getAtaque() - jogador.getDefesa();
                if (danoCausado < 0) {
                    danoCausado = 0;
                }
                System.out.println("\n--- Turno do Inimigo ---");
                jogador.receberDano(danoCausado);
                System.out.println(inimigo.getNome() + " atacou! Dano: " + danoCausado + "!");  
            }
        }
        if (!inimigo.estaVivo()) {
            System.out.println("\nVITÓRIA! " + inimigo.getNome() + " foi derrotado!");
            System.out.println(inimigo.getNome() + " deixou cair " + recompensa.getNome() + "!");
            jogador.getInventario().adicionarItem(recompensa);
        } else if (!jogador.estaVivo()) {
            System.out.println("Derrota...");
            throw new GameOverException("O jogador foi derrotado em");
        }
    }
}   