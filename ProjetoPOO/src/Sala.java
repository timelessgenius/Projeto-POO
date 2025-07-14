import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;
    private int capacidadedeSala;
    private int numeroDeTurmasAlocadas;
    private List<Turma> turmalist;

    public Sala(int numero, int capacidadedeSala, int numeroDeTurmasAlocadas) {
        this.numero = numero;
        this.capacidadedeSala = capacidadedeSala;    
        this.numeroDeTurmasAlocadas = numeroDeTurmasAlocadas;
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
        return "Sala " + this.getNumero() + "\nCapacidade: " + this.getCapacidadedeSala() + "\nNúmero de Turmas Alocadas: " + this.getNumeroDeTurmasAlocadas();
    }

    

    
}
