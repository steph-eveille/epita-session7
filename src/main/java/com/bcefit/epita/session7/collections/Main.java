package com.bcefit.epita.session7.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listDeChaines = new ArrayList<>() ;

        listDeChaines.add("Salut") ;
        listDeChaines.add("C'est Stéphane") ;
        listDeChaines.add("Elément 7") ;
        listDeChaines.add("Elément 3") ;
        listDeChaines.add("Elément 5") ;

        ListeUtil.AfficheElements(listDeChaines);


        System.out.println("---------------------------------------------");

        Collections.sort(listDeChaines);

        ListeUtil.AfficheElements(listDeChaines);

        System.out.println("---------------------------------------------");
        Set<String> arbreDeChaines = new TreeSet<>() ;
        arbreDeChaines.add("Salut") ;
        arbreDeChaines.add("C'est Stéphane") ;
        arbreDeChaines.add("Elément 7") ;
        arbreDeChaines.add("Elément 3") ;
        arbreDeChaines.add("Elément 5") ;

        ListeUtil.AfficheElements(arbreDeChaines);


        List<List<Integer>> matrice = new ArrayList<>() ;

        System.out.println(matrice);

        for (int i = 0 ; i<3 ; i++) {
            List<Integer> ligne = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                ligne.add((i+1)*(j+1)) ;
            }
            matrice.add(ligne) ;

        }
        System.out.println(matrice);

        for (int i = 4 ; i<6 ; i++) {
            List<Integer> ligne = new ArrayList<>();
            for (int j = 5; j < 7; j++) {
                ligne.add((i+1)*(j+1)) ;
            }
            matrice.add(ligne) ;

        }
        System.out.println(matrice);



    }
}
