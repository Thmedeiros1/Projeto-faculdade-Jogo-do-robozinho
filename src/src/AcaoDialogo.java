
@FunctionalInterface
public interface AcaoDialogo {
    void executar(Jogador j);
}

// CondicaoDialogo.java (interface funcional)
@FunctionalInterface
public interface CondicaoDialogo {
    boolean testar(Jogador j);
}
