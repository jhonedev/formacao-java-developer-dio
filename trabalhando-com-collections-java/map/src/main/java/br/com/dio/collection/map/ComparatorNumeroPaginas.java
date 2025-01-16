package br.com.dio.collection.map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNumeroPaginas implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getNumeroPaginas().compareTo(livro2.getValue().getNumeroPaginas());
    }
}
