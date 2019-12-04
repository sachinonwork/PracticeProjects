package co.in.imager.controller;


import co.in.imager.exception.RequestInvalidException;
import co.in.imager.model.User;
import co.in.imager.model.UserDetailsCheck;
import co.in.imager.service.UserRegisterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController(value = "/api/v1/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserDetailsCheck userDetailsCheck;
    @Autowired
    private UserRegisterService userService;

    @PostMapping (consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<User> createUser(@RequestBody User userBody) throws RequestInvalidException {
        LOGGER.info("Request has user: {}", userBody.getUserId());
.danayak        userDetailsCheck.isValidUserDetails(userBody);
        userService.createUser(userBody);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
}
