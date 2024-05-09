package br.com.alura_desafio.modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Musicas extends Audio {
    private String album;
    private String cantor;
    private String genero;

    public Musicas(String titulo, String album, String cantor, String genero, int totalCurtidas, int totalDeReproducoes, int classificacao) {
        super(titulo, totalCurtidas, totalDeReproducoes, classificacao);
        this.album = album;
        this.cantor = cantor;
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public static Musicas criarModeloMusical(Scanner sc) {
        System.out.print("Informe o título da música: ");
        String titulo = sc.nextLine();
        System.out.print("Informe o album: ");
        String album = sc.nextLine();
        System.out.print("Informe o cantor: ");
        String cantor = sc.nextLine();
        System.out.print("Informe o gênero musical: ");
        String genero = sc.nextLine();

        char ouvirMusica;
        System.out.printf("Deseja reproduzir a música %s s/n?:  ", titulo);
        ouvirMusica = sc.nextLine().charAt(0);
        if (ouvirMusica == 's' || ouvirMusica == 'S') {
            System.out.println("Música em reprodução...");
        } else {
            System.out.println("Música parada!");
        }

        char curtir;
        System.out.printf("Deseja curtir a música %s s/n?:  ", titulo);
        curtir = sc.nextLine().charAt(0);
        if (curtir == 's' || curtir == 'S') {
            System.out.println("Obrigado pela curtida!\n");
        } else {
            System.out.println("Obrigado pela resposta!\n");
        }

        int classificacao = 0;
        boolean classificacaoValida = false;
        while (!classificacaoValida) {
            try {
                System.out.println("Classifique a música: ");
                System.out.print("1) Ótima, 2) Boa, 3) Ruim: ");
                classificacao = sc.nextInt();
                if (classificacao < 1 || classificacao > 3) {
                    throw new InputMismatchException("Opção inválida! Escolha um número entre 1 e 3.");
                }
                classificacaoValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: " + e.getMessage());
                sc.nextLine(); // Limpa o buffer do scanner
            }
        }

        Musicas musicas = new Musicas(titulo, album, cantor, genero, 0, 0, classificacao);
        musicas.reproduzir(); // Incrementa a reprodução
        musicas.curtir();     // Incrementa a curtida

        return musicas;
    }

    LocalDate hoje = LocalDate.now();
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String hojeFormatado = hoje.format(formatador);

    @Override
    public String toString() {
        return super.toString() +
                "\nálbum: " + album +
                "\nCantor: " + cantor +
                "\nGênero: " + genero +
                "\nData: " + hojeFormatado;

    }

}
