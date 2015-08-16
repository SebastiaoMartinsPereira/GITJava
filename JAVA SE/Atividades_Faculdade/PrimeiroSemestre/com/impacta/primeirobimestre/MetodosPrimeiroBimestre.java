package com.impacta.primeirobimestre;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class MetodosPrimeiroBimestre {
    
	DecimalFormat decimal = new DecimalFormat("0.0000");
	
	//Utilixado no calculo de combust�vel
    double kmtotal,combtotal;
    
    
    //Utilizadas na atividade de comiss�o
	int qtditens=0,coditem;
	double tProd1 = 0,tProd2 = 0,tProd3=0,tProd4=0,calc,sumtotal=0,comissao=0;
	String incluir="",vendedor="",mensagem="";
	char resp;
	
	
	 int num,
	 testado=1,i=1,sum=0;
	 
	 
	 
	public void soOsPrimos(){
		
		 //recebe o range at� onde ser� feita a pesquisa.
		 num=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe at� que n�mero ser� feita a pesquisa!!"));

		 while (num>0){
		     
			 i=1;
			 //ap�s atribuir o valor a i entra em um loop at� que i seja igual ao numero que esta sendo testado.
			 while (i <= testado){
			     
				 //verifica se o n�mero testado � divisivel por mais de dois numeros e faz o incremento de i.
				 if(testado % i == 0){
					 
					sum++; //sempre que o numero testado for divisel por i o sum � acrescido a 1
				 }
				 
				 i++;
	 		 }
			 
			   //se sum > 2 siginifica que o numero que foi testado n�o � um numero primo portanto ele n�o � adicionado a mensagem.
			 if (sum<3){
				 mensagem = mensagem + testado+","; 
			 }
			 
			 sum=0;  //zera o sum
			 testado++;  //indica o pr�ximo numero que ser� testado.
  			 num--;  //diminui um da quantidade de testes que ser�o feitos.
		 }
	}
	 
	
	
	public void calcularComissao(){
		
		do{
			sumtotal=0;
			tProd1=0;
			tProd2=0;
			tProd3=0;
			tProd4=0;
			comissao =0;
			
			vendedor= JOptionPane.showInputDialog(null,"Nome do vendedor");
		
			
		   do{
			   coditem = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o c�digo do produto:"
					                                                        +"\nCod-1"
					                                                        +"\nCod-2"
					                                                        +"\nCod-3"
					                                                        +"\nCod-4"
					                                                        +"\n0-Sair"));
			   
			   if (coditem == 0) continue;
			   
			   else{
				   
				   qtditens= Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade:"));
				   
				   switch (coditem) {
						case 1:
							calc = qtditens*239.99;
							tProd1=tProd1+calc;
							break;
						case 2:
							calc = qtditens*129.75;
							tProd2=tProd2+calc;
							break;
						case 3:
							calc = qtditens*99.95;
							tProd3=tProd3+calc;
							break;
						case 4:
							calc = qtditens*350.89;
							tProd4=tProd4+calc;
							break;
						default:
							break;
				    }   
			   } 	   
		   }
	       while(coditem != 0);
		   
		   sumtotal=tProd1+tProd2+tProd3+tProd4;
		   comissao = 200.00 + (sumtotal *((double)9/100)); 
		   mensagem= mensagem +"\n"+ vendedor + ":" + " Vendeu : " + sumtotal + " Comiss�o : "+ comissao; 
		   
		   incluir = JOptionPane.showInputDialog(null,"Deseja gerar comiss�o de outro vendedor?");
		   resp = incluir.toUpperCase().charAt(0);
		   
		   
		}while(resp != 'N');
		
		JOptionPane.showMessageDialog(null, mensagem);
		
	}
	
	

    
	public void calcularGastosCombustivel(double km,double combustivel){

		this.kmtotal = this.kmtotal + km;
		this.combtotal = this.combtotal + combustivel;
		
		String calcGasto = decimal.format(km/combustivel);
		
		JOptionPane.showMessageDialog(null, "Rela��o litro combust�vel: \n"+ calcGasto+" Km/l");
	}
	

	public double getKmtotal() {
		return kmtotal;
	}

	public double getCombtotal() {
		return combtotal;
	}


	public void setCombtotal(double combtotal) {
		this.combtotal = combtotal;
	}


	public void setKmtotal(double kmtotal) {
		this.kmtotal = kmtotal;
	}

	
}
