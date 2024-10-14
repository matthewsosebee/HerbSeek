package demo.herbseek.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) //Do not use this in production - this is just for testing locally for this demo.
public class HerbSeekApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerbSeekApiApplication.class, args);
	}
}
