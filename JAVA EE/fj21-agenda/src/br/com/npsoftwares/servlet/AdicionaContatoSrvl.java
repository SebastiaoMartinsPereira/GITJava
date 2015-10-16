package br.com.npsoftwares.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.npsoftwares.jdbc.dao.ContatoDao;
import br.com.npsoftwares.jdbc.modelo.Contato;

/**
 * Servlet implementation class AdicionaContatoSrvl
 */
@WebServlet("/adicionaContato")
public class AdicionaContatoSrvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdicionaContatoSrvl() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    protected void service(HttpServletRequest request,HttpServletResponse  response)
			throws ServletException,IOException{
    	
    	PrintWriter out = response.getWriter();
    	
    	String nome = request.getParameter("nome");
    	String endereco = request.getParameter("endereco");
    	String email = request.getParameter("email");
    	String dataEmTexto = request.getParameter("dataNascimento");
    	Calendar dataNascimento = null;
    	
    	
    	try {
			Date date = new SimpleDateFormat("dd/MM/yyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		} catch (Exception e) {
			out.println("Erro de Conversão de data.");
			return;
		}
    	
    	Contato  contato = new Contato(nome,email,endereco,dataNascimento);
    	
    	ContatoDao dao = new ContatoDao();
       	dao.addContato(contato);
    	
    	out.println("<html>");
    	out.println("<body>");
    	out.println("contato" + contato.getNome() + "Adicionado com sucesso");
    	out.println("</body>");
    	out.println("</html>");
    	
    
    }
}
