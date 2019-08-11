package co.in.imager.simple;

import co.in.imager.controller.UserController;
import co.in.imager.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class UserControllerTest {

    @Autowired
    private UserController userController;

    @Autowired
    private User user;

    @Test
    public void shouldReturnBadRequestForInvalidBody() {

    }
}
