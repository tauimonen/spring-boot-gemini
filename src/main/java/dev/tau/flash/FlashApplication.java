package dev.tau.flash;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlashApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ChatClient.Builder builder) {
		return args -> {
			var client = builder.build();
			String response = client.prompt("What is the approximate value of pi to six decimal places?")
					.call()
					.content();

			System.out.println(response);
		};
	}
}
