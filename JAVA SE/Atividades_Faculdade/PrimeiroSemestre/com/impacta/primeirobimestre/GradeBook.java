package com.impacta.primeirobimestre;

import java.util.Scanner;

public class GradeBook {

	private String coursename;
	private String instrutorname;
	
	//construtor da classe
	public GradeBook(String name, String instrutor){
		
		coursename = name;
		instrutorname = instrutor;
		
	}
	
	//Calcula a média de dez notas infomormadas pelo usuário.
	public void GradeAvareng( int centinela){
		
		Scanner scan = new  Scanner(System.in);
		int total,gradecount,grade=0;
		double average;
		
		
		total = 0;
		gradecount = 1;
		
		while (grade != centinela){
			
			System.out.printf("Digite a nota %d :\n",gradecount);
			grade = scan.nextInt();
			if (grade != centinela) {
				total = total+grade;
				gradecount++;
			}	
		}
		
		
        
		if (total != 0){
			average = (double)total/(gradecount-1);
			System.out.printf("\nO total informado foi : %d",total);
			System.out.printf("\nA média é : %.2f",average);
		}else{
			System.out.println("Não foi inserido nenhuma nota!");
		} 
		scan.close();
	}
	
	//mensagem de boas vindas
	public void displayMenssage(String aluno ){
		
		System.out.printf("Seja bem vindo\n%s \nao curso de %s", aluno,getCourseName() );
		
	}

	public void setCourseName(String name){
		
		coursename = name;	
	}
	
	public String getCourseName(){
		
		return coursename;
	}
	
	public void setInstrutorName(String instrutor){
		
		instrutorname = instrutor;
	}
	
	public String getInstrutorName(){
		
		return instrutorname;
	}
	

	
}

