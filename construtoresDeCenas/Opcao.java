package construtoresDeCenas;

public class Opcao {
    // "Encapsulamento"
    protected String texto;
    protected int proximoElemento;

    // "Método Construtor"
    public Opcao(String texto, int proximoElemento) {
        this.texto = texto;
        this.proximoElemento = proximoElemento;
    }
}
