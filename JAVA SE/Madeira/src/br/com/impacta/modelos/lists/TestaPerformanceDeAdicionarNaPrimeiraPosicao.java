package br.com.impacta.modelos.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

   public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
	   
	  private static Scanner scan;

	public static void main(String[] args) {
		 
		scan = new Scanner(System.in);
		
	    System.out.println("Iniciando...");
	    
	    long inicio = System.currentTimeMillis();
	           
	    List<Integer> teste = new LinkedList<>();
	    
	    for (int i = 0; i < 30000; i++) {
	      teste.add(i, i);
	    }
	      
	    for (Integer integer : teste) {
	    	System.out.println( integer.intValue());
		}
	    
	    long fim = System.currentTimeMillis();
	    double tempo = (fim - inicio) / 1000.0;
	    
	    System.out.println("Tempo gasto: " + tempo);
	    
	    /////////======================================================/////////
	    
	    System.out.println("Pressione um tecla para o próximo teste!!");
	    scan.nextLine();
	    
        System.out.println("\n\n\nnIniciando...");
	    
	    inicio = System.currentTimeMillis();
	           
	    List<Integer> testeArrayList = new ArrayList<>();
	    
	    for (int i = 0; i < 30000; i++) {
	    	testeArrayList.add(i,i);
	    }
	      
	    for (Integer integer : testeArrayList) {
	    	System.out.println( integer.intValue() );
		}
	    
	    fim = System.currentTimeMillis();
	    tempo = (fim - inicio) / 1000.0;
	    
	    System.out.println("Tempo gasto: " + tempo);
	    
	  }
	}
