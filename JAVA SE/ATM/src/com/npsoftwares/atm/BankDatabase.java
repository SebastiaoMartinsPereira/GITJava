package com.npsoftwares.atm;

public class BankDatabase {
	
	private Account[] accounts;   //arry de contas
	
	public BankDatabase()
	{
		accounts = new Account[2];   //apenas duas conas para teste
 	    accounts[0] = new Account(12345, 54321, 1000.0, 1200.0);   
 	    accounts[1] = new Account(98165, 56789, 200.0, 200.0); 
	}

	private Account getAccount(int accountNumber)
	{
		for(Account currentAccount : accounts)
		{
			if(currentAccount.getAccountNumber() == accountNumber)
				return currentAccount;
		}
		
		return null;
	}
	
	
	public boolean authenticatUser(int userAccountNumber,int userPIN)
	{
		Account userAccount = getAccount(userAccountNumber);
		
		
		//se a conta existir retorna o resultado do método validadePIN
		if(userAccount != null)
		{
			return userAccount.validatePIN(userPIN);
		}
		else
		{
			return false;
		}
	}
	
	
	//retona o saldo disponível para o número da conta especificado
    public double getAvailableBalance(int userAccountNumber)
    {
    	return getAccount(userAccountNumber).getAvailableBalance();
    }
    
    
       //retorna o total para o npumeor da conta especificado
    public double getTotalBalance(int userAccountNumber)
    {
    	return getAccount(userAccountNumber).getTotalBalance();
    }
    
    //realiza o depósito na conta
    public void credit(int userAccountNumber,double amount)
    {
    	getAccount(userAccountNumber).credit(amount);
    }
    
    
    //débita da conta
    public void debit(int userAccountNumbr,double amount)
    {
    	getAccount(userAccountNumbr).debit(amount);
    }
    
    
    
}

