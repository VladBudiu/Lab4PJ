package Lab4.MainClasses;

import Lab4.Enums.FormatCopiere;

public class Copiator extends Echipament {

    private int pagToner;
    private FormatCopiere format;

    public Copiator() {}
    public Copiator(int pagToner, FormatCopiere format)
    {
        this.pagToner=pagToner;
        this.format=format;
    }
}
