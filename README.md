# Programa de Gerenciamento de Músicas e Podcasts

Este é um programa simples em Java para gerenciar músicas e podcasts. Ele permite ao usuário criar e visualizar informações sobre músicas e podcasts, além de simular ações como reproduzir e curtir.

## Funcionalidades

- Criar e visualizar informações sobre músicas e podcasts.
- Reproduzir e curtir músicas e podcasts.
- Classificar músicas e podcasts.

## Tecnologias Utilizadas

- Java
- IntelliJ IDEA (ou sua IDE preferida)

## Como Usar

1. Clone este repositório:

    ```bash
    git clone https://github.com/cgvargas/loja_de_musica.git
    ```

2. Abra o projeto em sua IDE.

3. Execute o arquivo `Principal.java` localizado na pasta `src/br/com/alura_desafio/principal`.

4. Siga as instruções no console para interagir com o programa.

## Exemplos de Uso

- Criar uma música:
  
    ```java
    System.out.print("1- Música / 2- Podcast: ");
    int opcao = sc.nextInt();
    sc.nextLine();

    if(opcao == 1){
        Musicas musicas = Musicas.criarModeloMusical(sc);
        System.out.println(musicas);
    }
    ```

- Criar um podcast:
  
    ```java
    System.out.print("1- Música / 2- Podcast: ");
    int opcao = sc.nextInt();
    sc.nextLine();

    if(opcao == 2){
        Podcasts podcasts = Podcasts.criarModeloPodcast(sc);
        System.out.println(podcasts);
    }
    ```

## Contribuindo

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver alguma sugestão de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Descrição

Este projeto foi criado para fins acadêmicos, onde utilizamos o paradigma orientado a objetos como principio de estudos.

---
