package br.com.dio.collection.set;

import java.util.Comparator;

public class ComparatorOrdemInversa implements Comparator<ArcoIris> {
    @Override
    public int compare(ArcoIris cor1, ArcoIris cor2) {
        return cor2.getCor().compareTo(cor1.getCor());
    }
}
