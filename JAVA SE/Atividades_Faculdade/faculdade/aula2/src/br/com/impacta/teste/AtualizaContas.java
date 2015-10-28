package br.com.impacta.teste;

import java.util.ArrayList;

import br.com.impacta.modelos.Conta;

public class AtualizaContas {

	private ArrayList<Conta> listOfContas;
	private Double valorGerenciado;
	private Double valorTotalGerenciado;
	
	public AtualizaContas(){
		this.setValorTotalGerenciado(0.);
	}
	
	public AtualizaContas(ArrayList<Conta> listaContas){
		this.valorGerenciado=0.;
		this.setValorTotalGerenciado(0.);
		this.setListOfContas(listaContas);
		
	}
	
	public String atualizarGerarRelatorio(Double taxa){
		
		double saldoAnterior=0.;
		String mensagem="";
 		
		for (Conta conta : listOfContas) {
			saldoAnterior = conta.getSaldo();
			conta.atualiza(taxa);
			mensagem += String.format("Conta do Senhor %s:\n Saldo anterior a atualizacao %5.2f \n Saldo após atualização %5.2f\n\n"
					, conta.getDono(),saldoAnterior,conta.getSaldo());
			this.setValorTotalGerenciado(this.getValorTotalGerenciado() + (conta.getSaldo()));
			this.setValorGerenciado(this.getValorGerenciado() + (conta.getSaldo() - saldoAnterior));
		}
		
		
		mensagem+= String.format("\n\nO valor em atualizações foi %5.2f\n\nO valor total gerenciado foi %7.2f", this.getValorGerenciado(),this.getValorTotalGerenciado());
		
		return mensagem;
				
	}

	public String atualizarGerarRelatorio(Conta c,Double taxa){
			
			double saldoAnterior=0.;
			
			String mensagem="";
	 		
				saldoAnterior = c.getSaldo();
				
				c.atualiza(taxa);
				
				mensagem += String.format("Conta do Senhor %s:\n Saldo anterior a atualizacao %5.2f \n Saldo após atualização %5.2f\n\n"
						, c.getDono(),saldoAnterior,c.getSaldo());
				this.setValorTotalGerenciado(this.getValorGerenciado() + (c.getSaldo()));
				this.setValorGerenciado(this.getValorGerenciado() + (c.getSaldo() - saldoAnterior));

			return mensagem;
					
	}

	 
	public ArrayList<Conta> getListOfContas() {
		return listOfContas;
	}

	public void setListOfContas(ArrayList<Conta> listOfContas) {
		this.listOfContas = listOfContas;
	}

	public Double getValorGerenciado() {
		return valorGerenciado;
	}

	public void setValorGerenciado(Double valorGerenciado) {
		this.valorGerenciado = valorGerenciado;
	}

	public Double getValorTotalGerenciado() {
		return valorTotalGerenciado;
	}

	public void setValorTotalGerenciado(Double valorTotalGerenciado) {
		this.valorTotalGerenciado = valorTotalGerenciado;
	}
	
	
}
