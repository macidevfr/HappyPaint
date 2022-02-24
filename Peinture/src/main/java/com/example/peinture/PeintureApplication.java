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
            iProduit.save(new Produit("test",123.3,"Rouge",1.5,"Le Roy Merlin","http://www.glow-colors.fr/Files/96851/Img/20/peinture_fluorescente_rouge_paint_red_neon_UV_actif_fluo.png"));
        };
    }

    

}
