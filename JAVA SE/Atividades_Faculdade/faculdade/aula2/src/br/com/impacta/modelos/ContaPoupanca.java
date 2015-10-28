package br.com.impacta.modelos;

public class ContaPoupanca extends Conta{

	
	public ContaPoupanca(){
		
	}
	
	
	public ContaPoupanca(Integer numero,String dono,Double saldo,Double limite){
		super(numero, dono, saldo, limite);
	}
	

	public void atualiza(Double taxa){
		
		this.setSaldo( this.getSaldo()+(this.getSaldo() * (taxa * 3)));
	}
}


  