package br.com.escola.triunfo.model;

public class Usuario {
	
	private int IdUsuario,Idade;
	private String Matricula,Nome,Cpf;
	
	 
	public Usuario() { 
	}

	public Usuario(int idUsuario, int idade, String matricula, String nome, String cpf) { 
		IdUsuario = idUsuario;
		Idade = idade;
		Matricula = matricula;
		Nome = nome;
		Cpf = cpf;
	}
	
	public int getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	 
	public void ExibirDetalhes() {
		System.out.println("ID:"+getIdUsuario()+ "  idade:"+getIdade()+ "  matricula:"+getMatricula()+"  nome:"+getNome()+"  cpf:"+getCpf());
	}
	

}
