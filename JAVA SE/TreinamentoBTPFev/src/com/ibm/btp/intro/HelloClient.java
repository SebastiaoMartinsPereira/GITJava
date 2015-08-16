package com.ibm.btp.intro;


public class HelloClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tipo nomeDaVariavel = new Tipo();
		//o operador new cria um novo objeto chamando o construtor default da classe, e devolve 
		//a posicao de memoria do objeto para a variavel firstClient
		Client firstClient = new Client();
		
		//setando os atributos do objeto
		firstClient.setCpf("222.222.222.222-22");
		firstClient.setName("john doe");
	
		//lendo os valores dos atributos do objeto
		System.out.println("Bem vindo, " + firstClient.getName());
		System.out.println("suas informacoes: cpf: " + firstClient.getCpf());
	
	}

}
