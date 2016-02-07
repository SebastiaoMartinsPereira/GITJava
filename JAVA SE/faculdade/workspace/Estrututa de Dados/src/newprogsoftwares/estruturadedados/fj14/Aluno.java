package newprogsoftwares.estruturadedados.fj14;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private int ra;
	private int idade;
	
	public Aluno()
	{
		
	}
	
	public Aluno(String nome,int ra,int idade){
		this.nome = nome;
		this.ra = idade;
		this.idade = ra;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getRa() {
		return this.ra;
	}
	
	public void setRa(int ra) {
		this.ra = ra;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String toString(){
		return this.nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Aluno)
		{
			return this.ra == ((Aluno) obj).getRa();
		}
		
		return false;
		
	}

	@Override
	public int compareTo(Aluno o) {

        if(this.getRa() < o.getRa()){
        	return -1;
        }else if(this.getRa() > o.getRa()){
        	return 1;
        }
        
		return 0;
	}
		
		
}

