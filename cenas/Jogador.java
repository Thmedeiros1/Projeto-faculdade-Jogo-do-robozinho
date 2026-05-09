/**
 * CLASSE: Jogador
 * CONCEITO POO: Encapsulamento (atributos privados, getters/setters)
 *               Atributos de instância
 *               Classe Final (não pode ser estendida)
 */
public final class Jogador {
    
    // ATRIBUTOS PRIVADOS - Encapsulamento
    private String nome;
    private int energia = 100;
    private final int ENERGIA_MAXIMA = 100; // ATRIBUTO FINAL
    
    // Atributos do personagem
    private int forca;
    private int inteligencia;
    private int destreza;
    
    // Inventário
    private Inventario inventario;
    
    // Equipamentos
    private ItemEquipavel arma;
    private ItemEquipavel armadura;
    
    /**
     * MÉTODO CONSTRUTOR - Sobrecarga (construtor principal)
     * @param nome Nome do jogador
     */
    public Jogador(String nome) {
        this.nome = nome;
        this.inventario = new Inventario();
    }
    
    /**
     * MÉTODO CONSTRUTOR - Sobrecarga (com atributos iniciais)
     */
    public Jogador(String nome, int forca, int inteligencia, int destreza) {
        this(nome); // Chama o outro construtor
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.destreza = destreza;
    }
    
    // MÉTODOS DE ENERGIA
    public void consumirEnergia(int v) { 
        energia = Math.max(0, energia - v);
    }
    
    public void recuperarEnergia(int v) { 
        energia = Math.min(ENERGIA_MAXIMA, energia + v);
    }
    
    public boolean temEnergia() { return energia > 0; }
    
    // MÉTODOS DE ATRIBUTOS (COM BÔNUS DE EQUIPAMENTOS)
    public int getForcaTotal() {
        int bonus = (arma != null ? arma.getBonusForca() : 0);
        return forca + bonus;
    }
    
    public int getInteligenciaTotal() {
        int bonus = (armadura != null ? armadura.getBonusInteligencia() : 0);
        return inteligencia + bonus;
    }
    
    public int getForca() { return forca; }
    public int getInteligencia() { return inteligencia; }
    public int getDestreza() { return destreza; }
    
    public void setAtributos(int f, int i, int d) {
        this.forca = f;
        this.inteligencia = i;
        this.destreza = d;
    }
 // ========== MÉTODOS PARA ALTERAR ATRIBUTOS ==========

    public void alterarForca(int valor) {
        this.forca += valor;
        if (this.forca < 0) this.forca = 0;
        System.out.println("💪 Força: " + (valor > 0 ? "+" : "") + valor + " → " + this.forca);
    }

    public void alterarInteligencia(int valor) {
        this.inteligencia += valor;
        if (this.inteligencia < 0) this.inteligencia = 0;
        System.out.println("🧠 Inteligência: " + (valor > 0 ? "+" : "") + valor + " → " + this.inteligencia);
    }

    public void alterarDestreza(int valor) {
        this.destreza += valor;
        if (this.destreza < 0) this.destreza = 0;
        System.out.println("⚡ Destreza: " + (valor > 0 ? "+" : "") + valor + " → " + this.destreza);
    }
    
    // GETTERS E SETTERS (Encapsulamento)
    public String getNome() { return nome; }
    public int getEnergia() { return energia; }
    public Inventario getInventario() { return inventario; }
    
    // SISTEMA DE EQUIPAMENTOS
    public void equiparArma(ItemEquipavel item) {
        this.arma = item;
        System.out.println("⚔️ Equipado: " + item.getNome());
    }
    
    public void equiparArmadura(ItemEquipavel item) {
        this.armadura = item;
        System.out.println("🛡️ Equipado: " + item.getNome());
    }
    
    public ItemEquipavel getArma() { return arma; }
    public ItemEquipavel getArmadura() { return armadura; }
    
}
