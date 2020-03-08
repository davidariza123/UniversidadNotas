package Excepciones;

public class Error extends Exception {
	
	private String message;

	public Error(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
	
	
	

}
