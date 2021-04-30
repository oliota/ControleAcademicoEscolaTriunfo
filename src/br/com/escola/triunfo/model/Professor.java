package br.com.escola.triunfo.model;

public class Professor extends Usuario{
	private int IdProfessor;
	private String Cracha;
	 
	public Professor() {
		super();
	}
	  
	public Professor(int idUsuario, int idade, String matricula, String nome, String cpf,int idProfessor, String cracha) {
		super(idUsuario, idade, matricula, nome, cpf);
		IdProfessor = idProfessor;
		Cracha = cracha;
	}
 
	public Professor(int idProfessor, String cracha) {
		super();
		IdProfessor = idProfessor;
		Cracha = cracha;
	}
 
	public int getIdProfessor() {
		return IdProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		IdProfessor = idProfessor;
	}
	public String getCracha() {
		return Cracha;
	}
	public void setCracha(String cracha) {
		Cracha = cracha;
	}
	
	
	
	
}
