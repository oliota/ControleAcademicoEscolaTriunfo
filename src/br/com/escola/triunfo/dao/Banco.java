package br.com.escola.triunfo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Banco {
	
	public static Connection con;
	public String banco="escola_triunfo";
	
	public Banco() {
		if(con==null) {
			AbrirConexao();
		} 
	} 

	private void AbrirConexao() {
		String url = "jdbc:postgresql://localhost/"+banco;
		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "admin");
		props.setProperty("ssl", "false");
		try {
			con = DriverManager.getConnection(url, props);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	 public ResultSet ConsultarBD(String sql) {
		Statement statement;
		try {
			statement = con.createStatement();
			return statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Falha ao realizar a consulta no banco de dados");
			System.out.println("Sql utilizado:");
			System.out.println(sql);
			return null;
		}
	}
	 
	 
	 public boolean ExecutarComando(String sql) {
		 Statement statement;
			try {
				statement = con.createStatement();
				return statement.execute(sql);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Falha ao realizar a consulta no banco de dados");
				System.out.println("Sql utilizado:");
				System.out.println(sql);
				return false;
			}
	 }
	

}
