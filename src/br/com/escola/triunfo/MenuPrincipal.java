package br.com.escola.triunfo;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
	
	private ArrayList<String> opcoes=new ArrayList<String>();
	private String resposta;
	private Scanner scan= new Scanner(System.in);
	
	public void ExibirMenu() {
		opcoes.add("Sair");
		opcoes.add("Cadastro de usuarios");
		opcoes.add("Relatorios");
		
		 
		do {
			ListarOpcoes();
			ExecutarEscolha(); 
		}while(!resposta.equals("0"));
		resposta="";
		
	}
	
	private void ListarOpcoes() {
		for(int i=0;i<opcoes.size();i++) {
			System.out.println( i +" - "+ opcoes.get(i));
		}
		
	}
	
	private void ExecutarEscolha() {
		System.out.println("Escolha uma opção:");
		resposta=scan.next();
		
		switch(resposta) {
		
		case "0":
			System.out.println("Escolheu SAIR");
			break;
			
		case "1":
			new UsuarioMenu().ExibirMenu();
			break;
			
		case "2":
			System.out.println("Relatorios - ainda não implementado...");
			break;
		
		}
		
	}
	
	

}
