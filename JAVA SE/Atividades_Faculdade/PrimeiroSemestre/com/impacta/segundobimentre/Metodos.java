package com.impacta.segundobimentre;

import java.util.Scanner;

public class Metodos {

	// Objeto Scanner criado e utilizado em todas as atividades para receber
	// entrada de dados do usu�rio.
	final static Scanner scan = new Scanner(System.in);

	// M�todo principal utlizado para iniciar o programa
	// � utilizado para que o usu�rio escolhar qual atividade ele ir� executar;
	public static void listaAtividades() {

		// apenas inicializa a vari�vel.
		int atividade = 0; // utilizada para armazenar o numero do exerc�cio
							// escolhdo pelo usu�rio.

		// Mensagem para escolha da atividade.
		// Onde o usu�rio dever� informar com um numero qual atividade ele ir�
		// executar;
		System.out.println("Escolha a atividade a ser realizada: ");
		System.out.println();// apenas para pular uma linha...
		System.out.println("1 - Contagem de divisores: ");
		System.out.println("2 - Verificar se um n�mero � primo ");
		System.out.println("3 - Verificar se um n�mero � DIVPRIMO: ");
		System.out.println("4 - Verificar se o ano � Bissexto: ");
		System.out
				.println("5 - Informa em que dia da semana ir� cair uma data informada:");
		System.out
				.println("6 - Informa quantos dias tem um m�s informado pelo usu�rio:");
		System.out
				.println("7 - Informa em que dia ca semana cai um data informada por (dia/mes/ano):");
		System.out.println();

		// recebe o n�mero que o usu�rio ir� informar.
		atividade = scan.nextInt();

		// chamada do m�todo que executa a atividade escolhida pelo usu�rio
		// passando como par�metro o n�mero da atividad que foi escolhida pelo
		// usu�rio.
		escolhaExercicios(atividade);

	}

