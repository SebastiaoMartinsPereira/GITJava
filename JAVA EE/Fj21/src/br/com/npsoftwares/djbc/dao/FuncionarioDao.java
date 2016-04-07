package br.com.npsoftwares.djbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.npsoftwares.jdbc.ConnectionFactory;
import br.com.npsoftwares.jdbc.dao.exception.DaoException;
import br.com.npsoftwares.jdbc.modelo.Funcionario;

public class FuncionarioDao {
	
	private int id;
	private String nome;
	private String senha;
	private String usuario;
	
    private Connection conn;
	
	public FuncionarioDao()
	{
		new ConnectionFactory();
		this.conn = ConnectionFactory.getConn();
	}
	
	
	public void addFuncionario(Funcionario funcionario){
		 
	     StringBuilder sbQuery = new StringBuilder();
	     sbQuery.append("INSERT INTO tb006_Funcionarios(");
	     sbQuery.append("nome,usuario,senha)");
	     sbQuery.append("values(?,?,?)");
	     
	     try {
			 
	    	 PreparedStatement stmt = conn.prepareStatement(sbQuery.toString());
	    	 
		     stmt.setString(1,funcionario.getNome());
		     stmt.setString(2,funcionario.getUsuario());
		     stmt.setString(3,funcionario.getSenha());
		    
		     stmt.execute();
		     stmt.close(); 
		     
		} catch (Exception e) {
			
			throw new DaoException("Erro ao adicionar novo funcionário: \n Local: FuncionarioDao-->addFuncionario \n Motivo:" + e.getMessage(),e);
		}

	}
	
	public ArrayList<Funcionario> getList()
	{
		
		try {
			
		    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
			
			PreparedStatement stmt = this.conn.prepareStatement("SELECT * FROM tb006_Funcionarios");
			ResultSet rs  = stmt.executeQuery();
			
			while(rs.next()){
				Funcionario funcionario = new Funcionario(rs.getLong("id"),rs.getString("nome"),rs.getString("usuario"),rs.getString("senha"));
				funcionarios.add(funcionario);
			}
			
			rs.close();
			stmt.close();
			return funcionarios;
			
		} catch (Exception e) {
			
			throw new DaoException("Erro Listar funcionarios: \n Local: FuncionarioDao-->getList \n Motivo:" + e.getMessage(),e);
		}
		
	}
	
	
	public Funcionario pesquisar(int id){
		
		Funcionario funcionario= new Funcionario();
		
		try {
					
			PreparedStatement stmt = this.conn.prepareStatement("SELECT * FROM tb006_Funcionarios WHERE id = ?");
			stmt.setInt(1, id);
			ResultSet rs  = stmt.executeQuery();
                
			while (rs.next()){	
				funcionario = new Funcionario(rs.getLong("id"),rs.getString("nome"),rs.getString("usuario"),rs.getString("senha"));
			}
			
		    rs.close();
			stmt.close();

			return funcionario;
			
		} catch (Exception e) {
			
			throw new DaoException("Erro durante consulta ao banco de dados: \n Local: FuncionarioDao-->pesquisar \n Motivo:" + e.getMessage(),e);
		}
		
	}
	
	public void altera(Funcionario funcionario){
		
		StringBuilder sbQuery = new StringBuilder();
		sbQuery.append("UPDATE tb006_Funcionarios set nome= ?,usuario=?,senha=? WHERE id = ?");
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement(sbQuery.toString());
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());
			stmt.setLong(4,funcionario.getId());
			
			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
			
			throw new DaoException("Erro ao adicionar novo Funcionario: \n Local: FuncionarioDao-->altera \n Motivo:" + e.getMessage(),e);
		}
		
	}

    public void remove(Funcionario funcionario){
		
		try {
			PreparedStatement stmt = conn.prepareStatement("DELETE FROM tb006_Funcionarios WHERE id = ?");
			stmt.setLong(1, funcionario.getId());
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new DaoException("Error",e);
		}
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	

}
