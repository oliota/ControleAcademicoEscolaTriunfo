package br.com.escola.triunfo.model;

import java.util.ArrayList;

public class Turma {
	
	private int IdTurma;
	private String Nome;
	private Professor Professor;
	private ArrayList<Aluno> Alunos;
	
	
	public Turma() {
		
	}
	
	public Turma(int idTurma, String nome, br.com.escola.triunfo.model.Professor professor, ArrayList<Aluno> alunos) {
		super();
		IdTurma = idTurma;
		Nome = nome;
		Professor = professor;
		Alunos = alunos;
	}
	
	
	public int getIdTurma() {
		return IdTurma;
	}
	public void setIdTurma(int idTurma) {
		IdTurma = idTurma;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Professor getProfessor() {
		return Professor;
	}
	public void setProfessor(Professor professor) {
		Professor = professor;
	}
	public ArrayList<Aluno> getAlunos() {
		return Alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		Alunos = alunos;
	}
	
	
	

	
	
}
