package br.com.escola.triunfo.model;

public class Nota {

	private int IdNota;
	private float Valor;
	
	public Nota() {
		
	}
	
	public Nota(int idNota, float valor) {
		super();
		IdNota = idNota;
		Valor = valor;
	}
	
	
	public int getIdNota() {
		return IdNota;
	}
	public void setIdNota(int idNota) {
		IdNota = idNota;
	}
	public float getValor() {
		return Valor;
	}
	public void setValor(float valor) {
		Valor = valor;
	}
	
	
	
	
}
