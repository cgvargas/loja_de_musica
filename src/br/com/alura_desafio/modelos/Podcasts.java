package br.com.alura_desafio.modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Podcasts extends Audio {
    private String apresentador;
    private String descricao;

    public Podcasts(String titulo, String apresentador, String descricao, int totalCurtidas, int totalDeReproducoes, int classificacao) {
        super(titulo, totalCurtidas, totalDeReproducoes, classificacao);
        this.apresentador = apresentador;
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static Podcasts criarModeloPodcast(Scanner sc) {
        System.out.print("Informe o título do podcast: " );
        String titulo = sc.nextLine();
        System.out.print("Informe a descrição: " );
        String descricao = sc.nextLine();
        System.out.print("Informe o apresentador: " );
        String apresentador = sc.nextLine();

        char ouvirPodcast;
        System.out.printf("Deseja reproduzir o podcast %s s/n?:  ", titulo);
        ouvirPodcast = sc.nextLine().charAt(0);
        if(ouvirPodcast=='s' || ouvirPodcast=='S') {
            System.out.println("Música em reprodução...");
            Podcasts podcast = new Podcasts(titulo, apresentador, descricao,0,0,0);
            podcast.reproduzir();
        }else {
            System.out.println("Música em parada!");
        }

        char curtir;
        System.out.printf("Deseja curtir o podcast %s s/n?:  ", titulo);
        curtir = sc.nextLine().charAt(0);
        if(curtir=='s' || curtir=='S') {
            System.out.println("Obrigado pela curtida!\n");
            Podcasts podcasts = new Podcasts(titulo, apresentador, descricao, 0, 0, 0);
            podcasts.curtir();
        }else{
            System.out.println("Obrigado pela resposta!\n");
        }
        System.out.println("Classifique o podcast: ");
        System.out.print("1) Otima, 2) Boa, 3) Ruim: " );
        int classificacao = sc.nextInt();

        Podcasts podcast = new Podcasts(titulo, apresentador, descricao, 0, 0, classificacao);
        podcast.reproduzir(); // Incrementa a reprodução
        podcast.curtir();     // Incrementa a curtida

        return podcast;
    }

    LocalDate hoje = LocalDate.now();
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String hojeFormatado = hoje.format(formatador);

    @Override
    public String toString() {
        return super.toString() +
                "\nApresentador: " + apresentador +
                "\nDescrição: " + descricao +
                "\nData: " + hojeFormatado;

    }
}
