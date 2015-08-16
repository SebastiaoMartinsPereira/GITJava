package com.ibm.btp.atividade;

import java.util.Date;

import javax.swing.JOptionPane;

public class Cliente {

	private String name,cpf,phone;	
	private double saldo;
	private int idade;
	
	Date date = new Date(System.currentTimeMillis());
	
	//Contrutores
	public Cliente(){
		this.name = "Sebastião Martins Pereira";
		this.cpf = "000.000.000-00";
		this.saldo = 0.0;
		this.idade= 26;
		this.phone = ("1146086451");
	}
    
	public Cliente(String name, String cpf, double saldo,String phone,int idade){
		setName(name);
		setCpf(cpf);
		setSaldo(saldo);
		setPhone(phone);
		setIdade(idade);
	}
	
	
	//Verifica os dados informados para o nome 
	// se forem válidos faz o set para o nome do cliente
	public boolean ChecksFullName(String name,String secondName){
		
		if(!name.equals("")&&(!secondName.equals(""))){
			this.name= name+" "+secondName;
			return true;
		}else{
			
			JOptionPane.showMessageDialog(null,"Nome ou Sobrenome informado é inválido, favor preencher corretamente");
			return false;
		}
		
		
	}
	
	//Verifica os dados informados para a idade 
	//se estiverem corretos faz o set na iadade do cliente.
	public boolean CheckAge(String age){
		
		boolean retorno=false;
		
		if(this.isNumeric(age)){//verifica se o valor informado é numerico
			
			int checkAge = Integer.parseInt(age);
			
			if(checkAge<=18 || checkAge >= 100){
				
				//Verifica se o valor informado está realmente correto
				if((JOptionPane.showConfirmDialog(null, "A idade informada foi : "+ checkAge 
						+"\n Está realmente correta?","alert!!",JOptionPane.YES_NO_OPTION)) == JOptionPane.YES_OPTION){
					this.setIdade(checkAge);
					return true;
				}else{
					retorno= false; 
				}

			}else{
				retorno = true;
			}
			
		}else{
			//caso o valor informado não seja numerico o usuário terá que informar novamente.
			JOptionPane.showMessageDialog(null, "Favor informar um valor numerico!!!","Alert",JOptionPane.WARNING_MESSAGE);
			retorno = false;
		}

		return retorno;
	}
	
    //verifica se um valor informado pode ser numerico	
	public boolean isNumeric(String age){
		
		try{
		   Integer.parseInt(age);
		   return true;
		}catch(NumberFormatException ex){
			return false;
		}
		
	}
	
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(saldo) != Double
				.doubleToLongBits(other.saldo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", cpf=" + cpf + ", saldo=" + saldo
				+ "]";
	}
	
	

}
