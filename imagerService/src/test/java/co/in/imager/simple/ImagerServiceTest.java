package co.in.imager.simple;

import co.in.imager.ImagerServiceExceptionHandler;
import co.in.imager.controller.UserController;
import co.in.imager.model.User;
import co.in.imager.service.entities.UserRepository;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@RunWith(MockitoJUnitRunner.class)
public class ImagerServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserController userController;

    @InjectMocks
    private ImagerServiceExceptionHandler exceptionHandler;

    @BeforeClass
    public static void setup() {

        RestAssuredMockMvc.standaloneSetup(new UserController());
       /* String port = System.getProperty("server.port");

        if(port == null) {
           RestAssured.port = Integer.valueOf(8080);
        } else {
            RestAssured.port = Integer.valueOf(port);
        }

        String basePath = System.getProperty("server.base");
        if(basePath==null){
            basePath = "/imagerService/";
        }
        RestAssured.basePath = basePath;

        String baseHost = System.getProperty("server.host");
        if(baseHost==null){
            baseHost = "http://localhost";
        }
        RestAssured.baseURI = baseHost;*/
    }

    @Test
    public void userCreatedSuccessfully() {

       // Mockito.doNothing().when(userRepository.save(any(UserEntity.class)));
       // User user = new User("myUser", "PasswordSample");

        given()
                .contentType(APPLICATION_JSON.toString())
                .body("{\"userId\" : \"kimSami\", \"password\" : \"samplePass\"}")
                //.body(user)
                .when()
                .post("http://localhost:8080/api/v1/user")
                .then()
                .status(HttpStatus.CREATED);
    }
}
