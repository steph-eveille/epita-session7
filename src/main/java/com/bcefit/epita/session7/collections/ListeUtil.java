package com.bcefit.epita.session7.collections;

//import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListeUtil {

    public static void AfficheElements(List<String> liste) {

        for (String elementListe : liste) {
            System.out.println("Elément de liste : " + elementListe) ;
        }
    }

    public static void AfficheElements(Set<String> monSet) {

        for (String elementListe : monSet) {
            System.out.println("Elément de set : " + elementListe) ;
        }
    }


}
