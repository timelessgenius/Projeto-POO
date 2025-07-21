import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;
    private int capacidadedeSala;
    private int numeroDeTurmasAlocadas;
    private List<Turma> turmalist;

    public Sala(int numero, int capacidadedeSala) {
        this.numero = numero;
        this.capacidadedeSala = capacidadedeSala;
        this.numeroDeTurmasAlocadas = 0;
        this.turmalist = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidadedeSala() {
        return capacidadedeSala;
    }

    public void setCapacidadedeSala(int capacidadedeSala) {
        this.capacidadedeSala = capacidadedeSala;
    }

    public int getNumeroDeTurmasAlocadas() {
        return numeroDeTurmasAlocadas;
    }

    public void setNumeroDeTurmasAlocadas(int numeroDeTurmasAlocadas) {
        this.numeroDeTurmasAlocadas = numeroDeTurmasAlocadas;
    }

    public void adicionarTurma(Turma t) {
        if (this.verificarCapacidade(t)) {
            if (turmalist.contains(t)) {
                System.out.println("Esta sala já foi reservada para essa turma!");
            } else {
                turmalist.add(t);
                this.setNumeroDeTurmasAlocadas(turmalist.size());
                System.out.println("Turma adicionada com sucesso!");
            }
        } else {
            System.out.println("O número de alunos da turma excede a capacidade da sala!");
        }
    }

    @Override
    public String toString() {
        return "Sala " + this.getNumero() + "\nCapacidade: " + this.getCapacidadedeSala()
                + "\nNúmero de Turmas Alocadas: " + this.getNumeroDeTurmasAlocadas();
    }

    public void removerTurmaNoFinal() {
        if (turmalist.isEmpty()) {
            System.out.println("Não existe turma alocada para essa sala!");
        } else {
            turmalist.removeLast();
            this.setNumeroDeTurmasAlocadas(turmalist.size());
            System.out.println("Turma removida com sucesso!");
        }
    }

    // Remoção por index/posição
    public void removerTurma(int index) {
        if (turmalist.isEmpty()) {
            System.out.println("Não existe turma alocada para essa sala!");
        } else {
            for (Turma t : turmalist)
                if (turmalist.indexOf(t) == index) {
                    turmalist.remove(index);
                    this.setNumeroDeTurmasAlocadas(turmalist.size());
                    System.out.println("Turma removida com sucesso!");
                }
        }
    }

    // Remoção por objeto
    public void removerTurma(Turma t) {
        if (turmalist.isEmpty()) {
            System.out.println("Não há turmas alocadas nessa Sala");
        } else {
            if (turmalist.contains(t)) {
                turmalist.remove(t);
                this.setNumeroDeTurmasAlocadas(turmalist.size());
                System.out.println("Turma removida com sucesso!");
            }
        }
    }

    public boolean verificarCapacidade(Turma t) {
        if (t.getNumeroAlunos() <= this.getCapacidadedeSala()) {
            return true;
        } else {
            return false;
        }
    }



    // Metodo para verificar conflito de horario com as turmas alocadas
    public boolean verificarConflitoHorario(Turma novaTurma) {
        for (Turma turma : turmalist) {
            for (Horario h : turma.getHorarios()) {
                for (Horario novoh : novaTurma.getHorarios()) {
                    if (h.ConflitoHorario(novoh)) {
                        return true; 
                    }
                }

            }
        }
        return false; 
    }

    public void destruirSala(){
        if (turmalist.isEmpty()) {
            System.out.println("Não há turmas nesta sala");
        }
        else {
            turmalist.clear();
        }
    }
}