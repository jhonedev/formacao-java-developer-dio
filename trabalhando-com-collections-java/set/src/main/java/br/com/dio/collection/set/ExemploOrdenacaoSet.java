package br.com.dio.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

//        Dados as seguintes informações de séries, crie um conjunto e ordene exibindo:
//        (nome - genero - tempo de episodio)
//
//        serie1 - Nome: got, genero: fantasia, tempoEpisodio: 60;
//        serie2 - Nome: dark, genero: drama, tempoEpisodio: 60;
//        serie3 - Nome: that '70s show, genero: comédia, tempoEpisodio: 25

        Set<Serie> seriesSet = new HashSet<>();
        seriesSet.add(new Serie("got", "fantasia", 60));
        seriesSet.add(new Serie("dark", "drama", 60));
        seriesSet.add(new Serie("that '70s show", "comedia", 25));

        System.out.println("Ordem aleatória");
        for (Serie serie : seriesSet) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Ordem de insercao");
        Set<Serie> seriesSet1 = new LinkedHashSet<>();
        seriesSet1.add(new Serie("got", "fantasia", 60));
        seriesSet1.add(new Serie("dark", "drama", 60));
        seriesSet1.add(new Serie("that '70s show", "comedia", 25));

        for (Serie serie : seriesSet1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Ordem natural (Tempo Episodio");
        Set<Serie> seriesSet2 = new TreeSet<>(seriesSet);

        for (Serie serie : seriesSet2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Ordem Nome-Genero-TempoEpisodio");
        Set<Serie> serieSet3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        serieSet3.addAll(seriesSet);
        for (Serie serie : serieSet3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Ordem genero");
        Set<Serie> serieSet4 = new TreeSet<>(new ComparatorGenero());
        serieSet4.addAll(seriesSet);
        for (Serie serie : serieSet4) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }
}
