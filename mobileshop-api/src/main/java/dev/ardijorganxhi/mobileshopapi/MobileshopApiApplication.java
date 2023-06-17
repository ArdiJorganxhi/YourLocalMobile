package dev.ardijorganxhi.mobileshopapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MobileshopApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileshopApiApplication.class, args);
	}

}
