package com.impacta.primeirobimestre;


public class HeartHates{
	
	String firstname,middlename;
	
	public HeartHates(String firstname,String middlename){
		
		this.firstname = firstname;
		this.middlename = middlename;
	}
	
	public String NomeSobrenome(){
		
		String fullname = null;	
		fullname = getFirstName() + " " + getMiddleName();
		return fullname;
	}
	
	
	public int MaxHeartHates(int idade){
		
		int maxhearthates=0;
		maxhearthates = 220- idade;
		return maxhearthates;	
	}
	
	
	public String IdealHeartHates(int maxhearthates){

		String idealhearthates = null;
		double mimidealhearthates = (double)50/100;
		double maxidealhearthates = (double)85/100;

		idealhearthates = String.valueOf(maxhearthates*mimidealhearthates)+" e " + String.valueOf(maxhearthates * maxidealhearthates);
		
		return idealhearthates;
	}

	public void setFirstName(String firstname){
		
		this.firstname = firstname;
		
	}
	
	public String getFirstName(){
		
		return firstname;
	}
	
	public void setMiddleName(String middlename){
		
		this.middlename = middlename;
	}
	
	public String getMiddleName(){
		
		return middlename;
	}
	
	
}