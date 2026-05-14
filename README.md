# Lista de tarefas

### _Definições_

Package (Pacote) - É uma pasta com um conjunto de classes Java

## Package: Personagens

Esse pacote contêm todas as classes que envolvam o jogador, inimigos e NPCs. Esses três herdam de uma classe abstrata "Personagem". A classa abstrata possui três construtores possíveis e os getters de todos os atributos definidos nela.

- Criar método para 'criação de personagem' em Jogador que deverá receber do usuário o nome pro Jogador e a distribuição de status desejada
  - Vejam 'private void criarJogador()' em Jogo.java feita pelo Thiago, ela é a referência pra esse método. Importante notar, o método feito por ele tem um erro na distribuição de status, então não adianta copiar e colar como está lá.

- Criar as classes para Itens, ItensEquipáveis e Inventário
  - Os dois possíveis itens equipáveis são 'Armadura' e 'Arma'.
  - Itens comuns são o que o jogador conseguirá entre cenas e poderá usar para fazer trocas em lojas
  - O Jogador terá um inventário, carregará itens e poderá equipar outros (tenham em mente que os itens equipáveis, quando equipados, vão prover acréscimos de status ao jogador)
  - As classes Item.java, ItemEquipavel.java, Inventario.java e TipoItem.java feitas pelo Thiago são as referências, especialmente a Inventario.java.

- Criar métodos em Jogador que permitam-o equipar equipamentos possuídos e novos getters de status do jogador que levem em consideração os equipamentos equipados. Eles devem dar @Override nos getters da classe Personagem.

- Criar getters em Jogador para o inventário dele e um para cada equipamento equipado.

- A classe de Inimigo é uma classe genérica que vamos usar para inimigos comuns na criação de cenas mas ela também servirá como superclasse de inimigos mais especializados, como chefes
  - Por enquanto não temos ideias de que tipo de inimigos especializados vamos fazer

## Package: Cenas

Esse pacote contêm todas as classes que envolvam a composição de uma cena. A classe abstrata "Cena" define os comportamentos compartilhados entre cenas principais e cenas aleatórias. Cada cena que vamos mostrar pro jogador vai ser uma herdeira dessa abstrata.

- Criar classe 'Combate' que deverá conter todo o desenrolar de um combate entre jogador e inimigo. A ideia é fazer com que ela seja instanciada recebendo um jogador e um inimigo. A referência principal dela é a Combate.java feita pelo Thiago, essa classe pode ser quase que um copia e cola completo da original.

- Alterar a classe Cena para que ela possa aceitar instâncias de Combate.
  - A parte complexa é alinhar quando o combate deve acontecer dentro da cena. Quando a cena receber uma instância de combate, vamos precisar indicar também após qual diálogo ele deverá começar.

- Criar classe 'Opcao' que representa as escolhas que o usuário poderá tomar em dado momento dentro de uma Cena.

- Alterar a classe Cena para que ela possa aceitar instâncias de Opcao
  - Novamente, o complexo é alinhar quando essas opções serão dadas ao jogador e como fazer esses caminhos divergentes dentro da classe.

## Classe Main

A classe main (ainda não criada) será a classe principal do jogo, aonde vamos instanciar as cenas e controlar o fluxo de eventos. Nela vamos ter a instanciação direta das cenas principais e as chamadas ao método estático 'getCenaAleatoria'. Será aqui também que vamos controlar algumas exceções de erro possíveis pelo usuário, mas veremos depois que os pacotes acima estiverem construídos.
