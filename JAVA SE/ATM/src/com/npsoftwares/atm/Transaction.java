package com.npsoftwares.atm;

public abstract class Transaction {

	private int accountNumber;
	private Screen screen; //tela do atm
	private BankDatabase bankDataBase; //banco de dados com informações da conta

	public Transaction(int userAccountNumber ,Screen atmScreen,BankDatabase atmBankDatabase)
	{
		super();
		accountNumber = userAccountNumber;
		screen = atmScreen;
		bankDataBase = atmBankDatabase;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public Screen getScreen()
	{
		return screen;
	}
	
	public BankDatabase getBankDatabase()
	{
		return bankDataBase;
	}
	
	public abstract void execute();
}
