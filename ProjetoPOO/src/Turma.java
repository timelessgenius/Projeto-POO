import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int anoTurma;
    private String curso;
    private int numeroAlunos;
    private List<Aluno> listaAlunos;
    
    public Turma(int anoTurma, String curso, int numeroAlunos) {
        this.anoTurma = anoTurma;
        this.curso = curso;
        this.numeroAlunos = numeroAlunos;
        this.listaAlunos = new ArrayList<>();
    }

    public int getAnoTurma() {
        return anoTurma;
    }

    public void setAnoTurma(int anoTurma) {
        this.anoTurma = anoTurma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumeroAlunos() {
        return numeroAlunos;
    }

    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }

    public void adicionarAluno(Aluno a){
        if(listaAlunos.contains(a)){
            System.out.println("O aluno já está na turma");
        }else{
            listaAlunos.add(a);
            System.out.println("Aluno adicionado com sucesso!");
        }
    }

    public void exibirAlunos(){
        if(!listaAlunos.isEmpty()){
            for(Aluno a : listaAlunos){
                System.out.println(a);
            }
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "Turma" + "\nAno da turma: " + this.getAnoTurma() + "\nCurso: " + this.getCurso() + "\nNúmero de alunos: " + this.getNumeroAlunos() + "\nAlunos: " + listaAlunos.toString();
    }

    
    

    
}
