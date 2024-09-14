package com.escolasenai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Disciplina {
        private String nome;
        private String professor;
        private List<Aluno> alunos;
        public static List<Disciplina> disciplinas= new ArrayList<>();		


        public Disciplina(String nome, String professor) {
            this.nome = nome;
            this.professor = professor;
            this.alunos = new ArrayList<>();
        }

        public Disciplina() {
            
        }

        public String getNome() {
            return nome;
        }

        public String getProfessor() {
            return professor;
        }

        public List<Aluno> getAlunos() {
            return alunos;
        }

        public void adicionarAluno(Aluno aluno) {
            this.alunos.add(aluno);
        }

        //Métodos da classe

        public static void adicionarDisciplina(){
            //Requisições ao usuario
                    Scanner scannerdisciplina = new Scanner(System.in);
                    System.out.println("==========ADICIONAR DISCIPLINA==========");
                    System.out.print("Digite o nome da disciplina: "); 
                    String nomedisciplina = scannerdisciplina.nextLine();
                    System.out.print("Digite o nome do professor: "); 
                    String professordisciplina = scannerdisciplina.nextLine();                    
                        //Instncia um novo professor
                
                    Disciplina disciplina = new Disciplina(nomedisciplina, professordisciplina);
                    disciplinas.add(disciplina);
                    //Confirma
                    System.out.println("Disciplina Adicionada com sucesso!");
                    System.out.println("CPF: " + disciplina.getNome());
                    System.out.println("Nome: " + disciplina.getProfessor());
        }
        public static void mostrarDisciplinas(){
       
            System.out.println("==========LISTA DE ALUNOS MATRICULADOS==========");
            for (Disciplina d: disciplinas) {
                System.out.println(d.getInfo());
            }
        
    }
        public String getInfo(){
        return "Nome: " + getNome() + ", Cpf: " + getProfessor() ;
    }     
    public static void alimentaDisciplina() {
        Disciplina disciplina = new Disciplina("Geografia", "Arnaldo");
        Disciplina disciplina2 = new Disciplina("Matematica", "Rodolfo");
        Disciplina disciplina3 = new Disciplina("Historia", "Arthur");
        disciplinas.add(disciplina);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);



    }
    }
