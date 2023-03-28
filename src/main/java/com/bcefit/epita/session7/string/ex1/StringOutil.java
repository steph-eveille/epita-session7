package com.bcefit.epita.session7.string.ex1;

public class StringOutil {

    public static String mettreEnMajuscule(String str) {
        return str.toUpperCase() ;
    }

    public static String mettreEnMinuscule(String str) {
        return str.toLowerCase() ;
    }

    public static String remplacerLesCaracteres(String str, String a) {
        return str.replaceAll("a", a) ;
    }

    public static int getLongueur (String str) {
        return str.length() ;
    }

    public static String supprimeCaracteres5a10 (String str)     {
        if (str.length() <= 5)
            return str.substring( 0, 4) ;
        else
            return str.substring( 0, 4) + str.substring(11) ;
    }


    public static int compterCaractere(String str, char caractereACompter)
    {
        int res = 0 ;
        for (int i=0 ; i < str.length() ; i++)
        {
            if (str.charAt(i) == caractereACompter)
            {
                res++ ;
            }
        }
        return res ;
    }
}
