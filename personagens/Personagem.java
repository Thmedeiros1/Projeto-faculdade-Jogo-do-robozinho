package personagens;

public abstract class Personagem {
    private String nome;
    private int vida;
    private final int vidaMax;
    
    private int forca;
    private int inteligencia;
    private int destreza;

    // Construtor usado para inimigos
    public Personagem(String nome, int vida, int vidaMax, int forca, int inteligencia, int destreza) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMax = vidaMax;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.destreza = destreza;
    }

    // Construtor usado para o jogador
     public Personagem(String nome, int forca, int inteligencia, int destreza) {
        this.nome = nome;
        this.vida = 10;
        this.vidaMax = 10;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.destreza = destreza;
    }

    // Construtor usado para NPCs
    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 1;
        this.vidaMax = 1;
        this.forca = 1;
        this.inteligencia = 1;
        this.destreza = 1;
    }

    public String getNome() {
         return nome; 
    }

    public int getVida() {
         return vida; 
    }

     public int getVidaMax() {
         return vidaMax; 
    }

     public int getForca() {
         return forca; 
    }

    public int getInteligencia() {
         return inteligencia; 
    }

    public int getDestreza() {
         return destreza; 
    }
}
