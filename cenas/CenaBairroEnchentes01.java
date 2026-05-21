package cenasPrincipais;

import construtoresDeCenas.*;
import personagens.Robo;

public class CenaBairroEnchentes01 extends Cena {

    public CenaBairroEnchentes01(Robo robo) {

        super();

        elementos.add(new Dialogo(
        "O corpo destruído do Triturador Alfa afunda lentamente entre as montanhas de sucata."
        ));

        elementos.add(new Dialogo(
        "Faíscas ainda escapavam da carcaça metálica.\n" +
        "Motores defeituosos giravam pela última vez antes de parar."
        ));

        elementos.add(new Dialogo(
        "O Distrito das Sucatas finalmente ficou silencioso."
        ));

        elementos.add(new Dialogo(
        robo.getNome() + " observa o horizonte contaminado."
        ));

        elementos.add(new Dialogo(
        "Ao longe...\n" +
        "o brilho verde do Núcleo Gaia pulsava entre os arranha-céus."
        ));

        elementos.add(new Dialogo(
        "Mais perto agora."
        ));

        elementos.add(new Dialogo(
        "Seu sistema interno atualiza a rota automaticamente."
        ));

        elementos.add(new Dialogo(
        "\"Novo setor identificado:\""
        ));

        elementos.add(new Dialogo(
        "\"SETOR 02 — BAIRRO DAS ENCHENTES\""
        ));

        elementos.add(new Dialogo(
        "\"Distância restante até o Núcleo Gaia: 14 quilômetros.\""
        ));

        elementos.add(new Dialogo(
        "\"Risco ambiental aumentado.\""
        ));

        elementos.add(new Dialogo(
        "Uma passagem subterrânea aparece atrás do ferro-velho industrial."
        ));

        elementos.add(new Dialogo(
        "Antigos túneis de transporte atravessavam Neo Aurora abaixo da cidade."
        ));

        elementos.add(new Dialogo(
        "Antes do acidente, eram usados para mover lixo reciclável até o Núcleo Gaia."
        ));

        elementos.add(new Dialogo(
        "Agora...\n" +
        "os túneis estavam parcialmente inundados."
        ));

        elementos.add(new Dialogo(
        "3-R avança lentamente pela escuridão."
        ));

        elementos.add(new Dialogo(
        "Água escura cobre parte do chão.\n" +
        "Cabos energizados estalam nas paredes."
        ));

        elementos.add(new Dialogo(
        "As luzes do corredor piscavam sem parar."
        ));

        elementos.add(new Dialogo(
        "\"Nível de contaminação hídrica: extremo.\""
        ));

        elementos.add(new Dialogo(
        "Conforme você avança...\n" +
        "o som de água corrente fica cada vez mais forte."
        ));

        elementos.add(new Dialogo(
        "Então o túnel termina."
        ));

        elementos.add(new Dialogo(
        "E o Bairro das Enchentes surge diante de você."
        ));

        elementos.add(new Dialogo(
        "A antiga região residencial havia desaparecido sob a água."
        ));

        elementos.add(new Dialogo(
        "Prédios emergiam como ilhas no meio de avenidas inundadas."
        ));

        elementos.add(new Dialogo(
        "Pontes improvisadas conectavam partes da cidade destruída."
        ));

        elementos.add(new Dialogo(
        "Barcos feitos de sucata flutuavam entre postes e carros submersos."
        ));

        elementos.add(new Dialogo(
        "Uma chuva fina caía constantemente do céu escurecido."
        ));

        elementos.add(new Dialogo(
        "Mas não era chuva comum."
        ));

        elementos.add(new Dialogo(
        "\"Composição identificada:\""
        ));

        elementos.add(new Dialogo(
        "\"Chuva ácida.\""
        ));

        elementos.add(new Dialogo(
        "As gotas corroíam lentamente placas metálicas próximas."
        ));

        elementos.add(new Dialogo(
        "Algumas construções ainda possuíam energia."
        ));

        elementos.add(new Dialogo(
        "Letreiros de neon refletiam na água contaminada."
        ));

        elementos.add(new Dialogo(
        "\"VIVA MELHOR COM A GAIA CORPORATION\""
        ));

        elementos.add(new Dialogo(
        "A propaganda piscava acima de um prédio parcialmente afundado."
        ));

        elementos.add(new Dialogo(
        "Algo parecia errado naquele lugar."
        ));

        elementos.add(new Dialogo(
        "As águas se moviam mesmo sem vento."
        ));

        elementos.add(new Dialogo(
        "Sombras atravessavam lentamente as partes mais profundas da enchente."
        ));

        elementos.add(new Dialogo(
        "Então...\n" +
        "um sinal de rádio surge entre as interferências."
        ));

        elementos.add(new Dialogo(
        "\"Se alguém estiver ouvindo...\"\n" +
        "\"não atravessem os canais centrais.\""
        ));

        elementos.add(new Dialogo(
        "\"Alguma coisa vive dentro da água.\""
        ));

        elementos.add(new PontoDeEscolha(
        "Qual será a próxima ação de " + robo.getNome() + "?",

        new Opcao(
        "Seguir pelas pontes superiores",
        37),

        new Opcao(
        "Atravessar pelos canais inundados",
        42)
        ));

        elementos.add(new Dialogo(
        "Você sobe pelas estruturas metálicas improvisadas."
        ));

        elementos.add(new Dialogo(
        "As pontes rangem sob seus passos."
        ));

        elementos.add(new Dialogo(
        "De cima, o Bairro das Enchentes parece ainda maior."
        ));

        elementos.add(new Dialogo(
        "E no centro da região...\n" +
        "algo gigantesco se move sob a água escura."
        ));

        elementos.add(new FimCena());

        elementos.add(new Dialogo(
        "Você decide seguir pelos canais inundados."
        ));

        elementos.add(new Dialogo(
        "A água contaminada alcança suas pernas metálicas."
        ));

        elementos.add(new Dialogo(
        "\"Corrosão detectada.\""
        ));

        elementos.add(new Dialogo(
        "Ondas pequenas se formam ao redor de 3-R."
        ));

        elementos.add(new Dialogo(
        "Então...\n" +
        "algo passa rapidamente abaixo da superfície."
        ));

        elementos.add(new Dialogo(
        "Talvez o aviso no rádio estivesse certo."
        ));

        elementos.add(new FimCena());
    }
}
