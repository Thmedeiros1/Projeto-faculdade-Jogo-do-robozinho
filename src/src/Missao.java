
import java.util.Scanner;

/**
 * CLASSE: Missao
 * CONCEITO POO: Métodos estáticos para cada missão
 */
public class Missao {
    
    public static void agua(Jogador j, Scanner sc) {
        System.out.println("\n MISSÃO: SISTEMA DE ÁGUA ");
        System.out.println("O Rio Tietê artificial está contaminado com metais pesados.");
        
        j.consumirEnergia(10);
        
        System.out.println("\nOpções:");
        System.out.println("1 - Analisar água (requer Inteligência 5+)");
        System.out.println("2 - Tentar filtrar manualmente (requer Força 5+)");
        System.out.println("3 - Ignorar e voltar depois");
        
        int escolha;
        try {
            escolha = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.out.println(" Entrada inválida! Missão falhou.");
            return;
        }
        
        switch (escolha) {
            case 1:
                if (j.getInteligencia() >= 5) {
                    System.out.println(" Análise concluída! Poluentes: Chumbo, Mercúrio, Microplásticos.");
                    System.out.println(" Você usa um catalisador químico para neutralizar os poluentes.");
                    j.avancarProgresso();
                    j.alterarSustentabilidade(20);
                    j.adicionarFlag("AGUA_PURIFICADA");
                } else {
                    System.out.println(" Inteligência insuficiente! Falha na análise.");
                    j.alterarSustentabilidade(-5);
                }
                break;
            case 2:
                if (j.getForca() >= 5) {
                    System.out.println(" Você remove manualmente os resíduos sólidos!");
                    j.avancarProgresso();
                    j.alterarSustentabilidade(15);
                } else {
                    System.out.println(" Força insuficiente! Os resíduos são muito pesados.");
                    j.alterarSustentabilidade(-5);
                }
                break;
            default:
                System.out.println(" Você ignorou a missão... A poluição piorou.");
                j.alterarSustentabilidade(-10);
        }
    }
    
    public static void ar(Jogador j, Scanner sc) {
        System.out.println("\n MISSÃO: SISTEMA DE AR ");
        System.out.println("A qualidade do ar está crítica. Fumaça industrial domina a cidade.");
        
        System.out.println("\nOpções:");
        System.out.println("1 - Instalar filtros ecológicos (custo 5 energia)");
        System.out.println("2 - Confrontar as indústrias (combate)");
        System.out.println("3 - Ignorar");
        
        int escolha;
        try {
            escolha = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.out.println(" Entrada inválida!");
            return;
        }
        
        switch (escolha) {
            case 1:
                j.consumirEnergia(5);
                System.out.println(" Filtros instalados! O ar começa a melhorar.");
                j.avancarProgresso();
                j.alterarSustentabilidade(15);
                break;
            case 2:
                Inimigo i = new Inimigo("Drone Antipoluição", 50, 12, "Fumaça Tóxica");
                Combate.iniciar(j, i, sc);
                if (j.temEnergia()) {
                    j.avancarProgresso();
                    j.alterarSustentabilidade(20);
                    j.adicionarFlag("DERRUBOU_DRONE");
                }
                break;
            default:
                System.out.println(" Ar continua poluído...");
                j.alterarSustentabilidade(-10);
        }
    }
    
    public static void solo(Jogador j, Scanner sc) {
        System.out.println("\n MISSÃO: SOLO CONTAMINADO ");
        System.out.println("O solo está estéril. Nada cresce há décadas.");
        
        j.consumirEnergia(10);
        
        if (j.getForca() >= 6) {
            System.out.println(" Com muito esforço, você remove os resíduos tóxicos do solo!");
            j.avancarProgresso();
            j.alterarSustentabilidade(20);
        } else if (j.getInteligencia() >= 7) {
            System.out.println(" Você desenvolve um composto químico que descontamina o solo!");
            j.avancarProgresso();
            j.alterarSustentabilidade(25);
            j.adicionarFlag("SOLO_RESTAURADO");
        } else {
            System.out.println(" Força e inteligência insuficientes! O solo continua poluído.");
            j.alterarSustentabilidade(-10);
        }
    }
    
    public static void biodiversidade(Jogador j, Scanner sc) {
        System.out.println("\n MISSÃO: BIODIVERSIDADE ");
        System.out.println("Um engenheiro genético precisa de ajuda para restaurar espécies.");
        
        NPC.engenheiro(j, sc);
        j.avancarProgresso();
    }
    
    public static void carbono(Jogador j, Scanner sc) {
        System.out.println("\n MISSÃO: SEQUESTRO DE CARBONO ");
        System.out.println("As emissões de carbono estão descontroladas.");
        
        Inimigo i = new Inimigo("Mestre da Indústria", 80, 15, "Queima de Combustível");
        Combate.iniciar(j, i, sc);
        
        if (i.estaVivo()) {
            j.alterarSustentabilidade(-15);
            System.out.println(" Você perdeu! A indústria continua poluindo.");
        } else if (j.temEnergia()) {
            j.avancarProgresso();
            j.alterarSustentabilidade(25);
            j.adicionarFlag("CARBONO_CONTROLADO");
        }
    }
}
