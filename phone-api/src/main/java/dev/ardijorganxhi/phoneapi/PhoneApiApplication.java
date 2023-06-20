package dev.ardijorganxhi.phoneapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PhoneApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneApiApplication.class, args);
	}

}
