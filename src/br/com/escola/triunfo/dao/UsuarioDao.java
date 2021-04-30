package br.com.escola.triunfo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.escola.triunfo.model.Usuario;

public class UsuarioDao extends Banco {
	
	public Usuario entrar(String matricula,String cpf) {
		Usuario usuario=null;
		
		String sql="select * from usuario where matricula='"+matricula+"' and cpf='"+cpf+"' ";
		ResultSet resultado=ConsultarBD(sql);
		
		try {
			while(resultado.next()) {
				usuario=new Usuario();
				usuario.setIdUsuario(resultado.getInt(resultado.findColumn("idusuario")));
				usuario.setMatricula(resultado.getString(resultado.findColumn("matricula")));
				usuario.setNome(resultado.getString(resultado.findColumn("nome")));
				usuario.setIdade( resultado.getInt(resultado.findColumn("idade")));
				usuario.setCpf( resultado.getString(resultado.findColumn("cpf")));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return usuario;
	}

	public void Listar()  {
		Usuario usuario=null;
		String sql="select * from usuario";
		ResultSet resultado=ConsultarBD(sql);
		
		try {
			while(resultado.next()) {
				usuario=new Usuario();
				usuario.setIdUsuario(resultado.getInt(resultado.findColumn("idusuario")));
				usuario.setMatricula(resultado.getString(resultado.findColumn("matricula")));
				usuario.setNome(resultado.getString(resultado.findColumn("nome")));
				usuario.setIdade( resultado.getInt(resultado.findColumn("idade")));
				usuario.setCpf( resultado.getString(resultado.findColumn("cpf")));
				usuario.ExibirDetalhes();
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void BloquearConta(String matricula) {
		String sql="select * from usuario where matricula='"+matricula+"' ";
		ResultSet resultado=ConsultarBD(sql);
		
		Usuario usuario=new Usuario();
		try {
			while(resultado.next()) {
				usuario.setIdUsuario(resultado.getInt(resultado.findColumn("idusuario")));
				usuario.setMatricula(resultado.getString(resultado.findColumn("matricula")));
				usuario.setNome(resultado.getString(resultado.findColumn("nome")));
				usuario.setIdade( resultado.getInt(resultado.findColumn("idade")));
				usuario.setCpf( resultado.getString(resultado.findColumn("cpf")));
				
				String comando= "update usuario set matricula='"+
				usuario.getMatricula()+
				"-bloqueado"+
				"' where matricula='"+
				matricula+"' ";
				
				ExecutarComando(comando);
				
				System.out.println(" errou 3 x , conta do ["+usuario.getNome()+"]  bloqueada ");
			}
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		
	}

}
