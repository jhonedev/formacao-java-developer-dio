package br.com.dio.exception;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) throws IOException {

        // Imprimir um arquivo no console
        String nomeArquivo = "romances-blake-crouch.txt";
        imprimirArquivoConsole(nomeArquivo);

        System.out.println("Apesar da exception ou nao, o programa continua");

    }

    public static void imprimirArquivoConsole(String nomeArquivo) throws IOException {
        File arquivo = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(arquivo.getName()));
        String line =  br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while (line != null);
        bw.flush();
        br.close();
    }
}
