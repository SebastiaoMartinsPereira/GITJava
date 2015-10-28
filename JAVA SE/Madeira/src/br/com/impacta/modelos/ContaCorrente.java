package br.com.impacta.modelos;

import br.com.impacta.modelos.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(){
		
	}	
	
	public ContaCorrente(Integer numero ,String dono,Double saldo,Double limite){
		super(numero, dono, saldo, limite);
	}
	
	@Override
	public void atualiza(Double taxa){
		
		this.setSaldo(this.getSaldo()+(this.getSaldo() * (taxa * 2)));
	}
	
	@Override
	public void deposita(Double money){
		if(money > 0.10){
			this.setSaldo(this.getSaldo() + (money-0.10));
		}else{
			System.out.println("valor insuficiente para cobrir a taxa de depósito");
		}
	}

	public double calculaTributos() {
		// TODO Auto-generated method stub
		return this.getSaldo() * 0.01;
	}
	
}
