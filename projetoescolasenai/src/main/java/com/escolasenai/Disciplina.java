package com.escolasenai;

import java.util.ArrayList;
import java.util.List;
    
    public class Disciplina {
        private String nome;
        private Professor professor;
        private List<Aluno> alunos;
    
        public Disciplina(String nome, Professor professor) {
            this.nome = nome;
            this.professor = professor;
            this.alunos = new ArrayList<>();
        }
    
        public String getNome() {
            return nome;
        }
    
        public Professor getProfessor() {
            return professor;
        }
    
        public void adicionarAluno(Aluno aluno) {
            this.alunos.add(aluno);
        }
    
        public List<Aluno> getAlunos() {
            return alunos;
        }
    }