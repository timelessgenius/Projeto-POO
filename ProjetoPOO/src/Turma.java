public class Turma {
    private int anoTurma;
    private String curso;
    private int numeroAlunos;
    
    public Turma(int anoTurma, String curso, int numeroAlunos) {
        this.anoTurma = anoTurma;
        this.curso = curso;
        this.numeroAlunos = numeroAlunos;
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

    

    
}
