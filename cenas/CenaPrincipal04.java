package cenas;

import construtoresDeCenas.*;
import personagens.Inimigo;
import personagens.Jogador;

public class CenaPrincipal04 extends Cena {
    public CenaPrincipal04(Jogador jogador) {
        super();

        elementos.add(new Dialogo("Algumas horas depois de derrotar o CEO Parasita.\nVocê continuou sua jornada em direção ao Coração de Gaia."));
        
        elementos.add(new Dialogo("Conforme você se aproximava dela.\nO céu ia ficando cada vez mais avermelhado.\nNessa área, não existia nem mais construções.\nApenas uma grande área vazia com a sede principal no centro."));
        
        elementos.add(new Dialogo("Você reajusta seus sensores..."));
        
        elementos.add(new Dialogo("Nova localização: O CORAÇÃO DE GAIA.\nToxicidade do ar: ALTA.\nTemperatura externa: 70°c.\nNível de radiação: MUITO ALTO."));
        
        elementos.add(new Dialogo("Você já conseguia observá-la ao longe.\nEra uma grande usina irradiando ondas vermelhas.\nInfluenciando em tudo ao seu redor."));
        
        elementos.add(new Dialogo("Sua energia era algo inexplicável.\nPorém sua vontade de salvar o planeta era maior."));
        
        elementos.add(new Dialogo("Depois de alguns minutos andando.\nVocê finalmente chega ao tão esperado local."));
        
        elementos.add(new Dialogo("Você observa a entrada.\nIncerto do que pode estar te aguardando lá dentro."));
        
        elementos.add(new Dialogo("Você entra no Coração."));
        
        elementos.add(new Dialogo("Tudo lá dentro parecia destruído.\nExceto por um grande computador repleto de estranhas plantas ao seu redor."));
        
        elementos.add(new Dialogo("Era ali onde você colocaria a chave.\nOnde tudo terminaria."));
        
        elementos.add(new Dialogo("Você se aproxima do computador e observa um buraco em seu painel.\nA chave deveria ser colocada ali."));
        
        elementos.add(new Dialogo("Você pega a chave a chave desativadora e estava prestes a encaixa-la ali."));
        
        elementos.add(new Dialogo("Quando de repente..."));
        
        elementos.add(new Dialogo("BOOM"));
        
        elementos.add(new Dialogo("Com um grande estrando.\nO computador liga, revelando conter vida, tal qual você."));
        
        elementos.add(new Dialogo("Ele olha para você e grita"));
        
        elementos.add(new Dialogo("O Coração: QUEM VOCÊ PENSA QUE É ROBOZINHO!?"));
        
        elementos.add(new Dialogo("O Coração: Acha que pode me derrotar!?"));
        
        elementos.add(new Dialogo("O Coração: ACHA QUE PODE ME DESLIGAR!?"));
        
        elementos.add(new Dialogo("O Coração: HAHAHAH! Que piada!!"));
        
        elementos.add(new Combate(new Inimigo("O Coração", 15, 15, 5, 3, 5), null));
        
        elementos.add(new Dialogo("O Coração parecia quase derrotado."));
        
        elementos.add(new Dialogo("Quando de repente..."));
        
        elementos.add(new Dialogo("Ele começa a se transformar!\nSe tornando mais planta do que máquina."));
        
        elementos.add(new Dialogo("O Coração: PENSOU QUE SERIA FÁCIL?? HAHAHAH!"));
        
        elementos.add(new Dialogo("Você se prepara para continuar a batalha."));
        
        elementos.add(new Combate(new Inimigo("O Coração de Planta", 30, 30, 10, 3, 5), null));
        
        elementos.add(new Dialogo("Após quase totalmente derrotado,\no Coração reúne suas últimas forças.\nSoltando líquidos radioativos pelo meio de seus caules.\nSe tornando cada vez mais assustador."));
        
        elementos.add(new Dialogo("O Coração: Desista logo robozinho, não conseguirá me derrotar."));
        
        elementos.add(new Dialogo("Embora cansado, você não desiste.\nVocê irá até o fim."));
        
        elementos.add(new Combate(new Inimigo("O Coração de Planta", 60, 60, 15, 3, 5), null));
        
        elementos.add(new Dialogo("Você deu seu golpe final"));
        
        elementos.add(new Dialogo("O Coração ainda estava vivo, mas não tinha mais forças para lutar contra você.\n"));
        
        elementos.add(new Dialogo("Você pega a chave novamente, e vai em direção ao painel para encaixá-la."));
        
        elementos.add(new Dialogo("O Coração: Não.... não faça isso..."));
        
        elementos.add(new Dialogo("Ele diz com muita dificuldade"));
        
        elementos.add(new Dialogo("O Coração: Se você me desligar... tudo aqui irá explodir..."));
        
        elementos.add(new Dialogo("O Coração: Você morrerá também..."));
        
        elementos.add(new Dialogo("Você fica pensativo com essa informação..."));
        
        elementos.add(new Dialogo("..."));
        
        elementos.add(new Dialogo("..."));
        
        elementos.add(new Dialogo("Você decide se sacrificar pelo bem da humanidade."));
        
        elementos.add(new Dialogo("Você encaixa a chave no painel e a gira.\n O Coração começa a se desfazer.\nExplodindo seus pedaços por todo o local."));
        
        elementos.add(new Dialogo("Até finalmente..."));
        
        elementos.add(new Dialogo("Explodir por completo..."));
        
        elementos.add(new Dialogo("Te levando junto com ele..."));
        
        elementos.add(new Dialogo("Você se sacrificou, mas salvou o mundo!"));
        
        elementos.add(new Dialogo("A partir de agora, o mundo voltará ao normal e a humanidade poderá se reerguer!"));
        
        elementos.add(new Dialogo("Parabéns por completar a sua missão."));
        
        elementos.add(new FimCena());
    }
}
