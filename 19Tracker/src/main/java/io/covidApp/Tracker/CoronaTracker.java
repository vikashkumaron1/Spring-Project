package io.covidApp.Tracker;

import io.covidApp.Tracker.model.Location;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableScheduling
public class CoronaTracker {

	public static void main(String[] args) {
		SpringApplication.run(CoronaTracker.class, args);
	}
}

