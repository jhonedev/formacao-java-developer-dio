package one.digitalinovation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeut"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Uno"));

        System.out.println(listCarros.contains(new Carro("Fiat")));

        System.out.println(listCarros.get(3));

        System.out.println(listCarros.indexOf(new Carro("Fiat"))); // informa em qual posicao (indice) está o item selecionado

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);


    }

}
