package construtoresDeCenas.acoes;

import construtoresDeCenas.ElementoCena;
import personagens.Jogador;

public abstract class Acao extends ElementoCena {
    public abstract int executar(Jogador jogador);
}
