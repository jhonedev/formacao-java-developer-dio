package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as setes notas");
        List<Double> notas = new ArrayList<>();
        notas.add(7.1);
        notas.add(8.1);
        notas.add(4.5);
        notas.add(7.6);
        notas.add(8.9);
        notas.add(7.7);
        notas.add(9.9);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 8.9");
        System.out.println(notas.indexOf(8.9));

        System.out.println("Adicione na lista a nota 8 na posição 4");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 4.5 pela nota 6");
        notas.set(notas.indexOf(4.5), 6d );
        System.out.println(notas);

        System.out.println("Confira se a nota 8.9 está na lista");
        System.out.println(notas.contains(8.9));

        System.out.println("Exiba todas as notas em que foram inseridas, uma abaixo da outra ");
//        for (Double nota : notas) System.out.println(nota);  versão simplificada
        for (Double nota : notas) {
            System.out.println(nota);
        }


    }
}
