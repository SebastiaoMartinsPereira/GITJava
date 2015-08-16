package com.npsoftwares.atm;

public class Account {
	
	private int accountNumber;
	private int pin;
	private double availableBalance;    //fundo disponível para saque
	private double totalBalance;        //fundo disponível + depósitos pendentes
	
	public Account(int theAccountNumber,int thePIN,double theAvailableBalance, double theTotalBalance)
	{
		accountNumber = theAccountNumber;
		pin = thePIN;;
		availableBalance = theAvailableBalance;
		totalBalance = theTotalBalance;
	}
	
	
	//determina se o PIN especificado pelo usuário corresponde ao PIN da conta
	public boolean validatePIN(int userPIN)
	{
		if(userPIN == pin)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
    
	
	public double getAvailableBalance() {
		return availableBalance;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
	public double getTotalBalance() {
		return totalBalance;
	}
	
	
	public void credit(double amount)
	{
		totalBalance += amount;
	}
	
	
	public void debit(double amount)
	{
		totalBalance -= amount;
	}
	
}
