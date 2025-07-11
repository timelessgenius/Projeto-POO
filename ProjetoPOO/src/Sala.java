public class Sala {
    private int numero;
    private int capacidadedeSala;
    private int numeroDeTurmasAlocadas;
    
    
    public Sala() {}


    public Sala(int numero, int capacidadedeSala, int numeroDeTurmasAlocadas) {
        this.numero = numero;
        this.capacidadedeSala = capacidadedeSala;
        this.numeroDeTurmasAlocadas = numeroDeTurmasAlocadas;
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

    

    
}
