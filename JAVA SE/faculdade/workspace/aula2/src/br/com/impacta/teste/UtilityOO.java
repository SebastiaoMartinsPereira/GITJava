package br.com.impacta.teste;

import java.text.DecimalFormat;
import java.util.Random;

import br.com.impacta.modelos.Data;

public class UtilityOO {
	
	private static Random ram;
	
	public UtilityOO(){
		
	}
	
	public static String geraValores(int qtdCasasDecimais)
	{
		DecimalFormat df = new DecimalFormat("#####");
		Random ram = new Random();
		String auxLen ="";
		for(int i=0;i<qtdCasasDecimais;i++){
			auxLen+="9";
		};
		
		return df.format(ram.nextDouble() * Double.parseDouble(auxLen));
		
	}

	public static Double geraValoresEmDouble(int qtdCasasDecimais)
	{
		DecimalFormat df = new DecimalFormat("#####");
	    ram = new Random();
   String auxLen ="";
		for(int i=0;i<qtdCasasDecimais;i++){
			auxLen+="9";
		};
		
		return Double.parseDouble( df.format(ram.nextDouble() * Double.parseDouble(auxLen)));
		
	}
	
	
	public static String gerarNome()
	{
		String[] nomes = {"Carina","Carisa","Carísia","Carissa","Cárita",
				"Carla","Carlinda","Carlo","Carlos","Carlota",
				"Darlene","Darnela","Davi","David","Davide",
				"Davina","Davínia","Débora","Décia","Décimo",
				"Deise","Deivid"};
		
		ram = new Random();
		
		return nomes[ram.nextInt(nomes.length)];
    };
    
    
	public static String gerarSobrenome()
	{
		String[] nomes = {"ROSSI","FERRARI","BRAGATTI","VOLTOLINI","SARTORI","LOMBARDI","CASAGRANDE","BARBIERI","ZANELLA","FONTANA"};
		
		ram = new Random();
		
		return nomes[ram.nextInt(nomes.length)];
    };
    
	public static String gerarSetor()
	{
		String[] nomes = {"RH","DESENVOLVIMENTO","ANALISE","BANCO DE DADOS","LIMPEZA","PORTEIRO","ATENDENTE","SUPORTE","SECRETARIO","CHEFIA"};
		
		ram = new Random();
		
		return nomes[ram.nextInt(nomes.length)];
    };
    
	public static String gerarRg(int qtdCasasDecimais )
	{
		Random ram = new Random();
		String auxLen ="";
		for(int i=0;i<qtdCasasDecimais;i++){
			auxLen+= String.valueOf(ram.nextInt(9));
		};
		
		return auxLen;
    };
    
    
    public static Data gerarData(){
    	
    	Data data = new Data(ram.nextInt(31), ram.nextInt(12), gerarAno());
		return data;
    }
    
    
    public static int gerarAno()
    {
    	int val1 = ram.nextInt(2);
    	int val2=ram.nextInt(9);
    	
    	val1 = val1>0?val1:1;
    	val2 = val2>9?val2:9;
    	
    	String ano = val1 +""+val2+""+ram.nextInt(9)+""+ram.nextInt(9);
		return Integer.parseInt(ano);
    	
    }
    
    
    
	}
