/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author ilegra0195
 */
public class FuncionarioBuilder {
    public String nome;
    public String cpf;
    public String dataNascimento;
    public String endereco;
    public String bairro;
    public String cidade;
    public String estado;
    public String observacoes;

    public FuncionarioBuilder(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public FuncionarioBuilder dataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public FuncionarioBuilder endereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public FuncionarioBuilder bairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public FuncionarioBuilder cidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public FuncionarioBuilder estado(String estado) {
        this.estado = estado;
        return this;
    }

    public FuncionarioBuilder observacoes(String obs) {
        this.observacoes = obs;
        return this;
    }
    
    public Funcionario build(){
        return new Funcionario(this);
    }
}
