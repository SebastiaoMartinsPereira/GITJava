package com.ibm.btp.intro;


/**
 * Classe para demonstrar referencias
 * 
 * 
 * @author icampos
 *
 */
public class ReferenceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//instanciando dois objetos do tipo Client
		//a classe Client foi definida por nós no pacote com.ibm.btp.model
		Client firstClient = new Client("joe", "000.000.000-00", 0.0);
		
		//apesar de os objetos criados terem os mesmos valores para seus atributos, cada vez que o 
		//operador new é chamado ele instancia um objeto em uma posicao de memoria diferente; 
		//é essa posicao de memoria que é atribuida as variaveis: sao apontadores(ponteiros), referencias, 
		//por isso dizemos que firstClient e secondClient sao variaveis de referencia
		Client secondClient = new Client("joe", "000.000.000-00", 0.0);
		
		//o operador == testa se o valor das variaveis sao iguais, mas o valor delas é a posicao de memoria 
		//onde o objeto esta guardado, e nao os valores dos atributos dos objetos;
		//mesmo com mesmos atributos, os 2 objetos estao em posicoes diferentes, por isso essa comparacao retorna false
		boolean test1 = (firstClient == secondClient);
		
		System.out.println(test1);
		//mesma posicao na memoria - mesmo hashcode
		System.out.println(firstClient.hashCode());
		System.out.println(secondClient.hashCode());
		
		//Aqui criamos um objeto e a var de referencia thirdClient guarda o endereco desse objeto
		Client thirdClient = 
				new Client("john", "000.000.000-00", 0.0);
		//fourthClient aponta para o mesmo endereco que thirdClient
		Client fourthClient = thirdClient;
		
		//Como guardam o mesmo endereco, a comparacao com == retorna true
		boolean test2 = (thirdClient == fourthClient);
		
		System.out.println("test2: " + test2);
		//mesmo endereco de memoria - tem que ter mesmo hashcode
		System.out.println(thirdClient.hashCode());
		System.out.println(fourthClient.hashCode());
		
		//usando o metodo equals() - que sobrescrevemos na classe Client - agora compara os valores 
		//dos atributos, e retorna true
		boolean test3 = (firstClient.equals(secondClient));
		System.out.println(test3);
		
		//como thirdClient e fourthClient apontam pro mesmo objeto, alterando os atributos atraves de
		//thirdClient faz com que peguemos os valores alterados ao usar a var fourthClient:
		thirdClient.setName("Ivan");
		System.out.println("fourth name: " + fourthClient.getName());
	}

}
