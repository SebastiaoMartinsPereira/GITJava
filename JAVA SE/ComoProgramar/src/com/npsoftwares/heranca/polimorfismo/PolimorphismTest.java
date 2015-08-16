package com.npsoftwares.heranca.polimorfismo;

import com.npsoftwares.heranca.BasePlusCommisionEmployee;
import com.npsoftwares.heranca.CommisionEmployee;

public class PolimorphismTest {
	
	public static void main(String[] args) {
		
		CommisionEmployee commisionEmployee = new CommisionEmployee( 
				"Sebastião", "Martins", "12345", 1500.00, .03);
		
		BasePlusCommisionEmployee basePlusCommisionEmployee = new BasePlusCommisionEmployee(
				"Daniela", "Rodrigues", "1425", 3000, 0.01, 1500.);
		
		//utilizo como referência a superclasse porém o objeto é uma subclasse 
		CommisionEmployee basePlusCommisionEmployeeSuper = new BasePlusCommisionEmployee(
				"Daniela", "Martins", "1425", 3000, 0.01, 1500.);
		
		System.out.printf("%s %s:\n\n%s\n\n",
				"Call CommisionEmployee's to String with superclass reference",
				"to superclass object",commisionEmployee.toString());
		
		System.out.printf("%s %s:\n\n%s\n\n",
				"Call CommisionEmployee's to String with superclass reference",
				"to superclass object",basePlusCommisionEmployee.toString());
		
		System.out.printf("%s %s:\n\n%s\n\n",
				"Call CommisionEmployee's to String with superclass reference",
				"to superclass object",basePlusCommisionEmployeeSuper.toString());
	}
}
