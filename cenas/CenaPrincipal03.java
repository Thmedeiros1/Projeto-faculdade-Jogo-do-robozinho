package cenas;

import construtoresDeCenas.*;
import construtoresDeCenas.acoes.*;
import personagens.Inimigo;
import personagens.Jogador;
import personagens.itens.Arma;
import personagens.itens.Armadura;
import personagens.itens.ItemCura;

public class CenaPrincipal03 extends Cena {
    public CenaPrincipal03(Jogador jogador) {
        super();
        
        elementos.add(new Dialogo("Após algumas horas seguindo pelas águas do que parecia não terminar,\nvocê avista uma enorme cidade ao longe.\nFinalmente encontrando o fim do Bairro das Enchentes."));
        
        elementos.add(new Dialogo("Ao chegar perto da cidade,\nvocê já consegue sentir a presença do coração de Gaia."));
        
        elementos.add(new Dialogo("Você reajusta seus sensores..."));
        
        elementos.add(new Dialogo("Nova localização: CENTRO URBANO.\nToxicidade do ar: MÉDIA.\nTemperatura externa: 50°c.\nNível de radiação: ALTA"));
        
        elementos.add(new Dialogo("Ao sair de seu barco e pisar em terra firme,\nvocê se depara com uma paisagem de um centro urbano, com shoppings e prédios empresariais."));
        
        elementos.add(new Dialogo("Porém tudo abandonado e caindo aos pedaços.\nApenas com uma lembrança do que já se foi."));
        
        elementos.add(new Dialogo("Por conta das condições ambientais desse local,\nnão existe mais vida humana."));
        
        elementos.add(new PontoDeEscolha("O que fazer?", 
            new Opcao("Explorar o local", 8),
            new Opcao("Seguir andando", 11)
        )); 
        
        elementos.add(new Dialogo("Você resolveu explorar o local"));
        
        elementos.add(new Dialogo("Enquanto olhava pelos prédios abandonados você encontrou..."));
        
        elementos.add(new AcaoDarItem(new ItemCura("Pedaços de sucata", "Placas de metal pequenas", 8), 11));
        
        elementos.add(new Dialogo("Você resolve seguir com seu destino."));
        
        elementos.add(new Dialogo("Enquanto caminhava,\nvocê começa a escutar barulhos próximos\ne resolve investigar."));
        
        elementos.add(new Dialogo("Depois de andar um pouco na direção do som,\nvocê encontra um grupo de robôs danificados."));
        
        elementos.add(new Dialogo("Você resolve se aproximar deles"));
        
        elementos.add(new Dialogo("Eles notam sua presença e rapidamente um deles anda em sua direção.\nProvavelmente o líder deles."));

        elementos.add(new Dialogo("Robô Líder: Quem é você!?"));
       
        elementos.add(new Dialogo("Ele pergunta desconfiado"));
       
        elementos.add(new Dialogo("Você: Eu me chamo "  + jogador.getNome()));

        elementos.add(new Dialogo("Robô Líder: O que você está fazendo por aqui? Normalmente quem aparece assim do nada, não é por coisa boa."));

        elementos.add(new Dialogo("Você conta sua história para o robô."));

        elementos.add(new Dialogo("Robô Líder: Entendi... nesse caso, por que você não vem conosco até o nosso acampamento, podemos te ajudar lá."));

        elementos.add(new Dialogo("Você aceita e se junta a eles para ir ao acampamento."));

        elementos.add(new Dialogo("..."));

        elementos.add(new Dialogo("Ao chegar lá,\nexistem mais robôs também danificados,\nporém fazendo o possível para viverem de forma feliz."));

        elementos.add(new Dialogo("O Robô Líder anda em sua direção e diz"));

        elementos.add(new Dialogo("Robô Líder: Bem-vindo à nossa tribo, aqui resgatamos robôs e tentamos viver em harmonia ajudando uns ao outros."));

        elementos.add(new Dialogo("Robô Líder: Pelo que você me contou, você pretende desligar O Coração de Gaia, não sabíamos que isso era possível, mas também estamos muito debilitados para tentar fazer algo arriscado assim."));

        elementos.add(new Dialogo("Robô Líder: Em vez de ir direto ao Coração, a Gaia Corporation tem um prédio abandonado aqui perto, talvez seja útil passar lá antes."));

        elementos.add(new Dialogo("Você concorda, pega suas coisas e vai em direção a esse prédio da Gaia."));

        elementos.add(new Dialogo("..."));

        elementos.add(new Dialogo("Após andar durante alguns minutos,\nvocê encontra esse prédio abandonado."));

        elementos.add(new Dialogo("Ele tem uma Grande Placa escrito “Gaia Corporation” em seu exterior.\nCom receio, você adentra o prédio."));

        elementos.add(new Dialogo("Observando os arredores, você vê muitas salas de arquivos."));

        elementos.add(new PontoDeEscolha("O que fazer?", 
            new Opcao("Explorar as salas", 36),
            new Opcao("Seguir andando", 39)
        )); 
        
        elementos.add(new Dialogo("Você resolveu explorar as salas"));
        
        elementos.add(new Dialogo("Enquanto olhava as inúmeras salas você encontrou alguns"));
        
        elementos.add(new AcaoDarItem(new Armadura("Armadura de aço", "armadura de aço", 0, 0, 8), 39));
        
        elementos.add(new Dialogo("Você resolve seguir com seu destino."));
        
        elementos.add(new Dialogo("Enquanto caminhava,\nvocê ouve alguns barulhos vindos dos andares acima."));
        
        elementos.add(new Dialogo("Você resolve investigar"));
        
        elementos.add(new Dialogo("Você estava subindo as escadas do prédio,\ncada vez mais próximo da origem do barulho.\nQuando de repente..."));
        
        elementos.add(new Dialogo("CRACK!"));
        
        elementos.add(new Dialogo("Os chãos dos andares mais acima desabam.\nE nessa destruição você acaba caindo e retornando ao térreo do prédio.\nVocê se levanta e então se depara com uma grande máquina conectada a um humano por cabos."));
        
        elementos.add(new Dialogo("A criatura olha para você e grita"));
        
        elementos.add(new Dialogo("CEO Parasita: VOCÊ NÃO VAI ME PARAR!"));
        
        elementos.add(new Combate(new Inimigo("CEO Parasita", 50, 50, 5, 7, 4), null));
        
        elementos.add(new Dialogo("Após derrotar o CEO Parasita, você encontra um pen drive"));
        
        elementos.add(new Dialogo("Você conecta esse pen drive em sua entrada USB.\nOs arquivos começam a ser baixados em sua memória."));
        
        elementos.add(new Dialogo("Após alguns minutos os arquivos foram baixados e você os acessa."));
        
        elementos.add(new Dialogo("São registros da época em que ocorreu a explosão.\nVocê leva alguns minutos para ler tudo."));
        
        elementos.add(new Dialogo("Enquanto lia, você se depara com as seguintes frases:"));
        
        elementos.add(new Dialogo("“NÚCLEO INSTÁVEL – NECESSESSARIO DESATIVAÇÃO POR MEIO DE CHAVE”"));
        
        elementos.add(new Dialogo("“DESATIVAÇÃO NEGADA POR CEO DA GAIA CORPORATION”"));
        
        elementos.add(new Dialogo("Você fica abismado ao absorver essas informações.\nO acidente na verdade nunca foi acidente.\nEles sabiam o tempo todo o que poderia acontecer e resolveram não fazer nada."));
        
        elementos.add(new Dialogo("Você olha ao seu redor e você vê uma chave em cima dos restos do CEO Parasita"));
        
        elementos.add(new Dialogo("Você resolve continuar sua jornada em direção ao Coração de Gaia."));
        
        elementos.add(new Dialogo("Agora que tudo estava mais claro, você entende que desligar a sede Principal é realmente seu destino."));
    }
}
