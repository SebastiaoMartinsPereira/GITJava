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

	// Seta o intervalo para os calculos que ser�o mostrados ao usu�rio de
	// acordo com o n�vel escolhido.
	public static void geraNivelJogo() {
		// Seleciona o n�vel do jogo
		switch (nivelJogo()) {
		case 1: // calculos ser�o gerados entre a tabuada de 1 e 10
			setInicioRange(1);
			setFimRange(10);
			break;
		case 2: // calculos ser�o gerados entre a tabuada de 11 e 20
			setInicioRange(10);
			setFimRange(20);
			break;
		case 3: // calculos ser�o gerados entre a tabuada de 21 e 30
			setInicioRange(20);
			setFimRange(30);
			break;
		default: // calculos ser�o gerados entre a tabuada de 1 e 10 caso o
					// usu�rio informe um n�mero inv�lido
			setInicioRange(1);
			setFimRange(10);
		}

	}

	// Gera uma pergunta para escolha do n�vel a ser jogado!!!
	public static int nivelJogo() {

		System.out.println("Escolha o n�vel :\n"
				+ "N�vel-1 calculos entre  1x1 e 10x10\n"
				+ "N�vel-2 calculos entre 11x1 e 20x10\n"
				+ "N�vel-2 calculos entre 21x1 e 30X10\n");
		int nivel = scan.nextInt();
		scan.reset();

		return nivel;// retorna o �vel escolhido

	}

	// Pergunta ao Usu�rio que tipo de calculo ele deseja realizar.
	public static void selecionarTipoCalculo() {

		System.out.println("Escolha o tipo aritm�tico que ser� utilizado :\n");
		System.out.println("1-Soma\n" + "2-Subtra��o\n" + "3-Multiplic�o\n"
				+ "4-Divis�o\n" + "5-Aleat�rio\n");

		int selecao = scan.nextInt();
		scan.reset();

		LearningMulti.setTipoCalculo(selecao);// seta o tipo de calculo a ser
												// usado na rodada
	}

	// Faz a sele��o do sinal aritmetico
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
				// aleat�rio entre (+ , - , * , /)

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
		System.out.printf("Quanto � %d %s %d\n resposta = ", base, sinal, expo);
		resp = scan.nextDouble(); // captura a resposta do aluno

		if (resp == realizaCalc(base, expo, sinal)) {
			// mostra um mensagem de parab�ns
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
								// mostrada ao usu�rio
			resposta = respNegativas(geraInt(1, 10));
		} else { // escolhe ums das respostas negativas para ser mostrada ao
					// usu�rio.
			resposta = respPositiva(geraInt(1, 10));
		}

		return resposta;
	}

	// poss�veis resposta negativas a serem selecionadas
	private static String respNegativas(int choice) {

		String resp = null;

		switch (choice) {

		case 1:
			resp = "Resposta errada, vamos tentar novamente!!";
			break;
		case 2:
			resp = "Quase, quem sabe na pr�xima!!";
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
			resp = "Hum, est� precisando se esfor�ar mais um pouco.";
			break;
		case 9:
			resp = "Nescessita de um pouco mais de aten��o";
			break;
		default:
			resp = "Mais um pouco estar� muito bem.";
		}

		return resp;
	}

	// Poss�veis respostas positivas a serem selecionadas
	private static String respPositiva(int choice) {

		String resp = null;

		switch (choice) {

		case 1:
			resp = "Parab�ns!!";
			break;
		case 2:
			resp = "Nossa, voc� est� muito bom com calculos!";
			break;
		case 3:
			resp = "Isso, parab�ns!";
			break;
		case 4:
			resp = "�timo!";
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
			resp = "Que bom voc� realmente estudou!!";
			break;
		case 9:
			resp = "Como todas as outras vezes est� de parab�ns!";
			break;
		default:
			resp = "�timo, assistiu todas as aulas direitinho!";
		}

		return resp;

	}

	// realiza o c�lculo da porcentagem entre erros e acertos.
	public static void geraCalculo(int acertos, int base) {
		// realiza o calculo
		double percentual = (((double) acertos / base) * 100);

		// mostra uma messagem ao usu�rio
		System.out.printf("Acertos = %d\n" + "Erros = %d\n"
				+ "Percentual de acertos = %.0f%%\n", acertos, base - acertos,
				percentual);

		if (percentual > 75) {
			System.out
					.println("Parab�ns, voc� esta pronto para avan�ar ao pr�ximo n�vel!");
		} else {
			System.out.println("Vai ser nescess�rio estudar mais um  pouco!");
		}

	}

	// gera um numero inteiro positivo entre um e dez.
	private static int geraInt(int inicioRange, int fimRange) {
		int num = inicioRange + rand.nextInt(fimRange);
		return num;
	}

	// realiza a multiplica��o entre dois numeros inteiros
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
