package com.ibm.btp.intro;

import java.util.Scanner;

public class LoopsTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//teste1(scan.nextInt());
		
		//teste2(scan.nextInt());
		
		teste3(scan.nextInt());

		scan.close();
	}
	

	public static void teste1(int i) {
		
		if (i == 1) {

			System.out.println("O numero informado foi :" + i);
		} else if (i == 2) {
			System.out.println("O numero informado foi :" + i);
		} else {
			System.out.println("O numero informado foi :" + i);
		}

	}
	

	public static void teste2(int i) {
         if (isEven(i)){
        	 System.out.println("O numero é par");
         }
         
         if(i>10){
        	 System.out.println("O numéro é maior que 10.");
         }
	}

	public static void teste3(int i){
		
		int j=0;
		
		while(j<i){
			System.out.println(++j);
		}
	}
	
	static boolean isEven(int i) {
		return (i % 2) == 0;
	}

}
