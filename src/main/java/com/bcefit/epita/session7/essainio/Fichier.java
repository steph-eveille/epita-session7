package com.bcefit.epita.session7.essainio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fichier {

    private String nom ;

    private List<String> lignes ;

    private Path chemin ;

    Fichier(String nom) {
        this.nom = nom;
        // C:\Users\steph\OneDrive\Documents\2023-03-23 Java\paroles.txt
        this.chemin = Paths.get(nom) ;
    }

    public void lireFichier() {
        try {
            this.lignes = Files.readAllLines(this.chemin, StandardCharsets.UTF_8);
        }
        catch (IOException e) {
            System.err.println("Erreur de lecture du fichier " + this.nom);
            e.printStackTrace();

        }
    }

    public void afficherLeFichier(){
        for (String ligne : lignes)
        {
            System.out.println(ligne);
        }

    }

    public void rangerLesMots() {
        Map<String, Integer> occurences = new HashMap<>() ;

        for (String ligne : lignes){
            // lire la ligne
            String[] mots =  ligne.split("[,' ]");
            for (String mot : mots){
                int nbOccurences = occurences.getOrDefault(mot, 0) ;
                occurences.put(mot, ++nbOccurences) ;
            }

        }
        System.out.println(occurences);
    }

}
