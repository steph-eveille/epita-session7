package com.bcefit.epita.session7.voyageurs;

import com.bcefit.epita.session7.collections.ClasseSiege;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Voyageur voyageur0115 = new Voyageur(5, ClasseSiege.PREMIERE, "Trevor") ;
        voyageur0115.Display();
        Voyageur voyageur0001 = new Voyageur(24, ClasseSiege.ECO, "Vincent") ;
        voyageur0001.Display();
        Voyageur voyageur0027 = new Voyageur(17, ClasseSiege.BUSINESS, "Grace") ;
        voyageur0027.Display();
        Voyageur voyageur3468 = new Voyageur(8, ClasseSiege.PREMIERE, "Grant");
        voyageur3468.Display();

        Set<Voyageur> avion = new TreeSet<>() ;
        avion.add(voyageur0115) ;
        avion.add(voyageur0001) ;
        avion.add(voyageur0027) ;
        avion.add(voyageur3468) ;

        System.out.println("================================================\nAppel embarquement :") ;
        System.out.println(avion) ;

    }
}
