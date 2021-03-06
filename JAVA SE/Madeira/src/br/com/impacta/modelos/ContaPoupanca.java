package br.com.impacta.modelos;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	
	public ContaPoupanca(){
		
	}
	
	
	public ContaPoupanca(Integer numero,String dono,Double saldo,Double limite){
		super(numero, dono, saldo, limite);
	}
	

	public void atualiza(Double taxa){
		
		this.setSaldo( this.getSaldo()+(this.getSaldo() * (taxa * 3)));
	}


//	@Override
//	public int compareTo(ContaPoupanca conta) {
//		
//		if(this.getNumero() < conta.getNumero())
//		{
//			return -1;
//		}
//		
//		if(this.getNumero() > conta.getNumero()){
//			return 1;
//		}
//		
//		return 0;
//		
//	}
	
	
	
	//altera��o para realizar a compra��o pelo nome do cliente.
	public int compareTo(ContaPoupanca conta) {
		
		return this.getDono().compareTo(conta.getDono());

	}
	
	
}


  