package br.com.dio.collection.set;

import java.util.Comparator;

public class ComparatorIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getIde().compareTo(o2.getIde());
    }
}
