package br.com.impacta.modelos.exceptions;

public class BonificacaoIllegalException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BonificacaoIllegalException(String message){
		super(message);	
	}
	
	public BonificacaoIllegalException(String message,Exception e){
		super(message, e);	
	}

	public BonificacaoIllegalException(String message,double bonificacao){
		super(message + "\n O valor informado foi " + bonificacao);	
	}
	
    
	@Override
	public String getMessage() {
		
		return super.getMessage() + "\nNão posso bonificar valor negativo;\n";
	}
	
}
