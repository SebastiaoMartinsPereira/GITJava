<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>


	  
		<link href="css/jquery-ui.css" rel="stylesheet"/>
		<script src="Jq/jquery-1.11.3.js"></script>
		<script src="Jq/jquery-ui.js"></script>
        <script src="Jq/jquery-ui.css"></script>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		
	</head>
	<body>
	    <c:import url="Cabecalho.jsp"/>
	    
		<form action="adicionaContato" method="POST">
	      Nome: <input type="text" name="nome" /><br />
	      E-mail: <input type="text" name="email" /><br />
	      Endere�o: <input type="text" name="endereco" /><br />
   	      Data Nascimento: <caelum:campoData id="dataNascimento" /><br />     
	      <input type="submit" value="Gravar" />
	      
	    </form>
	    
	    <c:import url="Rodape.jsp"/>
	</body>
</html>