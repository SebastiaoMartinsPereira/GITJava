package com.npsoftwares.heranca;

public class CommisionEmployee extends Employee{

	private double grossSales; // weekly gross sales.
	private double commisionRate; //

	public CommisionEmployee(String firstName, String lastName, String ssn,
			double sales, double rate) {

        super(firstName, lastName, ssn);
		this.setGrossSales(sales);
		this.setCommisionRate(rate);

	}

	public double getCommisionRate() {
		return commisionRate;
	}
					
	public double getGrossSales() {
		return grossSales;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = (commisionRate > 0.0 && commisionRate < 1.0) ? commisionRate : 0.0;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = (grossSales < 0.0) ? 0.0 : grossSales;
	}

	@Override
	public double earnings(){
		return this.getCommisionRate() * this.getGrossSales();
	}
	
	@Override
	public String toString(){
		return String.format("%s: %s\n%s $%,.2f\n%s $%,.2f ", 
				"comission employee",super.toString(),
				"gross sales",getGrossSales(),
				"commision rate",getCommisionRate()
				);
	}
}
