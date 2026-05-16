public class Opcao {
    private String texto;
    private int proximoElemento;

    public Opcao(String texto, int proximoElemento) {
        this.texto = texto;
        this.proximoElemento = proximoElemento;
    }
   
    public String getTexto() {
        return texto;
    }

    public int getProximoElemento() {
        return proximoElemento;
    }
}
