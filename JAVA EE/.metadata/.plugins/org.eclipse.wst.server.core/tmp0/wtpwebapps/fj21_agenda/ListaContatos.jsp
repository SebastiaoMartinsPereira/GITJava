<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.*,br.com.npsoftwares.jdbc.dao.*,java.util.*,br.com.npsoftwares.jdbc.modelo.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Lista de contatos</title>
	</head>
	<body>
		<table>
		   
		    
			<%
				ContatoDao dao = new ContatoDao();
				List<Contato> contatos = dao.getList();
				SimpleDateFormat dateFormat;
			    
				for(Contato contato : contatos){ %>
				<tr> <th>Nome</th> <th>Email</th> <th>Endereço</th> <th>Nascimento</th> </tr>
				<tr> 
					<td><%=contato.getNome() %></td>
					<td><%=contato.getEmail() %></td>
					<td><%=contato.getEndereco() %></td>
					<%--Como recebi a data em formato Date tenho que usar o SimpledateFormat . Fommat --%>
					<% String texto = new SimpleDateFormat("dd/MM/yyyy").format(contato.getDataNascimento().getTime()); %>
					<td><%=texto%></td>
				</tr>	
			<% 
			    }
			%>
		</table>
	</body>
</html>