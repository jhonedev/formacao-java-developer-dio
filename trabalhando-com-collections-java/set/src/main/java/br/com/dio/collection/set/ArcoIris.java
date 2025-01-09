package br.com.dio.collection.set;

import java.util.Comparator;
import java.util.Objects;

public class ArcoIris{
    private String cor;

    public ArcoIris(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ArcoIris arcoIris = (ArcoIris) o;
        return Objects.equals(cor, arcoIris.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cor);
    }

    @Override
    public String toString() {
        return "ArcoIris{" +
                "cor='" + cor + '\'' +
                '}';
    }
}
