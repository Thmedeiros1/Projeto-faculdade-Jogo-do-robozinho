
public class DialogoOpcao {
    private String texto;
    private Dialogo proximo;
    private AcaoDialogo acao;
    private CondicaoDialogo condicao;
    
    public DialogoOpcao(String texto, Dialogo proximo, AcaoDialogo acao, CondicaoDialogo condicao) {
        this.texto = texto;
        this.proximo = proximo;
        this.acao = acao;
        this.condicao = condicao;
    }
    
    public boolean disponivel(Jogador j) { return condicao == null || condicao.testar(j); }
    public String getTexto() { return texto; }
    public Dialogo getProximo() { return proximo; }
    public AcaoDialogo getAcao() { return acao; }
}
