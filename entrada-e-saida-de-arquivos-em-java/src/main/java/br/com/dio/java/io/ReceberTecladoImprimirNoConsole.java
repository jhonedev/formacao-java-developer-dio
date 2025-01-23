package br.com.dio.java.io;

import java.io.*;

public class ReceberTecladoImprimirNoConsole {

    public void lerLinha() throws IOException {
//        InputStream inputStream = System.in;
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //Comum ser usado dessa maneira
        System.out.println("Recomende 3 filmes: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String linha = bufferedReader.readLine();

//        OutputStream outputStream = System.out;
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
//        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        //Comum ser usado dessa maneira
        BufferedWriter bufferedWriter =  new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();

        }while (!(linha.isEmpty()));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
