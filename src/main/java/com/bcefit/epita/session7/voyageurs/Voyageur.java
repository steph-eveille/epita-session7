package com.bcefit.epita.session7.voyageurs;


import com.bcefit.epita.session7.collections.ClasseSiege;

public class Voyageur implements Comparable{
    private static int compteurVoyageur = 0 ;

    private int numeroVoyageur ;

    private final int numeroSiege ;

    private ClasseSiege classeSiege ;

    private final String nomVoyageur ;

    private int ordreAppel ;


    public Voyageur(int numeroSiege, ClasseSiege classeSiege, String nomVoyageur) {
        this.numeroSiege = numeroSiege;
        this.classeSiege = classeSiege;
        this.nomVoyageur = nomVoyageur;
        compteurVoyageur++ ;
        this.numeroVoyageur = compteurVoyageur ;

        this.ordreAppel = classeSiege.getOrdreAppel() * 1000 + this.numeroSiege ;
    }

    public void Display() {
        System.out.println( "Voyageur :" +
                "Siège = " + this.numeroSiege +
                ", \tClasse = " + this.classeSiege +
                ", \tNom = " + this.nomVoyageur +
                ", \tN° = " + numeroVoyageur +
                ", \tOrdre d'appel =" + ordreAppel + ".");
    }

    @Override
    public String toString() {
        return "Voyageur :" +
                "Siège = " + this.numeroSiege +
                ", \tClasse = " + this.classeSiege +
                ", \tNom = " + this.nomVoyageur +
                ", \tN°=" + numeroVoyageur +
                ", \tOrdre d'appel =" + ordreAppel + ". ****\n"        ;
    }

    @Override
    public int compareTo(Object autreObjet) {

        Voyageur autreVoyageur = (Voyageur) autreObjet ;

        return Integer.compare(this.ordreAppel, autreVoyageur.ordreAppel);
    }
}
