package by.ivan.itspartnertestn7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class ItspartnerTestN7Application {

	public static void main(String[] args) {
		SpringApplication.run(ItspartnerTestN7Application.class, args);
	}
}
