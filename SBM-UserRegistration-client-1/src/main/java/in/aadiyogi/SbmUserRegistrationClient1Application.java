package in.aadiyogi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SbmUserRegistrationClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(SbmUserRegistrationClient1Application.class, args);
	}

}
