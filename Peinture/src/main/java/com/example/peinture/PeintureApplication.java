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
            iProduit.save(new Produit("Peinture rouge d'intérieur",123.3,"Rouge",1.5,"Le Roy Merlin","http://www.glow-colors.fr/Files/96851/Img/20/peinture_fluorescente_rouge_paint_red_neon_UV_actif_fluo.png"));
            iProduit.save(new Produit("Nuit bleue",68.4,"Bleu",1.1,"Castorama","https://media.castorama.fr/is/image/Castorama/peinture-murale-bleu-intense-satin-2-5l~3663602590996_37c?$MOB_PREV$&$width=768&$height=768"));
            iProduit.save(new Produit("Peinture rouge d'intérieur XL",150.6,"Rouge",2.0,"Le Roy Merlin","http://www.glow-colors.fr/Files/96851/Img/20/peinture_fluorescente_rouge_paint_red_neon_UV_actif_fluo.png"));
            iProduit.save(new Produit("Nuit bleue XL",99.99,"Bleu",2.0,"Castorama","https://media.castorama.fr/is/image/Castorama/peinture-murale-bleu-intense-satin-2-5l~3663602590996_37c?$MOB_PREV$&$width=768&$height=768"));
        };
    }

    

}
