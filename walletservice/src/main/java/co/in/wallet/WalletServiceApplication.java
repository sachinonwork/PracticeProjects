package co.in.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class WalletServiceApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WalletServiceApplication.class, args);
	}
}
