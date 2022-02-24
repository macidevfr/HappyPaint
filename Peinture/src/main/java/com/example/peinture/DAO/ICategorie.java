package com.example.peinture.DAO;

import com.example.peinture.Entities.Categorie;
import com.example.peinture.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategorie extends JpaRepository<Categorie,Long> {

    Categorie findCategorieById(Long id);
}
