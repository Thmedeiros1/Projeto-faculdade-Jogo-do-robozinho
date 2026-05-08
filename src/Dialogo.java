
import java.util.ArrayList;
import java.util.Scanner;

public class Dialogo {
    private String texto;
    private ArrayList<DialogoOpcao> opcoes = new ArrayList<>();
    
    public Dialogo(String texto) { this.texto = texto; }
    
    public void adicionarOpcao(DialogoOpcao op) { opcoes.add(op); }
    
    public void executar(Jogador j, Scanner sc) {
        System.out.println("\n" + texto);
        
        ArrayList<DialogoOpcao> disponiveis = new ArrayList<>();
        for (DialogoOpcao op : opcoes) {
            if (op.disponivel(j)) disponiveis.add(op);
        }
        
        if (disponiveis.isEmpty()) {
            System.out.println("(Nenhuma opção disponível)");
            return;
        }
        
        for (int i = 0; i < disponiveis.size(); i++) {
            System.out.println((i + 1) + " - " + disponiveis.get(i).getTexto());
        }
        
        int escolha;
        try {
            escolha = Integer.parseInt(sc.next()) - 1;
        } catch (NumberFormatException e) {
            return;
        }
        
        if (escolha >= 0 && escolha < disponiveis.size()) {
            DialogoOpcao op = disponiveis.get(escolha);
            if (op.getAcao() != null) op.getAcao().executar(j);
            if (op.getProximo() != null) op.getProximo().executar(j, sc);
        }
    }
}
