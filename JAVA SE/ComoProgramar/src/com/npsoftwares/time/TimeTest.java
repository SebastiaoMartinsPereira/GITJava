package com.npsoftwares.time;


/**
 * @author Npsoftwares
 *
 */

public class TimeTest {
	
	public static void main(String[] args) {
	
		 Time t1 = new Time();
		 
		 Data aniversario = new Data(24,04,1989);
		 Data contratacao = new Data(28,07,2014);
		 Employee dadosContrato = new Employee("Sebastião", "Martins", aniversario, contratacao);
		 
		 System.out.println( dadosContrato.toString());
		 
		 System.out.println();
		 System.out.println("Hora inicial universal :");
		 System.out.println(t1.toUniversalFormat());
		 System.out.println("Hora inicial padrão :");
		 System.out.println(t1.toString());
		 System.out.println();
		 
		 
		 t1.setTime(13, 45,23);
		 System.out.println(t1.toUniversalFormat());
		 System.out.println("Hora inicial padrão :");
		 System.out.println(t1.toString());
		 System.out.println();
		 
		 System.out.println("Após um valor inválido informado :");
		 t1.setTime(99,99,99);
		 System.out.println(t1.toUniversalFormat());
		 System.out.println("Hora inicial padrão :");
		 System.out.println(t1.toString());
		 System.out.println();
	}

}
