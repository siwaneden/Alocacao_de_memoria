# Alocacao_de_memoria

# Sistema de Cadastro de Produtos em Java

## Introdução

Este projeto é um sistema simples de cadastro de produtos, desenvolvido em Java. O sistema faz uso de alocação dinâmica de memória para armazenar os produtos em uma lista. A interação com o usuário é realizada através do terminal.

## Estrutura do Código

### Classe `Product`

A classe `Product` é responsável por modelar o objeto de um produto. Ela contém três atributos:

- `id`: Um identificador numérico para o produto.
- `name`: O nome do produto.
- `price`: O preço do produto.

### Classe `Main`

Esta classe contém o método `main`, que é o ponto de entrada do programa. Ela faz o seguinte:

1. Inicializa um objeto `Scanner` para ler a entrada do usuário.
2. Cria uma lista dinâmica `ArrayList<Product>` para armazenar os produtos.
3. Entra em um loop para permitir o cadastro contínuo de produtos até que o usuário decida parar.

## Funcionamento

1. O programa pede ao usuário para inserir o nome e o preço do produto.
2. Um novo objeto `Product` é criado com essas informações e um `id` gerado automaticamente.
3. O objeto `Product` é adicionado à lista `ArrayList`.
4. O usuário é questionado se deseja continuar adicionando produtos.
5. Finalmente, todos os produtos cadastrados são exibidos no terminal.


