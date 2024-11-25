package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("IntA = " + intA + ", IntB = " + intB);
        intA = 2;
        System.out.println("IntA = " + intA + ", IntB = " + intB);


        MeuObjeto objetoA = new MeuObjeto(1);
        MeuObjeto objetoB = objetoA;

        System.out.println("objetoA = " + objetoA + ", objetoB = " + objetoB);
        objetoA.setNum(2);
        System.out.println("objetoA = " + objetoA + ", objetoB = " + objetoB);
    }
}
