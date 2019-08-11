package co.in.imager.model;

public class UserDetailsCheck {

    public boolean isValidUserDetails(User userDetails) {
        if(userDetails == null) {
            return Boolean.FALSE;
        }
        if(userDetails.getName() == null) {
            return Boolean.FALSE;
        }
        if(userDetails.getAuthData() == null) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
