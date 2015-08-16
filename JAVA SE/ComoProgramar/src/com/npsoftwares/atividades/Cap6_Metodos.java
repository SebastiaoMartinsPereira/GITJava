package com.npsoftwares.atividades;


public class Cap6_Metodos {

	public static void main(String[] args) {
		
		
		
	}
	
}
/*		//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
		//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
		//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
		
	 	//	Jogo Craps
		
		Craps game = new Craps();
		int x = 0,wins=0,lost=0;
		
		String resul;
		while (x<10){
			
		resul = game.play().name();
		
		if (resul == "LOST")
		{
			lost++;
		}
		else
		{
			wins++;
		}
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
			x++;
		}
		
		System.out.println("Vitorias : " + wins
				           +"\nDerrotas :" + lost);
		
	}
	
}	*/
	//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
	//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
	//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
	
 	//	ATIVIDADE 5.22
	
	
		
/* for (int i = 1; i <= 500; i++)
    for (int j = 1; j <= 500; j++)
        for (int k = 1; k <= 500; k++)
        {
                System.out.printf("i = %s, j = %s, k = %s\n",i,j,k);
	    // i como hypotenuse
	    if(Math.pow(i,2)==(Math.pow(j,2)+Math.pow(k,2)))
	            System.out.printf("side1 = %s, side2 = %s, hypotenuse = %s.\n %s == %s+%s\n",j,k,i,Math.pow(j,2),Math.pow(k,2),Math.pow(i,2));
	    // j como hypotenuse
	    if(Math.pow(j,2)==(Math.pow(i,2)+Math.pow(k,2)))
	            //System.out.printf("side1 = %s, side2 = %s, hypotenuse = %s.\n",i,k,j);
	            System.out.printf("side1 = %s, side2 = %s, hypotenuse = %s.\n %s == %s+%s\n",i,k,k,Math.pow(i,2),Math.pow(k,2),Math.pow(j,2));
	    // k como hypotenuse
	    if(Math.pow(k,2)==(Math.pow(i,2)+Math.pow(j,2)))
	            System.out.printf("side1 = %s, side2 = %s, hypotenuse = %s.\n",i,j,k);
	            System.out.printf("side1 = %s, side2 = %s, hypotenuse = %s.\n %s == %s+%s\n",i,j,k,Math.pow(i,2),Math.pow(j,2),Math.pow(k,2));
        }
	}
  }*/
		
	//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
	//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
	//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
	
 	//	ATIVIDADE 5.20
	
	
/*		int i=0;
	    double pi=0;
	    double divisor=3;
		while(i < 2000000D){
			
			if(i==0){
				pi=4;
			}else if(i==1){
				pi=(double)pi-(4.0/divisor);
				divisor+=2;
			}else if(i%2==0){
				pi=(double)pi+(4.0/divisor);
				divisor+=2;
			}else{
				pi=(double)(pi-(4.0/divisor));
				divisor+=2;
			}
			System.out.println(pi);
		i++;
		}
		System.out.println(pi);
		
		*/
		
		
		//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
		//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
		//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
		
     	//	ATIVIDADE 5.11
		
         /*		@SuppressWarnings("unused")
		int qtdVezes;
		double num,menor=0.0;
		int i=1;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números a ser informado:");
		qtdVezes = scan.nextInt();
		System.out.println();
		
		do{
			 
			num=Math.random();
			System.out.print("valor do numero "+i+":   "+(int)(num*10));
			System.out.println();

			if(i==1){
				menor= num;
			}else{
				if(num<menor){
					menor= num;
				}
			}
		
			i+=1;
		 }while(i<=qtdVezes);
		
		System.out.println(menor);
		scan.close();*/
		
		//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
		//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
		//++==++==++==++==++=+++=++++=+=+=+=++++=+=++=+=+=+=++=+=+=+=++=++++=++======++=+++==++=+=+==+=+=+=+=+=+=+
		
		/*  Atvidade 5.10
       int count1=0,count2=0;
		for(int i=1 ;i<=10;i++){
			count1+=1;
			for(int j=1;j<=5;j++){
				System.out.print("@");
				count2+=1;
				System.out.println();
			}
			
		}
	System.out.println(count1+"   "+ count2);*/
	
