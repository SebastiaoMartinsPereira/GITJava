package com.npsoftwares.gradebook;

public class GradeBook {
	
	private String courseName;
	private int grades[];
	
	
	public GradeBook(String courseName,int[] gradeArray){
		this.courseName = courseName;
		this.grades = gradeArray;
	}
			
	public String getCourseName(){
		return this.courseName;
	}
	
    public void setCourseName(String name){
    	this.courseName = name;
    }
    
    public void displayMessage(){
    	System.out.println("Bem vindo ao curso " + getCourseName() +"\n");
    }
    
    public void processGrade(){
    	
    	outputGrades();
    	System.out.println();
    	
    	System.out.printf("Média da classe : "+ getAvarage()+"\n");
    	
    	System.out.printf("Menor nota %d \nMaior nota %d\n\n",getMinimum(),getMaximun());
    	
    	outputBarChart();
    }
    
    public int getMinimum(){
    	int lowGrade = grades[0];
    	
    	for(int grade : grades){
    		
    		if(grade< lowGrade){
    			lowGrade = grade;
    		}
    	}
    	return lowGrade;
    }
    
    public int getMaximun(){
    	int highGrade = grades[0];
    	
    	for (int grade : grades){
    		if (grade > highGrade){
    			highGrade =grade;
    		}
    	}
    	return highGrade;
    }
    
    public double getAvarage(){
    	int total = 0;
    	
    	for (int grade : grades){
    		total += grade;
    	}
    	
    	return (double) total/grades.length;			
    }
    
    public void outputBarChart(){
    	
    	System.out.println("Grade distribution:");
    	
    	int[] frequency = new int[11];
    	
    	for (int grade : grades ){
    		
    		++frequency[grade/10];
    	}
    	
    	for(int count =0;count<frequency.length;count++){
    		if(count ==10){
    			System.out.printf("%5d :" ,100);
    		}else{
    			System.out.printf("%02d-%02d :",count * 10 ,count * 10 + 9);
    		}
    		
    		for(int stars = 0; stars< frequency[count];stars++ ){
    			System.out.print("*");
    			
    		}
    		
    		System.out.println("");
    	}
    }
    
    public void outputGrades(){
    	
    	System.out.println("The grades is:\n");
    	
    	for(int studant = 0 ; studant < grades.length; studant++){
		System.out.printf("Student %2d :%3d\n",studant+1,grades[studant]);
    	}
    }
}