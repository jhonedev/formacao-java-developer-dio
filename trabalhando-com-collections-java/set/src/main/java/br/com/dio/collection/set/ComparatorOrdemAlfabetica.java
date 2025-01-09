package br.com.dio.collection.set;

import java.util.Comparator;

public class ComparatorOrdemAlfabetica implements Comparator<ArcoIris> {
    @Override
    public int compare(ArcoIris cor1, ArcoIris cor2) {
        return cor1.getCor().compareTo(cor2.getCor());
    }
}
