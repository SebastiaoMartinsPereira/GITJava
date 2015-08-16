package com.impacta.segundobimentre;

import java.util.Scanner;

public class Metodos {

	// Objeto Scanner criado e utilizado em todas as atividades para receber
	// entrada de dados do usuário.
	final static Scanner scan = new Scanner(System.in);

	// Método principal utlizado para iniciar o programa
	// é utilizado para que o usuário escolhar qual atividade ele irá executar;
	public static void listaAtividades() {

		// apenas inicializa a variável.
		int atividade = 0; // utilizada para armazenar o numero do exercício
							// escolhdo pelo usuário.

		// Mensagem para escolha da atividade.
		// Onde o usuário deverá informar com um numero qual atividade ele irá
		// executar;
		System.out.println("Escolha a atividade a ser realizada: ");
		System.out.println();// apenas para pular uma linha...
		System.out.println("1 - Contagem de divisores: ");
		System.out.println("2 - Verificar se um número é primo ");
		System.out.println("3 - Verificar se um número é DIVPRIMO: ");
		System.out.println("4 - Verificar se o ano é Bissexto: ");
		System.out
				.println("5 - Informa em que dia da semana irá cair uma data informada:");
		System.out
				.println("6 - Informa quantos dias tem um mês informado pelo usuário:");
		System.out
				.println("7 - Informa em que dia ca semana cai um data informada por (dia/mes/ano):");
		System.out.println();

		// recebe o número que o usuário irá informar.
		atividade = scan.nextInt();

		// chamada do método que executa a atividade escolhida pelo usuário
		// passando como parâmetro o número da atividad que foi escolhida pelo
		// usuário.
		escolhaExercicios(atividade);

	}

