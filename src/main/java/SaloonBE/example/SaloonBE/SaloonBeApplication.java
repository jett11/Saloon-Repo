package SaloonBE.example.SaloonBE;

import ch.qos.logback.core.CoreConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaloonBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaloonBeApplication.class, args);
		System.out.println("First push to test code changes");
		System.out.println("Second Commit ");
	}

}
