package com.npsoftwares.time;

public class Employee {

	private String primeiroNome;
	private String ultimoNome;
	private Data aniversario;
	private Data contratacao;

	public Employee(String primeiroNome, String segundoNome, Data aniversario,Data contratacao) {
		this.setPrimeiroNome(primeiroNome);
		this.setUltimoNome(segundoNome);
		this.setAniversario(aniversario);
		this.setContratacao(contratacao);
	}

	public String toString() {
		return String.format("\n%s %s \nContratado %s  \naniversario %s",
				this.getPrimeiroNome(), this.getUltimoNome(),
				this.getContratacao(), this.getAniversario());
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public Data getAniversario() {
		return aniversario;
	}

	public void setAniversario(Data aniversario) {
		this.aniversario = aniversario;
	}

	public Data getContratacao() {
		return contratacao;
	}

	public void setContratacao(Data contratacao) {
		this.contratacao = contratacao;
	}

}
