package br.com.escola.triunfo;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.escola.triunfo.dao.UsuarioDao;

public class UsuarioMenu {
	private ArrayList<String> opcoes=new ArrayList<String>();
	private String resposta;
	private Scanner scan= new Scanner(System.in);
	private UsuarioDao usuarioDao=new UsuarioDao();
	//criar os 3 metodos

	public void ExibirMenu() {
		opcoes.add("Sair");
		opcoes.add("Novos");
		opcoes.add("Editar");
		opcoes.add("Listar");//
		opcoes.add("Deletar");
		
		 
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
			System.out.println("Novos - ainda não implementado...");
			break;

		case "2":
			System.out.println("Editar - ainda não implementado...");
			break;
			
		case "3":
			usuarioDao.Listar();
			break;

		case "4":
			System.out.println("Deletar - ainda não implementado...");
			break;
		
		}
		
	}

}
