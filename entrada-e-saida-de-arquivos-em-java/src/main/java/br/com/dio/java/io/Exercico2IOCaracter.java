package br.com.dio.java.io;

import java.io.*;
import java.util.Scanner;

public class Exercico2IOCaracter {

    public static void lerTecladoEscreverDocumento() throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("Digite 3 filmes: ");
        printWriter.flush();

        Scanner scanner = new Scanner(System.in);
        String linha = scanner.nextLine();

        File file = new File("recomendacoes.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getName()));

        do {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            linha = scanner.nextLine();
        }while (!(linha.equalsIgnoreCase("fim")));

        printWriter.printf("Arquivo \"%s\" foi criado com sucesso", file.getName());

        printWriter.close();
        scanner.close();
        bufferedWriter.close();




    }


    public static void main(String[] args) throws IOException {
        //Abra o teclado para escrever 3 filmes que voce recomendaria e armazene em recomendacoes.txt
        lerTecladoEscreverDocumento();
    }
}
