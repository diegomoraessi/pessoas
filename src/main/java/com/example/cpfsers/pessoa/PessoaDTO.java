package com.example.cpfsers.pessoa;

public class PessoaDTO {
    private String nome;
    private String cpf;
    private int idade;
    private int id;

    public PessoaDTO(String nome, String cpf, int idade, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.id = id;
    }

    public PessoaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
