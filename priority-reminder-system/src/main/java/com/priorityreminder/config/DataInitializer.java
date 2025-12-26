package com.priorityreminder.config;

import com.priorityreminder.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DataInitializer {

    private final TaskRepository taskRepository;

    @Bean
    CommandLineRunner initDb() {
        return args -> {
            System.out.println("DB initialized. Task count = " + taskRepository.count());
        };
    }
}
