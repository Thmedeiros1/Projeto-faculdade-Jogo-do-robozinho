
/**
 * CLASSE: Inimigo
 * CONCEITO POO: Classe com encapsulamento
 */
public class Inimigo {
    
    private String nome;
    private int vida;
    private int vidaMaxima;
    private int ataque;
    private String habilidade;
    
    /**
     * MÉTODO CONSTRUTOR
     */
    public Inimigo(String nome, int vida, int ataque) {
        this(nome, vida, ataque, "Ataque normal");
    }
    
    /**
     * MÉTODO CONSTRUTOR - SOBRECARGA
     */
    public Inimigo(String nome, int vida, int ataque, String habilidade) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.ataque = ataque;
        this.habilidade = habilidade;
    }
    
    public int atacar() { return ataque; }
    
    /**
     * Habilidade especial do inimigo
     */
    public void usarHabilidade(Jogador j) {
        System.out.println(" " + nome + " usou " + habilidade + "!");
        int danoEspecial = ataque + 5;
        j.consumirEnergia(danoEspecial);
        System.out.println("   Causou " + danoEspecial + " de dano!");
    }
    
    public void receberDano(int d) { 
        vida -= d;
        System.out.println("   " + nome + " sofreu " + d + " de dano! Vida: " + Math.max(0, vida) + "/" + vidaMaxima);
    }
    
    public boolean estaVivo() { return vida > 0; }
    
    public void resetarVida() { vida = vidaMaxima; }
    
    public String getNome() { return nome; }
    public int getVida() { return vida; }
    public int getVidaMaxima() { return vidaMaxima; }
    public String getHabilidade() { return habilidade; }
}
