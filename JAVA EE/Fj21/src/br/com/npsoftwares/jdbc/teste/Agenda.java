package br.com.npsoftwares.jdbc.teste;

public class Agenda {

	public static void main(String[] args) {
		int resposta;

		GerenciarAgenda assistente = new GerenciarAgenda();

		try {

			resposta = Integer
					.parseInt(assistente
							.recebeInput("1 - CADASTRO\n2 - PESQUISA\n3-LISTA CONTATOS\n4-EDITAR\n5-DELETAR"));

			switch (resposta) {
			
			case 1:
				assistente.CadastrarContato();
				break;
			case 2:
				assistente.pesquisarContato();
				break;
			case 3:
				assistente.listarContatos();
				break;
			case 4:
				assistente.alterarContato();
				break;
			case 5:
				assistente.apagarContato();
				break;
			default:
				break;
			}

		} catch (Exception e) {
			assistente.mostrarMensagem(e.getMessage());
		}

	}
}
