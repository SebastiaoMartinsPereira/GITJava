package br.com.npsoftwares.jdbc.teste;

import br.com.npsoftwares.jdbc.dao.ContatoDao;
import br.com.npsoftwares.jdbc.modelo.Contato;

public class TesteInsertDeleteContato {

	public static void main(String[] args) {
		
		Contato contato = null;
		ContatoDao contatoDao = new ContatoDao();
		
		contato = contatoDao.pesquisar(2);
		
		contato.setNome("O nome ue eu quizer.");
		
		contatoDao.altera(contato);

	}

}