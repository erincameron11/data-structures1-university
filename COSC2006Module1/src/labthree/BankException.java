package labthree;

public class BankException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BankException(String errorMsg) {
		super(errorMsg);
	}
}
