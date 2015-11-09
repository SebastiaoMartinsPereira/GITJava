package br.com.impacta.estrutura;

public class MainFila {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<Integer>();
		
		for (int i = 1; i <= 7; i++) {
			fila.inserir(i);
		}
		
//		for (int i =1; !fila.vazia(); i++) {
//			if(i%2 != 0){
//				System.out.println(fila.remover());
//			}else{
//				int alocar = fila.remover();
//				fila.inserir(alocar);
//			}
//		}
		
		System.out.println("Descartados :");
		
		while(fila.tamanho() > 1){
			System.out.printf("Carta : %2d\n",(int)fila.remover());
			fila.inserir(fila.remover());
		}
		
		System.out.println("\n\nRestante : " + fila.remover());
		
		
	}

}
