import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Professor> professorlist;
    private List<Turma> turmalist;
    private List<Aluno> alunolist;
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


    @Override
    public String toString() {
        return "Escola: " + this.getNome() + "\n\nProfessores: " + professorlist.toString() + "\n\nSalas: " + salalist.toString() +"\n\nTurmas: " + turmalist.toString() + "\n\nAlunos: " + alunolist.toString();
    }
    
}
