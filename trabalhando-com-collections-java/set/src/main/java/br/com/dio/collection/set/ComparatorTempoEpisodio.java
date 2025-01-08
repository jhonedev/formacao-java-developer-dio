package br.com.dio.collection.set;

import java.util.Comparator;

public class ComparatorTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int tempoEpisodio = serie1.getTempoEpisodio().compareTo(serie2.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        int nome = serie1.getNome().compareTo(serie2.getNome());
        if (nome != 0) return nome;

        return serie1.getGenero().compareTo(serie2.getGenero());
    }
}
