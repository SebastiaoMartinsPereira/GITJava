package br.com.impacta.teste;

import br.com.impacta.modelos.Conta;
import br.com.impacta.modelos.Funcionario;


public class TesteConta {

	public static void main(String[] args) {
		
		
		//Exercicio 1
		Conta conta1 = new Conta();
		
		
		conta1.setDono( "Sebasti�o");
		conta1.setLimite(1000);
		conta1.setNumero(0001);
		conta1.setSaldo(100000.);
		
		conta1.sacar(123456);
		
		System.out.println("\nExercicio 1: ");
		System.out.println(String.format("Estou rico %f.!!!!!!!!!", conta1.getSaldo()));
		
		
		//Exercicio 2
		Funcionario f1 = new Funcionario();
		
        System.out.println("\nExercicio 2: ");
        
		f1.setNome("Hugo");
		f1.setSalario(100.);
		f1.recebeAumento(50.);
		
		System.out.println("Sal�rio Atual :" + f1.getSalario());
		System.out.println("Ganho anual : "+ f1.calculoGanhoAumento());
		
		//Exercicio 4
		Funcionario f2 = new Funcionario();
		
		f2.setNome("Hugo");
		f2.setSalario(100.);
		f2.recebeAumento(50.);
		
		System.out.println("\nExercicio 4: ");
		
		if(f1==f2){
			System.out.println("S�o iguais!!");
		}else{
			System.out.println("N�o s�o Iguais....");
		}
			
		//Exercicio 5
		Funcionario f3 = new Funcionario();
		
		f3 = f2;
		
		System.out.println("\nExercicio 5: ");
		
		if(f3==f2){
			System.out.println("S�o iguais!!");
		}else{
			System.out.println("N�o s�o Iguais....");
		}
		
	}
	
}
