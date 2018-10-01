public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String dataNascimento;
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    protected String getNome() {
        return this.nome;
    }
    
    protected String getCpf() {
        return this.cpf;
    }
    
    protected String dataNascimento() {
        return this.dataNascimento;
    }
    
    protected void setDataNascimento(String data) {
        this.dataNascimento = data;
    }
    
    public boolean equals(Object outraPessoa) {
        Pessoa pessoa = (Pessoa)outraPessoa;
        boolean iguais = this.cpf.equals(pessoa.cpf) &&
                         this.nome.equals(pessoa.nome);
        return iguais;
    }    
}