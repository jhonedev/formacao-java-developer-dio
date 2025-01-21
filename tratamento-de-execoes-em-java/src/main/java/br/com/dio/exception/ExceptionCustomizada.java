package br.com.dio.exception;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {
    public static void main(String[] args) {

        String nomeArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido");

        imprimirArquivoNoConsole(nomeArquivo);
        System.out.println("\nCom exception ou nao, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeArquivo){
        try {
            BufferedReader br = lerArquivo(nomeArquivo);
            String line =  br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaDeArquivoException e) {
            e.printStackTrace();JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (IOException e){
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado, entre em contato com o suporte");
            e.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaDeArquivoException extends Exception {
    private String nomeArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException(String nomeArquivo, String diretorio) {
        super("O arquivo " + nomeArquivo + " nao foi encontrado no diretorio " + diretorio);
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeArquivo='" + nomeArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}

