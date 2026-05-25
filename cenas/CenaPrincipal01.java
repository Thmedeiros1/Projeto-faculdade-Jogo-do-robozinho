package cenas;

import construtoresDeCenas.*;
import construtoresDeCenas.acoes.AcaoAbrirInventario;
import construtoresDeCenas.acoes.AcaoDarItem;
import personagens.Inimigo;
import personagens.itens.Arma;
import personagens.itens.Armadura;
import personagens.itens.ItemCura;

public class CenaPrincipal01 extends Cena {
    public CenaPrincipal01() {
        super();

        elementos.add(new Dialogo("Bem vindo ao mundo!"));

        elementos.add(new AcaoDarItem(new ItemCura("Poção de cura", "poção de cura", 3), 2));
        
        elementos.add(new AcaoDarItem(new Arma("Espada de madeira", "Uma espada de madeira", 3, 2, 0), 3));
        
        elementos.add(new AcaoAbrirInventario(4));

        elementos.add(new Combate(new Inimigo("Aps", 20, 20, 3, 2, 4),
                    new Armadura("Peitoral de madeira", "rústico", 2, 0, 3)));
        
        elementos.add(new AcaoAbrirInventario(6));

        elementos.add(new Dialogo("Você passou pela primeira cena!"));

        elementos.add(new PontoDeEscolha("Como você se sente?",
            new Opcao("Triste com a APS...", 8),
            new Opcao("Animado com nosso progresso na APS!", 8)
        ));

        elementos.add(new FimCena());
    }
}
