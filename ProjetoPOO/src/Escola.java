import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Professor> professorlist;
    private List<Aluno> alunolist;
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

    public void adicionarAluno(String matricula, String nome){
        Aluno aluno_aux = new Aluno(matricula, nome);
        if(alunolist.contains(aluno_aux)){
            System.out.println("O aluno já existe no banco de dados da escola!");
            return;
        }else{
            alunolist.add(new Aluno(matricula, nome));
        }
    }

    public void adicionarProfessor(int numeroAulasMinistradas, String nome, String siape){
        Professor prof_aux = new Professor(numeroAulasMinistradas, nome, siape);
        if(professorlist.contains(prof_aux)){
            System.out.println("O professor já existe no banco de dados");
            return;
        }else{
            professorlist.add(prof_aux);
        }
    }

    public void adicionarSala(int numero, int capacidadedeSala, int numeroDeTurmasAlocadas){
        Sala sala_aux = new Sala(numero, capacidadedeSala, numeroDeTurmasAlocadas);
        if(salalist.contains(sala_aux)){
            System.out.println("A sala já existe no banco de dados");
            return;
        }else{
            salalist.add(sala_aux);
        }
    }
   
}
