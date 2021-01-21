package co.in.practice.simple.service.exceptions;

public class ServiceException extends Throwable {

    private String code;
    private String message;


    public ServiceException(String message, String code) {

        this.code = code;
        this.message = message;
    }


    public String getCode() {
        return code;
    }


    @Override
    public String getMessage() {
        return message;
    }

}
