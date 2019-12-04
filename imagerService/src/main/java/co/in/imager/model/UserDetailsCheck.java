package co.in.imager.model;

import co.in.imager.exception.RequestInvalidException;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;


@Service
@Configurable
public class UserDetailsCheck {

    public void isValidUserDetails(User userDetails) throws RequestInvalidException {
        if(userDetails == null) {
            throw new RequestInvalidException("User request is invalid");
        }
        if(userDetails.getUserId() == null || userDetails.getPassword() == null) {
            throw new RequestInvalidException("User request is invalid");
        }

    }
}
