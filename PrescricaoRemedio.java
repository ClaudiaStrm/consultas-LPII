public class PrescricaoRemedio {
    private Consulta consulta;
    public String remedio;
    private int dosagem;
    private String intervalo;
    
    public PrescricaoRemedio(Consulta consulta, String remedio, int dosagem, String intervalo) {
        this.consulta = consulta;
        this.remedio = remedio;
        this.dosagem = dosagem;
        this.intervalo = intervalo;
    }
    
    public Consulta getConsulta() {
        return this.consulta;
    }
    
    public String getRemedio() {
        return this.remedio;
    }
    
    public int getDosagem() {   
        return this.dosagem;
    }
    
    public String getIntervalo() {
        return this.intervalo;
    }
}