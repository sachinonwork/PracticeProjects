package co.in.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GreetClient {

    @Autowired
    private RestTemplate restTemplate;
    public String myGreetMsg() {
       ResponseEntity response = restTemplate.getForEntity("/greet", String.class);
       if(response.getStatusCode().is2xxSuccessful()) {
           return String.valueOf(response.getBody());
       }
       return "";
    }
}
