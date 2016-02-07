package br.com.impacta.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Banco {

	private Conta[] listaContas;
    private List<Conta> contas;
    private Map<String, Conta> mapContas;
	
	public Banco(){
		
	}

	public Banco(ArrayList<Conta> listaContas){
		
		this.listaContas = new Conta[3];
		
		for (Conta conta : listaContas) {
			this.addConta(conta);
		}
	}
	
	public Banco(Conta[] listaContas){
		this.setListaContas(listaContas);
	}
	
	
  /*	public void addConta(Conta c){
		
		for (int i = 0; i < this.listaContas.length; i++) {
			if(this.listaContas[i]==null){
				listaContas[i] = c;
				return;
			}
		}
		this.aumentaListaContas(this.listaContas);
		
		addConta(c);
		
	}*/
	
	
	public void addConta(Conta c){
		this.contas.add(c);
		this.mapContas.put(c.getDono(), c);
	}
	
	public Conta pega(int x){
	     return this.contas.get(x);	
	}
	
	public int pegaQuantidadeDeContas(){
		return this.contas.size();
	}
	
	public Conta buscaPorNome(String nome){
		
		return this.mapContas.get(nome);

	}
	
	
	public Conta pegaConta(int x){
		
		for (Conta conta : listaContas) {
			
			if(conta.getNumero() == x){
				return conta;
			}
		}
		
		return null;
	}
	
	public String totalDeContas(){
		
		int contasAtivas=0;
		int contasLivres=0;
		
		for (Conta conta : listaContas) {
			if(conta!=null){
				contasAtivas++;
			}else{
				contasLivres++;
			}
		}
		
		return String.format("Contas Ativas %4d.\nEspaço para criação de novas Contas %4d",contasAtivas,contasLivres);
	}
	
	
	@SuppressWarnings("unused")
	private void aumentaListaContas(Conta[] listaContas){
		
		Conta[] novaLista = new Conta[listaContas.length+10];
		
		for(int i =0;i<listaContas.length;i++){
			novaLista[i] = listaContas[i];
		}
		
		this.setListaContas(novaLista);
		
		novaLista=null;
	}
	
	public Conta[] getListaContas() {
		return listaContas;
	}

	public void setListaContas(Conta[] listaContas) {
		this.listaContas = listaContas;
	}
	
	
	
	
}
