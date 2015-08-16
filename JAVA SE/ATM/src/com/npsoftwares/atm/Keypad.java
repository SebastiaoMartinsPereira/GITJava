package com.npsoftwares.atm;

import java.util.Scanner;

public class Keypad {

    Scanner input;  //lê os dados na linha de comando
	
	public Keypad()
	{
		input = new Scanner(System.in);
	}
	
	public int getInput(){
		return input.nextInt();
	}
	
	public String getInputString(){
		return input.nextLine();
	}
    
	public double getInputDouble(){
		return input.nextDouble();
	}

}
