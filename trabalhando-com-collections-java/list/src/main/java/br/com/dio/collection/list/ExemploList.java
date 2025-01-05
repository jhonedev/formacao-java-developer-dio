package br.com.dio.collection.list;

import java.util.*;

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
        notas.set(notas.indexOf(4.5), 6d);
        System.out.println(notas);

        System.out.println("Confira se a nota 8.9 está na lista");
        System.out.println(notas.contains(8.9));

        System.out.println("Exiba todas as notas em que foram inseridas, uma abaixo da outra ");
//        for (Double nota : notas) System.out.println(nota);  versão simplificada
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota adicionada");
        System.out.println(notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota");
        System.out.println(Collections.min(notas));
        System.out.println(notas);

        System.out.println("Exiba a maior nota");
        System.out.println(Collections.max(notas));
        System.out.println(notas);

        System.out.println("Exiba a soma dos valores das notas");
        Double soma = 0d;
        for (Double nota : notas) {
            soma += nota;
        }
        System.out.println(soma);

        //ou

        Iterator<Double> iterator = notas.iterator();
        Double soma1 = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma1 += next;
        }
        System.out.println(soma1);

        System.out.println("Exiba a média das notas");
        Double media = 0d;
        media = soma / notas.size();
        System.out.println(media);

        System.out.println("Remova a nota 6.0");
        notas.remove(6d);
        System.out.println(notas);

        System.out.println("Remova a nota da posicao 1");
        notas.remove(1);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 8");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 8d){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia");
        System.out.println(notas.isEmpty());

        System.out.println("Exercicios utilizando os metodos da implementação LinkedList: ");

        System.out.println("Crie uma lista chamada notas2");
        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(9d);
        notas2.add(8.6);
        notas2.add(4.6);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem remove-lo");
        System.out.println(notas2.getFirst());

        System.out.println("Mostre a primeira nota da nova lista removendo-a");
        System.out.println(notas2.removeFirst());
        System.out.println(notas2);


    }
}
