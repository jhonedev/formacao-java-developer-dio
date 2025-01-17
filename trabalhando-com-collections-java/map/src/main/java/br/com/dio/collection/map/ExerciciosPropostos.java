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

        System.out.println("Esiba todos os estados na ordem em que foram inseridos");
        Map<String, Estado> estados1 = new LinkedHashMap<>();
        estados1.put("PE", new Estado(9616621));
        estados1.put("AL", new Estado(3351543));
        estados1.put("CE", new Estado(9187103));
        estados1.put("RN", new Estado(3534265));

        Set<Map.Entry<String, Estado>> entrySet = estados1.entrySet();
        for (Map.Entry<String, Estado> stringEstadoEntry : entrySet) {
            System.out.println(stringEstadoEntry.getKey() + " - " + stringEstadoEntry.getValue().getPopulacao());
        }

        System.out.println("Exiba os estados e suas populacoes em ordem alfabetica");
        Map<String, Estado> estadoMap = new TreeMap<>(estados);
        Set<Map.Entry<String, Estado>> entrySet1 = estadoMap.entrySet();
        for (Map.Entry<String, Estado> stringEstadoEntry : entrySet1) {
            System.out.println(stringEstadoEntry.getKey() + " - " + stringEstadoEntry.getValue().getPopulacao());
        }

        System.out.println("Exiba o estado com a maior e menor populacao e sua quantidade");
        Map<String, Integer> estados2 = new HashMap<>();

        estados2.put("PE", 9616621);
        estados2.put("AL", 3351543);
        estados2.put("CE", 9187103);
        estados2.put("RN", 3534265);

        Collection<Integer> populacao = estados2.values();
        String EstadoMaiorPopulacao = "";
        String EstadoMenorPopulacao = "";
        Integer min = Collections.min(populacao);
        Integer max = Collections.max(populacao);

        for (Map.Entry<String, Integer> entry : estados2.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))){
                EstadoMaiorPopulacao = entry.getKey();
            }
            if (entry.getValue().equals(Collections.min(populacao))){
                EstadoMenorPopulacao = entry.getKey();
            }
        }
        System.out.println("Estado com maior populacao: " + EstadoMaiorPopulacao + " com " + max);
        System.out.println("Estado com menor populacao: " + EstadoMenorPopulacao + " com " + min);

        System.out.println("Exiba a soma da populacao desses estados");
        int soma = 0;
        for (int i : populacao) {
            soma += i;
        }
        // ou

//        Iterator<Integer> iterator = estados2.values().iterator();
//        int soma1 = 0;
//        while (iterator.hasNext()) {
//            soma1 += iterator.next();
//        }
        System.out.println("A soma da populacao é : " + soma);

        System.out.println("Exiba a media da populacao desse dicionario");
        double media = (double) soma / populacao.size();
        System.out.println("A media da populacao é " + media);

        System.out.println("Remova os estados com populacao menor que 4000000");
        Iterator<Map.Entry<String, Integer>> entries = estados2.entrySet().iterator();
        while (entries.hasNext()){
            if (entries.next().getValue() < 4000000){
                entries.remove();
            }
        }

        for (Map.Entry<String, Integer> entry : estados2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Apague o dicionario de estados");
        estados.clear();

        System.out.println("Confira se o dicionario esta vazio");
        System.out.println(estados);

    }
}
