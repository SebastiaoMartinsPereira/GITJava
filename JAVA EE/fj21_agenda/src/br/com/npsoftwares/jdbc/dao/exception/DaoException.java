package br.com.npsoftwares.jdbc.dao.exception;

public class DaoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Exception ex;
	private String msg;
	
    public DaoException()
	{
		
	}
	
	public DaoException(String msg)
	{
		super(msg );
		
	}
	
	public DaoException(String msg, Exception ex)
	{
		super(msg , ex);
	}
	
	
	public Exception getEx() {
		return ex;
	}

	public void setEx(Exception ex) {
		this.ex = ex;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	
}
