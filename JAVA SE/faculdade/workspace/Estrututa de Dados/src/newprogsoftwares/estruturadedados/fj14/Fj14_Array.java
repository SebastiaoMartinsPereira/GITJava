package newprogsoftwares.estruturadedados.fj14;

public class Fj14_Array {

	private Object[] aluno;
	private int max = 100;
	private int contador;

	public Fj14_Array() {
		setAluno(new Object[100]);
		setContador(0);
	}

	public void adiciona(Aluno aluno) {

		if (!temEspaco()) {
			this.aumentalista();
		}

		this.getAluno()[getContador()] = aluno;
		this.contador++;
	}

	public void adiciona(Aluno aluno, int posicao) {

		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("A posição solicitada é inválida!");
		}
		
		if (!this.temEspaco())
			this.aumentalista();
			
			this.desalocarFrente(posicao);
			this.aluno[posicao] = aluno;
			this.contador++;
	}

	public void remover(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não possui valore.");
		}

		this.aluno[posicao] = null;

		this.desalocarTras(posicao);

		this.contador--;
	}

	public boolean contem(Aluno buscaLista) {

		for (Object aluno : this.getAluno()) {
			return (aluno.equals(buscaLista));
		}

		return false;
	}

	public int tamanho() {
		return this.contador;
	}

	public Boolean temEspaco() {
		return (this.contador - 1 < this.max);
	}

	private void aumentalista() {

		if (!temEspaco()) {

			Object[] alunoAux = new Aluno[this.contador + 50];
			this.max += 50;

			for (int i = 0; i < this.getAluno().length; i++) {
				alunoAux[i] = this.getAluno()[i];
			}

			this.setAluno(alunoAux);
		}

	}

	public Object buscar(int posicao) {
        	
		if (!this.posicaoOcupada(posicao))
			throw new IllegalArgumentException(
					"A posição solicitada não existe ou não está preenchida.");

		return aluno[posicao];

    }
    
	public Integer indexOf(Object obj){
		
		int i = 0;
		while(i < this.contador){
			if(obj.equals(this.aluno[i]))
				return i;
			i++;
		}
		
		return -1;
	}
	
	public int lastIndexOf(Object obj){
		
		int i = this.contador-1;
		while(i>0){
			if(obj.equals(this.aluno[i]))
				return i;
			i--;
		}
		
		return -1;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.contador;
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.contador;
	}

	private void desalocarFrente(int posicao) {
		for (int i = this.contador-1; i >= posicao; i--) {
			this.aluno[i + 1] = this.aluno[i];
		}
	}

	private void desalocarTras(int posicao) {
		for (int i = posicao; i < this.contador - 1; i++) {
			this.aluno[i] = this.aluno[i + 1];
		}
	}

	public int getContador() {
		return contador;
	}

	private void setContador(int contador) {
		this.contador = contador;
	}

	private Object[] getAluno() {
		return aluno;
	}

	private void setAluno(Object[] aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		for (int i = 0 ; i < this.contador-1; i++) {
			sb.append(String.format("%s ,",this.aluno[i].toString()));
		}
		
	    sb.append(String.format("%s ",this.aluno[this.contador-1].toString()));
	    sb.append("]");
		return sb.toString();
		
	};
	
}
