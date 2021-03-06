package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.npsoftwares.jdbc.dao.ContatoDao;
import br.com.npsoftwares.jdbc.modelo.Contato;

public class RemoverContatoLogic implements Logica {

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		Long id = Long.parseLong(request.getParameter("id"));
		Contato contato = new Contato();
		contato.setId(id);
		
		ContatoDao dao = new ContatoDao();
		dao.remove(contato);
		
		System.out.println("Excluindo Contato!!");
		
		return "mvc?logica=ListaContatosLogic";
	
	}

}
