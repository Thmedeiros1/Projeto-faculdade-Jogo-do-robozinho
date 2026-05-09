# TODO

- Fazer a classe Cena receber 'Personagem' como parâmetro, assim podemos fazer um tratamento de polimorfismo para definir o comportamento de Inimigo, Jogador e NPC numa cena

- Finalizar as classes de personagens

- Criar as classes para Items, ItemsEquipáveis e Inventário

- Criar o comportamento de ações que o usuário pode tomar dentro de cenas e entre cenas

# Cenas

Criei uma classe abstrata "Cena" que conterá todos os comportamentos que cenas devem ter

Cenas fixas (História e loja) serão instanciadas diretamente na classe Main
Cenas aleatórias seguirão uma lógica utilizando um método dentro da classe Cena que manterá
tracking de um array contendo referências para cada classe de cena aleatória e quais já foram instanciadas para evitar repetições

# Jogador

Eu retirei (temporariamente) o sistema de conquistas e reputação porque elas usavam hashmap/table
e eu não sei mexer com essas coisas
(também não sei se elas vão continuar pra versão final)
