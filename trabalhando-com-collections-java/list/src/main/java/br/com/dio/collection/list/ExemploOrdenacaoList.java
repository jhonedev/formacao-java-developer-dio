package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
        Dados os seguintes informaçoes sobre os gatos, crei uma lista e ordene esta lista exibindo:
        nome - idade - cor
        Gato 1 - nome: Jon, idade: 18, cor: preto
        Gato 2 - nome: Simba, idade: 6, cor: tigrado
        Gato 3 - nome: Jon, idade: 12, cor: amarelo*/
public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>();

        System.out.println("Ordem de inserção: ");
        gatos.add(new Gato("Jon", 18, "preto"));
        gatos.add(new Gato("Simba", 6, "tigrado"));
        gatos.add(new Gato("Jon", 12, "amarelo"));
        System.out.println(gatos);

        System.out.println("Ordem aleatória");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("Ordem natural (Nome)");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("Ordem Idade");
        Collections.sort(gatos, new ComparatorIdade());
        //gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("Ordem por cor");
        //Collections.sort(gatos, new ComparatorCor());
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("Ordem: Nome, cor, idade");
        Collections.sort(gatos, new ComparatorNomeCorIdade());
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);


    }
}
