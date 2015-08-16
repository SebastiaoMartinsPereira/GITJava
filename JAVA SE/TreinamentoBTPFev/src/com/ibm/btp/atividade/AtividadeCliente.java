package com.ibm.btp.atividade;

import javax.swing.JOptionPane;

public class AtividadeCliente {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente( );
		
		String clientNome,clientSobrenome;
		String clientAge;
	
		//Recebe o nome do cliente até que seja informado corretamente 
		do{
			
			clientNome=JOptionPane.showInputDialog(null, "Favor informa o primeiro nome do cliente");
			clientSobrenome=JOptionPane.showInputDialog(null, "Favor informa o segundo nome do cliente");
						
		}while(cli1.ChecksFullName(clientNome, clientSobrenome) ==false);
		
		//recebe a idade até que o usuário informe um numero
		do{

			clientAge=(JOptionPane.showInputDialog(null, "Favor informa a idade do cliente "+ cli1.getName()));
			
		}while(cli1.CheckAge(clientAge) == false);
		
		
		//completa o restante dos  dados do cliente CPF, teleohne e saldo.
		cli1.setCpf(JOptionPane.showInputDialog(null, "Favor informa o Cpf do senhor(a) "+ cli1.getName()));;
		cli1.setPhone(JOptionPane.showInputDialog(null, "Favor informa o telefone :"));
		cli1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Favor informa o saldo :")));
		
		
		JOptionPane.showMessageDialog(null, "Dados do cadastro realizado:\n"
				+ "\nCliente : " + cli1.getName()
				+ "\nIdade : " + cli1.getIdade()
				+ "\nCpf : " + cli1.getCpf()
				+ "\nTelefone : " + cli1.getPhone()
				+ "\nSaldo : " + cli1.getSaldo());
		
	}

}
