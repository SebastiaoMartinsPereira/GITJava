package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contador
 */
@WebServlet("/Contador")
public class Contador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int contador =0;
    
    public Contador() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void service(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		
		init();
		countIncrement(); //irá ser incrementado a cada requisição.
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("Contador agora é : " + this.getContador());
		out.println("</body>");
		out.println("</html>");
		destroy();
	} 
	
	protected void countIncrement(){
		this.contador++;
	}
	
	protected void countDecrement(){ 
		this.contador--;
	}
	
	public int getContador(){
		return this.contador;
	}
	
	public void  init(ServletConfig config) throws ServletException{
		super.init(config);
		log("iniciando");

	}
	
	public void destroy(){
		super.destroy();
		log("Finalizando");
	}
}
