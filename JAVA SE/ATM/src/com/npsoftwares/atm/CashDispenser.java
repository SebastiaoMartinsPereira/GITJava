package com.npsoftwares.atm;

public class CashDispenser 
{
    private final static int  INITAL_COUNT = 500;
    private int count;
    
    public CashDispenser()
    {
    	count = INITAL_COUNT;
    }
    
    public void dispenseCash(int amount)
    {
    	int billsRequired = amount /20;   // numéro de cédulas requerido
    	count -= billsRequired;    //atualiza a contagem das cedulas
    }
    
    
    public boolean isSufficientCashAvaliable(int amount)
    {
    	int billsRequired = amount/20; 
    	if(count >= billsRequired)
    	{
    		return true;          //o valor disponóvel é sufuciene para realizar a transação
    	} 
    	else
    	{
    		return false;         //valor disponível indufuciente para realziar  a transação 
    	}
    		
    }
}
