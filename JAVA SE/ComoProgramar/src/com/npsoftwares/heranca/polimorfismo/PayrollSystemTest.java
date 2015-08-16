package com.npsoftwares.heranca.polimorfismo;

import com.npsoftwares.heranca.BasePlusCommisionEmployee;
import com.npsoftwares.heranca.CommisionEmployee;
import com.npsoftwares.heranca.Employee;
import com.npsoftwares.heranca.HourlyEmployee;
import com.npsoftwares.heranca.SalariedEmployee;

public class PayrollSystemTest {

	public static void main(String[] args) {
		
		 SalariedEmployee salariedEmployee = new SalariedEmployee("Sebastião", "Martins ", "1254", 1200);
		 
		 HourlyEmployee hourlyEmployee = new HourlyEmployee("Gerson", "Silva", "1212", 90.00, 10);
		 
		 CommisionEmployee commisionEmployee = new CommisionEmployee("Daniela", "Rodrigues", "12554", 4120.00, 0.06);
		 
		 BasePlusCommisionEmployee basePlusCommisionEmployee = new BasePlusCommisionEmployee("Joe", "Serts", "11477", 8000.00, 0.02, 1200.00);
		 
		 System.out.println("Employees processed indivisually: \n");
		 
		 //Utilização do polimorfismo onde todos os objetos utiliam o método .earnings() porém a JVM distingue exatamente 
		 //qual a classe que está chamando e a maneira como o objeto irá se comportar.
		 System.out.printf("%s \n %s: $%,.2f\n\n",
				   salariedEmployee,"earned",salariedEmployee.earnings());
		 
		 System.out.printf("%s \n %s: $%,.2f\n\n",
		           hourlyEmployee,"earned",hourlyEmployee.earnings());
		 
		 System.out.printf("%s \n %s: $%,.2f\n\n",
				 commisionEmployee,"earned",commisionEmployee.earnings());
		 
		 System.out.printf("%s \n %s: $%,.2f\n\n",
				 basePlusCommisionEmployee,"earned",basePlusCommisionEmployee.earnings());
		 
		 //cria um array de objetos Employee
		 Employee[] employees = new Employee[4];
		 
		 employees[0]= salariedEmployee;
		 employees[1]= hourlyEmployee;
		 employees[2]= commisionEmployee;
		 employees[3]= basePlusCommisionEmployee;
		 
		 
		 System.out.println("Employees processed polymorphically:\n");
		 
         //processa genericamente cada objeto no array
         for (Employee currentEmployee : employees)
         {
        	 System.out.println(currentEmployee); //chama o método toString exoplicitamente;
        	 
        	 //donwcast da refêrencia de employee para
        	 //referência a BasePlusCommisionEmployee
        	if (currentEmployee instanceof BasePlusCommisionEmployee){
        		
	           	 BasePlusCommisionEmployee employee = (BasePlusCommisionEmployee) currentEmployee;
	        	 
	           	 employee.setBaseSalary(1.10 * employee.getBaseSalary()); //novo valor para o atributo salário base com 10% de acrescimo.

	             System.out.printf("new base salary with 10%% increase is : $%,.2f\n",employee.getBaseSalary());
        	}
	             
        	     System.out.printf("earned $%,.2f \n\n",currentEmployee.earnings());
         }
         
         //Obtém o nome de cada tipo de objeto contino no array.
         for(int j = 0 ; j< employees.length ; j++){
        	 System.out.printf("Employee %d is a %s\n",j,employees.getClass().getName());
         }
	}

}
