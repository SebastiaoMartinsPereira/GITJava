package com.npsoftwares.conta;

import javax.swing.JOptionPane;


public class Conta {
	
	private int nConta;
	private double salInicial,gastosMes,crAdd,limCredito,saldoAtual;

	
	public Conta(int nConta,double salInicial,double limCredito) {
		
		setnConta(nConta);
		setSalIncial(salInicial);
		setLimCredito(limCredito);
	}


	/**
	  * Acrescentar valor  de creditos até no máximo o valor do limite de crédito que possui o cliente.
	  * 
	  * @param valoracrescentar   valor que será adicionado ao saldo existente.
	  * @return            Caso o valor que esta tentando adicionar seja maior que o seu limite recebera uma mensagem informativa.
	  * @author            Sebastião Martins

	  */
	protected void AddCredito(double valoracrescentar){
		
		if((getSalIncial()+valoracrescentar)<= getLimCredito()){
			setCrTotal(getCrTotal()+valoracrescentar);
		}
		else
		{
			Mensagem1("O valor que está tentando acrescentar é maior que o limite de crédito do cliente!!\n"
					+ "Caso nescessário solicite o aumento de limite com o seu gerente.");
		}
		
	}
	
	/**
	  * Efetua o debito do valor informado caso o cliente posua a quantidade necessária de saldo.
	  * 
	  * @param valordebitar   informe o valor que deseja debitar da conta do cliente.
	
	  * @author            Sebastião Martins
	  */
	protected void DebitarSaldo(double valorDebitar){
		
		AtualizaSaldo();
		
		if (valorDebitar > getSaldoAtual()){
			Mensagem1("Você não possui o saldo desejado!!!");
		}
		else
		{
			setGastosMes(getGastosMes()+ valorDebitar);
			AtualizaSaldo();
		}
	}
		
	protected String Mensagem1(String mensagem){
		
		JOptionPane.showMessageDialog(null,"" + mensagem);
		return null;
	}

	/**
	  * Atualiza o valor do saldo e/ou retorna a informação an tela
	  * 
	  * @param num   passar o valor um como parametro para poder visualizar o saldo.
	  * @return      verdadeiro se o movimento é válido ou falso se inválido
	  * @author      Sebastião Martins

	  */
	protected void AtualizaSaldo(){
		
		double saldo=getSalIncial()+getCrTotal()-getGastosMes();
		
		setSaldoAtual(saldo);
	}
	
	protected void AtualizaSaldo(int num){
		
		setSaldoAtual(this.salInicial+this.crAdd-this.gastosMes);
		
		if (num==1){
			JOptionPane.showMessageDialog(null, "Saldo atual:" +getSaldoAtual());	
		}
		
	}
	
	
	public int getnConta() {
		return nConta;
	}


	public void setnConta(int nConta) {
		this.nConta = nConta;
	}


	public double getSalIncial() {
		return salInicial;
	}


	public void setSalIncial(double salIncial) {
		this.salInicial = salIncial;
	}


	public double getGastosMes() {
		return gastosMes;
	}


	public void setGastosMes(double gastosMes) {
		this.gastosMes = gastosMes;
	}


	public double getCrTotal() {
		return crAdd;
	}


	public void setCrTotal(double crAdd) {
		this.crAdd = crAdd;
	}


	public double getLimCredito() {
		return limCredito;
	}


	public void setLimCredito(double limCredito) {
		this.limCredito = limCredito;
	}


	public double getSaldoAtual() {
		return saldoAtual;
	}


	public void setSaldoAtual(double newSaldo) {
		this.saldoAtual = newSaldo;
	}

}
