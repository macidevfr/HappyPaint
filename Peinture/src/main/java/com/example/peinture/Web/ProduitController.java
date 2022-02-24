package com.example.peinture.Web;

import com.example.peinture.Entities.Produit;
import com.example.peinture.Services.ProduitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/produits")
public class ProduitController {

    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Produit>> getAllCars(){
        return new ResponseEntity<>(produitService.findAllProduits(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Produit> addCar(@RequestBody Produit produit){
        return new ResponseEntity<>(produitService.addProduit(produit),HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Produit> updateCar(@RequestBody Produit produit){
        return new ResponseEntity<>(produitService.updateProduit(produit),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable("id") Long id){
        produitService.deleteProduit(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
