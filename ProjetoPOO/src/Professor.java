public class Professor {
    private int numeroAulasMinistradas;
    private String nome;
    private String siape;
    
    
    public Professor() {}

    public Professor(int numeroAulasMinistradas, String nome, String siape) {
        this.numeroAulasMinistradas = numeroAulasMinistradas;
        this.nome = nome;
        this.siape = siape;
    }

    public int getNumeroAulasMinistradas() {
        return numeroAulasMinistradas;
    }

    public void setNumeroAulasMinistradas(int numeroAulasMinistradas) {
        this.numeroAulasMinistradas = numeroAulasMinistradas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    @Override
    public String toString() {
        return "Professor:\n" + "Nome: " + this.getNome() + "\nQuantidade de aulas ministradas: " + this.getNumeroAulasMinistradas() + "\nSIAPE: " + this.getSiape() + "\n";
    }

    
    
    
}
