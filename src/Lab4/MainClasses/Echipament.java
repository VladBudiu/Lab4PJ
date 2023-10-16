package Lab4.MainClasses;

import Lab4.Enums.StareEchipament;

import java.io.Serializable;

public class Echipament implements Serializable {

    protected String denumire;
    protected int nr_inventar;
    protected float pret;
    protected String zona_mag;
    protected StareEchipament stare;

    public Echipament(){}
    public Echipament(String denumire, int nr_inventar, float pret, String zona_mag, StareEchipament stare)
    {
        this.denumire=denumire;
        this.nr_inventar=nr_inventar;
        this.pret=pret;
        this.zona_mag=zona_mag;
        this.stare=stare;
    }
}
