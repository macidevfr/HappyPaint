import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse, HttpErrorResponse, HttpEvent } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { Observable } from 'rxjs';

import { CustomHttpRespone } from '../model/custom-http-response';
import { Produit } from '../model/produit';

@Injectable({providedIn: 'root'})
export class produitService {
  private host = environment.apiUrl;

  constructor(private http: HttpClient) {}

  public getProduits(): Observable<Produit[]> {
    return this.http.get<Produit[]>(`${this.host}/produits/list`);
  }
}
