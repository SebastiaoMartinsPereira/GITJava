package com.npsoftwares.time;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	private int checkMonth(int mes) {

		if (mes > 0 && mes <= 12)
			return mes;
		else {
			System.out.printf("O mês (%d) é inválido e será alterado para 1!!",
					mes);
			return 1;
		}

	}

	public Data(int dia, int mes, int ano) {

		
		this.mes = checkMonth(mes);
		this.dia = checkDay(dia);
		this.ano = ano;
	}

	private int checkDay(int dia) {

		int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (dia > 0 && dia <= diasPorMes[this.mes])
			return dia;

		if (mes == 2 && dia == 29
				&& (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))) {
			return dia;
		}

		System.out.printf("O dia (%d) é inválido e foi alterado para 1", dia);
		return 1;
	}

	@Override
	public String toString() {

		return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
	}
}
