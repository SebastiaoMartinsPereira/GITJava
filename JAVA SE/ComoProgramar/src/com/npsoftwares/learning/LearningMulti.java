package com.npsoftwares.learning;

import java.util.Random;
import java.util.Scanner;

public class LearningMulti {

	private static Random rand = new Random();
	private static Scanner scan = new Scanner(System.in);
	private static int inicioRange, fimRange, tipoCalculo;

	// Contrutor da classe
	public LearningMulti() {
	}

	// Seta o intervalo para os calculos que serão mostrados ao usuário de
	// acordo com o nível escolhido.
	public static void geraNivelJogo() {
		// Seleciona o nível do jogo
		switch (nivelJogo()) {
		case 1: // calculos serão gerados entre a tabuada de 1 e 10
			setInicioRange(1);
			setFimRange(10);
			break;
		case 2: // calculos serão gerados entre a tabuada de 11 e 20
			setInicioRange(10);
			setFimRange(20);
			break;
		case 3: // calculos serão gerados entre a tabuada de 21 e 30
			setInicioRange(20);
			setFimRange(30);
			break;
		default: // calculos serão gerados entre a tabuada de 1 e 10 caso o
					// usuário informe um número inválido
			setInicioRange(1);
			setFimRange(10);
		}

	}

	// Gera uma pergunta para escolha do nível a ser jogado!!!
	public static int nivelJogo() {

		System.out.println("Escolha o nível :\n"
				+ "Nível-1 calculos entre  1x1 e 10x10\n"
				+ "Nível-2 calculos entre 11x1 e 20x10\n"
				+ "Nível-2 calculos entre 21x1 e 30X10\n");
		int nivel = scan.nextInt();
		scan.reset();

		return nivel;// retorna o ível escolhido

	}

	// Pergunta ao Usuário que tipo de calculo ele deseja realizar.
	public static void selecionarTipoCalculo() {

		System.out.println("Escolha o tipo aritmético que será utilizado :\n");
		System.out.println("1-Soma\n" + "2-Subtração\n" + "3-Multiplicão\n"
				+ "4-Divisão\n" + "5-Aleatório\n");

		int selecao = scan.nextInt();
		scan.reset();

		LearningMulti.setTipoCalculo(selecao);// seta o tipo de calculo a ser
												// usado na rodada
	}

	// Faz a seleção do sinal aritmetico
	public static String selecaoAritmetica(int selecao) {

		String sinal = "";

		switch (selecao) {
		case 1:
			sinal = "+";
			break;
		case 2:
			sinal = "-";
			break;
		case 3:
			sinal = "*";
			break;
		case 4:
			sinal = "/";
			break;
		case 5: // caso receba o 5 como valor de parametro vai gerar um sinal
				// aleatório entre (+ , - , * , /)

			switch (geraInt(1, 4)) {
			case 1:
				sinal = "+";
				break;
			case 2:
				sinal = "-";
				break;
			case 3:
				sinal = "*";
				break;
			case 4:
				sinal = "/";
				break;
			}
			break;
		}

		return sinal;
	}

	// Realiza a pergunta ao aluno!!
	public static boolean realizaPergunta() {

		int base, expo;
		double resp;
		boolean retorno = false;
		String sinal;
		base = geraInt(getInicioRange(), getFimRange());
		expo = geraInt(1, 10);
		sinal = selecaoAritmetica(getTipoCalculo());

		// mensagem com a pergunta
		System.out.printf("Quanto é %d %s %d\n resposta = ", base, sinal, expo);
		resp = scan.nextDouble(); // captura a resposta do aluno

		if (resp == realizaCalc(base, expo, sinal)) {
			// mostra um mensagem de parabéns
			System.out.println(geraResposta(true) + "\n");
			retorno = true;
		} else {
			// mostra um mensagem informando o erro.
			System.out.println(geraResposta(false) + "\n");
		}
		scan.reset();
		return retorno;

	}

