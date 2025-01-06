package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosList {
    public static void main(String[] args) {

        List<TemperaturaAnual> temperatura = new ArrayList<>();

        temperatura.add(new TemperaturaAnual(25d, "Janeiro"));
        temperatura.add(new TemperaturaAnual(25.2, "Fervereiro"));
        temperatura.add(new TemperaturaAnual(33d, "Março"));
        temperatura.add(new TemperaturaAnual(26.4, "Abril"));
        temperatura.add(new TemperaturaAnual(23d, "Maio"));
        temperatura.add(new TemperaturaAnual(22.4, "Junho"));

        double soma = 0d;
        for (TemperaturaAnual temperaturaAnual : temperatura) {
            soma += temperaturaAnual.getTemperatura();
        }

        double media = soma / temperatura.size();
        System.out.println("A média das temperaturas é: " + media);

        System.out.println("As temperaturas acima da médias são:");
        for (int i = 0; i < temperatura.size(); i++) {
            TemperaturaAnual temp = temperatura.get(i);
            if (temp.getTemperatura() > media){
                System.out.println((i + 1) + " - " + temp.getMes() + " - " + temp.getTemperatura());
            }
        }
    }
}
