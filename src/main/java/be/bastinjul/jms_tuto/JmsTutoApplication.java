package be.bastinjul.jms_tuto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"be.bastinjul.jms_tuto", "org.springframework.jms" })
public class JmsTutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsTutoApplication.class, args);
	}

}
