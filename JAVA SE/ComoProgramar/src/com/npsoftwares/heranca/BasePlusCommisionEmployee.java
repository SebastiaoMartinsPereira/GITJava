package com.npsoftwares.heranca;

public class BasePlusCommisionEmployee extends CommisionEmployee {

	private double baseSalary;

	public BasePlusCommisionEmployee(String fisrt, String last, String ssn,
			double sales, double rate, double salary) {
		super(fisrt, last, ssn, sales, rate);
		this.setBaseSalary(salary);
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = (baseSalary > 0.0) ? baseSalary : 0.0;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	@Override
	// here the override it is done in the class CommissioEmployed
	public double earnings() {
		return getBaseSalary() + super.earnings();

	}

	@Override
	public String toString() {
		return String.format("%s %s\n%s: $%,.2f", "base-salaried",
				super.toString(), "base salary", getBaseSalary());
	}
}
