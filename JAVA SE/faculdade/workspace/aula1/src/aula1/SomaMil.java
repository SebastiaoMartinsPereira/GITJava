package aula1;

public class SomaMil {

	public static void main(String[] args) {
		
		int resultado = 0;
		
		for(int num = 1; num<=1000; num++){
			resultado = num + resultado;
		}
		
		System.out.println(resultado);
	}
}
