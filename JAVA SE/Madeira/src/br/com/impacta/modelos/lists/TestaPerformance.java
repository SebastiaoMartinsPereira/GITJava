package br.com.impacta.modelos.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	  public static void main(String[] args) {
		  
		  
	        System.out.println("Iniciando...");
			Collection<Integer> arrayListTeste = new ArrayList<>();
			
			long inicio = System.currentTimeMillis();
			
			int total = 100000;
			
			for (int i = 0; i < total; i++) {
				arrayListTeste.add(i);
			}
			
			for (int i = 0; i < total; i++) {
				arrayListTeste.contains(i);
			}
			
			
			long fim = System.currentTimeMillis();
			long tempo = fim - inicio;
			
			System.out.println("Finalizado...\n Tempo gasto: " + tempo);
			
			
			
			 System.out.println("\n\nIniciando hashSetTeste...");
				Collection<Integer> hashSetTeste = new HashSet<>();
				
				long hashSetinicio = System.currentTimeMillis();
				
				int hashSettotal = 100000;
				
				for (int i = 0; i < hashSettotal; i++) {
					hashSetTeste.add(i);
				}
				
				for (int i = 0; i < hashSettotal; i++) {
					hashSetTeste.contains(i);
				}
				
				
			long hashSetfim = System.currentTimeMillis();
			long hashSettempo = hashSetfim - hashSetinicio;
			
			System.out.println("Finalizado hashSetTeste ...\n Tempo gasto: " + hashSettempo);
			
			
	  }
}

