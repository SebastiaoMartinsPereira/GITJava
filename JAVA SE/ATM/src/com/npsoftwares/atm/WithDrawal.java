package com.npsoftwares.atm;

public class WithDrawal extends Transaction{//Representa uma trasa��o de saque no ATM
	
	private double amount;   //quantia a sacar
	//refer�ncia a objetos associados 
    private Keypad keypad; //teclado do atm
    private CashDispenser cashDispenser;  //dipensador de celulas
    
    //op��o cancelar do menu
    private final static int CANCELED =6;
    

	//contrutor sem agumentos
	public WithDrawal(int userAccountNumber,Screen atmScreen, BankDatabase atmBankDatabase, Keypad atmKeypad,
			CashDispenser atmCashDispenser)
	{	
		super(userAccountNumber, atmScreen, atmBankDatabase);
		
		keypad = atmKeypad;
		cashDispenser = atmCashDispenser;
	}
	
	@Override
	public void execute()
	{
		boolean cashDispensed = false;  //cedulas ainda n�o entregues
		double availableBalance;  //quantia dispon�vel para saque
		
		BankDatabase bankDataBase = getBankDatabase();
		Screen screen = getScreen();
		
		
		do
		{
			amount = displayMenuofAmounts();
			
			if(amount != CANCELED)
			{
				availableBalance = bankDataBase.getAvailableBalance(getAccountNumber());
				
				if(amount <= availableBalance)
				{
					if(cashDispenser.isSufficientCashAvaliable((int)amount))
					{
						bankDataBase.debit(getAccountNumber(), amount);
						cashDispenser.dispenseCash((int)amount);
						cashDispensed = true;
						
						screen.displayMessageLine("\n Your cash has been dispensed.Please take your cash now.");
					}
					else //o dispensadoor de c�dulas n�o tem o suficiente
					{
						screen.displayMessageLine("\n insufficient available in he ATM."
								                + "\n\n Please choose a smller amount");
				    }
				}
				else  //n�o ha dinheiro disp�n�vel dna coonta do usu�rio
				{
					screen.displayMessageLine("\n insufficient available in your account."
			                + "\n\n Please choose a smller amount");
				}
			}
			else
			{
				screen.displayMessageLine("\nCanceling transation...");
				return;
			}
		}while(!cashDispensed);
	}
	
	private int displayMenuofAmounts()
	{
		int userChoice = 0;  //vari�vel local para armazenar o vaor do retorno
		
		Screen screen= getScreen();   //obt�m a refer�nciia da tela
		
		int[] amounts = {0, 20, 40, 60, 100, 200};
		
		while(userChoice == 0)
		{
			screen.displayMessageLine("\nWithDrawal Menu:"
					                + "\n1 - $20"
					                + "\n2 - $40"
					                + "\n3 - $60"
					                + "\n4 - $100"
					                + "\n5 - $200"
					                + "\n6 - $Cancel transaction"
					                + "\nchosse a withdrawal amount: ");
			int input = keypad.getInput();  //obten a entrada pelo teclado
			
			//determina como proseguir com base no vaor de entrada
			switch(input)
			{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				userChoice = amounts[input];  //salva a escolha do usu�rio
				break;
			case CANCELED:
				userChoice = CANCELED;
				break;
			default:  //o usu�rio n�ao inseriu um valor entre 0 e 6
				screen.displayMessageLine("\n Invalid selection .Try again...");
			}
		}
		
		return userChoice;
	}
}

