public class CenaPrincipal01 extends Cena {
    public CenaPrincipal01() {
        super();

        // Elemento 0
        elementos.add(new Dialogo("Bem vindo ao mundo!"));
        // Elemento 1
        elementos.add(new PontoDeEscolha("O que deseja fazer?",
        new Opcao("Não sei...", 2),
        new Opcao("Quero correr!", 5)
        ));

        // Elemento 2
        elementos.add(new Dialogo("Tudo bem! Você tem bastante tempo para decidir!"));
        // Elemento 3
        elementos.add(new Dialogo("Afinal, este é um grande mundo!"));
        // Elemento 4
        elementos.add(new FimCena());

        // Elemento 5
        elementos.add(new Dialogo("Então vamos correr!"));
        // Elemento 6
        elementos.add(new FimCena());
    }
}
