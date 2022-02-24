export class Produit{
    public id : string;
    public nom : string;
    public prix : number;
    public couleur : string;
    public capacite : number;
    public marque : string;
    public imageUrl : string;

    

    constructor(){
        this.id = '';
        this.prix = 0;
        this.nom = '';
        this.capacite = 0;
        this.couleur ='';
        this.marque = '';
        this.imageUrl = '';
    }
}
