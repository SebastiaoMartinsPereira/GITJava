package newprogsoftwares.estruturadedados.fj14;

public class Node {

	private Node next;
	private Node before;
	
	private Object elemento;
	
	public Node(Node next,Object elemento){
		this.setNext(next);
		this.setElemento(elemento);
	}

	public Node(Object elemento){
		this.setElemento(elemento);
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Node getBefore() {
		return before;
	}

	public void setBefore(Node before) {
		this.before = before;
	}
	
}
