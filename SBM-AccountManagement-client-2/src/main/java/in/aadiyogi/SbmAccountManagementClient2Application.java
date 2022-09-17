package in.aadiyogi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SbmAccountManagementClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SbmAccountManagementClient2Application.class, args);
	}

}
