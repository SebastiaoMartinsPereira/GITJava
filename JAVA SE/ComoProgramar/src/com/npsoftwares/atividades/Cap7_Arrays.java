package com.npsoftwares.atividades;


import com.npsoftwares.gradebook.GradeBook;

//import java.util.Random;

public class Cap7_Arrays {

	public static void main(String[] args) {
		

		int[] gradesArray ={87,68,94,100,83,78,85,91,76,87};
		
		GradeBook grade = new GradeBook("Css", gradesArray);
		
		grade.displayMessage();
		grade.processGrade();
	}
}




/*
		1	FOR APRIMORADO (FOR EATCH)
		2	GRAFICO DE ASTERISTICOS
		3	JOGO DE DADOS
		4	CONTAGEM DE FREQUENCIA NUMERICA
		5   PASSAGEM DE PARAMETROS UTILIZANDO UM ARRAY.
*/


/*
              ///FOR APRIMORADO (FOR EATCH)
               * 
int[] array ={87,88,94,65,7,41,54,521,54,8,54,54,21,56,65};
int total =0;

for(int number : array){
	total+= number;
}

System.out.printf("Soma dos elementos da array : %d\n",total);


                     ///GRAFICO DE ASTERISTICOS
                      
  	//Cria um array de inteiros  e atribui os valores para cada index;
	int[] array = {0,0,01,03,05,010,10,2,4,2,1};
	
	System.out.println("Distribuição em Grade;");
	
	//faz o loop por todos os index da array
	for(int counter=0;counter<array.length;counter++){
		
		if(counter==10){ //quando o index for igual a dez trata a mensagem  da barra de forma diferente
			System.out.printf("%5d: ",100);
		}else{
			System.out.printf("%02d-%02d: ",counter*10,counter*10+9);//cria a barra com seus respectivos valores
		}
			for(int stars=0;stars<array[counter];stars++){//preenche os asteristicos no grafico
				System.out.print("*");
			}
			
			System.out.println();
	}



                        //JOGO DE DADOS

 		//Jogos de dados
		Random random = new Random();//gerador de numeros aleatórios
		
		int[] frequency = new int[7];//array  de numeros inteiros de tamnaho 7
		
		for(int roll=1;roll<=6000; roll++){ // gera valores e incrementa os valores de cada do array de acordo ncomm o numero gerado
			++frequency[1+random.nextInt(6)];
		}
        
		System.out.printf("%s%10s\n","Face","Frequancy");
		
		for(int face =1;face<frequency.length;face++){  //mostra os valores contidos em cada indez do array
			System.out.printf("%4d%10d\n",face,frequency[face]);
		}



                     CONTAGEM DE FREQUENCIA NUMERICA
                     

//gera um array co 50 numeros aleatórios
int[] responses = {1,5,4,2,3,8,7,6,9,9,
		           1,4,5,2,1,7,4,8,7,7,
		           7,5,2,10,2,1,5,5,4,8,
		           5,2,1,5,4,8,5,10,5,4,
		           2,1,5,4,5,2,4,8,1,5,};

int[] frequency = new int[11]; //gera um array que irá contar a frenquenci com quie os numeros aparecem

for(int answer=0;answer<responses.length;answer++){//faz a contagem de frequência e joga no segundo array
    ++frequency[responses[answer]];			
}

System.out.printf("%s%10s\n","Rating","Frequency");

for(int rating=1;rating<frequency.length;rating++){ //mostra os valores contidos no segundo array.
	System.out.printf("%6d%10d\n",rating,frequency[rating]);
	System.out.println();
}
    System.out.println("--------------------------------");  //Mostra o total de numeros contabilizados	
    System.out.printf("%6S%10d %s\n","TOTAL",responses.length,"Números");
 
    
    
    
                            PASSAGEM DE PARAMETROS UTILIZANDO UM ARRAY.
    
    		int[] array = {1,2,3,4,5};
		
		System.out.println("Passagem de referencias em por um array\n"
				+ "Valores do array original :  ");
		
		for(int value:array){
		System.out.printf("     %d",value);
		}
		
		modifyArray(array);
		
		System.out.println("\nModificando os valores da array");
		
		for(int value:array){
			System.out.printf("     %d",value);
		}
		
		System.out.printf("\nEfeitos de passagem de valores dos elementos de um array: \n"
				+ "arra[3] antes de ser moficada : %d\n",array[3]);
		
		modifyElement(array[3]);
		
		System.out.printf(
				"array[3] depois da moficação do elemento : %d\n",array[3]);
		
	}
	
	public static void modifyArray(int[] array2){
		for(int counter = 0;counter<array2.length;counter++){
			array2[counter]*=2;
		}
	}
	
	public static void modifyElement(int element){
		element*=2;
		
		System.out.printf("Valor do elemento modificado: %d\n",element);
		
		
    */
    
    
    