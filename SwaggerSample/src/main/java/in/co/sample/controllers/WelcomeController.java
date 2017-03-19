package in.co.sample.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

//@Api(basePath = "/landlords", value = "Landlords", description = "Operations with Landlords", produces = "application/json")
@RestController

public class WelcomeController {

    @RequestMapping(value = "/mymessages", produces = MediaType.APPLICATION_JSON_VALUE)
    public String showWelcomeMessage(@PathParam("name") String name) {
        return "Welcome " + name;
    }
}
