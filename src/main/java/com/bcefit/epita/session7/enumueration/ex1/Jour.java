package com.bcefit.epita.session7.enumueration.ex1;

public enum Jour {
    LUNDI (false, "😫😫"),
    MARDI (false, "😐😫"),
    MERCREDI (false, "😐😐"),
    JEUDI (false, "😐"),
    VENDREDI (false, "😊"),
    SAMEDI (true, "😀"),
    DIMANCHE  (true, "😀")  ;

    private final boolean  isWeekend;
    private final String humeur ;

    public boolean isWeekend() {
        return this.isWeekend;
    }

    public String getHumeur() {
        return this.humeur;
    }

    Jour(boolean isWeekend, String humeur) {
        this.isWeekend = isWeekend;
        this.humeur = humeur ;
    }
}
