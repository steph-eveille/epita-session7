package com.bcefit.epita.session7.enumueration.ex1;

public class MainEx1 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("            Hello world!");
        System.out.println("------------------------------------------");
/*
        for (int i = 0 ; i < 7 ; i++) // boucle sur toutes les valeurs de l'enum
        {
            System.out.println(Jour.values()[i]);
        }
*/
        System.out.println("------------------------------------------");
        for (Jour a : Jour.values()) // boucle sur toutes les valeurs de l'enum
        {
            System.out.println(a + " : " + a.getHumeur()  + "\t" + (a.isWeekend() ? "C'est le weekend !!!" : "Au boulot."));
        }

        System.out.println("------------------------------------------");

        System.out.println();
        //Jour[] b = Jour.values() ;

        if (Jour.MARDI.compareTo(Jour.JEUDI) < 0)

        {
            System.out.println(Jour.MARDI + " est avant " + Jour.JEUDI) ;
        }




    }
}