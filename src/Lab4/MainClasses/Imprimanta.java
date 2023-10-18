package Lab4.MainClasses;

import Lab4.Enums.ModTIparire;
import Lab4.Enums.StareEchipament;
import Lab4.MainClasses.Echipament;

public class Imprimanta extends Echipament {
    private int ppm;
    private String dpi;
    private int pagCartus;
    private ModTIparire modTiparire;

    public Imprimanta() {}
    public Imprimanta(String denumire, int nr_inventar, float pret, String zona_mag, StareEchipament stare,int tip, int ppm, String dpi, int pagCartus, ModTIparire modTipare)
    {
        super(denumire,nr_inventar,pret, zona_mag, stare,tip);
        this.ppm=ppm;
        this.dpi=dpi;
        this.pagCartus=pagCartus;
        this.modTiparire=modTipare;
    }

    public String toString()
    {
        return denumire.toString()+" " +nr_inventar+ " "+pret + " "+zona_mag.toString()+ " "+ stare.toString()+" "+ ppm+ " "+ dpi.toString()+" "+ pagCartus+" "+modTiparire.toString();
    }


}
