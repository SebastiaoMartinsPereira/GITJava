package com.npsoftwares.atm;

public class Deposit extends Transaction{
	
	private double amount;
	private Keypad keypad;
	private DepositSlot depositSlot;
	private final static int CANCELED = 0; 
	
	public Deposit(int userAccountNumber, Screen atmScreen,BankDatabase atmBankDatabase, Keypad atmKeypad,DepositSlot atmdepDepositSlot){
		
		super(userAccountNumber, atmScreen, atmBankDatabase);
		
		keypad = atmKeypad;
		depositSlot = atmdepDepositSlot;
		
	}
	
	@Override
	public void execute(){
		
		BankDatabase banckDatabase = getBankDatabase();
		Screen screen = getScreen();
		
		amount = promptForDepositAmount();
		
		if(amount != CANCELED)
		{
			screen.displayMessage("\nPlease insert a deposit envelop containg");
			screen.displayDollarAmount(amount);
			screen.displayMessageLine(".");
			
			boolean envelopReceived = depositSlot.isEnvelopeReceived();
			
			if(envelopReceived)
			{
				screen.displayMessageLine("\nYour envelope has been received."
						               +  "NOTE : the money just deposited will not be available "
						               +  "until we verify the amount of any "
						               +  "enclosed cash and your checs clear.");
                
				banckDatabase.credit(getAccountNumber(), amount);
				
			}
			else
			{
				screen.displayMessageLine("\nYou did not inseert an envelop"
						                + ",so the ATM has canceled  your transation");
			}
		}
		else
		{
			screen.displayMessageLine("\n Canceling transaction...");
		}
			
		}
	
	
    private double promptForDepositAmount()
    {
    	Screen screen = getScreen();
    	
    	screen.displayMessage("\nPlease enter a deposit amount in "
    			            + "CENTS (or 0 to cancel)");
    	int input = keypad.getInput();
    	
    	if(input == CANCELED)
    		return CANCELED;
    	else
    	{
    		return (double)input/100;
    	}
    	
    }
    
    
	}

