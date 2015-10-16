package br.com.impacta.modelos;


public class Empresa {
	
	private String nome;
	private String cnpj;
	private int idade;
	private Funcionario[] funcionarios = new Funcionario[10];
	
	

	public Empresa(int lenListaFuncionario){
		
		this.setNome("Empresa do Tião");
		this.funcionarios = new Funcionario[lenListaFuncionario];
	}
	
	
	public Funcionario buscaFuncionarioPorIdentificador(int index)
	{
		for (Funcionario funcionario : this.funcionarios) {
			
			if(funcionario.getIdentificador() == index)
			{
				return funcionario;
			}
		}
		
		return null;
	}
	
	public Funcionario buscaFuncionarioEmLista(int index)
	{
		
		for(int i = 0; i < getFuncionarios().length;i++){
			
			if(getFuncionarios()[i].getIdentificador() == index)
			{
				return getFuncionarios()[i];
			}
		}
	
		return null;
	}
	
	
	public void addFuncionario(Funcionario[] func){
		
		int count =0;
	
		for(int i =0 ; i<func.length;i++ ){
			
			if(count >= this.funcionarios.length)
			{
                this.aumentarListaFuncionarios();
			}
			
			count++;
			this.funcionarios[i] = func[i];
		}
		
	}
	
	public void mostraSalariosFuncionario(String gato)
	{
		System.out.println("\n\n");
		
		for(int i = 0;i < this.funcionarios.length ; i++){
			if(this.funcionarios[i]==null){
				return;
			}
			System.out.println(String.format("Salário do %s é %s",funcionarios[i].getNome(),funcionarios[i].getSalario().toString()));
		}

	}
	
	public void mostraSalariosFuncionario()
	{
		System.out.println("");
		
		for (Funcionario funcionario : this.funcionarios) {
			if(funcionario == null){return;}
			System.out.println(funcionario.toString());
		}
		
	}
	
	public boolean eMeuEmpregado(Funcionario func){
		
		for(int i=0;i< getFuncionarios().length;i++){
			
			if(this.funcionarios[i].getRg() == func.getRg() ){
				return true;
			}
		}
		return false;
	}
	
	
	public void aumentarListaFuncionarios(){
		
		Funcionario[] newFuncs = new Funcionario[this.funcionarios.length * 2];
		
		for(int i = 0 ; i < this.funcionarios.length ;i++){
			newFuncs[i] = this.funcionarios[i];
		}
		
		this.funcionarios = null;
		this.funcionarios = newFuncs;
	}
	
	
	public String toString(){
		return cnpj;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}


	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}


	public String getNome() {
		return nome;
	}
	
	
}
