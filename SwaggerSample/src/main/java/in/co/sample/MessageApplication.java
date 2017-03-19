package in.co.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("in.co.sample")
public class MessageApplication {

    public static void main(String args[]) {
        SpringApplication.run(MessageApplication.class, args);
    }
}
