<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Nossa isso � demais!</title>
	</head>
	<body>
	 	<c:import url="Cabecalho.jsp"/>
	 	
	    <!-- Cria (inst�ncia) a classe Dao -->
		<%-- <jsp:useBean id="dao" class="br.com.npsoftwares.jdbc.dao.ContatoDao" /> --%>
		
		<table width="100%">
			<!-- Percorre contatos montando as linhas da tabela -->
			
			<%String color = "green"; %>
			<tr><th width="25%" align="left" bgcolor= "grey">Nome</th> <th width="25%" align="left" bgcolor= "#D3D3D3" >Email</th> <th width="25%" align="left" bgcolor= "grey" >Endere�o</th> <th width="25%" align="left" bgcolor= "#D3D3D3">Data Nasc.</th></tr>
			
			<c:forEach var="contato" items="${contatos}" varStatus="id"> 
				<tr bgcolor= "#${id.count % 2 == 0 ? 'aaee88' : 'ffffff'  }" >
					<td width="25%" align="left">${contato.nome}</td>
					<td width="25%" align="left" > 
						<c:if test="${ not empty contato.email}"> 
							<a href="mailto:tigpega_ar@hotmail.com">
								${contato.email} 
							</a>
						</c:if>
					</td>
					<td width="25%" align="left" >${contato.endereco }</td>
					<td width="25%" align="left" >
						<fmt:formatDate value="${contato.dataNascimento.time }" pattern="dd/MM/yyyy"/>  
					</td>
					<td>
						<a href="mvc?logica=RemoverContatoLogic&id=${contato.id }">Remover</a>
					</td>
				</tr>			
			</c:forEach>
			
		</table>
		
		<c:import url="Rodape.jsp" />
		
	</body>
</html>