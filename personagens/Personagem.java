package personagens;

public abstract class Personagem {
    private String nome;
    private int vida;
    private final int vidaMax;
    private int defesa;
    private int ataque;
    
    private int forca;
    private int vigor;
    private int fortitude;

    // Construtor usado para inimigos
    public Personagem(String nome, int vida, int vidaMax, int forca, int vigor, int fortitude) {
        this.nome = nome;
        this.vida = vidaMax + this.vigor;
        this.vidaMax = vidaMax + this.vigor;
        this.ataque = this.forca;
        this.defesa = this.fortitude;
        this.forca = forca;
        this.vigor = vigor;
        this.fortitude = fortitude;
    }

    // Construtor usado para o jogador
     public Personagem(String nome, int forca, int vigor, int fortitude) {
        this.nome = nome;
        this.vida = 10 + this.vigor;
        this.vidaMax = 10 + this.vigor;
        this.ataque = this.forca;
        this.defesa = this.fortitude;
        this.forca = forca;
        this.vigor = vigor;
        this.fortitude = fortitude;
    }

    // Construtor usado para NPCs
    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 1;
        this.vidaMax = 1;
        this.ataque = 1;
        this.defesa = 1;
        this.forca = 1;
        this.vigor = 1;
        this.fortitude = 1;
    }

    public String getNome() {
         return nome; 
    }

    public int getVida() {
         return vida; 
    }

     public int getDefesa() {
         return defesa; 
    }

     public int getAtaque() {
         return ataque; 
    }

     public int getVidaMax() {
         return vidaMax; 
    }

     public int getForca() {
         return forca; 
    }

    public int getVigor() {
         return vigor; 
    }

    public int getFortitude() {
         return fortitude; 
    }
}
