package br.com.impacta.modelos;


public class Funcionario {
	
	private String nome;
	private String departamento;
	private Double salario;
	private Data dataEntrada;
	private String rg;
	private int identificador;
	
	
	private static int incluiIdentificador;
	
	
	public Funcionario(){
		
	}
	
	public Funcionario(String nome,String departamento,Double salario,Data dataEntrada,String rg){
		
		super();
		setNome(nome);
		setDepartamento(departamento);
		setSalario(salario);
		setDataEntrada(dataEntrada);
		setRg(rg);
		setIncluiIdentificador(getIncluiIdentificador()+1);
		setIdentificador(getIncluiIdentificador());
		
	}
	
	public Funcionario(String nome,String departamento,String salario,Data dataEntrada,String rg){
		
		super();
		setNome(nome);
		setDepartamento(departamento);
		setSalario(Double.parseDouble(salario));
		setDataEntrada(dataEntrada);
		setRg(rg);
		setIdentificador(getIdentificador()+1);
	}
	

	public void recebeAumento(Double value){
		
		setSalario(getSalario() +  value);
	}

	public Double calculoGanhoAumento(){
		
		return getSalario() * 12;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
	
		return String.format("Funcionário : \n Nome: %3s \n Departamento: %3s \n Salário:%3s"
				+ " \n DataEntrada:%3s \n Rg: %3s \n Identificador:%3d  \n\n",
				getNome(),getDepartamento(),getSalario(),getDataEntrada(),getRg(),getIdentificador());
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getNome() {
		return nome;
	}


	public String getDepartamento() {
		return departamento;
	}


	public Double getSalario() {
		return salario;
	}


	public Data getDataEntrada() {
		return dataEntrada;
	}


	public String getRg() {
		return rg;
	}
	
	
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	private static int getIncluiIdentificador() {
		return incluiIdentificador;
	}

	private static void setIncluiIdentificador(int incluiIdentificador) {
		Funcionario.incluiIdentificador = incluiIdentificador;
	}
	
	

}
