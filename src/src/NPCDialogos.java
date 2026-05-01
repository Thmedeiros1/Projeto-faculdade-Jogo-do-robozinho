
import java.util.Scanner;

public class NPCDialogos {

    public static void engenheiroAvancado(Jogador j, Scanner sc) {

        Dialogo inicio = new Dialogo(
            "👨‍🔬 Engenheiro: Você voltou... suas decisões estão mudando a cidade."
        );

        Dialogo confianca = new Dialogo(
            "Confio em você. Vamos restaurar o ecossistema."
        );

        Dialogo desconfiado = new Dialogo(
            "Você tem ajudado a indústria... isso preocupa."
        );

        AcaoDialogo ajudarEco = (player) -> {
            player.alterarSustentabilidade(20);
            player.alterarReputacao("ENGENHEIROS", 10);
            player.adicionarFlag("AJUDOU_ENGENHEIRO");
        };

        AcaoDialogo ajudarIndustria = (player) -> {
            player.alterarSustentabilidade(-15);
            player.alterarReputacao("INDUSTRIA", 10);
        };

        inicio.adicionarOpcao(new DialogoOpcao(
            "Quero restaurar o planeta",
            confianca,
            ajudarEco,
            (player) -> player.getReputacao("ENGENHEIROS") >= 0
        ));

        inicio.adicionarOpcao(new DialogoOpcao(
            "Precisamos de eficiência industrial",
            desconfiado,
            ajudarIndustria,
            null
        ));

        inicio.adicionarOpcao(new DialogoOpcao(
            "Acessar dados secretos",
            null,
            (player) -> {
                System.out.println("📂 Logs desbloqueados!");
                player.adicionarFlag("DESCOBRIU_VERDADE");
            },
            (player) -> player.getInteligencia() >= 6
        ));

        inicio.executar(j, sc);
    }
}
