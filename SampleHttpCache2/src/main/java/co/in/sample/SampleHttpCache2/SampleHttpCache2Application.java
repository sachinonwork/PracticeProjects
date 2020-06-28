package co.in.sample.SampleHttpCache2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "co.in.sample")
@EnableAutoConfiguration
public class SampleHttpCache2Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleHttpCache2Application.class, args);
	}

}
