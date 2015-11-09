package br.com.npsoftwares.jdbc.teste;

import java.util.Calendar;
import java.util.Date;

import br.com.npsoftwares.jdbc.dao.ContatoDao;
import br.com.npsoftwares.jdbc.modelo.Contato;

public class TesteInsertDeleteContato {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Contato contato = null;
		ContatoDao contatoDao = new ContatoDao();
		Date data = new Date();
		data.setTime(1900);

		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		
		
		contato = contatoDao.pesquisar(2);
		
		contato.setNome("O nome ue eu quizer.");
		
		contatoDao.altera(contato);
					
	}
}
