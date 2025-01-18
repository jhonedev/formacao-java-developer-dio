package br.com.dio.collection.map.ordenacaoMapStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(integer -> System.out.println(integer));
    }
}
