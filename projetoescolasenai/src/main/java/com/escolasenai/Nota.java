package com.escolasenai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ProjetoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoApplication.class, args);

        
        Aluno.alimentaAluno();
        Disciplina.alimentaDisciplina();
        Nota.alimentaNota();

        
        menuPrincipal();
    }

    public static void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha como prosseguir: ");
            System.out.println("1. Acessar o menu do aluno.");
            System.out.println("2. Acessar o menu do professor.");
            System.out.println("0. Sair.");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Aluno.menuAluno();
                    break;
                case 2:
                    Professor.menuProfessor();
                    break;
                case 0: // Correção da opção de sair
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Insira um dígito válido.");
                    break;
            }
        } while (opcao != 0);

        sc.close(); 
    }
}
