package br.com.npsoftwares.jdbc.teste;

import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

import br.com.npsoftwares.djbc.dao.ContatoDao;
import br.com.npsoftwares.jdbc.modelo.Contato;
import br.com.npsoftwares.jdbc.modelo.Builders.ContatoBuilder;

public class GerenciarAgenda {

	private ContatoDao dao;
	private Contato contato;
	private ArrayList<Contato> lista;
	private String resposta;
	
	
	public GerenciarAgenda()
	{
		contato = null;
		dao = new ContatoDao();
		lista = new ArrayList<Contato>();
	}
	
	public void CadastrarContato(){
		
		String nome;
		String email;
		String rua;
		
		mostrarMensagem("Cadastro de Contato: tecle Enter");
		nome = recebeInput("Informe o nome do contato!");
		email = recebeInput("Informe o email do contato!");
		rua = recebeInput("Informe o rua do contato!");
		
		try {
			contato = new ContatoBuilder().ComNome(nome)
					                      .ComEmail(email)
					                      .ComEndereco(rua)
					                      .NaData(Calendar.getInstance())
					                      .Criar();
			dao.addContato(contato);
			
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
			
			for (Contato item : lista) {
				
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
		contato = dao.pesquisar(id);
        
		if(contato.getId()== null)
		{
			throw new Exception("Contato não encontrado");
		}
		
		str.append(String.format("Nome: %s \nEmail:%s \nEndereço:%s",contato.getNome(),contato.getEmail(),contato.getEndereco()));
		
		mostrarMensagem("Contato selecionado:\n" + str);
		
	    do {
	    	
	    	input = Integer.parseInt(recebeInput("O que deseja alterar?\n1-Nome\n2-Email\n3-Endereço\n4-Sair"));
		
		    switch (input) {
			case 1:
				contato.setNome(recebeInput("Informe o novo nome!"));
				break;
			case 2:
				contato.setEmail(recebeInput("Informe o novo Email!"));
				break;
			case 3:
				contato.setEndereco(recebeInput("Informe o novo Endereço!"));
				break;
			}
	    
	    } while (input != 4);
	    
	    dao.altera(contato);
	    
	    mostrarMensagem("Contato editado com sucesso!");
	}
	
	public void apagarContato() throws Exception
	{
		int id;
		
		id = Integer.parseInt(recebeInput("Qual o id co contato que deseja deletar?"));
		contato = dao.pesquisar(id);
        
		if(contato.getId()== null)
		{
			throw new Exception("Contato não encontrado");
		}
		
		dao.remove(contato);
		
		mostrarMensagem("Contato excluído com sucesso!");
		
		
	}
	public String recebeInput(String texto){
		return JOptionPane.showInputDialog(texto);
	}
	
	public void mostrarMensagem(String texto)
	{
		JOptionPane.showMessageDialog(null, texto);
	}
	
	public ContatoDao getDao() {
		return dao;
	}

	public void setDao(ContatoDao dao) {
		this.dao = dao;
	}


	public Contato getContato() {
		return contato;
	}


	public void setContato(Contato contato) {
		this.contato = contato;
	}


	public ArrayList<Contato> getLista() {
		return lista;
	}


	public void setLista(ArrayList<Contato> lista) {
		this.lista = lista;
	}


	public String getResposta() {
		return resposta;
	}


	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
}
