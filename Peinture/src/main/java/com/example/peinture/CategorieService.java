package com.example.peinture;

import com.example.peinture.DAO.ICategorie;
import com.example.peinture.Entities.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    private final ICategorie iCategorie;

    @Autowired
    public CategorieService(ICategorie iCategorie) {
        this.iCategorie = iCategorie;
    }

    public Categorie addCategorie(Categorie categorie) {
        return iCategorie.save(categorie);
    }

    public Categorie updateCategorie(Categorie categorie) {
        return iCategorie.save(categorie);
    }

    public void deleteCategorie(Categorie categorie) {
        iCategorie.delete(categorie);
    }

    public List<Categorie> findAllCategories() {
        return iCategorie.findAll();
    }

    public Categorie findCategorieById(Long id) {
        return iCategorie.findCategorieById(id);
    }
}
