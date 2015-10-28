package br.com.impacta.estrutura;

public class Pilha {

       int topo;
	   int[] v;
	
	   public Pilha(){
		   v = new int[100];
		   topo = 0;
	   }
	
		public void empilhar(int x) {
			if (topo < v.length)
				v[topo++] = x;
		}
	
		public int desempilhar() {
			int resultado = 0;
			
			if (topo > 0)		
				resultado = v[--topo];
			
			return resultado;
		}
		
		public void mostrar() {
			for (int i =0 ; i < topo; i++)
				System.out.println(v[i]);
		}
	
		public boolean vazia() {
			return (topo == 0);
		}
		
		public boolean cheia(){
			return (topo == v.length);
		}
	
		public void esvaziar(){
			topo = 0;
		}
		
		public int tamanho(){
			return topo;
		}
}
