import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Aluno> nomes = Arrays.asList(
                new Aluno("Lucas"),
                new Aluno("Pedro"),
                new Aluno("Alice"),
                new Aluno ("Eduarda")
        );

        Map<String, List<Boolean>> chamadas = new HashMap<>();
        chamadas.put("1", Arrays.asList(true, false, true, true));
        chamadas.put("2", Arrays.asList(false, true, true, true));
        chamadas.put("3", Arrays.asList(true, true, true, false));
        chamadas.put("4", Arrays.asList(true, true, false, true));

        System.out.printf("%-10s", "Nome");
        for (String date : chamadas.keySet()) {
            System.out.printf(" | %-10s", "Data" + date);
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");


        for (int i = 0; i < chamadas.size(); i++) {
            System.out.printf("%-10s", nomes.get(i).getNome());
            for (List<Boolean> dia : chamadas.values()) {
                String presenca = dia.get(i) ? "✅" : "❌";
                System.out.printf("| %-10s", presenca);
            }
            System.out.println();
        }

    }
}