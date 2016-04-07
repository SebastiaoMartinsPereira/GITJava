package br.com.npsoftwares.jdbc.teste;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.npsoftwares.djbc.dao.FuncionarioDao;
import br.com.npsoftwares.jdbc.modelo.Funcionario;

public class GerenciarFuncionario {

	private FuncionarioDao dao;
	private Funcionario funcionario;
	private ArrayList<Funcionario> lista;
	private String resposta;
	
	
	public GerenciarFuncionario()
	{
		funcionario = null;
		dao = new FuncionarioDao();
		lista = new ArrayList<Funcionario>();
	}
	
	public void CadastrarContato(){
		
		String nome;
		String usuario;
		String senha;
		
		mostrarMensagem("Cadastro de Contato: tecle Enter");
		nome = recebeInput("Informe o nome do funcionario!");
		usuario = recebeInput("Informe o usuario do funcionario!");
		senha = recebeInput("Informe o senha do funcionario!");
		
		try {
			funcionario = new Funcionario( nome, usuario, senha);
			
			dao.addFuncionario(funcionario);
			
			mostrarMensagem("Contato adicionado com sucesso!");
		}	
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
	}
	
	public void pesquisarContato(){
		int codigoBusca = 0;
		//Recupera o codigo a ser pesquisado.
	    codigoBusca = Integer.parseInt(JOptionPane.showInputDialog("Codigo do contato que deseja pesquisar!"));
		System.out.println("Informações do contato pesquisado: " + dao.pesquisar(codigoBusca).toString());
	}
	
	public void listarContatos()
	{
		resposta = recebeInput("Deseja listar os contatos cadastrados?\n1-SIM\n2-NÃO");
		
		if(Integer.parseInt(resposta) == 1)
		{
			lista = dao.getList();
			
			for (Funcionario item : lista) {
				
				System.out.println(item.toString());
			}
			
		}else
		{
			System.out.println("Fim");
		}	
		
	}

	public void alterarContato() throws Exception{
		
		int id;
		int input;
		StringBuilder str = new StringBuilder();
		
		id = Integer.parseInt(recebeInput("Qual o id co contato que deseja editar?"));
		funcionario = dao.pesquisar(id);
        
		if(funcionario.getId()== null)
		{
			throw new Exception("Contato não encontrado");
		}
		
		str.append(String.format("Nome: %s \nEmail:%s \nEndereço:%s",funcionario.getNome(),funcionario.getUsuario(),funcionario.getSenha()));
		
		mostrarMensagem("Contato selecionado:\n" + str);
		
	    do {
	    	
	    	input = Integer.parseInt(recebeInput("O que deseja alterar?\n1-Nome\n2-Email\n3-Endereço\n4-Sair"));
		
		    switch (input) {
			case 1:
				funcionario.setNome(recebeInput("Informe o novo nome!"));
				break;
			case 2:
				funcionario.setUsuario(recebeInput("Informe o novo Email!"));
				break;
			case 3:
				funcionario.setUsuario(recebeInput("Informe o novo Endereço!"));
				break;
			}
	    
	    } while (input != 4);
	    
	    dao.altera(funcionario);
	    
	    mostrarMensagem("Contato editado com sucesso!");
	}
	
	public void apagarContato() throws Exception
	{
		int id;
		
		id = Integer.parseInt(recebeInput("Qual o id co contato que deseja deletar?"));
		funcionario = dao.pesquisar(id);
        
		if(funcionario.getId()== null)
		{
			throw new Exception("Contato não encontrado");
		}
		
		dao.remove(funcionario);
		
		mostrarMensagem("Contato excluído com sucesso!");
		
		
	}
	public String recebeInput(String texto){
		return JOptionPane.showInputDialog(texto);
	}
	
	public void mostrarMensagem(String texto)
	{
		JOptionPane.showMessageDialog(null, texto);
	}
	
	public FuncionarioDao getDao() {
		return dao;
	}

	public void setDao(FuncionarioDao dao) {
		this.dao = dao;
	}


	public Funcionario getContato() {
		return funcionario;
	}


	public void setContato(Funcionario contato) {
		this.funcionario = contato;
	}


	public ArrayList<Funcionario> getLista() {
		return lista;
	}


	public void setLista(ArrayList<Funcionario> lista) {
		this.lista = lista;
	}


	public String getResposta() {
		return resposta;
	}


	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
}
