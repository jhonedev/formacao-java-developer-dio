package br.com.dio.collection.set;

import java.util.*;

public class ExercicioArcoIris {
    public static void main(String[] args) {

        Set<ArcoIris> arcoIrisSet = new LinkedHashSet<>();
        arcoIrisSet.add(new ArcoIris("Vermelho"));
        arcoIrisSet.add(new ArcoIris("Laranja"));
        arcoIrisSet.add(new ArcoIris("Amarelo"));
        arcoIrisSet.add(new ArcoIris("Verde"));
        arcoIrisSet.add(new ArcoIris("Azul"));
        arcoIrisSet.add(new ArcoIris("Anil"));
        arcoIrisSet.add(new ArcoIris("Violeta"));

        System.out.println("Exiba todas as cores uma abaixo da outra");
        for (ArcoIris arcoIris : arcoIrisSet) {
            System.out.println(arcoIris.getCor());
        }

        System.out.println("A quantidade de cores que o arco-iris tem");
        System.out.println(arcoIrisSet.size());

        System.out.println("Exiba as cores em ordem alfabetica");
        Set<ArcoIris> arcoIrisSet1 = new TreeSet<>(new ComparatorOrdemAlfabetica());
        arcoIrisSet1.addAll(arcoIrisSet);
        for (ArcoIris arcoIris : arcoIrisSet1) {
            System.out.println(arcoIris.getCor());
        }

        System.out.println("Exiba as cores na ordem inversa em que foi informada");
        Set<ArcoIris> arcoIrisSet2 = new TreeSet<>(new ComparatorOrdemInversa());
        arcoIrisSet2.addAll(arcoIrisSet);
        for (ArcoIris arcoIris : arcoIrisSet2) {
            System.out.println(arcoIris.getCor());
        }
    }
}
