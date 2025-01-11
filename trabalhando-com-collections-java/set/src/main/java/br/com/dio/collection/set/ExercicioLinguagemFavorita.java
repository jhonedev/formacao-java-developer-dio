package br.com.dio.collection.set;

import java.util.*;

public class ExercicioLinguagemFavorita {
    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagemFavoritaSet = new HashSet<>();
        linguagemFavoritaSet.add(new LinguagemFavorita("Java", 1995, "Intelij"));
        linguagemFavoritaSet.add(new LinguagemFavorita("Python", 1991, "VsCode"));
        linguagemFavoritaSet.add(new LinguagemFavorita("JavaScript", 1995, "Vscode"));

        System.out.println("Ordene por ordem de inserção");
        Set<LinguagemFavorita> linguagemFavoritaSet1 = new LinkedHashSet<>();
        linguagemFavoritaSet1.add(new LinguagemFavorita("Java", 1995,"Intelij"));
        linguagemFavoritaSet1.add(new LinguagemFavorita("Python", 1991,"VsCode"));
        linguagemFavoritaSet1.add(new LinguagemFavorita("JavaScript", 1995,"VsCode"));

        for (LinguagemFavorita linguagemFavorita : linguagemFavoritaSet1) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("Ordem natural (nome)");
        Set<LinguagemFavorita> linguagemFavoritaSet2 = new TreeSet<>(linguagemFavoritaSet);
        for (LinguagemFavorita linguagem : linguagemFavoritaSet2){
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        };

        System.out.println("Ordem (IDE)");
        Set<LinguagemFavorita> linguagemFavoritaSet3 = new TreeSet<>(new ComparatorIde());
        linguagemFavoritaSet3.addAll(linguagemFavoritaSet);
        for (LinguagemFavorita linguagem : linguagemFavoritaSet3) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        }

        System.out.println("Ordene por Ano e nome");
        Set<LinguagemFavorita> linguagemFavoritaSet4 = new TreeSet<>( new ComparatorAnoNome());
        linguagemFavoritaSet4.addAll(linguagemFavoritaSet);
        for (LinguagemFavorita linguagem : linguagemFavoritaSet4) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        }

        System.out.println("Ordene por Nome, Ano e IDE");
        Set<LinguagemFavorita> linguagemFavoritaSet5 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagemFavoritaSet5.addAll(linguagemFavoritaSet);
        for (LinguagemFavorita linguagem : linguagemFavoritaSet5) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        }

    }
}
