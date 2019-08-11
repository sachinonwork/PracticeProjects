package co.in.imager;

import co.in.imager.exception.RequestInvalidException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ImagerServiceExceptionHandler {

    @ExceptionHandler(RequestInvalidException.class)
    public ResponseEntity handleInvalidRequest() {
        return ResponseEntity.badRequest().build();
    }
}