	// este m�todo recebe o numero da atividade escolhida pelo usu�rio
	// a atrav�s de um case executa a atividade informada;
	public static void escolhaExercicios(int atividade) {

		int num;// utilizada em todo o m�todo para receber numeros informados
				// pelo usu�rio;
		int qtdDivisores;// Vari�vel utilizada para armazenar a quantidade de
							// divisores @@@@Utilizadas nas atividades (1,2,3)
		int divPrimo;
		int dia;
		int diaSemana;
		int mes;
		int ano;

		switch (atividade) {

		case 1: // Atividade n�mero 1-Contagem de divisores

			// Utilizo o m�todo para capturar um n�mero inteiro informado pelo
			// usu�rio.
			num = Metodos
					.capturaINT("Digite um n�mero para saber quantos divisores ele tem:");

			// esta variavel armazena o retorno do m�todo
			// que � a quantidade de divisores do n��umero informado pelo
			// usu�rio.
			qtdDivisores = Metodos.contaDivisores(num);// passo o n�mero
														// informado pelo
														// usu�rio para o m�todo
														// que faz a contagem de
														// divisores.

			// Mostra uma mensagem ao usu�rio informando quantos divisores tem o
			// n�mero informado.
			System.out.printf("O numero %d tem %d divisores.", num,
					qtdDivisores);
			break;

		case 2: // Atividade 2-Veriicar se um n�mero � primo.

			// Utilizo o m�todo para capturar um n�mero inteiro informado pelo
			// usu�rio.
			num = Metodos
					.capturaINT("Digite um n�mero para saber se ele � primo:");

			// esta variavel armazena o retorno do m�todo
			// que � a quantidade de divisores do n�mero informado pelo usu�rio.
			qtdDivisores = Metodos.contaDivisores(num);// passo o n�mero
														// informado pelo
														// usu�rio para o m�todo
														// que faz a contagem de
														// divisores.

			// Se a quantidade de divisores do n�mero informado for maior que
			// dois o n�mero n�o � primo.
			// caso seja menor ou igual o numero � primo.
			// ap�os a verifica��o dentro do bloco do if � apresentada uma
			// mensagem ao usu�rio.
			if (qtdDivisores > 2) {
				System.out.printf(
						"O retorno � %d pois o n�mero %d n�o � primo:", 1, num);
			} else {
				System.out.printf("O retorno � %d pois o n�mero %d � primo:",
						0, num);
			}

			break;
		case 3: // Atividade - 3 - Verificar se um n�mero � DIVPRIMO:

			// Utilizo o m�todo para capturar um n�mero inteiro informado pelo
			// usu�rio.
			num = Metodos
					.capturaINT("Digite um n�mero para saber se ele � DIVPRIMO "
							+ "\nOu digite 0 para sair:");

			// entro no corpo do while para executar a verifica��o.
			do {

				// 1� PASSO
				// passo o n�mero que foi informado pelo usu�rio para verificar
				// quantos divisores tem este n�mero
				// o retorno do m�todo ser� a quantidade de divisores.
				// Armazeno o retono na vari�vel qtdDivisores
				qtdDivisores = Metodos.contaDivisores(num);

				// 2� Passo
				// Agora verifico quantos divisores tem o n�mero obtido no passo
				// 1
				// e armazeno o valor na vari�vel divPrimo que serr� testada no
				// proximo passo.
				divPrimo = Metodos.contaDivisores(qtdDivisores);

				// 3� Passo
				// � feita a verifica��o para saber se o n�mero
				// � primo ou n�o
				// � ap�s a verifica��o mostra uma mensagem ao usu�rio.
				if (divPrimo > 2) {
					System.out
							.printf("O n�mero %d n�o � DIVPRIMO pois tem %d divisores e %d n�o � primo \n\n",
									num, qtdDivisores, qtdDivisores);
				} else {
					System.out
							.printf("O num %d � DIVPRIMO pois tem %d divisores e %d � primo\n\n",
									num, qtdDivisores, qtdDivisores);
				}

				// /Pergunta ao usu�rio que ele quer verificar mais um n�mero.
				num = Metodos
						.capturaINT("Digite um n�mero para saber se ele � DIVPRIMO "
								+ "\nOu digite 0 para sair:");

			} while (num != 0);

			System.out.println("Saiu!!");

			break;
		case 4: // Atividade 4 - Verificar se o ano � Bissexto:

			num = Metodos
					.capturaINT("Digite um ano maior que 1582 para saber se ele � Bissexto:");

			do {

				// passo o n�mero informado pelo usu�rio como parametro no
				// m�todo isBissexto
				// que ir� verificar se � ou n�o Bissexto e mostra uma messagem
				// ao usu�rio.
				if (isBissexto(num)) {
					System.out.printf("O ano %d � bissexto.\n\n", num);
				} else {
					System.out.printf("O ano %d n�o � bissexto.\n\n", num);
				}

				// Pergunta se o usu�rio quer verificar outro ano.
				num = Metodos
						.capturaINT("Digite um ano maior que 1582 para saber se ele � Bissexto:"
								+ "\nOu digite 0 para sair:");

			} while (num != 0);

			System.out.println("Saiu!!");

			break;
			
		case 5: // Aticvidade 5 - Informa em que dia da semana ir� cair uma data
				// informada:

			// Armazeno o dia informado pelo usu�rio
			dia = Metodos.capturaINT("Digite o dia do m�s:");

			// armazeno o dia da semana que iniciou o m�s, representado por um
			// n�mero de (0 a 6).
			diaSemana = Metodos.capturaINT("Digite o dia da semana que caiu o primeiro dia do m�s:"
							+ "\n 0-Domingo"
							+ "\n 1-Segunda-Feira"
							+ "\n 2-Ter�a-Feira"
							+ "\n 3-Quarta-Feira"
							+ "\n 4-Quinta-Feira"
							+ "\n 5-Sexta-Feira"
							+ "\n 6-S�bado \n");

			// Passo os valores informados com par�metro para o m�todo
			// que far� todas as verifica��es para determinar em que dia da
			// semana ir� cair o dia informado
			String diaCair = Metodos.diaSemana(dia, diaSemana);

			// Mensagem ao usu�rio.
			System.out.println(" O dia cai na(o) " + diaCair);

			break;

		case 6: // Atividade - 6 - Informa quantos dias tem um m�s informado
				// pelo usu�rio:

			// Armazena o m�s informado
			mes = Metodos.capturaINT("Digite o M�s");

			// Armazena o ano informado.
			ano = Metodos.capturaINT("Digite o Ano");

			// Passo como par�metro para o m�todo o mes e o ano informado pelo
			// usu�rio
			// este m�todo ir� verificar quantos dias teve o m�s
			// e armazena na vari�vel qtdDias
			int qtdDias = Metodos.qtdDias(mes, ano);

			// Mensagem ao usu�rio.
			System.out.printf("Quantidade de dias %d", qtdDias);

			break;

		case 7: // Atividade - 7 - Informa em que dia da semana cai um data
				// informada por (dia/mes/ano):

			// Armazena o dia o mes e o ano informado pelo usu�rio.
			dia = Metodos.capturaINT("Digite o dia");
			mes = Metodos.capturaINT("Digite o m�s");
			ano = Metodos.capturaINT("Digite o ano");

			// Passo os dados informado pelo usu�rio para o m�todo que ir� fazer
			// a varifica��o.
			diaCair = Metodos.dataDiaInformado(dia, mes, ano);

			System.out.println("O dia foi :" + diaCair);
			
			break;
		}

	}

	// /BLOCO DE M�TODOS

	// Captura um numero inteiro
	public static int capturaINT(String mensagem) {

		// Mostra a mensagem que foi passada como par�metro
		System.out.print(mensagem+" ");

		// captura o numero informado pelo usu�rio
		// e retorna o n�mero digitado
		int num = scan.nextInt();
		return num;
	}

	// Captura um numero Double
	public static double capturaDouble(String mensagem) {

		// Mostra a mensagem que foi passada como par�metro
		System.out.println(mensagem);

		// captura o numero informado pelo usu�rio
		// e retorna o n�mero digitado
		Double num = scan.nextDouble();
		return num;
	}

