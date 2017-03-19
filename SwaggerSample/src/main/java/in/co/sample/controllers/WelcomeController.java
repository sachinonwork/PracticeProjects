package in.co.sample.controllers;

import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@Api(basePath = "/mymessages", value = "My Messages", description = "Messages for the user", produces = "application/json")
@RestController

public class WelcomeController {

    @RequestMapping(value = "/mymessages/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String showWelcomeMessage(@PathParam("name") String name) {
        return "Welcome " + name;
    }
}
