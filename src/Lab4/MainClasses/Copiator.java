package Lab4.MainClasses;

import Lab4.Enums.FormatCopiere;
import Lab4.Enums.StareEchipament;

public class Copiator extends Echipament {

    private int pagToner;
    private FormatCopiere format;

    public Copiator() {}
    public Copiator(String denumire, int nr_inventar, float pret, String zona_mag, StareEchipament stare, int pagToner, FormatCopiere format)
    {
        super(denumire,nr_inventar,pret, zona_mag, stare);
        this.pagToner=pagToner;
        this.format=format;
    }
    public String toString()
    {
        return denumire.toString()+" " +nr_inventar+ " "+pret + " "+zona_mag.toString()+ " "+ stare.toString()+" "+pagToner+" "+format.toString();
    }
}