	// este método recebe o numero da atividade escolhida pelo usuário
	// a através de um case executa a atividade informada;
	public static void escolhaExercicios(int atividade) {

		int num;// utilizada em todo o método para receber numeros informados
				// pelo usuário;
		int qtdDivisores;// Variável utilizada para armazenar a quantidade de
							// divisores @@@@Utilizadas nas atividades (1,2,3)
		int divPrimo;
		int dia;
		int diaSemana;
		int mes;
		int ano;

		switch (atividade) {

		case 1: // Atividade número 1-Contagem de divisores

			// Utilizo o método para capturar um número inteiro informado pelo
			// usuário.
			num = Metodos
					.capturaINT("Digite um número para saber quantos divisores ele tem:");

			// esta variavel armazena o retorno do método
			// que é a quantidade de divisores do n´´umero informado pelo
			// usuário.
			qtdDivisores = Metodos.contaDivisores(num);// passo o número
														// informado pelo
														// usuário para o método
														// que faz a contagem de
														// divisores.

			// Mostra uma mensagem ao usuário informando quantos divisores tem o
			// número informado.
			System.out.printf("O numero %d tem %d divisores.", num,
					qtdDivisores);
			break;

		case 2: // Atividade 2-Veriicar se um número é primo.

			// Utilizo o método para capturar um número inteiro informado pelo
			// usuário.
			num = Metodos
					.capturaINT("Digite um número para saber se ele é primo:");

			// esta variavel armazena o retorno do método
			// que é a quantidade de divisores do número informado pelo usuário.
			qtdDivisores = Metodos.contaDivisores(num);// passo o número
														// informado pelo
														// usuário para o método
														// que faz a contagem de
														// divisores.

			// Se a quantidade de divisores do número informado for maior que
			// dois o número não é primo.
			// caso seja menor ou igual o numero é primo.
			// apóos a verificação dentro do bloco do if é apresentada uma
			// mensagem ao usuário.
			if (qtdDivisores > 2) {
				System.out.printf(
						"O retorno é %d pois o número %d não é primo:", 1, num);
			} else {
				System.out.printf("O retorno é %d pois o número %d é primo:",
						0, num);
			}

			break;
		case 3: // Atividade - 3 - Verificar se um número é DIVPRIMO:

			// Utilizo o método para capturar um número inteiro informado pelo
			// usuário.
			num = Metodos
					.capturaINT("Digite um número para saber se ele é DIVPRIMO "
							+ "\nOu digite 0 para sair:");

			// entro no corpo do while para executar a verificação.
			do {

				// 1º PASSO
				// passo o número que foi informado pelo usuário para verificar
				// quantos divisores tem este número
				// o retorno do método será a quantidade de divisores.
				// Armazeno o retono na variável qtdDivisores
				qtdDivisores = Metodos.contaDivisores(num);

				// 2º Passo
				// Agora verifico quantos divisores tem o número obtido no passo
				// 1
				// e armazeno o valor na variável divPrimo que serrá testada no
				// proximo passo.
				divPrimo = Metodos.contaDivisores(qtdDivisores);

				// 3º Passo
				// é feita a verificação para saber se o número
				// é primo ou não
				// é após a verificação mostra uma mensagem ao usuário.
				if (divPrimo > 2) {
					System.out
							.printf("O número %d não é DIVPRIMO pois tem %d divisores e %d não é primo \n\n",
									num, qtdDivisores, qtdDivisores);
				} else {
					System.out
							.printf("O num %d é DIVPRIMO pois tem %d divisores e %d é primo\n\n",
									num, qtdDivisores, qtdDivisores);
				}

				// /Pergunta ao usuário que ele quer verificar mais um número.
				num = Metodos
						.capturaINT("Digite um número para saber se ele é DIVPRIMO "
								+ "\nOu digite 0 para sair:");

			} while (num != 0);

			System.out.println("Saiu!!");

			break;
		case 4: // Atividade 4 - Verificar se o ano é Bissexto:

			num = Metodos
					.capturaINT("Digite um ano maior que 1582 para saber se ele é Bissexto:");

			do {

				// passo o número informado pelo usuário como parametro no
				// método isBissexto
				// que irá verificar se é ou não Bissexto e mostra uma messagem
				// ao usuário.
				if (isBissexto(num)) {
					System.out.printf("O ano %d é bissexto.\n\n", num);
				} else {
					System.out.printf("O ano %d não é bissexto.\n\n", num);
				}

				// Pergunta se o usuário quer verificar outro ano.
				num = Metodos
						.capturaINT("Digite um ano maior que 1582 para saber se ele é Bissexto:"
								+ "\nOu digite 0 para sair:");

			} while (num != 0);

			System.out.println("Saiu!!");

			break;
			
		case 5: // Aticvidade 5 - Informa em que dia da semana irá cair uma data
				// informada:

			// Armazeno o dia informado pelo usuário
			dia = Metodos.capturaINT("Digite o dia do mês:");

			// armazeno o dia da semana que iniciou o mês, representado por um
			// número de (0 a 6).
			diaSemana = Metodos.capturaINT("Digite o dia da semana que caiu o primeiro dia do mês:"
							+ "\n 0-Domingo"
							+ "\n 1-Segunda-Feira"
							+ "\n 2-Terça-Feira"
							+ "\n 3-Quarta-Feira"
							+ "\n 4-Quinta-Feira"
							+ "\n 5-Sexta-Feira"
							+ "\n 6-Sábado \n");

			// Passo os valores informados com parâmetro para o método
			// que fará todas as verificações para determinar em que dia da
			// semana irá cair o dia informado
			String diaCair = Metodos.diaSemana(dia, diaSemana);

			// Mensagem ao usuário.
			System.out.println(" O dia cai na(o) " + diaCair);

			break;

		case 6: // Atividade - 6 - Informa quantos dias tem um mês informado
				// pelo usuário:

			// Armazena o mÊs informado
			mes = Metodos.capturaINT("Digite o Mês");

			// Armazena o ano informado.
			ano = Metodos.capturaINT("Digite o Ano");

			// Passo como parâmetro para o método o mes e o ano informado pelo
			// usuário
			// este método irá verificar quantos dias teve o mês
			// e armazena na variável qtdDias
			int qtdDias = Metodos.qtdDias(mes, ano);

			// Mensagem ao usuário.
			System.out.printf("Quantidade de dias %d", qtdDias);

			break;

		case 7: // Atividade - 7 - Informa em que dia da semana cai um data
				// informada por (dia/mes/ano):

			// Armazena o dia o mes e o ano informado pelo usuário.
			dia = Metodos.capturaINT("Digite o dia");
			mes = Metodos.capturaINT("Digite o mês");
			ano = Metodos.capturaINT("Digite o ano");

			// Passo os dados informado pelo usuário para o método que irá fazer
			// a varificação.
			diaCair = Metodos.dataDiaInformado(dia, mes, ano);

			System.out.println("O dia foi :" + diaCair);
			
			break;
		}

	}

