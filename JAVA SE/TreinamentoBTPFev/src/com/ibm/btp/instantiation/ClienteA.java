package com.ibm.btp.instantiation;

public class ClienteA {

	private String name;
	
	private String cpf;
	
	private double saldo;
	
	
	//construtor default ou padrão - nome da classe, sem tipo de retorno, sem parametros na chamada.
	//inicializa a classe
	 public ClienteA() {
		// TODO Auto-generated constructor stub
		this.name = "john doe";
		this.cpf = "000.000.000-00";
		this.saldo = 0.0;
	}
	
	//construtor nao padrao - diferenca é poder adicionar parametros. 
	//inicializa a classe
	public ClienteA(String name, String cpf, double saldo){
		//note o uso do this para acessar os atributos da classe e diferenciar dos parametros de mesmo nome
		this.name = name;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ClienteA [name=" + name + ", cpf=" + cpf + ", saldo=" + saldo
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
