package br.com.dio.collection.map;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        /*
        Dados as seguintes informacoes sobre os livros e seus autores, crie um dicionario e ordene este dicionario

        Autor - Hawking, Stephen - Livro = nome: Uma breve historia do tempo, paginas: 256
        Autor - Duhigg, Charles - Livro = nome: O poder do hábito, paginas: 408
        Autor - Harari, Yoval Noah - Livro = nome: 21 licoes para o seculo 21, paginas: 432
         */

        System.out.println("Ordem aleatoria");
        Map<String, Livro> livroMap = new HashMap();
        livroMap.put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
        livroMap.put("Duhigg, Charles", new Livro("O poder do hábito", 408));
        livroMap.put("Harari, Yoval Noah", new Livro("21 licoes para o seculo 21", 432));
        Set<Map.Entry<String, Livro>> LivroEntrie = livroMap.entrySet();

        for (Map.Entry<String, Livro> livro : LivroEntrie) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getNumeroPaginas() + " paginas");
        }

        System.out.println("Ordem de insercao");
        Map<String, Livro> livroMap1 = new LinkedHashMap<>();
        livroMap1.put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
        livroMap1.put("Duhigg, Charles", new Livro("O poder do hábito", 408));
        livroMap1.put("Harari, Yoval Noah", new Livro("21 licoes para o seculo 21", 432));

        Set<Map.Entry<String, Livro>> LivroEntrie2 = livroMap1.entrySet();
        for (Map.Entry<String, Livro> livro : LivroEntrie2) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getNumeroPaginas() + " paginas");
        }

        System.out.println("Ordem de alfabetica (autores)");
        Map<String, Livro> livroMap2 = new TreeMap<>(livroMap);
        Set<Map.Entry<String, Livro>> LivroEntries3 = livroMap2.entrySet();

        for (Map.Entry<String, Livro> livro : LivroEntries3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getNumeroPaginas() + " paginas");
        }

        


    }
}
