package br.com.escola.triunfo.model;

import java.util.ArrayList;

public class Aluno extends Usuario{

	private int IdAluno;
	private String Carteirinha;
	private ArrayList<Nota> Notas;
	
	public Aluno() {
		
	}
  
	public Aluno(int idUsuario, int idade, String matricula, String nome, String cpf,int idAluno, String carteirinha, ArrayList<Nota> notas) {
		super(idUsuario, idade, matricula, nome, cpf);
		IdAluno = idAluno;
		Carteirinha = carteirinha;
		Notas = notas;
	}
 
	public Aluno(int idAluno, String carteirinha, ArrayList<Nota> notas) {
		super();
		IdAluno = idAluno;
		Carteirinha = carteirinha;
		Notas = notas;
	}
 

	public int getIdAluno() {
		return IdAluno;
	}
	public void setIdAluno(int idAluno) {
		IdAluno = idAluno;
	}
	public String getCarteirinha() {
		return Carteirinha;
	}
	public void setCarteirinha(String carteirinha) {
		Carteirinha = carteirinha;
	}


	public ArrayList<Nota> getNotas() {
		return Notas;
	}


	public void setNotas(ArrayList<Nota> notas) {
		Notas = notas;
	}
	
	
	
}
