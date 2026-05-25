package cenas;

import construtoresDeCenas.Cena;
import construtoresDeCenas.Combate;
import construtoresDeCenas.Dialogo;
import construtoresDeCenas.FimCena;
import personagens.Inimigo;
import personagens.Jogador;

public class CenaAleatoria02 extends Cena {
        public CenaAleatoria02() {
        super();
        elementos.add(new Dialogo("Enquanto andava..."));
        elementos.add(new Dialogo("Um monstro de sucata!"));
        elementos.add(new Combate(new Inimigo("Monstro de Sucata", 10, 10, 5, 4, 3), null));
        elementos.add(new Dialogo("Você continua sua jornada."));
        elementos.add(new FimCena());
    }
}
