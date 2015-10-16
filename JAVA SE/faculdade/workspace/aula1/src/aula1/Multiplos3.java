package aula1;

public class Multiplos3 {

	public static void main(String[] args) {

		String resultado = "";
		
		for(int num = 1; num<=100;num++){
			if(num%3==0){
				resultado=resultado+num+"\n";				
			}
		}
		
		System.out.println(resultado);
	}
}
