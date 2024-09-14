package com.escolasenai;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Nota {
    private Disciplina disciplina;
    private Aluno aluno;
    private double valor;

    public static List<Nota> notas = new ArrayList<>();

    public Nota(Disciplina disciplina, double valor, Aluno aluno) {
        this.disciplina = disciplina;
        this.valor = valor;
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void adicionarNota() {
        Scanner scanner = new Scanner(System.in);
        try {
            if (Disciplina.disciplinas.isEmpty() || Aluno.alunos.isEmpty()) {
                System.out.println("Não há disciplinas ou alunos cadastrados.");
                return;
            }

            // Escolher a disciplina
            System.out.println("Escolha a disciplina:");
            for (int i = 0; i < Disciplina.disciplinas.size(); i++) {
                System.out.println((i + 1) + ". " + Disciplina.disciplinas.get(i).getNome());
            }
            int disciplinaIndex = scanner.nextInt() - 1;

            // Verificação de índice válido
            if (disciplinaIndex < 0 || disciplinaIndex >= Disciplina.disciplinas.size()) {
                System.out.println("Índice de disciplina inválido.");
                return;
            }
            scanner.nextLine(); // Consumir a nova linha
            Disciplina disciplina = Disciplina.disciplinas.get(disciplinaIndex);

            // Escolher o aluno
            System.out.println("Escolha o aluno:");
            for (int i = 0; i < Aluno.alunos.size(); i++) {
                System.out.println((i + 1) + ". " + Aluno.alunos.get(i).getNome());
            }
            int alunoIndex = scanner.nextInt() - 1;

            // Verificação de índice válido
            if (alunoIndex < 0 || alunoIndex >= Aluno.alunos.size()) {
                System.out.println("Índice de aluno inválido.");
                return;
            }
            scanner.nextLine(); // Consumir a nova linha
            Aluno aluno = Aluno.alunos.get(alunoIndex);

            // Entrada do valor da nota
            System.out.print("Digite o valor da nota: ");
            double valorNota = scanner.nextDouble();

            // Adicionar a nota
            Nota nota = new Nota(disciplina, valorNota, aluno);
            notas.add(nota);

            System.out.println("Nota adicionada com sucesso!");
            System.out.println("Disciplina: " + disciplina.getNome());
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Nota: " + valorNota);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira os dados corretamente.");
            scanner.nextLine(); // Limpar a entrada inválida
        }
    }

    public static void alimentaNota() {
        // Verificar se há disciplinas e alunos suficientes
        if (Disciplina.disciplinas.size() < 3 || Aluno.alunos.size() < 3) {
            System.out.println("Não há disciplinas ou alunos suficientes para alimentar notas.");
            return;
        }

        // Adicionar notas para testes
        Nota nota1 = new Nota(Disciplina.disciplinas.get(0), 5.6, Aluno.alunos.get(0));
        Nota nota2 = new Nota(Disciplina.disciplinas.get(1), 6.6, Aluno.alunos.get(0));
        Nota nota3 = new Nota(Disciplina.disciplinas.get(0), 7.8, Aluno.alunos.get(1));
        Nota nota4 = new Nota(Disciplina.disciplinas.get(2), 8.6, Aluno.alunos.get(2));
        Nota nota5 = new Nota(Disciplina.disciplinas.get(0), 9.6, Aluno.alunos.get(2));
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);
        notas.add(nota5);

        System.out.println("Notas adicionadas para testes.");
    }
}
