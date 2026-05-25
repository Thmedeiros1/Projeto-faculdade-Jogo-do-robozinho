package cenas;

import construtoresDeCenas.*;
import construtoresDeCenas.acoes.*;
import personagens.Inimigo;
import personagens.Jogador;
import personagens.itens.Arma;

public class CenaPrincipal02 extends Cena {
    public CenaPrincipal02(Jogador jogador) {
        super();
    
        elementos.add(new Dialogo("Algumas horas após sua luta contra o caminhão, você continuou andando e finalmente saiu do Distrito das Sucatas."));
        
        elementos.add(new Dialogo("...O Coração de Gaia está cada vez mais próximo.\nVocê agora se encontra em um novo local."));
        
        elementos.add(new Dialogo("Você reajusta seus sensores..."));
        
        elementos.add(new Dialogo("Nova localização: BAIRRO DAS ENCHENTES.\nToxicidade do ar: BAIXA.\nTemperatura externa: 39°C.\nNível de radiação: MÉDIO."));
        
        elementos.add(new Dialogo("Ao observar a nova paisagem, era como uma grande cidade, com prédios e avenidas,\nporém completamente alagada por uma água suja e fedida.\nUma chuva fina caía sobre o local, provavelmente era ácida."));
        
        elementos.add(new Dialogo("Ao longe, era possível observar um barco.\nVocê anda em sua direção."));
        
        elementos.add(new Dialogo("Ao se aproximar, você vê um idoso de capa de chuva dentro do barco"));
        
        elementos.add(new Dialogo("Idoso desconhecido: Oh! Olá caro robô, eu me chamo Otto, o barqueiro, qual o seu nome?"));
        
        elementos.add(new Dialogo("Você: Eu me chamo " + jogador.getNome()));
        
        elementos.add(new Dialogo("Otto: hmm... " + jogador.getNome() +", muito prazer!"));
        
        elementos.add(new Dialogo("Otto: Você gostaria de uma carona por essa bandas?"));
        
        elementos.add(new Dialogo("Sem ter opções você aceita."));
        
        elementos.add(new Dialogo("Enquanto andava de barco com Otto, ele começou a conversar com você"));
        
        elementos.add(new Dialogo("Otto: É complicada situação que tá esse lugar né? Antigamente passavam carros e pedestres por aqui, e agora apenas barcos, é muito triste."));
        
        elementos.add(new Dialogo("Otto: A casa que eu morava nem existe mais, agora estou morando em um abrigo naquele prédio ali."));
        
        elementos.add(new Dialogo("Ele aponta para um prédio levemente amarelo.\nEle está levemente destruído, porém era possível perceber movimentação lá dentro."));
        
        elementos.add(new Dialogo("Otto: Eu tinha ido ao Distrito das Sucatas procurar algum tesouro para dar de presente para minha filha e encontrei essa caixinha aqui."));
        
        elementos.add(new Dialogo("Ele te mostra a caixa.\nEra uma caixa que ao abrir tocava uma música.\nDentro dessa caixa havia uma bailarina dentro que girava.\nEra sua primeira vez vendo algo assim"));
        
        elementos.add(new Dialogo("Enquanto atravessavam essa grande área alagada, tudo corria bem.\nAté vocês começarem a ouvir um barulho estranho vindo de dentro da água."));
        
        elementos.add(new Dialogo("Grandes ondas começaram a agitar a embarcação.\nElas foram ficando cada vez mais fortes e o barco começou a quebrar aos poucos.\nAté chegar em um ponto que o barco não aguentou e naufragou."));
        
        elementos.add(new Dialogo("Você cai dentro da água, e tenta nadar para alguma superfície.\nNão há sinal de Otto.\nVocê consegue subir no teto de uma casa e uma grande criatura começa a aparecer em sua frente."));
        
        elementos.add(new Dialogo("Ela tem formato semelhante ao de uma mulher humana, mas completamente de água.\nRainha das Águas: “QUEM OUSA NAVEGAR POR MINHAS ÁGUAS??”"));
        
        elementos.add(new Combate(new Inimigo("Rainha das Águas", 40, 40, 3, 4, 2), null));
        
        elementos.add(new Dialogo("Alguns segundos depois, você lembra de Otto e vai em sua procura.\nVocê o avista de longe em cima do teto de outra casa."));
        
        elementos.add(new Dialogo("Você nada em sua direção para conferir se ele está bem.\nAo chegar próximo dele, ele se encontra desmaiado.\nProvavelmente engoliu muita água.\nAo seu lado, está sua caixa de musica.\nVocê tenta reanimá-lo."));
        
        elementos.add(new Dialogo("Após alguns segundos nisso, Otto acorda."));
        
        elementos.add(new Dialogo("Ele se encontra muito debilitado.\nEle olha em sua direção e diz"));
        
        elementos.add(new Dialogo("Otto: Ah... *tosse* " + jogador.getNome()+ " ..."));
        
        elementos.add(new Dialogo("Otto: Eu acho que não... *tosse* não vou conseguir sair dessa... *mais tosse*"));
        
        elementos.add(new Dialogo("Otto: como um último pedido... *tosse* você poderia *mais tosse* levar a caixa para minha filha? *mais tosses*"));
        
        elementos.add(new Dialogo("Antes que você pudesse responder, Otto falace em sua frente.\nVocê observa o corpo morto de Otto e pensa"));
        
        elementos.add(new AcaoDarItem(new Arma("Caixa de música", "Caixa", 5, 5, 0), 32));
        
        elementos.add(new Dialogo("Você nada em direção ao prédio amarelo que ele havia comentado anteriormente."));
        
        elementos.add(new Dialogo("Ao adentrá-lo, você vê várias famílias e se pergunta qual delas é a de Otto.\nAo longe você observa uma moça sozinha que se assemelha muito ao Otto.\nVocê vai na direção dela."));
        
        elementos.add(new Dialogo("Ela observa você se aproximando.\nAo chegar perto dela, ela diz"));
        
        elementos.add(new Dialogo("Filha do Otto: Oh! Quem é você camaradinha?"));
        
        elementos.add(new Dialogo("Ela diz com uma voz gentil"));
        
        elementos.add(new Dialogo("Você: Eu me chamo " + jogador.getNome()));
        
        elementos.add(new Dialogo("Filha do Otto: Oh! Muito Prazer " + jogador.getNome() + " eu me chamo Olga."));
        
        elementos.add(new Dialogo("Olga: O que te traz aqui?"));
        
        elementos.add(new Dialogo("Você: Infelizmente, seu pai faleceu e ele me pediu para trazer isso, sinto muito."));
        
        elementos.add(new Dialogo("*Você entrega a caixa de música*"));
                
        elementos.add(new Dialogo("Olga fica chocada com a notícia e fica em silêncio por um tempo."));
        
        elementos.add(new Dialogo("Ela então diz:"));
        
        elementos.add(new Dialogo("Olga: Muito obrigada " + jogador.getNome() + "por me trazer isso..."));
        
        elementos.add(new Dialogo("Ela se esforça para segurar as lágrimas."));
        
        elementos.add(new Dialogo("Olga: por você ter feito isso por mim e pelo meu pai *som de choro*, tome essa vara de pesca aqui como agradecimento, pode não ser muita coisa, mas ela era muito especial para o meu pai, gostaria que ficasse com ela."));
        
        elementos.add(new AcaoDarItem(new Arma("Vara de Otto", "Uma vara de pesca normal, ela emana uma energia surreal inexplicável", 3, 7, 0), 48));
        
        elementos.add(new AcaoAbrirInventario(49));
        
        elementos.add(new Dialogo("Você agradece o presente, se desped"));
        
        elementos.add(new Dialogo("E então se dirige para o lado de fora do prédio"));
        
        elementos.add(new Dialogo("Com a morte da Rainha da Águas você percebe que o nível da água estava diminuindo aos poucos e chuva estava parando.\nNão estava perfeito, porém era o suficiente para que a população do Bairro das Águas conseguissem viver tranquilos daqui para frente."));
        
        elementos.add(new FimCena());
    }
}
