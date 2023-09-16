package io.nerd.jdbcclientdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class JdbcClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdbcClientDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println(LocalDate.now());
        };
    }
}

