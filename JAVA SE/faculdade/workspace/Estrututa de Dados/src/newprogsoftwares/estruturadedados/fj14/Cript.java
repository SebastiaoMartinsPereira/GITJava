package newprogsoftwares.estruturadedados.fj14;

public class Cript<T> {

	private Pilha<Character> aux;
	
	public Cript(){}
	
	public Pilha<Character> criptografar(String palavra){
	    
		aux = new Pilha<Character>();	
		
		for (int i = palavra.length(); i > 0; i--) {
			aux.insere((Character)palavra.charAt(i));
		}
		
		return aux;
	}
}
