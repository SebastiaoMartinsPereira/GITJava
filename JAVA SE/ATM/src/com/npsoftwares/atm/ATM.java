package com.npsoftwares.atm;

public class ATM {
	
	
	private boolean userAuthenticated;    //usu�rio autenticadoou n�o
	private int currentAccountNumber;  //n�mero da conta atual
	private Screen screen;    //tela do ATM
	private Keypad keypad ; //teclado do ATM
	private CashDispenser cashDispenser; //dispensador de c�duas do ATM
	private DepositSlot depositSlot;  //aberura para dep�sito  do ATM
	private BankDatabase bankDatabase;  //banco de dados com informa��es da conta.
	
	//op��es do menu principal
	private static final int BALANCE_INQUERY = 1;
	private static final int WITHDRAWAL = 2;
	private static final int DEPOSIT = 3;
	private static final int EXIT = 4;
	
	
	public ATM()
	{
		userAuthenticated = false;  //usu�rio n�o foi autenticado para iniciar
		currentAccountNumber = 0;   //nenhum n�mro atual de conta para iniciar
		screen = new Screen();      //criar a tela
		keypad = new Keypad();      // cria o teclado 
		cashDispenser = new CashDispenser();  // cria o dispensador de cedulas
		depositSlot = new DepositSlot();   //cria abertura para dep�sito
		bankDatabase = new BankDatabase();  //banco de dados com informa��es da conta.
	}
	
	
	public void run()
	{
		
		while(true)
		{
			
			while(!userAuthenticated)
			{
				screen.displayMessageLine("\nWelcome");
				authenticateUser();   //autentica o usu�rio
			}
			
			performTransactions();  //usu�rio autenticado
			userAuthenticated = false;   //reinicia antes da pr�xima se��o
			currentAccountNumber = 0;    // reinicia antes da pr�xima se��o.
			screen.displayMessageLine("\nThank you Goodbye!!");
		}
		
	}
	
	
	private void authenticateUser()
	{
		screen.displayMessage("\nPlease enter your account number: ");
		int accountNumber = keypad.getInput();  //solicita o n�mero da conta
		screen.displayMessage("\nEnter your PIN");
		int pin = keypad.getInput();   //solicita o PIN
		
		userAuthenticated = bankDatabase.authenticatUser(accountNumber,pin);
		
		if(userAuthenticated)
		{
			currentAccountNumber = accountNumber;  //salva a conta do usuario
		}
		else
		{
			screen.displayMessage("Invalid account number or PIN. Please try again.");
		}
		
	}	
	
	
		private void performTransactions()
		{
			Transaction currentTransaction = null;
			
			boolean userExited = false; //usu�rio saiu ou n�o
			
			while(!userExited)
			{
				int mainMenuSelection = displayMainMenu();
				
				switch (mainMenuSelection) 
				{
				//op��es de escolha do usu�rio
				case BALANCE_INQUERY:
				case WITHDRAWAL:
				case DEPOSIT:
					//inicializa o novo objeto
					currentTransaction = createTransaction(mainMenuSelection);
					
					currentTransaction.execute();  //executa a transa��o
					break;
				case EXIT:
					screen.displayMessageLine("\nExiting the system...");
					userExited = true;  //termina a se��o do ATM
					break;
				default:
					screen.displayMessageLine("\nYou did not enter a calid selection . Try again.");
					break;
				}
			}
		}
		
		private int displayMainMenu()
		{
			screen.displayMessageLine("\nMain Menu:"
					                  + "\n1 - View my balance"
					                  + "\n2 - Withdraw cash"
					                  + "\n3 - Deposit funds"
					                  + "\n4 - Exit\n"
					                  + "Enter your choice:");
			return keypad.getInput();  // retorna a sele��o do usu�rio
		}
		
		
		//retorna o objeto da classe Transaction especificada
		private Transaction createTransaction(int type)
		{
			
			Transaction temp = null;   //vari�vel Transacion temp�raria
			
			//determina que tipo deve ser criado
			switch(type)
			{
			case BALANCE_INQUERY:
				temp = new BalanceInquiry(currentAccountNumber,screen,bankDatabase);
				break;
			case WITHDRAWAL:
				temp = new WithDrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
				break;
			case DEPOSIT:
				temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
			}
			
			return temp; // retorna o objeto rec�m criado
		}
		
	}
   
