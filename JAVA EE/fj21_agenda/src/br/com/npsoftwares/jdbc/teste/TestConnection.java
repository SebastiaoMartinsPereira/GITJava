package br.com.npsoftwares.jdbc.teste;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.npsoftwares.jdbc.dao.ContatoDao;
import br.com.npsoftwares.jdbc.modelo.Contato;

public class TestConnection {

	public static void main(String[] args) throws ReflectiveOperationException, IllegalAccessException {
		
		Contato contato = null;
		ContatoDao contatoDao = new ContatoDao();
		ArrayList<Contato> contatos = new ArrayList<Contato>();

		try {
			
			contato = new Contato("Caelum","contato@caelum.com.br","r. Verguerio 3185",Calendar.getInstance());
			
			contatoDao.addContato(contato);
			
			contatos = contatoDao.getList();
			
			for (Contato contato2 : contatos) {
				
				System.out.println(contato2.toString());
			}
				
			System.out.println(contatoDao.pesquisar(1).toString());
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
