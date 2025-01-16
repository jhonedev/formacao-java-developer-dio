package br.com.dio.collection.map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNomeLivros implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareTo(livro2.getValue().getNome());
    }
}
