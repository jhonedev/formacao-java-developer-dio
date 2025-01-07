package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicoListCrime {
    public static void main(String[] args) {

        List<String> perguntas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        perguntas.add("Telefonou pra vítima? S ou N");
        perguntas.add("Esteve no local do crime? S ou N");
        perguntas.add("Mora perto da vítima? S ou N");
        perguntas.add("Devia para a vítima S ou N");
        perguntas.add("Já trabalhou com a vítima? S ou N");

        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("s")) {
                contador++;
            }
        }
        scanner.close();

        if (contador < 2){
            System.out.println("Inocente");
        } else if (contador < 3) {
            System.out.println("Suspeito");
        }else if (contador < 5){
            System.out.println("Cúmplice");
        }else {
            System.out.println("Assassino");
        }
    }

}
