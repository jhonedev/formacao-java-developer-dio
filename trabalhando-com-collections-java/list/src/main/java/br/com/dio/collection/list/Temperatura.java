package br.com.dio.collection.list;

public class Temperatura {
    private String mes;
    private double temperatura;

    public Temperatura(double temperatura, String mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public double getTemperatura() {
        return temperatura;
    }
}
