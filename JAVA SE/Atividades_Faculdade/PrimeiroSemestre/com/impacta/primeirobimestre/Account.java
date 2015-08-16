package com.impacta.primeirobimestre;

public class Account {
	
	private  double balance = 0.0;
	
	public Account(double inicialbalance){
			
		//valida que o valor informado é maior que zero
		if (inicialbalance>0){
			//atribui o valor digitado ao balance
			balance = inicialbalance;	
		}else{
			balance = 0;
		}
	}

	public void Credit(double amount){
		
		balance = balance+amount; //add quantia ao saldoo existente
		
	}
    
	public double getBalance(){
		
		return balance; //informa o valor existente de saldo ao ser chamado
	}
}
