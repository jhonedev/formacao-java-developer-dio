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
        System.out.printf("Arquivo \"%s\" foi criado com sucesso, com tamanho '%d'", fileCopia.getName(), fileCopia.length());

    }

    public static void adicionarRecomendacaoNoArquivo(){

    }

    public static void main(String[] args) throws IOException {
        //Faça uma copia do arquivo recomendacoes.txt e agora adicione 3 recomendacoes de livros
        copiarArquivo();
    }
}
