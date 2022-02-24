package com.example.peinture.Entities;

import com.example.peinture.Entities.Categorie;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Double prix;
    private String couleur;
    private Double capacite;
    private String marque;
    private String imageUrl;



    public Produit(String nom, Double prix, String couleur, Double capacite, String marque,String imageUrl) {
        this.nom = nom;
        this.prix = prix;
        this.couleur = couleur;
        this.capacite = capacite;
        this.marque = marque;
        this.imageUrl = imageUrl;

    }
}
