package in.co.sample.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@Api(basePath = "/mymessages", value = "My Messages", description = "Messages for the user", consumes = "application/json",
        produces = "application/json")
@RestController
public class WelcomeController {

    @RequestMapping(value = "/mymessages/{name}", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String showWelcomeMessage(@PathVariable("name") String name) {
        return "Welcome " + name;
    }


    @ApiOperation(value="For adding two number returns string of addition result", response = String.class)
    @RequestMapping(value = "/mymessages/sayNumber", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String showRandomNumber(@RequestBody RequestNumber requestNum) {
        return String.valueOf(requestNum.getNumber1() + requestNum.getNumber2());
    }
}
