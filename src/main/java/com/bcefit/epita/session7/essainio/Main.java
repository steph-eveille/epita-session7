package com.bcefit.epita.session7.essainio;



public class Main {
    public static void main(String[] args) {

        Fichier fich = new Fichier("C:\\Users\\steph\\OneDrive\\Documents\\2023-03-23 Java\\paroles.txt") ;

        fich.lireFichier();
        fich.afficherLeFichier();

        fich.rangerLesMots();
    }
}
