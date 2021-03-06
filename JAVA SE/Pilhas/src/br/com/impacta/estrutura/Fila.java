package br.com.impacta.estrutura;

public class Fila<T>{

     T []item;
 
     final int MAX = 100;  

     int fim, inicio, cont;
    
     @SuppressWarnings("unchecked")
	public Fila(){
	    item = (T[])new Object[MAX];
        fim = 0;
        inicio = 0;
        cont = 0; 

     } 

     public void inserir(T valor){
         if (!cheia()){
            item[fim] = valor;
            fim = (fim + 1) % MAX;    
            cont++;    
         }
     }


     T remover(){
         if (vazia()) {
             System.out.println("pilha vazia!");
             return null;
         }
            
         T valor = item[inicio];
         inicio = (inicio + 1) % MAX; 
         cont--;
         return valor;        
     }

     int tamanho(){
        return cont;
     } 

     T inicio(){
         return item[inicio];
     }


     boolean cheia(){
	    return (cont == MAX);
     }

     boolean vazia(){
        return (cont == 0); 
     }

     void esvaziar(){
         inicio = 0;
         fim = 0;
         cont = 0;
     }
}