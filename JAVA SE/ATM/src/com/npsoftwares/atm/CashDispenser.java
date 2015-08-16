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
    	int billsRequired = amount /20;   // num�ro de c�dulas requerido
    	count -= billsRequired;    //atualiza a contagem das cedulas
    }
    
    
    public boolean isSufficientCashAvaliable(int amount)
    {
    	int billsRequired = amount/20; 
    	if(count >= billsRequired)
    	{
    		return true;          //o valor dispon�vel � sufuciene para realizar a transa��o
    	} 
    	else
    	{
    		return false;         //valor dispon�vel indufuciente para realziar  a transa��o 
    	}
    		
    }
}
