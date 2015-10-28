import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;


public class Utility {
	
	public static void somarMatriz(int [][] m){
		
		int soma = 0;
		
		for(int i = 0 ; i< m.length;i++){
			for(int j = 0 ; j < m[i].length;j++ ){
				soma += m[i][j];
			}
			System.out.println("Coluna " + i + " = " + soma);
		}
	}
	
	public static int[][] gerarMatriz(int tamanho)
	{
		Random ram = new Random();
		
		int[][] m= new int[tamanho][tamanho];
		
		for(int i = 0 ; i< m.length;i++){
			for(int j = 0 ; j < m[i].length;j++ ){
				m[i][j] = ram.nextInt(50);
			}
		}
			
		return m;
		
	}

	public static int[] gerarVetor(int tamanho,int maiorNum)
	{
		Random ram = new Random();
		
		int[] m= new int[tamanho];
		
		for(int i = 0 ; i< m.length;i++){

			m[i] = ram.nextInt(maiorNum);	
		}
			
		return m;
		
	}

	
	public static int[][] gerarMatriz(int tamanhoi,int tamanhoj)
	{
		Random ram = new Random();
		
		int[][] m= new int[tamanhoi][tamanhoj];
		
		for(int i = 0 ; i< m.length;i++){
			for(int j = 0 ; j < m[i].length;j++ ){
				m[i][j] = ram.nextInt(10);
			}
		}
		
		return m;
		
	}
	
	public static void mostrarValorMatriz(int[][] m){
		
		for(int i = 0 ; i< m.length;i++){
			for(int j = 0 ; j < m[i].length;j++ ){
				System.out.println(m[i][j]+"  "); 
			}
			System.out.println("");		}
	}
	
	public static String acharElemento(int[][] m){
		
		int numBusca=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o número que deseja buscar:");
		numBusca = scan.nextInt();
		
		
		for(int i = 0 ; i< m.length;i++){
			for(int j = 0 ; j < m[i].length;j++ ){
				if(m[i][j]==numBusca){
					scan.close();
					return String.format("O numero buscado esta na posição Matriz[%d][%d]", i,j);
			}
        }
		
		}
		
		scan.close();
		
		return String.format("O valor %d não foi encontrado na Matriz", numBusca);
			
	}
	
	public static void exibirMatriz(int[][] m){
		
		for(int i = 0 ; i< m.length;i++){
			for(int j = 0 ; j < m[i].length;j++ ){
				System.out.print(String.format("M[%d][%d] = %4d  "
						+ "", i,j,m[i][j]));
			}
			
			System.out.println();
        }
		
	}
	
	public static void exibirMatriz(int[] m){	
		for(int j = 0 ; j < m.length;j++ ){
			System.out.print(String.format("M[%d] = %4d  "
					+ "",j,m[j]));
			System.out.println();
		}
	}
	
	
	public static int[][] somarMatrizes(int[][] m1,int[][] m2){
		
		int[][] m3 = new int[m1.length][m1.length];
		
		for(int i = 0 ; i< m1.length;i++){
			for(int j = 0 ; j < m1[i].length;j++ ){
				System.out.print(String.format("M[%d][%d] = %d  "
						+ "", i,j,m1[i][j]));
			}
			System.out.println();
        }
		
		return m3;
		
	}
	
	public static void multiplicaMatriz(){
		
		
		int[][] Ma ={{3,1,3},
			         {6,5,5}  
	                };
	
	    int[][] Mb = { {100,50},
		         	{50,100},
		         	{50,50}
	               };
	
	
	int[][] result = new int[Ma.length][Mb[0].length];
	
	// na multiplicação a matris deve seguir a seguite regra
	// tendo  Ma[m][n]  e  Mb[n][p]
	//
	//A quantidade de colunas de Ma deve ser igual a quantidade de Linhas de Mb
    //
	// O resultado será uma mátris de [n][n] tamanho
	//
	
	if(Ma[0].length == Mb.length)
	{
		
		//primeiro loop vai até o tamanho da matriz a
		for(int i=0;i<Ma.length ;i++){
			
			//segundo loop vai até o tamanho da matriz[0].length
			for(int j=0;j<Mb[i].length;j++){
				
				//terceiro loop preenche a matriz resultante 
				for(int k = 0 ; k < Mb.length;k++){
				    
					//o loop varia na coluna da Matriz a e na Linha da Matriz b
					result[i][j] += Ma[i][k] * Mb[k][j];
					
				}
			}
		}
		
	}
	
	}
	
