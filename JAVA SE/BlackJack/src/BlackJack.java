import java.util.Random;
import java.util.Scanner;


public class BlackJack {
	
	private static Baralho baralho;
	private static Cliente cliente;
	private static Banca banca;
	
	
	public static void main(String[]args){
		
		jogar();
		
	}
	
	
	public static void jogar(){
		
		baralho = new Baralho();
		cliente = new Cliente();
		banca = new Banca();
		
	    int res;
		@SuppressWarnings("unused")
		Random ram = new Random();
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Deseja Inciar a Partida 1-Sim / 2-N�o?");
		res = scan.nextInt();
		
		if (res==1){
			
            System.out.println("Valores iniciais da pontua��o:\n");
			
			System.out.println("\nCliente :"+cliente.mostraPontos());
			System.out.println("Banca :" + banca.mostraPontos());
			
			System.out.println("\n\nRodada Inicial:\n");
			
		    banca.joga(baralho.pegarCarta());
		    cliente.joga(baralho.pegarCarta());
		    
		    banca.joga(baralho.pegarCarta());
		    cliente.joga(baralho.pegarCarta());
		}
			
			
		    System.out.println("Mais uma rodada ?  1-Sim / 2-N�o");
			res = scan.nextInt();
			
			while(res ==1){
				
			    banca.joga(baralho.pegarCarta());
			    cliente.joga(baralho.pegarCarta());
			    
			    if(cliente.mostraPontos() > 21){
			    	System.out.println("Estourou a pontua��o.");
			    	res=2;
			    }else{
			    	System.out.println("Mais uma rodada ?  1-Sim / 2-N�o");
					res = scan.nextInt();
					
					if(res==2){
						
						System.out.println("Voc� :" + cliente.mostraPontos());
						System.out.println("Banca :" + banca.mostraPontos());
						int ptcliente = cliente.mostraPontos();
						int ptBanca = banca.mostraPontos();
						
						if(ptcliente > ptBanca){
							System.out.println("Voc� ganhou.");
						}
						else if( ptBanca > 21){
							System.out.println("Voc� ganhou.");
						}
						else if(ptcliente == ptBanca){
							System.out.println("Voc� perdeu.");
						}
						else{
							System.out.println("Voc� perdeu.");
						}
					}
			    }   
			}
			
			scan.close();
	}
}
