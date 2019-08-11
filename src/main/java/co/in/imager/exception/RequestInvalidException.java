package co.in.imager.exception;

public class RequestInvalidException extends Exception {

    private String message;

    public RequestInvalidException(String message) {
        this.message = message;
    }
}
