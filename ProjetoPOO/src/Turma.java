import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int anoTurma;
    private String curso;
    private int numeroAlunos;
    private List<Aluno> listaAlunos;
    private List<Horario> horarios;

    public Turma(int anoTurma, String curso) {
        this.anoTurma = anoTurma;
        this.curso = curso;
        this.numeroAlunos = listaAlunos.size();
        this.listaAlunos = new ArrayList<>();
        this.horarios = new ArrayList<>();
    }

    public List<Horario> getHorarios() {
        return horarios;
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
    public List<Aluno> getAlunoList(){
        return listaAlunos;
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

    public void adicionarAluno(Aluno a) {
        if (listaAlunos.contains(a)) {
            System.out.println("O aluno já está na turma");
        } else {
            listaAlunos.add(a);
            this.setNumeroAlunos(listaAlunos.size());
            System.out.println("Aluno adicionado com sucesso!");
        }
    }

    public void exibirAlunos() {
        if (!listaAlunos.isEmpty()) {
            for (Aluno a : listaAlunos) {
                System.out.println(a);
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "Turma" + "\nAno da turma: " + this.getAnoTurma() + "\nCurso: " + this.getCurso()
                + "\nNúmero de alunos: " + this.getNumeroAlunos() + "\nAlunos: " + listaAlunos.toString()
                + "\nHorários: " + horarios.toString();
    }

    // Remoção por index
    public void removerAluno(int index) {
        if (listaAlunos.isEmpty()) {
            System.out.println("Não existe alunos nessa turma!");
        } else {
            if (index == listaAlunos.size() - 1) { // Remoção no final
                listaAlunos.removeLast();
                System.out.println("Aluno removido com sucesso!");
            } else if (index == 0) { // Remoção no inicio
                listaAlunos.removeFirst();
                System.out.println("Aluno removido com sucesso!");
            } else { // Remoção no meio
                for (Aluno a : listaAlunos) {
                    if (listaAlunos.indexOf(a) == index) {
                        listaAlunos.remove(index);
                        System.out.println("Aluno removido com sucesso!");
                        this.setNumeroAlunos(listaAlunos.size());
                    }
                }
            }
        }
    }

    // Remoção através do objeto Aluno
    public void removerAluno(Aluno a) {
        if (listaAlunos.isEmpty()) {
            System.out.println("Não há alunos nessa turma!");
        } else {
            if (listaAlunos.contains(a)) {
                listaAlunos.remove(a);
                this.setNumeroAlunos(listaAlunos.size());
                System.out.println("Aluno removido com sucesso!");
            } else {
                System.out.println("Esse aluno não está na lista!");
            }
        }
    }

    // Método para limpar a lista de alunos
    public void removerTodosAlunos() {
        if (listaAlunos.isEmpty()) {
            System.out.println("Não há alunos nessa turma!");
        } else {
            listaAlunos.clear();
            System.out.println("Todos os alunos foram removidos!");
        }
    }

    public void adicionarHorario(Horario h) {
        for(Horario horarioExistente: horarios){
            if (horarioExistente.ConflitoHorario(h)) {
                System.out.println("Conflito de horário! Horário não adicionado.");
                return;
            }else if (horarios.contains(h)) {
            System.out.println("Esse horário já foi adicionado nessa turma!");
        } else {
            horarios.add(h);
            System.out.println("Horário adicionado com sucesso!");
        }
    }

    }

    public void removerHorario(int index) {
        if (horarios.isEmpty()) {
            System.out.println("Não foram alocados horários para essa turma!");
        } else {
            if (index == horarios.size() - 1) {
                horarios.removeLast();
                System.out.println("Horário removido com sucesso");
            } else if (index == 0) {
                horarios.removeFirst();
                System.out.println("Horário removido com sucesso");
            } else {
                for (Horario h : horarios) {
                    if (horarios.indexOf(h) == index) {
                        horarios.remove(index);
                        System.out.println("Horário removido com sucesso");
                    }
                }
            }
        }
    }



    public void removerHorario(Horario h) {
        if (horarios.isEmpty()) {
            System.out.println("Não foram alocados horários para essa turma!");
        } else {
            if (horarios.contains(h)) {
                horarios.remove(h);
                System.out.println("Horário removido com sucesso");
            } else {
                System.out.println("Esse horário não está na lista!");
            }
        }
    }

    public void destruirTurma(){                    //Devido às variáveis do tipo inteiro, não consigo fazê-las receber um tipo null, portanto, optei por não colocá-las no método, assim como em algumas outras classes 
        this.curso = null;
        if (listaAlunos.isEmpty()) {
            System.out.println("Não tem alunos nesta turma");
        }
        else {
            listaAlunos.clear();
        }

        if (horarios.isEmpty()) {
            System.out.println("Não tem horários para esta turma");
        }
        else {
            horarios.clear();
        }
    }
}
