import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int numeroAulasMinistradas;
    private String nome;
    private String siape;
    private List<Turma> turmas;

    public Professor(int numeroAulasMinistradas, String nome, String siape) {
        this.numeroAulasMinistradas = numeroAulasMinistradas;
        this.nome = nome;
        this.siape = siape;
        this.turmas = new ArrayList<>();
    }

    public int getNumeroAulasMinistradas() {
        return numeroAulasMinistradas;
    }

    public void setNumeroAulasMinistradas(int numeroAulasMinistradas) {
        this.numeroAulasMinistradas = numeroAulasMinistradas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    @Override
    public String toString() {
        return "Professor:\n" + "Nome: " + this.getNome() + "\nQuantidade de aulas ministradas: "
                + this.getNumeroAulasMinistradas() + "\nSIAPE: " + this.getSiape() + "\nTurmas: " + this.getTurmas();
    }

    public void adicionarTurma(Turma t) {
        if (turmas.contains(t)) {
            System.out.println("Esta sala já foi reservada para essa turma!");
        } else {
            turmas.add(t);
            System.out.println("Turma adicionada com sucesso!");
        }
    }

    public void destruirProfessor(){
        this.nome = null;
        this.siape = null;

        if (turmas.isEmpty()) {
            System.out.println("O professor não dá aula em nenhuma turma");
        }
        else {
            turmas.clear();
        }
    }

}
