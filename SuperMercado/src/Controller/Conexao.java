package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	public Connection Banco() {
		String servidor = "localhost";
		String banco = "bdpc";
		String user = "root";
		String password = "";
		
		try {
			//Qual o pacote que vai usar
			Class.forName("com.mysql.jdbc.Driver");
			String path = "jdbc:mysql://"+servidor+"/"+banco;
			
			Connection conn = DriverManager.getConnection(path, user, password);
			
			return conn;
		} catch (Exception e) {
			System.err.println(e.getMessage());				
		}
		
		return null;
		
	}
	public void fechar(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
