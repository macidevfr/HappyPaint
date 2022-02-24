package com.example.peinture;

import com.example.peinture.DAO.IProduit;
import com.example.peinture.Entities.Produit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PeintureApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeintureApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(IProduit iProduit) {
        return args -> {
        };
    }

    

}
