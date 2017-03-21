package in.co.sample.controllers;

import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api(basePath = "/mymessages", value = "My Messages", description = "Messages for the user", produces = "application/json")
@RestController

public class WelcomeController {

    @RequestMapping(value = "/mymessages/{name}", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String showWelcomeMessage(@PathVariable("name") String name) {
        return "Welcome " + name;
    }
}
