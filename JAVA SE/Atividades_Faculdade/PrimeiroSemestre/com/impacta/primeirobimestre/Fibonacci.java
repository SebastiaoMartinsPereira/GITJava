package com.impacta.primeirobimestre;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		int atual,anterior,proximo,qtd;
		String mensagem = " ";
		
		atual=0;
		proximo=1;
		
		qtd =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite qtd de resultados:"));
		
		while (qtd>0){
			
			
			anterior=atual;
			
			mensagem = mensagem + anterior+",";
			
			atual=proximo;
			proximo=anterior+atual;
			qtd--;
			
			
		}
		
		
		JOptionPane.showMessageDialog(null, mensagem);

	}
}

