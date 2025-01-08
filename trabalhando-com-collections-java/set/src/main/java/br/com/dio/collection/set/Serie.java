package br.com.dio.collection.set;

import java.util.Objects;

public class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.tempoEpisodio = tempoEpisodio;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

//    @Override
//    public String toString() {
//        return "Serie{" +
//                "nome='" + nome + '\'' +
//                ", genero='" + genero + '\'' +
//                ", tempoEpisodio=" + tempoEpisodio +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());

        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }
}
