package br.com.dio.collection.map;

import java.util.*;

public class ExerciciosPropostos {
    public static void main(String[] args) {

        /*
        Dada a populacao estimada de alguns estados do Nordeste, faca:
        Estado = PE - Populacao = 9.616.621
        Estado = AL - Populacao = 3.351.543
        Estado = CE - Populacao = 9.187.103
        Estado = RN - Populacao = 3.534.265
         */

        System.out.println("Crie um dicionario e relacione os estados e suas populacoes");
        Map<String, Estado> estados = new HashMap<>();

        estados.put("PE", new Estado(9616621));
        estados.put("AL", new Estado(3351543));
        estados.put("CE", new Estado(9187103));
        estados.put("RN", new Estado(3534265));

        Set<Map.Entry<String, Estado>> estadoEntry = estados.entrySet();

        for (Map.Entry<String, Estado> stringEstadoEntry : estadoEntry) {
            System.out.println(stringEstadoEntry.getKey() + " - " + stringEstadoEntry.getValue().getPopulacao());
        }

        System.out.println("Substitua a populacao do RN por 3534165");
        estados.replace("RN", new Estado(3534165));

        for (Map.Entry<String, Estado> stringEstadoEntry : estadoEntry) {
            System.out.println(stringEstadoEntry.getKey() + " - " + stringEstadoEntry.getValue().getPopulacao());
        }

        System.out.println("Confira se o estado PB esta no dicionario, caso nao, adicione: PB - 4039277");
        if (!estados.containsKey("PB")){
            estados.put("PB", new Estado(4039277));
        }

        for (Map.Entry<String, Estado> stringEstadoEntry : estadoEntry) {
            System.out.println(stringEstadoEntry.getKey() + " - " + stringEstadoEntry.getValue().getPopulacao());
        }

        System.out.println("Exiba a populaao de PE");
        System.out.println(estados.get("PE").getPopulacao());
    }
}
