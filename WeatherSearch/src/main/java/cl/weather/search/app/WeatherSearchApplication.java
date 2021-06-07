package cl.weather.search.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"cl.weather.search"})
@SpringBootApplication
public class WeatherSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherSearchApplication.class, args);
	}

}
