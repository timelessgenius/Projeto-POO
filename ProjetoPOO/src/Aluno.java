import java.util.ArrayList;

public class Aluno {
    private String matricula;
    private String nome;
    private ArrayList<Turma> turmas;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.turmas = new ArrayList<>();
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        if(matricula == null || matricula.isEmpty()) {
            throw new IllegalArgumentException("Matrícula não pode ser vazia");
        }
        this.matricula = matricula;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public void MatricularTurma(Turma turma) {
        if(turmas.contains(turma)) {
            System.out.println("Aluno já está matriculado nesta turma.");
        } else {
            turmas.add(turma);
            turma.adicionarAluno(this);
            System.out.println("Aluno matriculado com sucesso na turma: " + turma.getCurso());
        }
    }

    public void removerTurma(Turma turma) {
        if(turmas.contains(turma)) {
            turmas.remove(turma);
            turma.removerAluno();
            System.out.println("Aluno removido da turma: " + turma.getCurso());
        } else {
            System.out.println("Aluno não está matriculado nesta turma.");
        }
    }

    public void ListarTurmas() {
        if(turmas.isEmpty()) {
            System.out.println("Aluno não está matriculado em nenhuma turma.");
        } else {
            System.out.println("Turmas do Aluno " + this.nome + ":");
            for(Object turma : turmas) {
                System.out.println(turma);
            }
        }
    }


    @Override
    public String toString() {
        return "Aluno:\n" + "Matrícula: " + this.getMatricula() + "\nNome: " + this.getNome() + "\n";
    }

    
    
}
