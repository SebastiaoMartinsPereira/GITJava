package com.ibm.btp.intro.hierarquia;

import com.ibm.btp.atividade.Cliente;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Cliente cli = new Cliente();
		Conta c1 = new ContaComun(200, 123, cli);
		Conta c2 = new ContaSpecial(200, 12334, cli, 200);
		
		boolean saqueComunOK= c1.sacar(100);
		boolean saqueEspecial = c2.sacar(500);
		
		
		if(saqueComunOK){
			System.out.println("Salco Conta comun " + c1.consultaSaldo());
			
		}else{
			System.out.println("Não foi possível sacar");
		}
		
		if(saqueEspecial){
			System.out.println("Salco Conta comun " + c2.consultaSaldo());
			
		}else{
			System.out.println("Não foi possível sacar");
		}
	}

}