	// Conta quantos divisores tem o numero passado como parametro
	public static int contaDivisores(int num) {

		// inicializa as vari�veis
		int i = 1;
		int qtdDivisores = 0;

		while (i <= num) {

			// se o n�mero informado for divis�vel pelo numero que esta contido
			// em i durante o loop
			// a vari�vel qtdDivisores recebe + 1;
			if (num % i == 0) {
				qtdDivisores++;
			}

			i++;
		}
		// Retorna a quantidade de divisores do n�mero informado
		return qtdDivisores;
	}

	// Verifica se um ano informado � bissexto
	public static boolean isBissexto(int ano) {

		boolean bissexto;

		// Se o ano informado for Divis�vel por 4 ele j� � um ano bissexto.
		if (ano % 4 == 0) {

			// Se o ano for divis�vel por 4 e tamb�m for divis�vel por 100 ent�o
			// � nescess�rio fazer mais uma verifica��o
			// para garantir que ele sej� Bissexto
			if (ano % 4 == 0 && ano % 100 == 0) {

				// Para garantir que o n�mero � bissexto ele tamb�m deve ser
				// divis�vel por 400
				// Caso contr�rio o ano n�o ser� bissexto.
				if (ano % 400 == 0) {
					bissexto = true;
				} else {
					bissexto = false;
				}

			} else { // se o ano n�o for divisivel por 4 e por 100 ao mesmo
						// tempo ele � um ano bissexto.

				bissexto = true;
			}

		} else { // Se n�o for divis�vel por 4 ele n�o � bissexto

			bissexto = false;
		}

		// Retorna verdadeiro ou falso para o chamado do m�todo.
		return bissexto;
	}

	// Verifica em que dia da semana ir� cair uma dia informado pelo usu�rio
	// passando o dia que ele quer verificar e o dia da semana em que o m�s iniciou
	public static String diaSemana(int dia, int diaSemana) {

		int diaCair;
		
		String diaProdurado = null;
         
		//Calculo para verificar o dia da semana a ser mostrado.
		diaCair = ((diaSemana + dia) % 7) - 1;

		switch (diaCair) {

		case 0:
			diaProdurado = "Domingo";
			break;
		case 1:
			diaProdurado = "Segunda-Feira";
			break;
		case 2:
			diaProdurado = "Terca-Feira";
			break;
		case 3:
			diaProdurado = "Quarta-Feira";
			break;
		case 4:
			diaProdurado = "Quinta-Feira";
			break;
		case 5:
			diaProdurado = "Sexta-Feira";
			break;
		case 6:
			diaProdurado = "S�bado";
			break;

		default:
			break;
		}

		return diaProdurado;

	}

	//m�todo que verifica quantos dias tem o m�s solicitado pelo usu�rio.
	public static int qtdDias(int mes, int ano) {

		int qtdDias = 0;

		
		switch (mes) {

		case 1:
			qtdDias = 31;
			break;
		case 2:
            //Verifico se o ano informado pelo usu�rio � um ano bissexto.
			if (Metodos.isBissexto(ano)) {
				qtdDias = 29;
			} else {
				qtdDias = 28;
			}
			break;
			
		case 3:
			qtdDias = 31;
			break;
		case 4:
			qtdDias = 30;
			break;
		case 5:
			qtdDias = 31;
			break;
		case 6:
			qtdDias = 30;
			break;
		case 7:
			qtdDias = 31;
			break;
		case 8:
			qtdDias = 31;
			break;
		case 9:
			qtdDias = 30;
			break;
		case 10:
			qtdDias = 31;
			break;
		case 11:
			qtdDias = 30;
			break;
		case 12:
			qtdDias = 31;
			break;

		default:
			break;
		}

		return qtdDias;
	}

	
	//m�todo que informa ao usu�rio em que dia da semana caiu o caira 
	//a data ser� fornecida pelo usu�rio com(dia,mes,ano)
	public static String dataDiaInformado(int dia, int mes, int ano) {

		
		int totalDias = (int) (dia + (int) (mes * 30) + (ano * 365));
		int diaSemana = (totalDias + 1) % 7;
		String diaselecionado = null;

		switch (diaSemana) {

		case 0:
			diaselecionado = "Segunda-Feira";
			break;
		case 1:
			diaselecionado = "Terca-Feira";
			break;
		case 2:
			diaselecionado = "Quarta-Feira";
			break;
		case 3:
			diaselecionado = "Quinta-Feira";
			break;
		case 4:
			diaselecionado = "Sexta-Feira";
			break;
		case 5:
			diaselecionado = "S�bado";
			break;
		case 6:
			diaselecionado = "Domingo";
			break;

		default:
			break;
		}

		return diaselecionado;

	}

	// Recebe dois n�meros inteiros e calcula a potencia desses dois n�meros.
	public static int potencia(int base, int expoente) {

		int count = 0;
		int result = 1;

		while (count < expoente) {

			result = result * base;
			return result;

		}

		return result;
	}

}
