package br.com.npsoftwares.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {


	private static String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=TESTE;";
	private static String usuario = "sa";
	private static String pass = "NPS300892";
	private static String driverSqlServer = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	public static Connection getConn()
	{
		try {
			Class.forName(driverSqlServer);
			Connection conn = DriverManager.getConnection(url,usuario,pass);
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static Connection getConn(String instancia,String port,String dataBase,String user,String pass)
	{
		
		try {
			
			url = String.format("jdbc:sqlserver://%s:%s;"+ "databaseName=%s;",instancia,port,dataBase);
			Class.forName(driverSqlServer);
			Connection conn = DriverManager.getConnection(url,user,pass);
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
//	private static void testeConn()
//	{
//		
//		Connection conn = getConn();
//		
//		try {
//			
//			if(!conn.isClosed())
//			{
//				System.out.println("Yes!!!");
//			}
//			
//			conn.close();
//			
//			if(conn.isClosed())
//			{
//			   System.out.println("Fechou");	
//			}
//			
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//	}
//	
}
