package br.com.npsoftwares.djbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import br.com.npsoftwares.jdbc.ConnectionFactory;
import br.com.npsoftwares.jdbc.dao.exception.DaoException;
import br.com.npsoftwares.jdbc.modelo.Contato;


public class ContatoDao {

	private Connection conn;
	
	public ContatoDao()
	{
		new ConnectionFactory();
		this.conn = ConnectionFactory.getConn();
	}
	
	public void addContato(Contato contato){
 
		 java.sql.Date dataForRecord = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
		
	     StringBuilder sbQuery = new StringBuilder();
	     sbQuery.append("INSERT INTO tb005_Contatos (");
	     sbQuery.append("nome,email,endereco,dataNascimento)");
	     sbQuery.append("values(?,?,?,?)");
	     
	     try {
			 
	    	 PreparedStatement stmt = conn.prepareStatement(sbQuery.toString());
	    	 
		     stmt.setString(1,contato.getNome());
		     stmt.setString(2,contato.getEmail());
		     stmt.setString(3,contato.getEndereco());
		     stmt.setDate(4,dataForRecord);
		     
		     stmt.execute();
		     stmt.close(); 
		     
		} catch (Exception e) {
			
			throw new DaoException("Erro ao adicionar novo contato: \n Local: ContatoDao-->addContato \n Motivo:" + e.getMessage(),e);
		}

	}
	
	public ArrayList<Contato> getList()
	{
		
		Calendar data = Calendar.getInstance();
		
		try {
			
		    ArrayList<Contato> contatos = new ArrayList<Contato>();
			
			PreparedStatement stmt = this.conn.prepareStatement("SELECT * FROM tb005_Contatos");
			ResultSet rs  = stmt.executeQuery();
			
			while(rs.next()){
				data.setTime(rs.getDate("dataNascimento"));
				Contato contato = new Contato(rs.getLong("id"),rs.getString("nome"),rs.getString("email"),rs.getString("endereco"),data);
				contatos.add(contato);
			}
			
			rs.close();
			stmt.close();
			return contatos;
			
		} catch (Exception e) {
			
			throw new DaoException("Erro ao adicionar novo contato: \n Local: ContatoDao-->getList \n Motivo:" + e.getMessage(),e);
		}
		
	}
	

	/**
	* M�todo para pesquisar contatos a partir do Id no mesmo.
	* @param  id idetifica��o do contato
	* @author Sebasti�o Martins
	* @return objeto Contato com as informa��es carregadas.
	*/
	public Contato pesquisar(int id){
		
	    Calendar data = Calendar.getInstance();
		Contato contato = new Contato();
		
		try {
					
			PreparedStatement stmt = this.conn.prepareStatement("SELECT * FROM tb005_Contatos WHERE id = ?");
			stmt.setInt(1, id);
			ResultSet rs  = stmt.executeQuery();
                
			while (rs.next()){
				
				data.setTime(rs.getDate("dataNascimento"));
				
				contato = new Contato(rs.getLong("id"),rs.getString("nome"),rs.getString("email"),rs.getString("endereco"),data);
			}
			
		    rs.close();
			stmt.close();

			return contato;
			
		} catch (Exception e) {
			
			throw new DaoException("Erro durante consulta ao banco de dados: \n Local: ContatoDao-->pesquisar \n Motivo:" + e.getMessage(),e);
		}
		
	}
	
	/**
	 * altera��o de dados de um contato na base de dados  a partir do id do contato.
	 * @param contato  identifica��o do contato
	 */
	public void altera(Contato contato){
		
		StringBuilder sbQuery = new StringBuilder();
		sbQuery.append("UPDATE tb005_Contatos set nome= ?,email=?,endereco=?,dataNascimento=? WHERE id = ?");
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(sbQuery.toString());
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.setLong(5,contato.getId());
			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
			
			throw new DaoException("Erro ao adicionar novo contato: \n Local: ContatoDao-->altera \n Motivo:" + e.getMessage(),e);
		}
		
	}
	
	public void remove(Contato contato){
		
		try {
			PreparedStatement stmt = conn.prepareStatement("DELETE FROM tb006_Contatos WHERE id = ?");
			stmt.setLong(1, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new DaoException("Error",e);
		}
	}
}
