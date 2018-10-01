public class Medico extends Pessoa {
    String crm;
    
    public Medico(String nome, String cpf, String dataNascimento, String crm) {
        super(nome, cpf);
        this.crm = crm;
    }
    
    public String getCrm() {
        return this.crm;
    }    
}