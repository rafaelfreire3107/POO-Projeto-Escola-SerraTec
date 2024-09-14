package com.escolasenai;


abstract public class Pessoa {
    protected String nome;
    protected String cpf; 

//Construtor Pessoa
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

//Getters and Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