	// /BLOCO DE MÈTODOS

	// Captura um numero inteiro
	public static int capturaINT(String mensagem) {

		// Mostra a mensagem que foi passada como parâmetro
		System.out.print(mensagem+" ");

		// captura o numero informado pelo usuário
		// e retorna o número digitado
		int num = scan.nextInt();
		return num;
	}

	// Captura um numero Double
	public static double capturaDouble(String mensagem) {

		// Mostra a mensagem que foi passada como parâmetro
		System.out.println(mensagem);

		// captura o numero informado pelo usuário
		// e retorna o número digitado
		Double num = scan.nextDouble();
		return num;
	}

	// Conta quantos divisores tem o numero passado como parametro
	public static int contaDivisores(int num) {

		// inicializa as variáveis
		int i = 1;
		int qtdDivisores = 0;

		while (i <= num) {

			// se o número informado for divisível pelo numero que esta contido
			// em i durante o loop
			// a variável qtdDivisores recebe + 1;
			if (num % i == 0) {
				qtdDivisores++;
			}

			i++;
		}
		// Retorna a quantidade de divisores do número informado
		return qtdDivisores;
	}

	// Verifica se um ano informado é bissexto
	public static boolean isBissexto(int ano) {

		boolean bissexto;

		// Se o ano informado for Divisível por 4 ele já é um ano bissexto.
		if (ano % 4 == 0) {

			// Se o ano for divisível por 4 e também for divisível por 100 então
			// é nescessário fazer mais uma verificação
			// para garantir que ele sejá Bissexto
			if (ano % 4 == 0 && ano % 100 == 0) {

				// Para garantir que o número é bissexto ele também deve ser
				// divisível por 400
				// Caso contrário o ano não será bissexto.
				if (ano % 400 == 0) {
					bissexto = true;
				} else {
					bissexto = false;
				}

			} else { // se o ano não for divisivel por 4 e por 100 ao mesmo
						// tempo ele é um ano bissexto.

				bissexto = true;
			}

		} else { // Se não for divisível por 4 ele não é bissexto

			bissexto = false;
		}

		// Retorna verdadeiro ou falso para o chamado do método.
		return bissexto;
	}

	// Verifica em que dia da semana irá cair uma dia informado pelo usuário
	// passando o dia que ele quer verificar e o dia da semana em que o mês iniciou
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
			diaProdurado = "Sábado";
			break;

		default:
			break;
		}

		return diaProdurado;

	}

	//método que verifica quantos dias tem o mÊs solicitado pelo usuário.
	public static int qtdDias(int mes, int ano) {

		int qtdDias = 0;

		
		switch (mes) {

		case 1:
			qtdDias = 31;
			break;
		case 2:
            //Verifico se o ano informado pelo usuário é um ano bissexto.
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

	
	//método que informa ao usuário em que dia da semana caiu o caira 
	//a data será fornecida pelo usuário com(dia,mes,ano)
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
			diaselecionado = "Sábado";
			break;
		case 6:
			diaselecionado = "Domingo";
			break;

		default:
			break;
		}

		return diaselecionado;

	}

	// Recebe dois números inteiros e calcula a potencia desses dois números.
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
