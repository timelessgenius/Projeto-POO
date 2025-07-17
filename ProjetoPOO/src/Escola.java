import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Professor> professorlist;
    private List<Turma> turmalist;
    private List<Aluno> alunolist; // Dúvida: Aqui poderia ser uma lista de lista de alunos?? usando a notação List<List<Aluno>> alunolist
    private List<Sala> salalist;

    public Escola(String nome) {
        this.nome = nome;
        this.professorlist = new ArrayList<>();
        this.alunolist = new ArrayList<>();
        this.salalist = new ArrayList<>();
        this.turmalist = new ArrayList<>();
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

    public void adicionarTurma(Turma t){
        if(turmalist.contains(t)){
            System.out.println("Esta sala já foi reservada para essa turma!");
        }else{
            turmalist.add(t);
            System.out.println("Turma adicionada com sucesso!");
        }
    }


    // [Estou em dúvida se essas funções estão sendo redundantes ou não]

    public void removerTurma(int index){
        if(turmalist.isEmpty()){
            System.out.println("Não há turmas nessa escola!");
        }else{
            if(index == turmalist.size()-1){ // Remoção no final 
                turmalist.removeLast();
                System.out.println("A turma foi removida com sucesso!");
            }else if(index == 0){ // Remoção no inicio 
                turmalist.removeFirst();
                System.out.println("A turma foi removida com sucesso!");
            }else{ // Remoção no meio 
                for(Turma t : turmalist){ 
                    if(turmalist.indexOf(t) == index){
                        turmalist.remove(index);
                        System.out.println("A turma foi removida com sucesso!");
                    }
                }
            }
        }
    }

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

    // [Falta a parte de remover os alunos da lista alunolist]


    @Override
    public String toString() {
        return "Escola: " + this.getNome() + "\n\nProfessores: " + professorlist.toString() + "\n\nSalas: " + salalist.toString() +"\n\nTurmas: " + turmalist.toString() + "\n\nAlunos: " + alunolist.toString();
    }
    
}
