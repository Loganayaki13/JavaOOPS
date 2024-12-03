package day13;


@SuppressWarnings("serial")
public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super();
	}
	
	public InvalidAgeException(String message) {
		
		super(message);
	}

}
