
package com.npsoftwares.gradebook;


public class GradeBookTeste {

	public static void main(String[] args) {

		int[] gradesArray ={87,68,94,100,83,78,85,91,76,87};
		
		GradeBook grade = new GradeBook("Css", gradesArray);
		
		grade.displayMessage();
		grade.processGrade();

	}

}
