package construtoresDeCenas.acoes;

import construtoresDeCenas.ElementoCena;
import personagens.Jogador;

// "Classe Abstrata"
public abstract class Acao extends ElementoCena {
    // "Método Abstrato"
    public abstract int executar(Jogador jogador);
}
