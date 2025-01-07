package br.com.dio.collection.set;

import javax.sound.midi.Soundbank;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        //Dada a lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>();

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("Confira se a nota 5d está no conjunto");
        System.out.println(notas.contains(5d));

        System.out.println("Exiba a menor nota");
        System.out.println(Collections.min(notas));

        System.out.println("Exiba a maior nota");
        System.out.println(Collections.max(notas));

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas");
        Double media = soma / notas.size();
        System.out.println(media);

        System.out.println("Remova a nota 0d");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova todas as notas menores que 7 e remova da lista");
//        notas.removeIf(nota -> nota < 7);
//        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram inseridos: ");
        Set<Double> notas1 = new LinkedHashSet<>();
        notas1.add(7d);
        notas1.add(8.5);
        notas1.add(9.3);
        notas1.add(5d);
        notas1.add(7d);
        notas1.add(0d);
        notas1.add(3.6);
        System.out.println(notas1);

        System.out.println("Exiba todas as notas na ordem crescente");
        Set<Double> notas2 = new TreeSet<>(notas1);
        System.out.println(notas2);

        System.out.println("Apague todo o conjunto");
        notas2.clear();
        System.out.println(notas2);

        System.out.println("Verifique se a lista esta vazia");
        System.out.println(notas2.isEmpty());
    }
}
