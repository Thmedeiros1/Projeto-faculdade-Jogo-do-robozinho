// se for dar algo para o jogador se defender de no inicio

package cenas;

import construtoresDeCenas.*;

public class CenaDistritoSucatas extends Cena {

    public CenaDistritoSucatas() {
        super();

        elementos.add(new Dialogo(
        "...\n" +
        "Inicializando sistema principal..."
        ));

        elementos.add(new Dialogo(
        "ERRO.\n" +
        "Conexão com Rede Central inexistente."
        ));
//colocar nome do personagem quando lembrar
        elementos.add(new Dialogo(
        "Unidade de manutenção urbana 3-R operacional." 
        ));

        elementos.add(new Dialogo(
        "Reiniciando sensores ambientais..."
        ));

        elementos.add(new Dialogo(
        "Toxicidade do ar: CRÍTICA.\n" +
        "Temperatura externa: 41°C.\n" +
        "Nível de radiação: acima do permitido."
        ));

        elementos.add(new Dialogo(
        "Seus sensores se ajustam lentamente."
        ));

        elementos.add(new Dialogo(
        "O céu da metrópole havia desaparecido atrás de uma camada grossa de fumaça verde."
        ));

        elementos.add(new Dialogo(
        "Arranha-céus surgiam no horizonte como esqueletos gigantescos.\n" +
        "Alguns ainda piscavam propagandas antigas."
        ));

        elementos.add(new Dialogo(
        "\"NÚCLEO GAIA — ENERGIA LIMPA PARA O FUTURO.\""
        ));

        elementos.add(new Dialogo(
        "A mensagem brilhava sobre toneladas de sucata e carros destruídos."
        ));

        elementos.add(new Dialogo(
        "Você estava no Distrito das Sucatas.\n" +
        "A periferia industrial de Neo Aurora."
        ));

        elementos.add(new Dialogo(
        "Antes do acidente, caminhões cruzavam aquelas avenidas noite e dia.\n" +
        "Agora apenas ferrugem, fumaça e silêncio permaneciam."
        ));

        elementos.add(new Dialogo(
        "Fragmentos de metal cobriam as ruas.\n" +
        "Canos quebrados despejavam líquidos escuros nos esgotos abertos."
        ));

        elementos.add(new Dialogo(
        "Algo se movia entre os montes de lixo."
        ));

        elementos.add(new Dialogo(
        "Seus arquivos internos estavam danificados.\n" +
        "Mas uma informação ainda permanecia intacta:"
        ));

        elementos.add(new Dialogo(
        "O Núcleo Gaia explodiu há 173 dias."
        ));

        elementos.add(new Dialogo(
        "A explosão começou no centro da cidade.\n" +
        "Depois disso...\n" +
        "tudo piorou."
        ));

        elementos.add(new Dialogo(
        "As águas ficaram tóxicas.\n" +
        "A vegetação sofreu mutações.\n" +
        "Máquinas começaram a apresentar comportamento anormal."
        ));

        elementos.add(new Dialogo(
        "E criaturas surgiram nas regiões contaminadas."
        ));

        elementos.add(new Dialogo(
        "Seu último registro antes da falha completa dizia:"
        ));

        elementos.add(new Dialogo(
        "\"Prioridade máxima:\n" +
        "Conter colapso ambiental.\""
        ));

        elementos.add(new Dialogo(
        "Mas você não conseguia lembrar quem enviou essa ordem."
        ));

        elementos.add(new Dialogo(
        "Um vento quente atravessa a avenida.\n" +
        "Papéis queimados deslizam pelo chão."
        ));

        elementos.add(new Dialogo(
        "Ao longe, uma sirene antiga ainda tocava sem parar."
        ));

        elementos.add(new Dialogo(
        "Então...\n" +
        "um sinal de rádio invade seus sistemas."
        ));

        elementos.add(new Dialogo(
        "\"Se alguma unidade ainda estiver ativa...\"\n" +
        "\"precisamos de ajuda no ferro-velho central.\""
        ));

        elementos.add(new Dialogo(
        "O sinal estava fraco.\n" +
        "Interferências cobriam quase toda a transmissão."
        ));

        elementos.add(new Dialogo(
        "Mas havia algo estranho."
        ));

        elementos.add(new Dialogo(
        "A voz parecia...\n" +
        "humana."
        ));

        elementos.add(new PontoDeEscolha(
        "Como R-0X irá responder?",
        
        new Opcao(
        "Seguir o sinal imediatamente",
        30),

        new Opcao(
        "Explorar os arredores antes",
        34)
        ));

        elementos.add(new Dialogo(
        "Nova rota calculada."
        ));

        elementos.add(new Dialogo(
        "Objetivo atualizado:\n" +
        "Investigar transmissão desconhecida."
        ));

        elementos.add(new Dialogo(
        "R-0X começa a caminhar pelas ruas destruídas.\n" +
        "Seus passos metálicos ecoam pelo Distrito das Sucatas."
        ));

        elementos.add(new Dialogo(
        "Entre a fumaça e os destroços...\n" +
        "algo observa você."
        ));

        elementos.add(new FimCena());

        elementos.add(new Dialogo(
        "Você ativa os sensores secundários."
        ));

        elementos.add(new Dialogo(
        "O distrito parecia abandonado.\n" +
        "Mas marcas recentes apareciam na poeira."
        ));

        elementos.add(new Dialogo(
        "Pegadas.\n" +
        "Grandes demais para serem humanas."
        ));

        elementos.add(new Dialogo(
        "Um som metálico ecoa entre os prédios destruídos."
        ));

        elementos.add(new Dialogo(
        "Talvez o acidente tenha criado mais do que poluição."
        ));

        elementos.add(new Dialogo(
        "Depois de analisar os arredores, você decide seguir o sinal desconhecido."
        ));

        elementos.add(new FimCena());
    }
}
