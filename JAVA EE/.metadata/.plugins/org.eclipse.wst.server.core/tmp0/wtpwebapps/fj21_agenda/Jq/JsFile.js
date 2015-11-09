
	alert("Agora a mensagem de um arquivo separado.!!");	
	
	
    var produto = "Suco";
	var produto1 = "Refrigenrante";
	var preco = 5;
	var preco1 = 4.75;
	var multi = preco * 6;
	var multi1 = preco1 * 4;
	var somatotal = multi + multi;
	
	alert(somatotal);	
			
	function mensagem(){
		alert("Function para mostrar mensagem.");
		alert("Resultado da Função de Soma " + somar(multi,multi1));
	}
	 
	
	function somar(valor1,valor2){
		var sum = valor1 + valor2;
		return sum;
	}
	
	$('document').ready(function(){
		$( '#target' ).click(function() {
			alert( "E agora está errado? \n\n kkkkk" );
		});
	});
	