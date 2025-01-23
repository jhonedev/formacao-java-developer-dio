package br.com.dio.exception;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class ExceptionCustomizada2 {
    public static void main(String[] args) {

        int[] numerador = {4, 5, 8, 10, 8};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {

            try {
                if (numerador[i] %2 != 0){
                    throw new DivisaoNaoExataException("Divisao nao exata", numerador[i], denominador[i]);
                }
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro: Impossivel dividor por zero");
            }

        }
        System.out.println("O programa continua");
    }
}
