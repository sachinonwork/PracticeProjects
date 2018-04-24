package co.in.sample;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

/**
 * Created by sdanayak on 12/2/18.
 */
public class MobileNumberValidationTest {

    @Autowired
    MobileNumberValidation mobileNumberValidation;
    @Test
    public void mobileNumberIsValid() {

        String phoneNumberToTest = "39493049";

        assertTrue(mobileNumberValidation.isValid(phoneNumberToTest));
    }
}
