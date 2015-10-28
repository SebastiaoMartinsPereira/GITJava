package br.com.impacta.teste;

import java.util.Scanner;

import br.com.impacta.modelos.Data;
import br.com.impacta.modelos.Diretor;
import br.com.impacta.modelos.Funcionario;
import br.com.impacta.modelos.Programador;

public class TesteException {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Funcionario diretor = new Diretor("Leandro Rossi", "Diretor de Vendas", 12000.
				,new Data(24, 04, 1989), "3385351");
		
		Funcionario programador = new Programador("Sebastião Martins", "Programador Sênior", 8000.
				,new Data(24, 04, 1989), "3385351");
		
		System.out.println("Valor da Bonificação pra o diretor de vendas.");
		diretor.bonifica(scan.nextDouble());
		
		System.out.println("\n\nInforme o valor da Bonificação pra o programador.");
		programador.bonifica(scan.nextDouble());
		
		System.out.printf("Salário Diretor : %10.2f.\n",diretor.getSalario());
		System.out.printf("Salário Programador : %10.2f.\n",programador.getSalario());
		scan.close();
		
	}
	
	

}



 