package com.ibm.btp.instantiation;

import java.util.Scanner;
public class InstantiationTest {

	public static void main(String[] args) {
		
		ClienteA clienteA1;    		
		clienteA1=new ClienteA();
		ClienteC clic =  new ClienteC();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("");
		
	   // clienteA1.setName(scan.nextLine());
		System.out.println(clienteA1.getName()); 
		System.out.println(clienteA1.toString()); 
		System.out.println(clic.toString());
	}
}
