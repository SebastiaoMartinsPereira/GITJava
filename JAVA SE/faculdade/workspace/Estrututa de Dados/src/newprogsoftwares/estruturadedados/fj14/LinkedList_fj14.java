package newprogsoftwares.estruturadedados.fj14;

public class LinkedList_fj14 implements DoubleLinked {

	Node first;
	Node last;

	private int totalizer;

	public LinkedList_fj14() {
		this.setTotalizer(0);
		this.first = null;
		this.last = null;
	}

	public Object get(int position) {
		return this.catchNode(position).getElemento();
	}

	public int length() {
		return this.totalizer;
	}

	public void addToStart(Object element) {
		

		if (isVoid()) {
			Node aux = new Node(element);
			last = first = aux;
		}else{
			Node aux = new Node(this.first,element);
			first.setBefore(aux);
			first = aux;	
		}

		this.totalizer++;
	}

	public void add(Object element, int position) {

		if (position == 0) {
			this.addToStart(element);
		} else if (position == this.totalizer) {
			this.addToEnd(element);
		} else {
			// I recover the previous position.
			Node before = this.catchNode(position - 1);
			// recover the next node
			Node next = before.getNext();
			Node newnew = new Node(next,element);
			// indicate the new node to lastnode as your next.
			newnew.setBefore(before);
			before.setNext(newnew);
			next.setBefore(newnew);
			this.totalizer++;
		}

	}

	public void addToEnd(Object element) {

		if (isVoid()) {
			this.addToStart(element);
		} else {

			Node nova = new Node(element);
			this.last.setNext(nova);
			nova.setBefore(last);
			//seek to take the question; 
			this.last = nova;
			this.totalizer++;
		}
	}

	public void removeFromStart() {

		if (!this.isOcuppedPosition(0)) {
			throw new IllegalArgumentException("Out of Position!");
		}

		this.first = this.first.getNext();
		this.totalizer--;

		if (this.totalizer == 0) {
			this.last = null;
		}
	}

	public void removeFromEnd() {
		if (isOcuppedPosition(totalizer)) {
			if (totalizer == 1) {
				removeFromStart();
			} else {
				Node novo = catchNode(totalizer - 1);
				novo.setNext(null);
			}
		}
	};

	public void remove(int position) {
		
		if(!isOcuppedPosition(position)){
			throw new IllegalArgumentException("Position is null!");
		}
		if(position == 0){
			removeFromStart();
		}else if(position == this.totalizer){
			removeFromEnd_();
		}else{
			
			//recover the Node before of position informated
			Node anterior = this.catchNode(position-1);
			//recover the Node to be deleted. 
			Node atual = anterior.getNext();
			//recover de next Node for the current Node  
			Node posterior = atual.getNext();
			//Assignment of the new Nodes references.
			anterior.setNext(posterior);
			posterior.setBefore(anterior);
			this.totalizer--;
		}
	}

	public Boolean isVoid() {
		return this.getTotalizer() == 0;
	}

	public boolean contains(Object element) {
		//recover de current Node
		Node current = this.first;
		
		//Make verification
		while(current!= null){
			
			///if it is equal return true
			if(current.getElemento().equals(element)){
				return true;
			}
			//catch the next node to verification.
			current = current.getNext();
					
		}
		return false;
	}
	
	private int getTotalizer() {
		return totalizer;
	}

	private void setTotalizer(int totalizer) {
		this.totalizer = totalizer;
	}

	protected boolean isOcuppedPosition(int position) {
		return position >= 0 && position < this.totalizer;
	}

	private Node catchNode(int position) {

		if (!isOcuppedPosition(position)) {
			throw new IllegalArgumentException("Posi��o n�o Existente!");
		}

		Node current = first;

		for (int i = 0; i < position; i++) {
			current = (Node) current.getNext();
		}

		return current;
	}

	@Override
	public String toString() {

		if (isVoid()) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder("[");
		Object atual = this.first;

		for (int i = 0; i < this.totalizer - 1; i++) {
			sb.append(((Node) atual).getElemento());
			sb.append(",");
			atual = ((Node) atual).getNext();
		}

		sb.append(((Node) atual).getElemento());
		sb.append("]");

		return sb.toString();
	}

	@Override
	public void removeFromEnd_() {

		if (!isOcuppedPosition(totalizer - 1)) {
			throw new IllegalArgumentException("Posi��o n�o existente!");
		}

		if (getTotalizer() == 1) {
			this.removeFromStart();
		} else {
			Node before = this.last.getBefore();
			before.setNext(null);
			this.last = before;
			this.totalizer--;
		}

	}

}
