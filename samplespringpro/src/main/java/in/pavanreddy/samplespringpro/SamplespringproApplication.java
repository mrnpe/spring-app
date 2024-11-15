package in.pavanreddy.samplespringpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SamplespringproApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamplespringproApplication.class, args);
	}

}
