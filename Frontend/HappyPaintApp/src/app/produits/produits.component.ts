import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Produit } from '../model/produit';
import { produitService } from '../service/produits.service';
import { HttpErrorResponse } from '@angular/common/http';
import { Subscription } from 'rxjs';


@Component({
  selector: 'app-produits',
  templateUrl: './produits.component.html',
  styleUrls: ['./produits.component.css']
})
export class ProduitsComponent implements OnInit {


  public listproduits : Produit[];
  private subscriptions: Subscription[] = [];


  constructor(private router: Router,private produitService : produitService) { }

  ngOnInit(): void {
    this.getProduits();
    console.log(this.listproduits);
    
  }

  public getProduits(): void {
    this.subscriptions.push(
      this.produitService.getProduits().subscribe({
        next: response => 
          this.listproduits = response        
        ,
        error : err => 
          console.log(err)
          
        }
      )
    );
  }

}



