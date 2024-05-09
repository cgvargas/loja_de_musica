package br.com.alura_desafio.modelos;

import java.time.Clock;
import java.time.LocalDate;

public class Audio {
    private String titulo;
    private int totalCurtidas;
    private int totalDeReproducoes;
    private int classificacao;


    //Construtor Padrão:
    public Audio() {
    }

    public Audio(String titulo, int totalCurtidas, int totalDeReproducoes, int classificacao) {
        this.titulo = titulo;
        this.totalCurtidas = totalCurtidas;
        this.totalDeReproducoes = totalDeReproducoes;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return totalCurtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir() {
        this.totalCurtidas++;
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
    }

    public String getClassificacaoString() {
        return switch (classificacao) {
            case 1 -> "Ótima";
            case 2 -> "Boa";
            case 3 -> "Ruim";
            default -> "Desconhecida";
        };
    }

    @Override
    public String toString() {
        return "\nDescrição: " +
                "\n=====================" +
                "\nTítulo: " + titulo +
                "\nTotal de Curtidas: " + totalCurtidas +
                "\nTotal de Reproduções: " + totalDeReproducoes +
                "\nClassificação: " + getClassificacaoString(); // imprime a String

    }
}


