package co.in.sample.SampleHttpCache1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataExposeController {

    private static final Logger LOG = LoggerFactory.getLogger(DataExposeController.class);

    @GetMapping("/greet")
    public ResponseEntity<String> ObtainGreetings() {
        LOG.info("Called to get greet");
        return  ResponseEntity.ok("This is my greetings");
    }
}
