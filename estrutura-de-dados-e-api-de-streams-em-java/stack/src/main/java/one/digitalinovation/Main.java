package one.digitalinovation;


import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);

        System.out.println(stackCarros.pop()); // retirando o ultimo item adicionado na lista
        System.out.println(stackCarros);


        System.out.println(stackCarros.peek()); // verifica o ultimo item adicionado na lista mas nao o retira.
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty()); // verifica se a lista está vazia
        System.out.println(stackCarros);




    }

}
