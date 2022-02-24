package com.example.peinture.DAO;

import com.example.peinture.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduit extends JpaRepository<Produit,Long> {

     Produit findProduitById(Long id);

}
