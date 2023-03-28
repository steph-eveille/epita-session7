package com.bcefit.epita.session7.collections;

public enum ClasseSiege {
    PREMIERE (1),
    BUSINESS (2),
    ECO (3);

    private int ordreAppel ;

    public int getOrdreAppel() {
        return ordreAppel;
    }

    ClasseSiege(int ordreDAppel) {
        ordreAppel = ordreDAppel ;
    }
}
