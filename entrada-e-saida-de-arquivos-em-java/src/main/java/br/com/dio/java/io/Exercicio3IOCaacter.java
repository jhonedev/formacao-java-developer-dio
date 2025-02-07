package br.com.dio.java.io;

import java.io.*;
import java.util.SortedMap;

public class Exercicio3IOCaacter {

    public static void copiarArquivo() throws IOException {
        File file = new File("C:\\Users\\jonat\\OneDrive\\Área de Trabalho\\Cursos\\formacao-java-developer\\entrada-e-saida-de-arquivos-em-java\\recomendacoes.txt");
        String nomeArquivo = file.getName();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));
        String linha = bufferedReader.readLine();

        String nomeArquivoCopia = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copia.txt");
        File fileCopia = new File(nomeArquivoCopia);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileCopia.getName()));

        do {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            linha = bufferedReader.readLine();
        }while (!(linha == null));

        System.out.printf("Arquivo \"%s\" foi copiado com sucesso, com tamanho '%d'\n", file.getName(), file.length());
        System.out.printf("Arquivo \"%s\" foi criado com sucesso, com tamanho '%d'\n", fileCopia.getName(), fileCopia.length());

        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("Recomende 3 livros");
        printWriter.flush();

        adicionarRecomendacaoNoArquivo(fileCopia.getName());

        printWriter.printf("Ok, tudo certo. Tamanho do arquivo copia é: '%d' bytes.", fileCopia.length());
        bufferedReader.close();
        bufferedWriter.close();
        printWriter.close();
    }

    public static void adicionarRecomendacaoNoArquivo(String nomeArquivo) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String linha  = bufferedReader.readLine();

        BufferedWriter bufferedWriter = new BufferedWriter((new FileWriter(nomeArquivo, true)));
        do {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            linha = bufferedReader.readLine();
        }while (!(linha.equalsIgnoreCase("fim")));

        bufferedWriter.close();
        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException {
        //Faça uma copia do arquivo recomendacoes.txt e agora adicione 3 recomendacoes de livros
        copiarArquivo();
    }
}
