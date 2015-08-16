package com.npsoftwares.heranca;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;

	public SalariedEmployee (String firstName,String lastName,String snn,double salary){
	
	super(firstName,lastName,snn);
	this.weeklySalary = salary;
	}
	
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = (weeklySalary > 0.0)? weeklySalary : 0.0;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	@Override
	public double earnings(){
		return getWeeklySalary();
	}
	@Override
	public String toString(){
		
		return String.format("Salaried Employee: %s\n %s: $%,.2f",super.toString(),
				"weekly salary",getWeeklySalary());
	}
	
	
}
