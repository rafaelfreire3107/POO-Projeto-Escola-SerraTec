package com.escolasenai;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoa {
    private String materia;
    private String login;
    private String senha;

    public static List<Professor> professores = new ArrayList<>();

    // Construtor professor
    public Professor(String nome, String cpf, String materia) {
        super(nome, cpf);
        this.materia = materia;
        this.login = cpf; 
    }

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    
    public static void menuProfessor() {
        Scanner menuProfessor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("MENU PROFESSOR:");
            System.out.println("1. Adicionar nota");
            System.out.println("2. Adicionar aluno");
            System.out.println("3. Voltar");

            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = menuProfessor.nextInt();

            switch (opcao) {
                case 1:
                    Nota.adicionarNota();
                    break;
                case 2:
                    Aluno.matricularAluno();
                    break;
                case 3:
                    System.out.println("-Voltando...");
                    ProjetoApplication.menuPrincipal();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 0);

        
    }
}
