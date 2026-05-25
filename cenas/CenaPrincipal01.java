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

        elementos.add(new Dialogo("Após derrotar a pilha de sucata, você ouve uma voz"));

        elementos.add(new Dialogo("Pessoa desconhecida: Meu Deus! Você acabou mesmo com ele! Que incrível!"));

        elementos.add(new Dialogo("Você vê uma jovem garota humana escondida atrás de um carro destruído.\nA quanto tempo ela estava te observando era um mistério, mas foi o suficiente para te assistir lutando.\nEla então corre em sua direção"));

        elementos.add(new Dialogo("Menina desconhecida: Eu me chamo Serena, eu sou de um acampamento de sobreviventes que fica aqui pertinho."));

        elementos.add(new Dialogo("Serena: Achei impressionante como você derrotou a criatura, nunca vi ninguém fazer igual!"));

        elementos.add(new Dialogo("Serena: Qual seu nome?"));

        elementos.add(new Dialogo("Você meio atordoado responde"));

        elementos.add(new Dialogo("Você: Eu me chamo "  + jogador.getNome()));

        elementos.add(new Dialogo("Serena: Hmm... " + jogador.getNome() + "... nome interessante..."));

        elementos.add(new Dialogo("Serena: Venha comigo, quero te apresentar aos outros."));

        elementos.add(new Dialogo("Sem ter outras escolhas, você resolve segui-la."));

        elementos.add(new Dialogo("..."));

        elementos.add(new Dialogo("Após alguns minutos seguindo Serena, vocês chegam ao acampamento.\nEle não era muito grande e haviam no máximo 20 pessoas.\nSerena te guia até uma cabana que se encontrava no centro do lugar."));

        elementos.add(new Dialogo("Ao adentrá-la, você vê alguns adultos conversando.\nEles percebem suas."));

        elementos.add(new Dialogo("Adulta desconhecida: Serena minha querida! Já voltou de suas aventuras?"));

        elementos.add(new Dialogo("Adulto desconhecido: Serena! Você voltou... e trouxe um robô?"));

        elementos.add(new Dialogo("Serena: Oi mãe, oi pai, voltei, eu os apresento " + jogador.getNome() + "!"));

        elementos.add(new Dialogo("Serena: Enquanto eu estava coletando recursos, eu ouvi um barulho estranho vindo de perto de umas pilhas de lixo, e resolvi olhar pois fiquei curiosa *risadas*."));

        elementos.add(new Dialogo("Serena:  Foi aí que vi " + jogador.getNome() + " lutando contra um dos monstros, e vencendo!!"));

        elementos.add(new Dialogo("Pai da Serena: Nossa! Isso é realmente impressionante! Ainda mais vindo de um robô limpador."));

        elementos.add(new Dialogo("Mãe da Serena: Seja bem vindo " + jogador.getNome() + " eu me chamo Silvia, pode ficar em nosso acampamento quanto tempo quiser, não é muito grande, mas pode considerar como seu lar."));

        elementos.add(new Dialogo("A mãe de Serena aparenta ser bem agradável"));

        elementos.add(new Dialogo("Silvia: Nossa!! Você esta com muitos danos em sua lataria " + jogador.getNome() + "!"));

        elementos.add(new Dialogo("Silvia: Me siga, vou te consertar."));

        elementos.add(new Dialogo("Você segue a mãe de Serena até uma área no exterior que aparentava ser uma oficina.\nEla conserta ferimentos que você obteve durante a batalha e outros que já existiam.\nDurante o processo, ela conversa com você"));

        elementos.add(new Dialogo("Silvia: Pobre robô, mal despertou e já se deparou com os monstros, você deve estar se perguntando o que aconteceu com esse planeta."));

        elementos.add(new Dialogo("Silvia: há alguns anos, fundaram uma grande empresa chamada Gaia Corporation, ela era muito boa pois ela conseguia produzir energia de forma muito sustentável, aos poucos ela foi se expandindo por todo o mundo, estava tudo indo bem, até que há alguns meses, houve um acidente em sua sede principal, conhecida como O Coração de Gaia, foi uma grande explosão que afetou todo o meio ambiente, causando destruição e poluição por todos os lados, aqui é um dos poucos lugares ainda habitáveis, pois não está tão perto do centro da explosão, porém como você já percebeu, não é muito seguro, existem essas criaturas de lixo que atacam sempre que tiverem oportunidade, não sei como elas surgiram, provavelmente foi alguma coisa no ar que deve ter causado uma mutação em coisas inanimadas, mas não tenho certeza."));
        
        elementos.add(new Dialogo("Silvia: Pelo que eu ouvi, a sede principal nunca foi desligada depois da explosão, pois ninguém consegue sobreviver até lá, dizem que a desligando, todo essa poluição irá embora, e poderemos voltar a viver nossas vidas de antigamente."));
        
        elementos.add(new Dialogo("Silvia: Seria um sonho se alguém conseguisse chegar até lá."));

        elementos.add(new Dialogo("Silvia: Mas mudando de assunto, essa é a primeira vez que vejo alguém derrotar um desses monstros, normalmente só os evitamos, e quem tentou lutar contra eles, não teve a mesma sorte que você."));
        
        elementos.add(new Dialogo("Após alguns minutos, Silvia termina de te concertar, de repente, ela tem um momento de epifania"));
        
        elementos.add(new Dialogo("Silvia: MEU DEUS!"));

        elementos.add(new Dialogo("Você se assusta"));
        
        elementos.add(new Dialogo("Silvia: Você é um robô! Você poderia ir até O Coração de Gaia tentar acabar com tudo isso! Por Favor " + jogador.getNome() + " você tem que fazer isso por nós, eu lhe imploro!"));
        
        elementos.add(new Dialogo("Você fica comovido com a fala de Silvia, e depois de tudo que presenciou, resolve aceitar essa missão"));

        elementos.add(new Dialogo("Após alguma horas, você se prepara para partir em direção ao centro de tudo, a Sede principal da Gaia Corporation.\nAntes de ir embora, Serena vem até você e diz"));
        
        elementos.add(new Dialogo("Serena: Minha pediu para entregar isso a você."));
        
        elementos.add(new Dialogo("Ela te entrega uma Espada e uma Armadura"));

        elementos.add(new AcaoDarItem(new Arma("Espada de Metal", "Uma espada de metal", 3, 4, 0), 61));
        
        elementos.add(new AcaoAbrirInventario(62));

        elementos.add(new AcaoDarItem(new Armadura("Armadura de Metal", "Uma armadura simples, mas muito útil", 3, 0, 3), 63));
        
        elementos.add(new AcaoAbrirInventario(64));

        elementos.add(new Dialogo("Serena: É para você se proteger no caminho."));
        
        elementos.add(new Dialogo("Ela dá um grito como se tivesse lembrado algo muito importante"));
        
        elementos.add(new Dialogo("Serena: OUTRA COISA!"));

        elementos.add(new Dialogo("Serena: Tá ouvindo esse som? Ele vem de um grande monstro que vaga pelos arredores, tome muito cuidado andando por aí"));
        
        elementos.add(new Dialogo("Você escuta o mesmo barulho estranho que ouviu mais cedo"));
        
        elementos.add(new Dialogo("Você concorda, mas fica um pouco receoso dos perigos que podem estar te esperando pelo caminho.\nLogo em seguida, você se despede de todos, agradece pelos itens e parte para sua viagem"));
        
        elementos.add(new Dialogo("Após um tempo andando, você se encontrava longe do acampamento."));
        
        elementos.add(new Dialogo("Você está em uma área com várias montanhas de lixo"));

        elementos.add(new PontoDeEscolha("O que deseja fazer?", 
            new Opcao("Explorar o local", 74),
            new Opcao("Seguir andando", 77)
        ));        
        elementos.add(new Dialogo("Você resolve explorar o local."));
        
        elementos.add(new Dialogo("Ao vasculhar as montanhas de sucata,\nvocê encontra peças mecânicas que impressionantemente são compatíveis com o seu modelo."));

        elementos.add(new AcaoDarItem(new ItemCura("Pedaços de sucata", "Placas de metal pequenas", 4), 77));

        elementos.add(new Dialogo("Você então segue seu caminho."));
        
        elementos.add(new Dialogo("Estava tudo indo bem até você ouvir um grande estrondo.\nEra o mesmo barulho de antes, mas dessa vez muito mais próximo"));
        
        elementos.add(new Dialogo("Você então enxerga seu inimigo, era um grande caminhão compactador mutante,\nEla também te vê, e corre em sua direção."));

        elementos.add(new Combate(new Inimigo("Grande Caminhão Compactador Mutante", 35, 35, 5, 4, 2), null));
        
        elementos.add(new Dialogo("Após derrotá-lo, pedaços de metal que compunham seu corpo estavam espalhados pelo ambiente.\nEmbora ainda esteja longe de seu objetivo final, pelo menos o Distrito das Sucatas estaria mais seguro daqui pra frente."));

        elementos.add(new FimCena());
    }
}
