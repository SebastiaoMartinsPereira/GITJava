package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlServer {

	private String host;
	private String user;
	private String pass;
	private String dataBase;
	public Connection conn;
	
	public SqlServer(String host,String user,String pass,String dataBase)
	{
		this.pass= pass;
		this.user = user;
		this.host = host;
		this.dataBase = dataBase;
	}
	
	public boolean connect()
	{
		boolean isConnected = false;
		
		String portNumber = "1433";
		String userName = this.user;
		String passName= this.pass;
		String url = "jdbc:sqlserver://"+this.host+":"+portNumber+";databaseName="+this.dataBase;
		
        final String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
        final String databaseUrl = "jdbc:sqlserver://localhost:1433;databaseName=JDBCTEST";  
		
		try {
			
			Class.forName(jdbcDriver).newInstance();
			this.conn = DriverManager.getConnection(databaseUrl,userName,passName);
			isConnected = true;
			
		}
		catch (SQLException sqlEx)
		{
			sqlEx.printStackTrace();
			System.out.println(sqlEx.getMessage());
			isConnected = false;
		}
		catch (ClassNotFoundException  e) {
		
			e.printStackTrace();
			System.out.println(e.getMessage());
			isConnected = false;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isConnected;
	}
	
	public boolean disconnect() throws SQLException
	{
		boolean isConnected = false;
		
		String url;
        String portNumber = "1433";
        String userName   = this.user;
        String passName   = this.pass;
        url = "jdbc:jtds:sqlserver://"+ this.host+":" +portNumber + ";databaseName=" +this.dataBase;
        
        final String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
        final String databaseUrl = "jdbc:sqlserver://localhost:1433;databaseName=JDBCTEST";  

        
        try {
        	
        	Class.forName(jdbcDriver);
        	//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();  
            System.out.println("Carregou o Driver");  
            
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            this.conn = DriverManager.getConnection(databaseUrl,userName, passName);
            this.conn.close();
            isConnected = true;
            
		} catch ( ClassNotFoundException e ) {
            System.out.println(e.getMessage());
            isConnected = false;
        }
        
        return isConnected;
        
		}
	
	public ResultSet executar(String query)
	{
		Statement st;
		ResultSet rs;
		
		try
		{
		 	st = (Statement) this.conn.createStatement();
		 	rs = st.executeQuery(query);
		 	return rs;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	public int insert(String query)
	{
		
		java.sql.Statement st;
		int result = -1;
		  
		try 
		{
			st = this.conn.createStatement();
			result = st.executeUpdate(query);
        } 
		catch ( SQLException e ) 
		{
		    e.printStackTrace();
		}
		  
	    return result;
	}
	
	
	
	}











