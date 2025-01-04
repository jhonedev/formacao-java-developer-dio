import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno1 = new HashMap<>();
        Map<String, String> aluno2 = new HashMap<>();
        List<Map<String, String>> listAlunos = new ArrayList<>();

        aluno1.put("Nome", "João");
        aluno1.put("Idade", "17");
        aluno1.put("Média", "8.5");
        aluno1.put("Turma", "3A");

        aluno2.put("Nome", "Mario");
        aluno2.put("Idade", "21");
        aluno2.put("Média", "9");
        aluno2.put("Turma", "3A");

        System.out.println(aluno2);
        System.out.println(aluno2.keySet());
        System.out.println(aluno2.values());

        listAlunos.add(aluno1);
        listAlunos.add(aluno2);
        System.out.println(listAlunos);

        System.out.println(aluno1.containsKey("Nome")); // verifica se esse "objeto" contem a chave informada
        System.out.println(aluno1.containsValue("Jonathan")); // verifica se esse "objeto" contem o valor informado
    }
}
