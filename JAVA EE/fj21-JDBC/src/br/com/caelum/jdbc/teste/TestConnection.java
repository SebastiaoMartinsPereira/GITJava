package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.SqlServer;

public class TestConnection {
	
	public static void main(String[] args) throws SQLException {
		
		
		boolean boll;
		
		SqlServer sql = new SqlServer("localHost", "sa", "NPS300892", "JDBCTEST");
		
		boll = sql.connect();
		
		
//		Connection conn = new ConnectionFactory().getConnection(); 
//			System.out.println(conn.getCatalog().toString());
//			conn.close();	
			
	}
}
