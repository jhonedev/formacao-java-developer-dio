package br.com.dio.collection.list;

public class TemperaturaAnual {
    private String mes;
    private double temperatura;

    public TemperaturaAnual(double temperatura, String mes) {
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
