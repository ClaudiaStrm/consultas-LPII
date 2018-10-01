public class Consulta {
    private Paciente paciente;
    private Medico medico;
    String data;
    
    public Consulta(Paciente paciente, Medico medico) {
        this.paciente = paciente;
        this.medico = medico;
    }
    
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public Medico getMedico() {
        return this.medico;
    }
    
    protected void setData(String data) {
        this.data = data;
    }
    
    public String getData() {
        return this.data;
    }
}