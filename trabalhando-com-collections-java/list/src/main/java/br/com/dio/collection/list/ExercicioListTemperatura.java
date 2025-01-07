package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ExercicioListTemperatura {
    public static void main(String[] args) {

        List<Temperatura> temperatura = new ArrayList<>();

        temperatura.add(new Temperatura(25d, "Janeiro"));
        temperatura.add(new Temperatura(25.2, "Fervereiro"));
        temperatura.add(new Temperatura(33d, "Março"));
        temperatura.add(new Temperatura(26.4, "Abril"));
        temperatura.add(new Temperatura(23d, "Maio"));
        temperatura.add(new Temperatura(22.4, "Junho"));

        double soma = 0d;
        for (Temperatura temperaturaAnual : temperatura) {
            soma += temperaturaAnual.getTemperatura();
        }

        double media = soma / temperatura.size();
        System.out.println("A média das temperaturas é: " + media);

        System.out.println("As temperaturas acima da médias são:");
        for (int i = 0; i < temperatura.size(); i++) {
            Temperatura temp = temperatura.get(i);
            if (temp.getTemperatura() > media){
                System.out.println((i + 1) + " - " + temp.getMes() + " - " + temp.getTemperatura());
            }
        }
    }
}
