package co.in.sample.SampleHttpCache2;


import co.in.sample.GreetClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsPreparatorController {

    @Autowired
    private GreetClient greetClient;

    @GetMapping("/tell/message/{name}")
    public ResponseEntity<String> prepareAndGreet(@PathVariable String name) {
        String msg = greetClient.myGreetMsg();
        return ResponseEntity.ok(msg + name);
    }
}
