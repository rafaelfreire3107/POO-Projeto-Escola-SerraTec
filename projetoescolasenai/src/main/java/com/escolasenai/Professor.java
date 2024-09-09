package com.escolasenai;
public class Professor extends Pessoa {
    private String especialidade;
     public Professor(String nome, String cpf, String especialidade) {
             super(nome, cpf); 
             this.especialidade = especialidade;
         }
     
         public String getEspecialidade() {
             return especialidade;
         }
     }
 