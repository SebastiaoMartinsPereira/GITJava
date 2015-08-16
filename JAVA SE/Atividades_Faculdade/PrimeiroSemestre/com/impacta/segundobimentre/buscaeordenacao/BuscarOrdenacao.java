package com.impacta.segundobimentre.buscaeordenacao;

import com.impacta.segundobimentre.Metodos;
import com.impacta.segundobimentre.MetodosVetores;

public class BuscarOrdenacao {

	public static void main(String[] args) {
		
		if(Metodos.capturaINT("Escola o tipo de busca : \n Linear -> 1 \nBinária -> 2 ")==1){
			MetodosVetores.RealizaBuscaLinear(Metodos.capturaINT("Tamanho do array a ser preenchido:"));
		}else{
			MetodosVetores.RealizaBuscaBinaria(Metodos.capturaINT("Tamanho do array a ser preenchido:"));
		}
		
	}
}
