package br.com.dio.exception;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {

        // Imprimir um arquivo no console
        String nomeArquivo = "romances-blake-crouch.txt";
        try {
            imprimirArquivoConsole(nomeArquivo);
        }catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do seu arquivo que você deseja imprimir");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado, entre em contato com o suporte!");
            e.printStackTrace();
        }finally {
            System.out.println("Chegou no finally");
        }

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
