package com.projetono;

public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<>("Conteudo No1");
        No<String> no2 = new No<>("Conteudo No2");
        No<String> no3 = new No<>("Conteudo No3");
        No<String> no4 = new No<>("Conteudo No4");

        //Apontando de um nó para outro
        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        //Encandeamento de NÓ's.
        //no1 -> no2 -> no3 -> no4 -> null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


    }
}
