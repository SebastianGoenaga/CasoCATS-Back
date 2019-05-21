package edu.eci.arep.CasoCATS_Back;

public class SuperEasyExeption  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SuperEasyExeption(String message) {
        super(message);
    }

    public SuperEasyExeption(String message, Throwable cause) {
        super(message, cause);
    }

}
