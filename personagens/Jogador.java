public class Jogador extends Personagem {
    public Jogador(String nome, int forca, int inteligencia, int destreza) {
        super(nome, forca, inteligencia, destreza); 
    }

    /* 
    Jogador precisa ter um inventário para guardar Items e equipáveis
    Jogador precisa de atributos que representem Equipamentos atualmente equipados
    Jogador precisa de métodos para equipar esses equipamentos
    Precisamos sobrescrever os getters de forca, inteligencia e destreza para contar os equipamentos
    Um método .toString() que mostre os status do personagem (ou talvez não toString mas algum método p fazer isso)
    */
}
