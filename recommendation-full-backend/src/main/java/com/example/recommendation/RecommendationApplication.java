package com.example.recommendation;

import com.example.recommendation.model.User;
import com.example.recommendation.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RecommendationApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecommendationApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(UserRepository userRepository) {
        return args -> {
            User user = new User("Jean Dupont", "jean.dupont@example.com");
            userRepository.save(user);

            System.out.println("Utilisateur enregistré : " + user.getName());
        };
    }
}
