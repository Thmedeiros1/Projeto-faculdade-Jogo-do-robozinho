package cenasPrincipais;

import construtoresDeCenas.*;

public class CenaDistritoSucatas02 extends Cena {

    public CenaDistritoSucatas02() {
        super();

        elementos.add(new Dialogo(
        "O Distrito das Sucatas parecia não ter fim."
        ));

        elementos.add(new Dialogo(
        "Montanhas de metal se acumulavam entre os prédios.\n" +
        "Carcaças de ônibus, drones quebrados e placas de trânsito enferrujadas formavam corredores estreitos."
        ));

        elementos.add(new Dialogo(
        "Tubulações atravessavam as ruas como raízes mecânicas.\n" +
        "De algumas delas escorria um líquido verde brilhante."
        ));

        elementos.add(new Dialogo(
        "Seus sensores identificam altos níveis de resíduos químicos."
        ));

        elementos.add(new Dialogo(
        "\"AVISO:\n" +
        "Área imprópria para vida orgânica.\""
        ));

        elementos.add(new Dialogo(
        "Mesmo assim...\n" +
        "alguém ainda vivia ali."
        ));

        elementos.add(new Dialogo(
        "Pequenas fogueiras podiam ser vistas dentro de veículos abandonados.\n" +
        "Tecidos velhos cobriam janelas quebradas."
        ));

        elementos.add(new Dialogo(
        "Neo Aurora não morreu após o acidente.\n" +
        "Ela apenas apodreceu lentamente."
        ));

        elementos.add(new Dialogo(
        "Ao passar por uma avenida destruída, você encontra um enorme outdoor caído."
        ));

        elementos.add(new Dialogo(
        "\"GAIA CORPORATION\"\n" +
        "\"Construindo um amanhã sustentável.\""
        ));

        elementos.add(new Dialogo(
        "A estrutura metálica estava coberta por musgo escuro e ferrugem."
        ));

        elementos.add(new Dialogo(
        "Parte dos seus arquivos corrompidos tenta acessar informações sobre a empresa."
        ));

        elementos.add(new Dialogo(
        "ERRO.\n" +
        "Dados incompletos."
        ));

        elementos.add(new Dialogo(
        "Mas uma frase ainda aparece na sua memória:"
        ));

        elementos.add(new Dialogo(
        "\"O Núcleo Gaia nunca deveria ter sido ativado.\""
        ));

        elementos.add(new Dialogo(
        "Subitamente...\n" +
        "um barulho ecoa entre os contêineres."
        ));

        elementos.add(new Dialogo(
        "CLANK.\n" +
        "CLANK.\n" +
        "CLANK."
        ));

        elementos.add(new Dialogo(
        "Algo estava se movendo nas sombras."
        ));

        //nome jogador
        elementos.add(new PontoDeEscolha(
        "O que ?? faz?",

        new Opcao(
        "Investigar o barulho",
        19),

        new Opcao(
        "Evitar o local e continuar avançando",
        25)
        ));

        elementos.add(new Dialogo(
        "Você ativa a lanterna frontal."
        ));

        elementos.add(new Dialogo(
        "Os feixes de luz atravessam a fumaça tóxica."
        ));

        elementos.add(new Dialogo(
        "Entre pedaços de metal, um pequeno robô de manutenção aparece."
        ));

        elementos.add(new Dialogo(
        "Metade do corpo dele estava destruída."
        ));

        elementos.add(new Dialogo(
        "\"...ajuda...\"\n" +
        "\"energia... baixa...\""
        ));

        elementos.add(new Dialogo(
        "O robô tenta estender o braço na sua direção."
        ));

        elementos.add(new PontoDeEscolha(
        "Como responder?",

        new Opcao(
        "Compartilhar energia",
        32),

        new Opcao(
        "Ignorar e seguir caminho",
        36)
        ));

        elementos.add(new Dialogo(
        "Você decide não se aproximar."
        ));

        elementos.add(new Dialogo(
        "Enquanto se afasta, o som metálico continua ecoando atrás de você."
        ));

        elementos.add(new Dialogo(
        "Seus sensores detectam movimento constante entre os prédios."
        ));

        elementos.add(new Dialogo(
        "Talvez o Distrito das Sucatas estivesse mais vivo do que parecia."
        ));

        elementos.add(new FimCena());

        elementos.add(new Dialogo(
        "Você transfere parte da sua energia reserva."
        ));

        elementos.add(new Dialogo(
        "As luzes do pequeno robô voltam a funcionar."
        ));
        //nome jogador
        elementos.add(new Dialogo(
        "\"Unidade... ?? identificada...\"\n" +
        "\"Ainda existem modelos ativos...\""
        ));

        elementos.add(new Dialogo(
        "\"Cuidado com as zonas internas...\"\n" +
        "\"Eles escutam o metal.\""
        ));

        elementos.add(new Dialogo(
        "Antes que você pudesse perguntar qualquer coisa..."
        ));

        elementos.add(new Dialogo(
        "O robô desliga novamente."
        ));

        elementos.add(new Dialogo(
        "Mas agora você sabia de uma coisa:"
        ));

        elementos.add(new Dialogo(
        "Havia algo nas partes mais profundas do distrito."
        ));

        elementos.add(new FimCena());

        elementos.add(new Dialogo(
        "Você ignora o robô danificado."
        ));

        elementos.add(new Dialogo(
        "Seus passos ecoam pelo ferro-velho silencioso."
        ));

        elementos.add(new Dialogo(
        "Por alguns segundos...\n" +
        "você sente que está sendo observado."
        ));

        elementos.add(new Dialogo(
        "Então os sensores detectam múltiplas assinaturas metálicas próximas."
        ));

        elementos.add(new Dialogo(
        "Talvez ignorar pedidos de ajuda naquele lugar tenha sido um erro."
        ));

        elementos.add(new FimCena());
    }
}
