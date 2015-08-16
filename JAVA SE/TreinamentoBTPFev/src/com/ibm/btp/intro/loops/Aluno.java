package com.ibm.btp.intro.loops;

public class Aluno {

	private String nome;
	private double[][] notas;
	private double media;
	String mensagem;

	public Aluno() {

	}

	public Aluno(String nome, double[][] notas) {

		this.setNome(nome);
		this.setNotas(notas);
	}

	// Calcula da m�dia do aluno
	private double CalcularMedia() {

		double media = (this.getNotas()[0][0] + this.getNotas()[0][1] + this
				.getNotas()[0][2]) / 3;

		this.setMedia(media);

		return media;
	}

	// Verifica se o aluno foi aprovado ou n�o
	// e seta a mensagem apropriada para ser apresentada durante a eecu��o do
	// programa.
	private Boolean isAprovado(double media) {

		boolean result = false;

		if (media > 7.0) {
			result = true;
			this.setMensagem("aluno aprovado!");
		} else if (media > 5.0) {
			result = false;
			this.setMensagem("Aluno ficou de exame!!");
		} else {
			result = false;
			this.setMensagem("Aluno reprovado!!");
		}

		return result;
	}

	// Exibe nome notas m�dia e resultado final.
	public void exibirResultado() {

		System.out.printf(" Aluno : %s \n", this.nome);
		CalcularMedia();
		System.out.printf(" Notas : %2.1f || %2.1f || %2.1f \n m�dia %2.1f \n",
				this.notas[0][0], this.notas[0][1], this.notas[0][2],
				this.media);
		this.isAprovado(this.media);
		System.out.printf(" " + this.mensagem + "\n\n\n");
	}

	// Se��o de gets e sets.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
