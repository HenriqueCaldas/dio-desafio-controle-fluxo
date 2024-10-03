package aplicacao;

public class ParametrosInvalidosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double entrada1;
	private double entrada2;
	
	public ParametrosInvalidosException(double entrada1, double entrada2) {
		super();
		this.entrada1 = entrada1;
		this.entrada2 = entrada2;
	}
	
	@Override
	public String toString() {
		
		return "O primeiro valor informado (" + entrada1 + ") não pode ser maior que o segundo valor informado (" + entrada2 + ")";
	}


	
	
}
