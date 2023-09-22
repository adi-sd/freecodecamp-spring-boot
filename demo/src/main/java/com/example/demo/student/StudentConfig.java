package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student miriam = new Student(1L, "Miriam Maisal", "miriam.maisal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 7));
            Student joel = new Student("Joel Maisal", "joel.maisal@gmail.com",
                    LocalDate.of(1999, Month.JANUARY, 3));

            repository.saveAll(List.of(miriam, joel));
        };
    }
}
