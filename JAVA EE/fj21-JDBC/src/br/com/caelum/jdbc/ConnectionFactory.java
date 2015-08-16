package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	
	public Connection getConnection()
	{
		try
		{
			
			String strConn = "jdbc:sqlserver://DESKTOP-J77CTJJ:1433;databaseName=JDBCTEST;user=sa;";
			return DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433;databaseName=JDBCTEST;user=sa;"
					);
		
		}
		catch( SQLException  e)
		{
			throw new RuntimeException(e);
		}
	}

}
