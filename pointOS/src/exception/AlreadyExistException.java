package exception;



public class AlreadyExistException extends Exception {
	public AlreadyExistException() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getExistError() {
		return existError;
	}
	public void setExistError(int existError) {
		this.existError = existError;
	}
	private int existError;
}
