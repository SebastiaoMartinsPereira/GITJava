package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OiMundo
 */
@WebServlet(name = "/OiMundo",urlPatterns={"/oi","/oi2"},initParams={@WebInitParam(name="param1",value="value1"),@WebInitParam(name="param2",value="value2")})
public class OiMundo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private String param1;
	private String param2;
	
    public OiMundo() {
        super();
        
    }
    
    public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    	    	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Primeira Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Oi mundo Servlet!</h1>");
        out.println("</body>");
        out.println("</html>");
        
        init();
        
        out.println("<h2>Exemplo com InitParam Servlet</h2>");
        
      //terceira forma de recuperar os valores informados
        
        ServletConfig config = getServletConfig();
        String parametro1= config.getInitParameter("param1");
        out.println("Valor do parâmetro 1: " + parametro1);
          
        String parametro2 = config.getInitParameter("param2");
        out.println("<br>Valor do parâmetro 1: " + parametro2);
        
        //terceira forma de recuperar os valores informados
        out.println("\nValor do parâmetro 1: "
        		  + getServletConfig().getInitParameter("param1"));
        
        
        
        out.close();
        
        destroy();
        
    }


	
	public void init(ServletConfig config) throws ServletException 
	{
		//recuperando parâmetros passados através do @WebInitParam 
		super.init(config);
		this.param1 = config.getInitParameter("param1");
		this.param2 = config.getInitParameter("param2");
		
	    System.out.println(this.param1 + this.param2);
	    log("Iniciando a servlet");
	   
	}

 
      public void destroy() {
          super.destroy();
          log("Destruindo a servlet");
      }
      
	

}
