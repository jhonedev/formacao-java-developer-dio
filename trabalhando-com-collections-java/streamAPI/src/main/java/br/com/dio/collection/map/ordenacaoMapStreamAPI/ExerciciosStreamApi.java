package br.com.dio.collection.map.ordenacaoMapStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ExerciciosStreamApi {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista");
        numerosAleatorios.forEach(
                System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(
                        s -> System.out.println(s) // expressao lambda
                );

        System.out.println("Transforme essa lista em uma lista de numeros inteiros");
        List<Integer> numerosInteiros = new ArrayList<>(
                numerosAleatorios.stream()
                        .map(Integer::parseInt)
                        .toList());
        System.out.println(numerosInteiros);

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
        List<Integer> ListParesMaioresQueDois = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        return i % 2 == 0 && i > 2;
                    }
                })
                .toList();
        for (Integer numeros : ListParesMaioresQueDois) {
            System.out.println(numeros);
        }

        System.out.println("Mostre a media dos numeros");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares");
        numerosInteiros.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosInteiros);

    }
}
