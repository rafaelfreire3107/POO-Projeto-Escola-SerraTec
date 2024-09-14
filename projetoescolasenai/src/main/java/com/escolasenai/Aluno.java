package com.escolasenai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {
    private String matricula;
    private Turno turno;
    private Turma turma;
    private String login;
    private String senha;


    public static List<Aluno> alunos = new ArrayList<>();

    // Construtor
    public Aluno(String nome, String cpf, String matricula, Turno turno, Turma turma, String senha) {
        super(nome, cpf);
        this.matricula = matricula;
        this.login = matricula;
        this.senha = senha;
        this.turma = turma;
        this.turno = turno;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    
    public static void matricularAluno() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o CPF do aluno:");
        String cpfaluno = scanner.nextLine();
        System.out.println("Digite o nome do aluno: ");
        String nomealuno = scanner.nextLine();
        System.out.println("Digite a matrícula do aluno: ");
        String matriculaaluno = scanner.nextLine();
        System.out.println("Crie a senha do aluno: ");
        String senhaaluno = scanner.nextLine();

        Turno turnoaluno = null;
        while (turnoaluno == null) {
            System.out.println("Escolha o turno do aluno, para: Manhã (Digite 1), Tarde (Digite 2), Noite (Digite 3)");
            int opcaoturnoaluno = scanner.nextInt();
            switch (opcaoturnoaluno) {
                case 1:
                    turnoaluno = Turno.MANHA;
                    break;
                case 2:
                    turnoaluno = Turno.TARDE;
                    break;
                case 3:
                    turnoaluno = Turno.NOITE;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        Turma turmaaluno = null;
        while (turmaaluno == null) {
            System.out.println(
                    "Escolha a turma do aluno, para: Turma 1 (Digite 1), Turma 2 (Digite 2), Turma 3 (Digite 3)");
            int opcaoturmaaluno = scanner.nextInt();
            switch (opcaoturmaaluno) {
                case 1:
                    turmaaluno = Turma.TURMA1;
                    break;
                case 2:
                    turmaaluno = Turma.TURMA2;
                    break;
                case 3:
                    turmaaluno = Turma.TURMA3;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        Aluno aluno = new Aluno(nomealuno, cpfaluno, matriculaaluno, turnoaluno, turmaaluno, senhaaluno);
        alunos.add(aluno);

        System.out.println("Aluno matriculado com sucesso!");
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Turno: " + aluno.getTurno());
        System.out.println("Turma: " + aluno.getTurma());
    }

    public static void mostrarAlunos() {
        System.out.println("==========LISTA DE ALUNOS MATRICULADOS==========");
        for (Aluno a : alunos) {
            System.out.println(a.getInfo());
        }
    }

    public String getInfo() {
        return "Nome: " + getNome() + ", CPF: " + getCpf() + ", Matrícula: " + getMatricula() + ", Turno: " + turno
                + ", Turma: " + turma;
    }

    public static void removerAluno(String nome) {
        alunos.removeIf(aluno -> aluno.getNome().equals(nome));
    }

    public static void alimentaAluno() {
        Aluno aluno = new Aluno("Joao", "1111111111", "001", Turno.MANHA, Turma.TURMA1, "1234");
        Aluno aluno2 = new Aluno("Pedro", "1111111111", "002", Turno.MANHA, Turma.TURMA2, "1234");
        Aluno aluno3 = new Aluno("Lucas", "1111111111", "003", Turno.MANHA, Turma.TURMA3, "1324");
        alunos.add(aluno);
        alunos.add(aluno2);
        alunos.add(aluno3);
    }

    
    public static void menuAluno() {
        int opcao;
        Scanner menuAluno = new Scanner(System.in);
        do {
            System.out.println("MENU ALUNO:");
            System.out.println("1. Ver notas");
            System.out.println("2. Listar Cadastro");
            System.out.println("3. Voltar ao menu principal");
            System.out.println("0. Sair");
            opcao = menuAluno.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("-Ver boletim ");
                    mostrarBoletim();
                    break;
                case 2:
                    System.out.println("-Ver dados cadastrais ");
                    mostrarDados();
                    break;
                case 3:
                    System.out.println("-Voltando...");
                    // Chame aqui o método do menu principal, caso exista
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

    
    public static void mostrarBoletim() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome do aluno: ");
        String nomedigitado = scanner.nextLine();
        for (Nota n : Nota.notas) {
            if (n.getAluno().getNome().equals(nomedigitado)) {
                System.out.println("Disciplina: " + n.getDisciplina().getNome() + " Nota: " + n.getValor());
            }
        }
    }

    public static void mostrarDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome do aluno: ");
        String nomedigitado = scanner.nextLine();

        for (Aluno p : Aluno.alunos) {
            if (p.getNome().equals(nomedigitado)) {
                System.out.println("Nome: " + p.getNome() + " CPF: " + p.getCpf() + " Matrícula: " + p.getMatricula()
                + " Turno: " + p.getTurno() + " Turma: " + p.getTurma() + " Login: " + p.getLogin() + "Senha:" + p.getSenha());
            }
        }
    }
}
