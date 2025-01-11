package br.com.dio.collection.set;

import java.util.Comparator;

public class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if (nome != 0) return nome;

        int ano = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return o1.getIde().compareTo(o2.getIde());
    }
}
