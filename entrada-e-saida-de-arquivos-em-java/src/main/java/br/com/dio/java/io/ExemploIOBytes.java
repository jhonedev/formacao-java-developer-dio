package br.com.dio.java.io;

import java.io.*;

public class ExemploIOBytes {
    public static void copiarArquivo() throws IOException {
        File file = new File("C:\\Users\\jonat\\OneDrive\\Área de Trabalho\\Cursos\\formacao-java-developer\\entrada-e-saida-de-arquivos-em-java\\recomendacoes-copia.txt");
        String nomeArquivo = file.getName();

        BufferedInputStream bufferedInputStream = new  BufferedInputStream(new FileInputStream(nomeArquivo)); // Leitura do arquivo
        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("-copy2.txt");

        File fileCopy = new File(nomeArquivoCopy);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileCopy));

        int line = 0;
        while ((line = bufferedInputStream.read()) != -1){
            bufferedOutputStream.write((char) line);
            bufferedOutputStream.flush();
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();

        PrintStream printStream = new PrintStream(System.out);
        printStream.printf("Arquivo %s copiado com sucesso e está no diretório %s com %d bytes",
                fileCopy.getName(), fileCopy.getPath(), fileCopy.length());

    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