	public static int nFatorial(int[] vetor,int busca,int vInicio,int vFim){
		
		int inicio = vInicio;
		int fim = vFim;

		if(inicio <= fim){
			
			int meio = (inicio + fim ) / 2;
			
			if(vetor[meio] == busca){
				
				return busca;
				
			}else if(busca < vetor[meio]){
				
			  return nFatorial(vetor, busca, inicio, meio - 1);
			   
		    }else if(busca > vetor[meio]){
		    	
		 	  return nFatorial(vetor, busca,meio + 1, fim);

		    }  
		}
		
		return -1;	
		
	}
	
	public static int potencia(int base, int expoente){
		
		if(expoente == 1){
			
			return base * expoente;
			
		}else{
			
			return base * potencia(base, expoente-1);
		}
		 
	}
	
	public static void boobleSort(int[] m){
		
		int aux=0;
		
		for(int i = 0;i<m.length-1;i++){
			for(int j = 0 ;j<m.length-i-1;j++){
				if(m[j]>m[j+1]){
					aux=m[j];
					m[j]=m[j+1];
				    m[j+1] = aux;
				}
			}
		}		
	}
	
	
	public static void selection(int[] array) {
		
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;
			
			for (int i = menor + 1; i < array.length; i++){
				if (array[i] < array[menor]){
					menor = i;
				}
			}
			if (menor != fixo) {
				// Troca
	                        int t = array[fixo];
	                        array[fixo] = array[menor];
	                        array[menor] = t;
			}
		}
		
		System.out.println(" Ele faz uma varredura em todo o array verificando o menor número e o colocando na primeira posição do vetor,"
						 + " então ele faz uma nova varredura a partir do segundo numero do vetor e procura pelo segundo menor numero que existe"
						 + " no vetor quando o encontra coloca ele na segunda posição do vetor.");
	}
	
	
	static void bolha(int []v){
		
	   Long count = (long) 0;
	   
	   Long countFor1 = (long) 0;
	   Long countFor2 = (long) 0;
	   
	   for (int ultimo = v.length - 1; ultimo > 0; ultimo--){
		  countFor1++;
	      for (int i = 0; i < ultimo; i++){
	           if (v[i] > v[i+1]){
	               trocar(v, i, i+1);
	               countFor2++;
	           }
	      } 
	   }
	   
	   System.out.println("For1" + countFor1);
	   System.out.println("For2" + countFor2);
	   
	}
	
	static void insertionSort(int v[]) {
	   int  x, y;
	   
	   Long countFor1 = (long) 0;
	   Long countFor2 = (long) 0;
	  	   
	   for (int i = 1 ; i < v.length; i++) {
		  countFor1++;
	      x = i;
	      y = i - 1;
	      while ((x > 0) && (v[x] < v[y])) {  
	            trocar(v, x, y);
	            x--;  y--; countFor2++;   
	      }
	   }
	   
	   System.out.println("For1" + countFor1);
	   System.out.println("For2" + countFor2);
	}
	
	static void trocar(int []v, int i, int j){
	   int aux = v[i];
	   v[i] = v[j];
	   v[j] = aux;
	}
		

	public static void quickSort(){
			
	}
	
	public static void particao(int[] vetor,int i,int f){
		
		int maior=0;
		int menor=0;
	
		for (int j = i; j < f; j++) {
			
			if(j == i){
				menor = j;
			}else if(j<menor){
				menor = j ;
			}
			if(j > maior){
				maior = j;
			}			
		}
	}
		
}
