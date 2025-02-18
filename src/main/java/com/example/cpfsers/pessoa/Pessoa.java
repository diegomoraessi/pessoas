package com.example.cpfsers.pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Pessoa(String nome, String cpf, int idade, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.id = id;
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
