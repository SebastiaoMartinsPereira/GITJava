package br.com.impacta.teste;

import java.util.ArrayList;

import br.com.impacta.modelos.AtualizaContas;
import br.com.impacta.modelos.Banco;
import br.com.impacta.modelos.Conta;
import br.com.impacta.modelos.ContaCorrente;
import br.com.impacta.modelos.ContaPoupanca;

public class TestaConta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Conta conta;
		ContaCorrente cCorrente;
		ContaPoupanca cPoupanca;
		AtualizaContas atualizador;
		ArrayList<Conta> listaContas = null;
		Banco meuBanco;
		
		
		conta = new Conta(123, "Sebastiao", 1000.0, 2000.0);
		cCorrente = new ContaCorrente(1234, "Cleverson", 1000.0, 2500.0);
		cPoupanca = new ContaPoupanca(12345, "Josenildo", 1000.0, 2500.);
			
		imprimirSaldo(conta);
		imprimirSaldo(cCorrente);
        imprimirSaldo(cPoupanca);	
        
        
        System.out.println("\nREALIZAR DEPOSITOS\n\n");
        
        realizarDeposito(conta, 500.);
        realizarDeposito(cCorrente, 500.);
        realizarDeposito(cPoupanca, 500.);
        

        System.out.println("\nATUALIZANDO SALDO\n\n");
        
        listaContas = new ArrayList<Conta>();
        listaContas.add(conta);
        listaContas.add(cCorrente);
        listaContas.add(cPoupanca);
        
        atualizador = new AtualizaContas(listaContas);
        
        System.out.println(atualizador.atualizarGerarRelatorio(0.1));
        
        
        System.out.println("\n\nRegistrando contas no banco.");
        
        meuBanco = new Banco(listaContas);
        
        meuBanco.addConta(conta);
        meuBanco.addConta(cPoupanca);
        meuBanco.addConta(cCorrente);
        
        System.out.println(meuBanco.totalDeContas());
        
        
    
	}

	
	
	
	
	
	
	public static void imprimirSaldo(Conta c){
	
		System.out.println(String.format("\nSaldo da conta do Senhor %10s é %5.2f.", c.getDono(),c.getSaldo()));
	}
	
	public static void realizarDeposito(Conta c , Double valor){
		
		c.deposita(valor);
		
		System.out.println(String.format("\nO valor depositado foi %f \n Valor atual na conta do senhor %10s é %5.2f",valor,c.getDono(),c.getSaldo()));
	}
	
	public static void atualizaSaldo(Conta c, Double taxa){
		
		c.atualiza(taxa);
		
		System.out.println(String.format("\nSaldo do senhor %10s após atualização %5.2f ",c.getDono(),c.getSaldo()));	
	}
	
	
}
