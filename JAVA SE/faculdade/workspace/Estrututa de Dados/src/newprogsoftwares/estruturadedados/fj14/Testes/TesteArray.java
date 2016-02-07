package newprogsoftwares.estruturadedados.fj14.Testes;

import newprogsoftwares.estruturadedados.fj14.Aluno;
import newprogsoftwares.estruturadedados.fj14.Fj14_Array;

public class TesteArray {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("aluno1", 1510171, 26);
		Aluno a2 = new Aluno("aluno2", 1710171, 32);
		Aluno a3 = new Aluno("aluno3", 1710171, 30);
		Aluno a4 = new Aluno("aluno4", 1710171, 33);
		Aluno a5 = new Aluno("aluno5", 1710171, 30);
		Aluno a6 = new Aluno("aluno6", 1710171, 35);
		
		Fj14_Array alunos = new Fj14_Array();
		
		
		try {
			
			 //adiciona no fim da lista.
			alunos.adiciona(a1);
			alunos.adiciona(a2);
			alunos.adiciona(a5);
			alunos.adiciona(a3);
			alunos.adiciona(a4);
			alunos.adiciona(a5);
			
			
			System.out.println("\nFull List :\n" + alunos);
			
			System.out.println("\nResult of search:\n" + alunos.buscar(4));
			
			alunos.adiciona(a6, 5);
			
			System.out.println("\nFull list after insert :\n" + alunos);
			
			alunos.remover(5);
				
			System.out.println("\nFull list after removal of student number 5 : \n " +alunos);
			
			System.out.println("\nFull List :\n" + alunos);
			System.out.println("\nFirst index of Student a5 " + alunos.indexOf(a5));
			
			System.out.println("\nFull List :\n" + alunos);
			System.out.println("\nLast index of Student a5 " + alunos.lastIndexOf(a5));
			
		} catch (IllegalArgumentException e) {
			
			System.out.println(e.getMessage());
		}
       
	    	
	}
}
