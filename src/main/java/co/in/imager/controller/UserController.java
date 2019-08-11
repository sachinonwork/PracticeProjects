package co.in.imager.controller;


import co.in.imager.model.User;
import co.in.imager.model.UserDetailsCheck;
import co.in.imager.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/v1/user")
public class UserController {

    @Autowired
    private UserDetailsCheck userDetailsCheck;
    private UserRegisterService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User userBody) {

        if (!userDetailsCheck.isValidUserDetails(userBody)) {
            return ResponseEntity.badRequest().build();
        }
        userService.createUser(userBody);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
}
