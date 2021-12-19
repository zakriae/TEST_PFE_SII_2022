package sii.maroc;


public class UnvailableDishException extends RuntimeException{

    public UnvailableDishException (String message) {
        super(message);
    }

    public UnvailableDishException (String message, Throwable cause) {
        super(message, cause);
    }
}