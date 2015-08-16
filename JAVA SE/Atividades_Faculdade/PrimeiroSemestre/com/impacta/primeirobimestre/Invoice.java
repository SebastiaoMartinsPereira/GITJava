package com.impacta.primeirobimestre;

public class Invoice {
	//declaração dos campo (variáveis de instância)
	String numerofatura,descricaofatura;
	int quantidadeproduto;
	double precounidade;
	
  //contrutor do metodo
	public Invoice(String numero,String descricao,int quantidade, double precouni){
		numerofatura = numero;
		descricaofatura = descricao;
		
		if (quantidade<0){
			
			quantidadeproduto=0;
		}else{
		quantidadeproduto = quantidade;
		}
		
		if (precouni < 0.0){
			
			precounidade=0.0;	
		}else{
			 precounidade=precouni;
		}
			
	}
	
	//bloco de metodos para get e set das variaveis de instancia.
	public void setNumeroFatura(String numero){
		
		numerofatura = numero;	
	}
	
	public String getNumeroFatura(){
		
		return numerofatura;
	}
	
	public void setDescricaoFatura(String descricao){
		
		descricaofatura = descricao;
	}
	
	public String getDescricaoFatura(){
		
		return descricaofatura;
	}
	
	public void setQuantidadeProduto(int quantidade){
		
		quantidadeproduto=quantidade;
	}
	
	public int getQuantidadeProduto(){
		
		return quantidadeproduto;
	}
	
	public void setprecoUnidade(double precouni){
		
		precounidade= precouni;
	}
	
	public double getPrecoUnidade(){
		
		return precounidade;
	}
	
	//calcula o valor a ser pego pela compra.
	public double calculaFatura(){
		
		double valorfatura=0.0;
		int quantidade = 0;
	    double preco =0.0;
						
		quantidade = getQuantidadeProduto();
		preco = getPrecoUnidade();
		
		valorfatura = (double)quantidade*preco;
		
		return valorfatura;		
		
	}
	
	
	
	
	
	
}
