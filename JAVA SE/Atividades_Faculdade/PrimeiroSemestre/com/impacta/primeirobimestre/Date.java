package com.impacta.primeirobimestre;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Date {
	
	private int dia;
	private int  mes,ano;
	
	public Date(int dia,int mes,int ano){
		
		if ((dia > 0 && dia<31)){
		setDia(dia);
		}
		else 
			dia=01;
		
		if (mes>0 && mes < 12){
		setMes(mes);
		}else
			mes=01;
		
		if(ano >1900 && ano < ano+120){
		setAno(ano);	
		}else 
			ano= 1900;	
	}

	
	
	//apenas mostar a data que foi informda
	public void  ViewDate(){
				
		System.out.printf("a data informada é  %s/%s/%s",getDia(),getMes(),getAno());
			
	}
	
	//retorna data de aniversario 
	public String Birthday(){
		
		String birthday=null;
		
		birthday = getDia()+"/"+getMes()+"/"+getAno();
		return birthday;
			
	}
	
	//calcula a idade de acordo com a data informada.
	public int CalcYearsOld(){
		
		int idadeano,idademes;
		int idade=0;
		int dataatual;
		
		//retorna a data atual no formato especificado
		DateFormat format = new SimpleDateFormat("yyyy"); 
		java.util.Date data = new java.util.Date();
		dataatual = Integer.parseInt(format.format(data));
		
		idadeano = ((int)dataatual - getAno())*365;
		idademes = getMes() * 31;
		
		 //caucula a idade
		idade = ((idadeano + idademes + getDia())/360);
		
		return idade;	
	}	
	
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
