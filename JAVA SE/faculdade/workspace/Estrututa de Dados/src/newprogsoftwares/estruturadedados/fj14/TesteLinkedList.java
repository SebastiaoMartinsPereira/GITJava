package newprogsoftwares.estruturadedados.fj14;

public class TesteLinkedList {

	
	
    public static void main(String[] args) {
    	LinkedList_fj14 lista;
		lista = new LinkedList_fj14();
			
		Aluno a1 = new Aluno("Maria", 15151515, 30);
		Aluno a2 = new Aluno("Jo�o", 15151123, 40);
		Aluno a3 = new Aluno("Sergio", 15123415, 20);
		Aluno a4 = new Aluno("Gl�ria", 1123415, 23);
		Aluno a5 = new Aluno("Selena", 112334515, 24);
		
		
		lista.addToStart(a1);
		lista.addToStart(a2);
		lista.add(a3, 1);
		lista.addToStart(a4);
		lista.addToStart(a5);
		
		//for(int i = 0; i < lista.length();i++){
			 
			System.out.println(lista.toString());
		//}
	}
	
}
