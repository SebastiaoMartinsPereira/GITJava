package com.ibm.btp.intro.loops;

import java.util.ArrayList;
import java.util.Random;

public class MediasAlunos {

	public static void main(String[] args) {

		int i = 0;
		Aluno aluno = new Aluno();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		do {

			System.out.println(alunos.size());
			// preenche dados do aluno.
			aluno.setNome("Aluno " + i);
			// Gera as notas que são serão passadas para cada aluno.
			aluno.setNotas(GerarNotas());
			// após todos os calculos serem feitos
			// o rsultado é exibido no console.
			aluno.exibirResultado();

			i++;

			// armazeena o objeto aluno em um arrayList
			alunos.add(aluno);

		} while (i < 10);

	}

	// Método utilizado para gerar notas eleatórias
	// e armazelas em um array.
	public static double[][] GerarNotas() {

		double[][] notasGeradas = new double[1][3];

		// Objeto random utilizado para gerar uma nota aleatória
		Random ram = new Random();

		for (int aluno = 0; aluno < notasGeradas.length; aluno++) {
			for (int notas = 0; notas < notasGeradas[aluno].length; notas++) {
				double nota = ram.nextInt(10);
				notasGeradas[aluno][notas] = nota;
			}
		}

		return notasGeradas;
	}

}
