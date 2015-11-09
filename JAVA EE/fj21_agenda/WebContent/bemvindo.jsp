<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<%--Coomentário em Jsp(Jaca Server Pages : nossa primeira página JSP) --%>
		<%String mesage = "Bem vindo ao sistema de agenda do fj-21"; %>
		<% out.println(mesage); %>
		<br/>
		<%String desenvolvido = "Desenvolvido por Sebastião Martins Pereira."; %>
		<% out.println(desenvolvido); %>
		<br/>
		<% out.println("Tudo foi executado!!");%>
		<% System.out.println("Tudo foi executado!!");%>
	</body>
</html>