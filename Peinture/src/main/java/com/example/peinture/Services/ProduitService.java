package com.example.peinture.Services;

import com.example.peinture.DAO.IProduit;
import com.example.peinture.Entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {

    private final IProduit iProduit;

    @Autowired
    public ProduitService(IProduit iProduit) {
        this.iProduit = iProduit;
    }

    public Produit addProduit(Produit produit){
        return iProduit.save(produit);
    }

    public Produit updateProduit(Produit produit){
        return iProduit.save(produit);
    }

    public void deleteProduit(Long id){
         iProduit.deleteById(id);
    }

    public List<Produit> findAllProduits(){
        return iProduit.findAll();
    }

    public Produit findProduitById(Long id){
        return iProduit.findProduitById(id);
    }

}

