package com.npsoftwares.conta;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class TesteConta {

	public static void main(String[] args) {
	    
		int x = 0;
		String resp;
		Conta conta = null;
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		
		do {
			
			x = Integer.parseInt(JOptionPane.showInputDialog(null,"escolha uma opção:"
					+"\n1-Criar uma conta:"
					+"\n2-Acessar uma conta:"
					));
			
		switch (x) {
			
			case 1:
				
				int numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero da conta:"));
				double saldoInicial=Double.parseDouble(JOptionPane.showInputDialog(null,"Saldo inicial:"));
				double limiteCredito=Double.parseDouble(JOptionPane.showInputDialog(null,"Limite de crédito:"));
				
				conta = new Conta(numeroConta, saldoInicial, limiteCredito);
				
				contas.add(conta);
				JOptionPane.showMessageDialog(null, "Conta criada com sucesso!!","finalizado",1);
				break;
				
			case 2:
			    
				int numconta = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero da conta:"));
				
					x = Integer.parseInt(JOptionPane.showInputDialog(null,"escolha uma opção:"
							+"\n1-Consultar Saldo:"
							+"\n2-Consultar Limite de Credito:"
							+"\n3--Gastos do mês"
							+"\n4-Sacar:"
							+"\n5-Sair"
							));
					
					switch (x) {
					
					case 1:
						contas.get(numconta).AtualizaSaldo(1);
						break;
					case 2:
						contas.get(numconta).getLimCredito();
						break;
					case 3:
						contas.get(numconta).getGastosMes();
						break;
					case 4:
						
						double valsaque = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor que deseja debitar."));
						contas.get(numconta).DebitarSaldo(valsaque);
						contas.get(numconta).AtualizaSaldo();
						
					case 5:
						break;
					default:
						break;
					}

			break;
			
			default:
				break;
			}
			
			
			resp = JOptionPane.showInputDialog(null,"Deseja efetuar uma nova transação?"
			                                        +"\n1-Sim"
					                                +"\n2-Sair");
			
		}while(resp != "2");
		        
	}
		
}
