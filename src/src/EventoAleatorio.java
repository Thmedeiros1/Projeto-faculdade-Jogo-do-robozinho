
import java.util.Scanner;

/**
 * CLASSE: EventoAleatorio
 * CONCEITO POO: Métodos estáticos, uso de Math.random()
 */
public class EventoAleatorio {
    
    public static void gerar(Jogador j, Scanner sc) {
        int evento = (int)(Math.random() * 8);
        
        switch(evento) {
            case 0:
                System.out.println("\n EVENTO: Chuva Ácida!");
                int dano = 5 + (int)(Math.random() * 10);
                j.consumirEnergia(dano);
                System.out.println("    -" + dano + " energia pela corrosão!");
                break;
                
            case 1:
                System.out.println("\n✨ EVENTO: Bateria Solar Encontrada!");
                int ganho = 15 + (int)(Math.random() * 15);
                j.recuperarEnergia(ganho);
                System.out.println("    +" + ganho + " energia!");
                break;
                
            case 2:
                System.out.println("\n EVENTO: Robô Amigo!");
                System.out.println("   Um robô reciclador te dá dicas valiosas.");
                j.alterarReputacao("ENGENHEIROS", 5);
                break;
                
            case 3:
                System.out.println("\n EVENTO: Mutante Agressivo!");
                Inimigo mutante = new Inimigo("Mutante Radioativo", 35, 8, "Contaminação");
                Combate.iniciar(j, mutante, sc);
                break;
                
            case 4:
                System.out.println("\n EVENTO: Nasce uma Planta!");
                System.out.println("   Uma muda resistente brota no concreto. Sinal de esperança!");
                j.alterarSustentabilidade(10);
                break;
                
            case 5:
                System.out.println("\n EVENTO: Sobrecarga Elétrica!");
                j.consumirEnergia(8);
                System.out.println("    -8 energia!");
                break;
                
            case 6:
                System.out.println("\n EVENTO: Mercado Negro!");
                Loja.visitar(j, sc);
                break;
                
            default:
                // Sem evento
        }
    }
}
