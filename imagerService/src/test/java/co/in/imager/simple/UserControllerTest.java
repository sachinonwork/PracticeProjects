/*

package co.in.imager.simple;

import co.in.imager.controller.UserController;
import co.in.imager.exception.RequestInvalidException;
import co.in.imager.model.User;
import co.in.imager.service.entities.UserEntity;
import co.in.imager.service.entities.UserRepository;
import org.apache.http.entity.ContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.net.URI;

import static io.restassured.RestAssured.given;
import static org.mockito.Matchers.any;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest extends ImagerServiceTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserRepository userRepository;

    @Test
    public void shouldReturnBadRequestForInvalidBody() throws RequestInvalidException {

        User userRequest = new User(null, "myPass");

        //Mockito.doNothing().when(userRepository.save(any(UserEntity.class)));

        given()
                .body(userRequest)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .when()
                .post(URI.create("api/v1/user"))
                .then()
                .assertThat().statusCode(HttpStatus.BAD_REQUEST.value());
    }
}
*/
