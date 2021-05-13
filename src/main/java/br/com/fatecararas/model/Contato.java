package br.com.fatecararas.model;

public class Contato {

    // Atributos
    private
    String nome;
    String sobrenome;
    String email;
    String telefone;
    String endereco;
    String empresa;
    String observacoes;


    //Métodos

    //Método construtor com todos os atributos
    public Contato(String nome, String sobrenome, String email, String telefone, String endereco, String empresa, String observacoes) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.empresa = empresa;
        this.observacoes = observacoes;
    }


    //Método construtor vazio
    public Contato() {
    }


    //Método construtor get-set com todos os atributos, padrão builder
    public String getNome() {
        return nome;
    }

    public Contato setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Contato setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Contato setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Contato setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Contato setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Contato setEmpresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Contato setObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", empresa='" + empresa + '\'' +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }

    // equals vai ser criada depois, quando se falar sobre listas.

}