	// Gerador de respostas
	private static String geraResposta(boolean tipo) {
		String resposta = "";

		if (tipo == false) { // escolhe ums das respostas possitivas para ser
								// mostrada ao usuário
			resposta = respNegativas(geraInt(1, 10));
		} else { // escolhe ums das respostas negativas para ser mostrada ao
					// usuário.
			resposta = respPositiva(geraInt(1, 10));
		}

		return resposta;
	}

	// possíveis resposta negativas a serem selecionadas
	private static String respNegativas(int choice) {

		String resp = null;

		switch (choice) {

		case 1:
			resp = "Resposta errada, vamos tentar novamente!!";
			break;
		case 2:
			resp = "Quase, quem sabe na próxima!!";
			break;
		case 3:
			resp = "Humm, vamos mais uma vez.";
			break;
		case 4:
			resp = "Errado!!!.";
			break;
		case 5:
			resp = "Vamos mais una vez.";
			break;
		case 6:
			resp = "Passou bem perto!";
			break;
		case 7:
			resp = "Quase!!";
			break;
		case 8:
			resp = "Hum, está precisando se esforçar mais um pouco.";
			break;
		case 9:
			resp = "Nescessita de um pouco mais de atenção";
			break;
		default:
			resp = "Mais um pouco estará muito bem.";
		}

		return resp;
	}

	// Possíveis respostas positivas a serem selecionadas
	private static String respPositiva(int choice) {

		String resp = null;

		switch (choice) {

		case 1:
			resp = "Parabéns!!";
			break;
		case 2:
			resp = "Nossa, você está muito bom com calculos!";
			break;
		case 3:
			resp = "Isso, parabéns!";
			break;
		case 4:
			resp = "Ótimo!";
			break;
		case 5:
			resp = "Acertou!!!";
			break;
		case 6:
			resp = "Muito bom acertou novamente!!";
			break;
		case 7:
			resp = "Maravilha!!";
			break;
		case 8:
			resp = "Que bom você realmente estudou!!";
			break;
		case 9:
			resp = "Como todas as outras vezes está de parabéns!";
			break;
		default:
			resp = "Ótimo, assistiu todas as aulas direitinho!";
		}

		return resp;

	}

	// realiza o cálculo da porcentagem entre erros e acertos.
	public static void geraCalculo(int acertos, int base) {
		// realiza o calculo
		double percentual = (((double) acertos / base) * 100);

		// mostra uma messagem ao usuário
		System.out.printf("Acertos = %d\n" + "Erros = %d\n"
				+ "Percentual de acertos = %.0f%%\n", acertos, base - acertos,
				percentual);

		if (percentual > 75) {
			System.out
					.println("Parabéns, você esta pronto para avançar ao próximo nível!");
		} else {
			System.out.println("Vai ser nescessário estudar mais um  pouco!");
		}

	}

	// gera um numero inteiro positivo entre um e dez.
	private static int geraInt(int inicioRange, int fimRange) {
		int num = inicioRange + rand.nextInt(fimRange);
		return num;
	}

	// realiza a multiplicação entre dois numeros inteiros
	private static double realizaCalc(int num1, int num2, String sinal) {

		double calc = 0.0;

		switch (sinal) {
		case "+":
			calc = (double) num1 + num2;
			break;
		case "-":
			calc = (double) num1 - num2;
			break;
		case "*":
			calc = (double) num1 * num2;
			break;
		case "/":
			calc = (double) num1 / num2;
			break;
		}

		return calc;
	}

	public static int getTipoCalculo() {
		return tipoCalculo;
	}

	public static void setTipoCalculo(int selecao) {
		LearningMulti.tipoCalculo = selecao;
	}

	public static int getInicioRange() {
		return inicioRange;
	}

	public static void setInicioRange(int inicioRange) {
		LearningMulti.inicioRange = inicioRange;
	}

	public static int getFimRange() {
		return fimRange;
	}

	public static void setFimRange(int fimRange) {
		LearningMulti.fimRange = fimRange;
	}

}
