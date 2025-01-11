package br.com.dio.collection.set;

import java.util.Comparator;

public class ComparatorAnoNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int anoCriacao = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (anoCriacao != 0 ) return anoCriacao;

        return o1.getNome().compareTo(o2.getNome());
    }
}
