package co.in.sample;

/**
 * Created by sdanayak on 12/2/18.
 */
public class MobileNumberValidation {

    private final String contactListType;
    private final String countryCode;

    public MobileNumberValidation(String countryCode, String contactListTypeId){
        this.countryCode = countryCode;
        this.contactListType = contactListTypeId;
    }

    public boolean isValid(String phoneNumberToTest) {


    }
}
