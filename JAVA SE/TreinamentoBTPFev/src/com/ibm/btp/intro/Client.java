package com.ibm.btp.intro;

/**
 * Classe que representa um cliente.
 * 
 * Vamos demonstrar a declaracao de atributos, de métodos getters e setters, construtores e mostrar como
 * sobrescrever os metodos equals(), hashcode() e toString() herdados da classe Object
 * 
 * Veja como instanciar essa classe e acessar seus parametros na classe HelloClient.java, do pacote
 * com.ibm.btp.intro
 * 
 * @author icampos
 *
 */
public class Client {

	/*
	 * Declarando atributos como privados: acesso somente dentro da classe, assim nenhum codigo externo pode 
	 * modificar os valores dos atributos indevidamente
	 */
	private String name;
	
	private String cpf;
	
	private double saldo;
	
	
	//construtor default ou padrão - nome da classe, sem tipo de retorno, sem parametros na chamada.
	//inicializa a classe
	public Client(){
		this.name = "john doe";
		this.cpf = "000.000.000-00";
		this.saldo = 0.0;
	}
	
	//construtor nao padrao - diferenca é poder adicionar parametros. 
	//inicializa a classe
	public Client(String name, String cpf, double saldo){
		//note o uso do this para acessar os atributos da classe e diferenciar dos parametros de mesmo nome
		this.name = name;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
    /*
    * Aqui temos uma lista de getters e setters, um para cada aributo
    * Getters - para que uma classe externa possa ler o valor do atributo privado
    * Setters - para que uma classe externa possa setar o valor do atributo privado: aqui nao colocamos regras pra isso,
    * mas podemos colocar regras para o setter so alterar o valor se ele for valido dentro do seu contexto
     */
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

	/*
	 * Toda classe herda da classe Object implicitamente (ver sobre: heranca).
	 * Toda classe vai ter, por causa disso, disponiveis os metodos da classe Object: 
	 *  hashcode() 
	 *  equals()
	 *  toString()
	 *  clone()
	 *  
	 * Mas precisamos sobrescrever esses metodos se quisermos que eles tenham o comportamento desejado para a nossa classe.
	 * Voce pode gerar esse codigo com o auxilio da IDE eclipse
	 */
	
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
		Client other = (Client) obj;
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
