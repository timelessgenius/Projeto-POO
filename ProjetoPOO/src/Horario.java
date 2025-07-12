import java.util.HashMap;

public class Horario {
    private int horaInicio;
    private int horaFim;
    private int diaSemana;
    private HashMap<Integer,String> diasDaSemana;
    
    public Horario(int horaInicio, int horaFim, int diaSemana) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.diaSemana = diaSemana;
        this.diasDaSemana = new HashMap<>();
    }
    public int getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }
    public int getHoraFim() {
        return horaFim;
    }
    public void setHoraFim(int horaFim) {
        this.horaFim = horaFim;
    }
    public int getDiaSemana() {
        return diaSemana;
    }
    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }
    
    public void adicionarDiasDaSemana(int dia, String nome){
        if(diasDaSemana.containsKey(dia) || diasDaSemana.containsValue(nome)){
            System.out.println("Essa chave já está no Map!");
        }else{
            diasDaSemana.put(dia, nome);
        }
    }

    
    
    
    
}
