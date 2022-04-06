package lol.gilliard.awslambdademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Locale;
import java.util.function.Function;

@SpringBootApplication
public class AwsLambdaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsLambdaDemoApplication.class, args);
	}

	@Bean
	public Function<AwsEvent, String> uppercase () {
		return event -> event.value.toUpperCase();
	}

	public static class AwsEvent {
		public String value;
	}
}
