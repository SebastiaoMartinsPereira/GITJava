package br.com.impacta.teste;

import java.util.Scanner;

import br.com.impacta.modelos.Empresa;
import br.com.impacta.modelos.Funcionario;
import br.com.impacta.modelos.UtilityOO;

public class TestaEmpresa {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int tamanhoLista;
		
		//Define o construtor com o tamanho que ter� a lista de funcion�rios
		System.out.println("Tamanho que ter� a lista de funcionarios");
		tamanhoLista = scan.nextInt();
			
		Empresa empresa = new Empresa(tamanhoLista);
		
		
		Funcionario[] funcs = new Funcionario[tamanhoLista];
		for(int i=0;i< funcs.length;i++){
			funcs[i]= new Funcionario(UtilityOO.gerarNome(), UtilityOO.gerarSetor(),UtilityOO.geraValoresEmDouble(4), UtilityOO.gerarData(),UtilityOO.gerarRg(9));
		}
	
		empresa.addFuncionario(funcs);
		empresa.mostraSalariosFuncionario("");
	
		System.out.println("\n\nInforma��es detalhadas do Funcionario:");
		
		empresa.mostraSalariosFuncionario();
		
		System.out.println("Foi verificado que : \n");
		if(empresa.eMeuEmpregado(funcs[10])){
			System.out.println(funcs[10].getNome() + " � meu funcionario;");
		}else{
			System.out.println(funcs[10].getNome() + " n�o � meu funcionario;");
		}
		
		empresa.aumentarListaFuncionarios();
		
		System.out.println("Digite o n�mero Identificador do funcion�rio:");
		System.out.println(empresa.buscaFuncionarioPorIdentificador(scan.nextInt()));
		scan.close();
	}

}
