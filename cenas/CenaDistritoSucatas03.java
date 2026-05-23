package cenas;

import construtoresDeCenas.*;

public class CenaDistritoSucatas03 extends Cena {

    public CenaDistritoSucatas03() {
        super();

        elementos.add(new Dialogo(
        "A fumaça ficava mais densa conforme 3-R avançava pelo Distrito das Sucatas."
        ));

        elementos.add(new Dialogo(
        "Os prédios pareciam inclinados na direção do centro da cidade.\n" +
        "Como se a explosão tivesse empurrado tudo para fora."
        ));

        elementos.add(new Dialogo(
        "Placas metálicas vibravam com o vento quente.\n" +
        "Cabos elétricos soltavam faíscas acima das ruas destruídas."
        ));

        elementos.add(new Dialogo(
        "Seu sistema de navegação tenta recalcular a rota."
        ));

        elementos.add(new Dialogo(
        "\"Destino principal identificado:\""
        ));

        elementos.add(new Dialogo(
        "\"NÚCLEO GAIA\"\n" +
        "Distância estimada: 18 quilômetros."
        ));

        elementos.add(new Dialogo(
        "Uma imagem incompleta surge em seus arquivos."
        ));

        elementos.add(new Dialogo(
        "O Núcleo Gaia.\n" +
        "A maior central energética já construída em Neo Aurora."
        ));

        elementos.add(new Dialogo(
        "Projetado para transformar lixo urbano e resíduos industriais em energia limpa."
        ));

        elementos.add(new Dialogo(
        "Projeto sustentável.\n" +
        "Baixo custo.\n" +
        "Produção infinita."
        ));

        elementos.add(new Dialogo(
        "Então veio a explosão."
        ));

        elementos.add(new Dialogo(
        "Algo no núcleo saiu do controle.\n" +
        "Os sistemas ambientais falharam em sequência."
        ));

        elementos.add(new Dialogo(
        "A contaminação começou no centro da metrópole...\n" +
        "e se espalhou como uma doença."
        ));

        elementos.add(new Dialogo(
        "Agora, quanto mais perto do núcleo...\n" +
        "mais agressivo o ambiente se tornava."
        ));

        elementos.add(new Dialogo(
        "Seus sensores mostram múltiplas zonas críticas no caminho."
        ));

        elementos.add(new Dialogo(
        "\"SETOR 02 — Região Alagada\"\n" +
        "Risco: ALTO."
        ));

        elementos.add(new Dialogo(
        "\"SETOR 03 — Centro Corporativo\"\n" +
        "Risco: SEVERO."
        ));

        elementos.add(new Dialogo(
        "\"SETOR 04 — Zona Vermelha\"\n" +
        "Risco: EXTREMO."
        ));

        elementos.add(new Dialogo(
        "Uma interferência invade sua memória."
        ));

        elementos.add(new Dialogo(
        "\"Unidades de contenção devem impedir o avanço da contaminação a qualquer custo.\""
        ));

        elementos.add(new Dialogo(
        "Containment Unit 3-R."
        ));

        elementos.add(new Dialogo(
        "Seu modelo não foi criado para combate."
        ));

        elementos.add(new Dialogo(
        "Sua função original era:\n" +
        "coletar resíduos,\n" +
        "reciclar materiais,\n" +
        "e restaurar áreas ambientais."
        ));

        elementos.add(new Dialogo(
        "Reciclar.\n" +
        "Reduzir.\n" +
        "Reutilizar."
        ));

        elementos.add(new Dialogo(
        "Por isso sua unidade recebeu o nome:\n" +
        "3-R."
        ));

        elementos.add(new Dialogo(
        "Mas Neo Aurora já não precisava apenas de manutenção."
        ));

        elementos.add(new Dialogo(
        "Ela precisava sobreviver."
        ));

        elementos.add(new Dialogo(
        "Um tremor atravessa o distrito."
        ));

        elementos.add(new Dialogo(
        "Montanhas de sucata desabam ao longe."
        ));

        elementos.add(new Dialogo(
        "Então seus sensores detectam atividade intensa vindo do centro da cidade."
        ));

        elementos.add(new Dialogo(
        "\"Assinaturas desconhecidas detectadas.\""
        ));

        elementos.add(new Dialogo(
        "\"Mutação biológica acelerada.\""
        ));

        elementos.add(new Dialogo(
        "\"Máquinas corrompidas identificadas.\""
        ));

        elementos.add(new Dialogo(
        "\"Probabilidade de sobrevivência: baixa.\""
        ));

        elementos.add(new Dialogo(
        "Mesmo assim...\n" +
        "você continua andando."
        ));
//nome jogador
        elementos.add(new PontoDeEscolha(
        "Qual será a prioridade de",

        new Opcao(
        "Focar em chegar rapidamente ao Núcleo Gaia",
        36),

        new Opcao(
        "Explorar o distrito em busca de recursos e informações",
        41)
        ));

        elementos.add(new Dialogo(
        "\"Objetivo prioritário atualizado.\""
        ));

        elementos.add(new Dialogo(
        "\"Traçando rota mais curta até o centro da contaminação.\""
        ));

        elementos.add(new Dialogo(
        "Você acelera os passos pelas ruas destruídas."
        ));

        elementos.add(new Dialogo(
        "Ao longe...\n" +
        "uma luz verde gigantesca pulsava no horizonte."
        ));

        elementos.add(new Dialogo(
        "O Núcleo Gaia ainda estava ativo."
        ));

        elementos.add(new FimCena());

        elementos.add(new Dialogo(
        "\"Modo de exploração ativado.\""
        ));

        elementos.add(new Dialogo(
        "Você decide investigar o distrito antes de seguir para o centro."
        ));

        elementos.add(new Dialogo(
        "Talvez existam sobreviventes.\n" +
        "Ou informações sobre o acidente."
        ));

        elementos.add(new Dialogo(
        "Talvez exista uma forma de impedir que Neo Aurora desapareça completamente."
        ));

        elementos.add(new Dialogo(
        "Enquanto avança entre as montanhas de sucata..."
        ));

        elementos.add(new Dialogo(
        "Seus sensores detectam algo enorme se movendo nas profundezas do distrito."
        ));

        elementos.add(new Dialogo(
        "E o som parecia ficar cada vez mais próximo."
        ));

        elementos.add(new FimCena());
    }
}
