package br.com.alura_desafio.principal;

import br.com.alura_desafio.modelos.Musicas;
import br.com.alura_desafio.modelos.Podcasts;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1- Música / 2- Podcast: ");
        int opcao = sc.nextInt();

        sc.nextLine();

        if(opcao == 1){
            Musicas musicas = Musicas.criarModeloMusical(sc);
            System.out.println(musicas);

        }else {
            Podcasts podcasts = Podcasts.criarModeloPodcast(sc);
            System.out.println(podcasts);

        }
        sc.close();
    }
}