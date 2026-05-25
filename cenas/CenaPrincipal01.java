package cenas;

import construtoresDeCenas.*;
import construtoresDeCenas.acoes.*;
import personagens.Inimigo;
import personagens.Jogador;
import personagens.itens.Arma;
import personagens.itens.Armadura;
import personagens.itens.ItemCura;

public class CenaPrincipal01 extends Cena {
    public CenaPrincipal01(Jogador jogador) {
        super();

        elementos.add(new Dialogo("...\nInicializando sistema principal"));

        elementos.add(new Dialogo("ERRO\nConexão com Rede Central inexistente"));

        elementos.add(new Dialogo("Unidade de manutenção urbana 3-R operacional"));

        elementos.add(new Dialogo("Reiniciando sensores ambientais..."));

        elementos.add(new Dialogo("Localização: DISTRITO DAS SUCATAS.\nToxicidade do ar: MUITO BAIXA.\nTemperatura externa: 35°C\nNível de radiação: MUITO BAIXO."));

        elementos.add(new Dialogo("Seus sensores se ajustam lentamente"));

        elementos.add(new Dialogo("Você observa o mundo ao seu redor e enxerga uma paisagem de sujeira e destruição.\nUma estranha neblina cobria o local.\nRios que antigamente eram cristalinos estavam cobertos de lixo.\nMuitas sucatas espalhadas por todos os lados."));

        elementos.add(new Dialogo("Você não entende como, mas havia sido ligado novamente.\nPor ter passado muito tempo desligado e em péssimas condições, boa parte de sua memória havia sido perdida.\nO que havia acontecido ness lugar era uma incógnita."));

        elementos.add(new Dialogo("Você conseguia apenas lembrar que foi construído na intenção de restaurar o meio ambiente.\nE que o nome designado a você..."));

        elementos.add(new Dialogo("Era " + jogador.getNome() + "."));

        elementos.add(new Dialogo("Em busca de tentar entender o que estava acontecendo, você resolveu andar por aí."));

        elementos.add(new Dialogo("Enquanto caminhava, você conseguia ouvir um estranho barulho ecoando ao longe.\nVocê não entendia da onde esse som se originava, então resolveu ignorar por agora."));

        elementos.add(new Dialogo("Até que..."));

        elementos.add(new Dialogo("PLOFT"));

        elementos.add(new Dialogo("Você tropeçou e caiu no chão.\nAo olhar para trás, percebeu que havia tropeçado em um comprido cano de metal enferrujado.\nApós pensar um pouco, rsolveu levar este cano consigo, ele talvez possa ser útil."));

        elementos.add(new AcaoDarItem(new Arma("Cano de metal enferrujado", "Cano de metal meio instável, mas dá para o gasto", 3, 2, 0), 16));

        elementos.add(new AcaoAbrirInventario(17));

        elementos.add(new Dialogo("Você continuou caminhando\nvendo as condições em que o mundo se encontrava\ne se questionando como tudo foi acabar desse jeito."));

        elementos.add(new Dialogo("Estava tudo bem até que ouviu um rugido saindo de uma das pilhas de sucata que haviam ao redor.\nTalvez existisse algum animal ali dentro."));

        elementos.add(new Dialogo("Enquanto observava, percebeu que a pilha começou a se movimentar.\nEla começou a ficar alta como se estivesse se levantando.\nE é quando percebe que ela estava viva.\nE aparentemente nao era amigável."));

        elementos.add(new Dialogo("Ela vem em sua direção."));

        elementos.add(new Combate(new Inimigo("Pilha de sucata", 18, 18, 2, 2, 1), new ItemCura("Pedaços de sucata", "Placas de metal pequenas", 4)));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));


        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));


        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

        elementos.add(new Dialogo(""));

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
