package newprogsoftwares.estruturadedados.fj14;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {

	int cont;
	private List<T> pecas = new  ArrayList<T>();
	
	public Pilha(){
		cont=0;
	}
	
	public void insere(T peca){
		this.pecas.add(cont,peca);
		cont++;
	}
	
	public T remove() throws IndexOutOfBoundsException{
		if(!vazia());
		return this.pecas.remove(--cont);
	}
	
	public boolean vazia(){
		return this.cont==0;
	}
	
	public List<T> getPecas() {
		return pecas;
	}

	public void setPecas(List<T> pecas) {
		this.pecas = pecas;
	}
	
	public int tamanho(){
		return this.cont-1;
	}
}
