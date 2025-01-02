package one.digitalinovation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugot"))); // adiciona a lista, caso nao consiga, retorna um erro.
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault"))); // ao contrario do add, ele adiciona, mas se não conseguir add ele retorna false
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); // verifica quem é o item que está no inicio da fila, sem excluir
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); // verifica quem é o item que está no inicio da fila e exclui.
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty()); // verifica se a fila está vazia

        System.out.println(queueCarros.size()); // verifica o tamanho da fila


    }

}
