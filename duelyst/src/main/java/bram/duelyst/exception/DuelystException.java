package bram.duelyst.exception;

public class DuelystException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DuelystException(String message) {
		super(message);
	}
	
	public DuelystException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
}
