import java.util.ArrayList;
import java.util.Arrays;

public class PontoDeEscolha extends ElementoCena {
    public String pergunta;
    public ArrayList<Opcao> opcoes;

    /*
    A sintaxe (Classe)... na assinatura do método é uma funcionalidade do Java
    que significa "Uma quantidade de instâncias desta classe",
    sendo esta quantidade entre 0 e várias. Isso é útil na chamada do método pois
    permite instanciar opção por opção dentro das cenas invés de lidar com ArrayList dentro delas
    (Por isso o construtor aqui está criando um ArrayList
    tomando uma quantidade de opções para transformar em lista invés de já receber a lista pronta)
    */
    public PontoDeEscolha(String pergunta, Opcao... opcoes) {
        this.pergunta = pergunta;
        this.opcoes = new ArrayList<>(Arrays.asList(opcoes));
    }
}
