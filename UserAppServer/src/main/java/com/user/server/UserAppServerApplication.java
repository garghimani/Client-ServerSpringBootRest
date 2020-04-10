package com.user.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.user.server"})
//@ComponentScan("com.user.*")  ----exclude={DataSourceAutoConfiguration.class}, -- scanBasePackages = { "com.user.db*" },
public class UserAppServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAppServerApplication.class, args);
		System.out.println("Inside application");
	}

}
