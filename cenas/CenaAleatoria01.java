package cenas;

import construtoresDeCenas.*;
import construtoresDeCenas.acoes.*;
import personagens.itens.ItemCura;

public class CenaAleatoria01 extends Cena {
    public CenaAleatoria01() {
        super();
        elementos.add(new Dialogo("Ao seu redor, você verifica alguns escombros."));
        elementos.add(new Dialogo("Pera, tem um brilho no meio deles!"));
        elementos.add(new Dialogo("Você se aproxima para discernir o que é o brilho."));
        elementos.add(new AcaoDarItem(new ItemCura("Pedaços de sucata", "Placas de metal pequenas", 5), 4));
        elementos.add(new Dialogo("Você continua sua jornada."));
        elementos.add(new FimCena());
    }
}