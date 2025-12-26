package com.priorityreminder;
import java.util.TimeZone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PriorityReminderSystemApplication {

	public static void main(String[] args) {
		 TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		SpringApplication.run(PriorityReminderSystemApplication.class, args);
	}

}
