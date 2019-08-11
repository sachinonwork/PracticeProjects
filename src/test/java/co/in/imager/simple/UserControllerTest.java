package co.in.imager.simple;

import co.in.imager.controller.UserController;
import co.in.imager.exception.RequestInvalidException;
import co.in.imager.model.User;
import co.in.imager.service.entities.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserRepository userRepository;

    @Test (expected = RequestInvalidException.class)
    public void shouldReturnBadRequestForInvalidBody() throws RequestInvalidException {

        User userRequest = new User("James", "", null, null, null);
        /*userRequest.setName("James");
        userRequest.setAuthData(null);*/
        userController.createUser(userRequest);
    }
}
