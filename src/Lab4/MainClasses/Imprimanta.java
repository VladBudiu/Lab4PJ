package Lab4.MainClasses;

import Lab4.Enums.ModTIparire;
import Lab4.MainClasses.Echipament;

public class Imprimanta extends Echipament {
    private int ppm;
    private int dpi;
    private int pagCartus;
    private ModTIparire modTiparire;

    public Imprimanta() {}
    public Imprimanta(int ppm, int dpi, int pagCartus, ModTIparire modTipare)
    {
        this.ppm=ppm;
        this.dpi=dpi;
        this.pagCartus=pagCartus;
        this.modTiparire=modTipare;
    }

}
