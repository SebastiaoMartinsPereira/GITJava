package com.impacta.primeirobimestre;

public class Employee {
	
	//declara os campos da classe (variáveis de instância) "atributos"
	private String firstname,middlename;
	private double salariomensal;
	
	//construtor da classe
	public Employee(String nome,String sobrenome, double salario){
		
		setFirstname(nome);
		setMiddlename(sobrenome);
		
		if (salario > 0.0 ){
		setSalarioMensal(salario);
		}	
		
	}
	
	
	//acrescento o valor de aumento ao salario atual.
	public void CalcularAumento(double valordoaumento){
		
		double emporcentagem = valordoaumento/100;
		
		setSalarioMensal(getSalarioMensal() +(getSalarioMensal()*emporcentagem));
		
	}

	//metodos para utlização dos atributos.
	public double getSalarioMensal() {
		return salariomensal;
	}

	public void setSalarioMensal(double salariomensal) {
		this.salariomensal = salariomensal;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	
	
}
