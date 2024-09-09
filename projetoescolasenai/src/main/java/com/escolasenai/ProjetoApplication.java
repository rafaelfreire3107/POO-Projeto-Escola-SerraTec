package com.escolasenai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
		Professor professor = new Professor("Arthur", "12345678910", "Ciências");

		Disciplina portugues = new Disciplina("Portugues", professor);


		Aluno aluno1 = new Aluno("Rafael Freire", "15582754963", "0001");
		Aluno aluno2 = new Aluno("Luis Filipe", "07555384792", "0002");

		portugues.adicionarAluno(aluno1);
        portugues.adicionarAluno(aluno2);

		
		Nota nota1 = new Nota(portugues, 8.5);
        Nota nota2 = new Nota(portugues, 9.5);

		aluno1.adicionarNota(nota1);
        aluno2.adicionarNota(nota2);

		System.out.println("Disciplina: "+ portugues.getNome());
        System.out.println("Professor: "+ portugues.getProfessor().getNome());

		List<Aluno> alunos = portugues.getAlunos();
        
		for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
            
			List<Nota> notas = aluno.getNota();
            for (Nota nota : notas) {
                System.out.println("Nota na disciplina " + nota.getDisciplina().getNome() + ": " + nota.getValor());
            }
	}

	}}