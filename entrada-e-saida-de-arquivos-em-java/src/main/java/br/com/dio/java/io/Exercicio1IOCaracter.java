package br.com.dio.java.io;

import java.io.IOException;

public class Exercicio1IOCaracter {
    public static void main(String[] args) throws IOException {

        //Abra o teclado para escrever 3 filmes que voce recomendaria e exiba os filmes no console
        ReceberTecladoImprimirNoConsole leitorDeLinha = new ReceberTecladoImprimirNoConsole();

        leitorDeLinha.lerLinha();

    }
}
