package br.com.dio.collection.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        /*Dado os modelos dos carros e seus respectivos consumos na estrada, faca:
        modelo = gol - consumo 14,4 km/l
        modelo = uno - consumo 15,6 km/l
        modelo = mobi - consumo 16,1 km/l
        modelo = hb20 - consumo 14,5 km/l
        modelo = kwid - consumo 15,6 km/l
         */

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> modeloCarros = new HashMap<>();

        modeloCarros.put("Gol", 14.4);
        modeloCarros.put("Uno", 15.6);
        modeloCarros.put("Mobi", 16.1);
        modeloCarros.put("Hb20", 14.5);
        modeloCarros.put("Kwid", 15.6);

        System.out.println(modeloCarros);

        System.out.println("Substitua o consumo do gol por 15.2 km/l");
        modeloCarros.replace("Gol", 14.5);
        System.out.println(modeloCarros);

        System.out.println("Confira se o modelo tucson esta no dicionario");
        System.out.println(modeloCarros.containsKey("tucson"));

        System.out.println("Exiba o consumo do Uno");
        System.out.println(modeloCarros.get("Uno"));

        System.out.println("Exiba os modelos");
        Set<String> modelo = modeloCarros.keySet();
        System.out.println(modelo);

        System.out.println("Exiba os consumos dos carros");
        Collection<Double> valor = modeloCarros.values();
        System.out.println(valor);

        System.out.println("Exiba o modelo mais economico e seu consumo");
        Double consumoMaisEficiente = Collections.max(modeloCarros.values());
        Set<Map.Entry<String, Double>> entries1 = modeloCarros.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries1) {
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente é: " + modeloMaisEficiente + " com " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos economico e seu consumo");
        Double consumoMenosEficiente = Collections.min(modeloCarros.values());
        Set<Map.Entry<String, Double>> entries = modeloCarros.entrySet();
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente é : " + modeloMenosEficiente + " com " + consumoMenosEficiente);
            }
        }

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = modeloCarros.values().iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma dos valores foi de : " + soma);

        System.out.println("Exiba a media dos consumos deste dicionario de carros");
        Double media = soma / modeloCarros.size();
        System.out.println(media);

        System.out.println("Remova os modelos com o consumo igual a 15.6 km/l");
        Iterator<Double> iterator1 = modeloCarros.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println(modeloCarros);

        System.out.println("Exiba todos os carros na ordem em que foram informado");
        Map<String, Double> modeloCarros1 = new LinkedHashMap<>();
        modeloCarros1.put("Gol", 14.4);
        modeloCarros1.put("Uno", 15.6);
        modeloCarros1.put("Mobi", 16.1);
        modeloCarros1.put("Hb20", 14.5);
        modeloCarros1.put("Kwid", 15.6);

        System.out.println(modeloCarros1);

        System.out.println("Exiba o dicionario ordenado pelo modelo (ordem alfabetica)");
        Map<String, Double> modeloCarros2 = new TreeMap<>(modeloCarros1);
        System.out.println(modeloCarros2);

        System.out.println("Apague o dicionario de carros");
        modeloCarros1.clear();
        System.out.println(modeloCarros1);

        System.out.println("Confir se a lista esta vazia");
        System.out.println(modeloCarros1.isEmpty());


    }
}
