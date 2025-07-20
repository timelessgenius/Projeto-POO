import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Professor> professorlist;
    private List<Aluno> alunolist; // Dúvida: Aqui poderia ser uma lista de lista de alunos?? usando a notação List<List<Aluno>> alunolist
    private List<Sala> salalist;

    public Escola(String nome) {
        this.nome = nome;
        this.professorlist = new ArrayList<>();
        this.alunolist = new ArrayList<>();
        this.salalist = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno a){
        
        if(alunolist.contains(a)){
            System.out.println("O aluno já existe no banco de dados da escola!");
            return;
        }else{
            alunolist.add(a);
            System.out.println("Aluno adicionado com sucesso");
        }
    }

    public void adicionarProfessor(Professor p){
        if(professorlist.contains(p)){
            System.out.println("O professor já existe no banco de dados");
            return;
        }else{
            professorlist.add(p);
            System.out.println("Professor adicionado com sucesso!");
        }
    }

    public void adicionarSala(Sala s){
        if(salalist.contains(s)){
            System.out.println("A sala já existe no banco de dados");
            return;
        }else{
            salalist.add(s);
            System.out.println("Sala adicionada com sucesso");
        }
    }

    // public void adicionarTurma(Turma t){
    //     if(turmalist.contains(t)){
    //         System.out.println("Esta sala já foi reservada para essa turma!");
    //     }else{
    //         turmalist.add(t);
    //         System.out.println("Turma adicionada com sucesso!");
    //     }
    // }


    // [Estou em dúvida se essas funções estão sendo redundantes ou não]

    // public void removerTurma(int index){  
    //     if(turmalist.isEmpty()){
    //         System.out.println("Não há turmas nessa escola!");
    //     }else{
    //         if(index == turmalist.size()-1){ // Remoção no final 
    //             turmalist.removeLast();
    //             System.out.println("A turma foi removida com sucesso!");
    //         }else if(index == 0){ // Remoção no inicio 
    //             turmalist.removeFirst();
    //             System.out.println("A turma foi removida com sucesso!");
    //         }else{ // Remoção no meio 
    //             for(Turma t : turmalist){ 
    //                 if(turmalist.indexOf(t) == index){
    //                     turmalist.remove(index);
    //                     System.out.println("A turma foi removida com sucesso!");
    //                 }
    //             }
    //         }
    //     }
    // }

    public void removerProfessor(int index){
        if(professorlist.isEmpty()){
            System.out.println("Não há professor nessa escola!");
        }else{
            if(index == professorlist.size()-1){ // Remoção no final
                professorlist.removeLast();
                System.out.println("Professor removido com sucesso!");    
            }else if(index == 0){  // Remoção no inicio
                professorlist.removeFirst();
                System.out.println("Professor removido com sucesso!");
            }else{ // Remoção no meio
                for(Professor p : professorlist){
                    if(professorlist.indexOf(p) == index){
                        professorlist.remove(index);
                        System.out.println("Professor removido com sucesso!");
                    }
                }
            }
        }
    }

    public void removerProfessor(Professor p){
        if(professorlist.isEmpty()){
            System.out.println("Não há professores na escola");
        }else{
            if(professorlist.contains(p)){
                professorlist.remove(p);
                System.out.println("Professor removido com sucesso!");
            }else{
                System.out.println("Esse professor não existe!");
            }
        }
    }


    public void removerSala(int index){
        if(salalist.isEmpty()){
            System.out.println("Não foram alocadas salas para essa escola!");
        }else{
            if(index == salalist.size()-1){ // Remoção no final
                salalist.removeLast();
                System.out.println("Sala removida com sucesso!");
            }else if(index == 0){ // Remoção no inicio
                salalist.removeFirst();
                System.out.println("Sala removida com sucesso!");
            }else{ // Remoção no meio
                for(Sala s : salalist){
                    if(salalist.indexOf(s) == index){
                        salalist.remove(index);
                        System.out.println("Sala removida com sucesso!");
                    }
                }
            }
        }
    }

   // Remoção por index
    public void removerAluno(int index) {
        if (alunolist.isEmpty()) {
            System.out.println("Não existe alunos nessa turma!");
        } else {
            if (index == alunolist.size() - 1) { // Remoção no final
                alunolist.removeLast();
                System.out.println("Aluno removido com sucesso!");
            } else if (index == 0) { // Remoção no inicio
                alunolist.removeFirst();
                System.out.println("Aluno removido com sucesso!");
            } else { // Remoção no meio
                for (Aluno a : alunolist) {
                    if (alunolist.indexOf(a) == index) {
                        alunolist.remove(index);
                        System.out.println("Aluno removido com sucesso!");                    }
                }
            }
        }
    }

    // Remoção através do objeto Aluno
    public void removerAluno(Aluno a) {
        if (alunolist.isEmpty()) {
            System.out.println("Não há alunos nessa turma!");
        } else {
            if (alunolist.contains(a)) {
                alunolist.remove(a);
                System.out.println("Aluno removido com sucesso!");
            }else{
                System.out.println("Esse aluno não está na lista!");
            }
        }
    }

    // Método para limpar a lista de alunos
    public void removerTodosAlunos() {
        if (alunolist.isEmpty()) {
            System.out.println("Não há alunos nessa turma!");
        } else {
            alunolist.clear();
            System.out.println("Todos os alunos foram removidos!");
        }
    }

    public void destruirEscola(){
        this.nome = null;
        if (professorlist.isEmpty()) {
            System.out.println("Não tem professores nesta escola");
        }
        else {
            professorlist.clear();
        }
        if (alunolist.isEmpty()) {
            System.out.println("Não tem alunos nesta escola");
        }
        else {
            alunolist.clear();
        }
        if (salalist.isEmpty()) {
            System.out.println("Não tem salas nesta escola");
        }
        else {
            salalist.clear();
        }
    }


    @Override
    public String toString() {
        return "Escola: " + this.getNome() + "\n\nProfessores: " + professorlist.toString() + "\n\nSalas: " + salalist.toString() + "\n\nAlunos: " + alunolist.toString();
    }
    
}
