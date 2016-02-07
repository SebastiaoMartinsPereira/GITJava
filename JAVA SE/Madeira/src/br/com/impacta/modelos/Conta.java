package br.com.impacta.modelos;

public class Conta {

	private int numero;
	private String dono;
	private Double saldo;
	private Double limite;
	private Double deposita;
	
	
	public Conta() {
		super();
	}
	
	public Conta(int numero, String dono, double saldo, double limite) {
		super();
		this.numero = numero;
		this.dono = dono;
		this.saldo = saldo;
		this.limite = limite;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	public void sacar(double money){
		
		if(this.getSaldo() > money){
			this.saldo -= money;
		}else{
			System.out.println("Vai trabalhar!!");
		}
	}

    public void deposita(Double money){
    	
    	this.setSaldo(this.getSaldo() + money);
    }
	
    public void atualiza(Double taxa){
    	
    	this.setSaldo(this.getSaldo()+(this.getSaldo() * taxa));
    	
    }

	public int getNumero() {
		return numero;
    }
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Double getDeposita() {
		return deposita;
	}

	public void setDeposita(Double deposita) {
		this.deposita = deposita;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", dono=" + dono + ", saldo="
				+ saldo + ", limite=" + limite + ", deposita=" + deposita + "]";
	}

}
