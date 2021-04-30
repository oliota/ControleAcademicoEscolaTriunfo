package br.com.escola.triunfo;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.escola.triunfo.dao.UsuarioDao;
import br.com.escola.triunfo.model.Usuario;

public class Main {

	static Scanner scan= new Scanner(System.in);
	static UsuarioDao usuarioDao= new UsuarioDao();
	
	public static void main(String[] args) throws SQLException {

		

		System.out.println("Bem vindo ao sistema academico");
		Usuario usuario;
		int tentativas=3;
		usuarioDao.Listar();
		
		do {
			System.out.println("Informe sua matricula");
			String matricula= scan.next();
			
			System.out.println("Informe o seu CPF");
			String cpf= scan.next();
			

			usuario= usuarioDao.entrar(matricula, cpf);
			
			if(usuario==null) {
				//tentativas--;
				tentativas=tentativas-1;
				if(tentativas!=0) {
					System.out.println("Entrada não permitida, ainda restam ["+tentativas+"] tentativas");
				}else {
					usuarioDao.BloquearConta(matricula);
				}
			}else {
				System.out.println("Entrada permitida, "+usuario.getNome()+" "+usuario.getIdade());
				new MenuPrincipal().ExibirMenu();
			}
		}while(usuario==null && tentativas!=0);
		
		
		
		
		
		
		
		
		
		

	}

}
