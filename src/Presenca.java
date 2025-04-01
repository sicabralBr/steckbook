import java.util.List;

public class Presenca {

    private String dia;
    private List<Aluno> alunos;
    private String diario;
    public Presenca(String dia, List<Aluno> alunos, String diario) {
        this.dia = dia;
        this.alunos = alunos;
        this.diario = diario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAlunos(Aluno aluno) {
        alunos.add(aluno);
    }

    public String getDiario() {
        return diario;
    }

    public void setDiario(String diario) {
        this.dia = diario;
    }
}
