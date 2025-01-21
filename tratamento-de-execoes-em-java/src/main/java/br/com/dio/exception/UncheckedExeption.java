package br.com.dio.exception;

import javax.swing.*;

public class UncheckedExeption {
    public static void main(String[] args) {

        boolean continuaLooping = true;
        do {
            //Fazer a divisao de dois numero inteiros
            String a  = JOptionPane.showInputDialog("Numerador");
            String b =  JOptionPane.showInputDialog("Denominador");

            try {
                int num1 = Integer.parseInt(a);
                int num2 = Integer.parseInt(b);

                Dividir calcular = new Dividir();
                int resultado = calcular.dividir(num1, num2);
                System.out.println(resultado);
                continuaLooping = false;
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Entrada invalida, infome numeros inteiro");
                //e.printStackTrace();
            }catch (ArithmeticException exception){
                JOptionPane.showMessageDialog(null, "Impossivel dividir um numero por 0");
            } finally {
                System.out.println("Chegou no finally");
            }
        }while (continuaLooping);
        System.out.println("O codigo continua");
    }
}
