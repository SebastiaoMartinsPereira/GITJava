package br.com.npsoftwares.jdbc.teste;

import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

import br.com.npsoftwares.djbc.dao.ContatoDao;
import br.com.npsoftwares.jdbc.modelo.Contato;
import br.com.npsoftwares.jdbc.modelo.Builders.ContatoBuilder;

public class TestConnection {

	public static void main(String[] args) {
		
		Contato contato = null;
		ContatoDao contatoDao = new ContatoDao();
		ArrayList<Contato> contatos = new ArrayList<Contato>();

		try {
			contato = new ContatoBuilder().ComNome("Sebastião Martins")
					                      .ComEmail("sebastiao@npsoftwares.com.br")
					                      .ComEndereco("r morrinhos")
					                      .NaData(Calendar.getInstance())
					                      .Criar();
			
			contatoDao.addContato(contato);
			
			contatos = contatoDao.getList();
			
			for (Contato contato2 : contatos) {
				
				System.out.println(contato2.toString());
			}

			JOptionPane.showInputDialog(null, "mensagem");
			System.out.println(contatoDao.pesquisar(5).toString());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
