package one.digitalinovation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Peugeut"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hashSetCarros);

        Set<Carro> treeeSetCarros = new TreeSet<>();
        treeeSetCarros.add(new Carro("Ford"));
        treeeSetCarros.add(new Carro("Fiat"));
        treeeSetCarros.add(new Carro("Chevrolet"));
        treeeSetCarros.add(new Carro("Peugeut"));
        treeeSetCarros.add(new Carro("Zip"));
        treeeSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(treeeSetCarros);// comparando carro pelo metodo compareTo da classe Carro

    }

}
