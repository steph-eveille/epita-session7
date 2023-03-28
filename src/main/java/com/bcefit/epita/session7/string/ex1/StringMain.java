package com.bcefit.epita.session7.string.ex1;

public class StringMain {
    public static void main(String[] args)
    {
        String strOriginal = "Tata et Maman" ;
        //String strOriginal = "s" ;


        System.out.println("Original :" + strOriginal);
        System.out.println("En majuscule : " + StringOutil.mettreEnMajuscule(strOriginal));
        System.out.println("En minuscule : " + StringOutil.mettreEnMinuscule(strOriginal));


        System.out.println("Longueur de " + strOriginal + " : " + strOriginal.length() + (strOriginal.length() < 2 ? " caractère" : " caractères"));

        System.out.println("Remplacement du caractère a par un 4 : " + StringOutil.remplacerLesCaracteres(strOriginal, "4") ) ;


        //String str15 = "Chaîne suffisamment longue" ;
        String str15 = "1234567890ABCDEFGHIJK" ;

        System.out.println("Suppression dans " + str15 + " des caractères 5 à 10 (inclus) : " + StringOutil.supprimeCaracteres5a10(str15)) ;

        String s = "Caractèresa" ;
        System.out.println(StringOutil.compterCaractere(s, 'a'));

    }
}
