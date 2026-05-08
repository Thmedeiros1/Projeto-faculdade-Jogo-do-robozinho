public abstract class Personagem {
    private String nome;
    private int vida;
    private final int vidaMax;
    
    private int forca;
    private int inteligencia;
    private int destreza;

    // Construtor usado para o jogador e inimigos
    public Personagem(String n, int v, int vM, int f, int i, int d) {
        nome = n;
        vida = v;
        vidaMax = vM;
        forca = f;
        inteligencia = i;
        destreza = d;
    }

    // Construtor usado para NPCs
    public Personagem(String n) {
        nome = n;
        vida = 1;
        vidaMax = 1;
        forca = 1;
        inteligencia = 1;
        destreza = 1;
    }

    
}
