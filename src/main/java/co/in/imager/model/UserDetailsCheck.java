package co.in.imager.model;

import co.in.imager.exception.RequestInvalidException;

public class UserDetailsCheck {

    public void isValidUserDetails(User userDetails) throws RequestInvalidException {
        if(userDetails == null) {
            throw new RequestInvalidException("User request is invalid");
        }
        if(userDetails.getName() == null) {
            throw new RequestInvalidException("User request is invalid");
        }
        if(userDetails.getAuthData() == null) {
            throw new RequestInvalidException("User request is invalid");
        }
    }
}
