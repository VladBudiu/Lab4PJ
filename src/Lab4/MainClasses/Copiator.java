package Lab4.MainClasses;

import Lab4.Enums.FormatCopiere;
import Lab4.Enums.ModTIparire;
import Lab4.Enums.StareEchipament;

import java.util.List;
import java.util.Scanner;

public class Copiator extends Echipament {

    private int pagToner;
    private FormatCopiere format;

    public Copiator() {}
    public Copiator(String denumire, int nr_inventar, float pret, String zona_mag, StareEchipament stare,int tip, int pagToner, FormatCopiere format)
    {
        super(denumire,nr_inventar,pret, zona_mag, stare,tip);
        this.pagToner=pagToner;
        this.format=format;
    }
    public String toString()
    {
        return denumire.toString()+" " +nr_inventar+ " "+pret + " "+zona_mag.toString()+ " "+ stare.toString()+" "+pagToner+" "+format.toString();
    }

    public void modifyFormat()
    {
        System.out.println("Formatul curent a echipamentului este: "+this.format.toString());
        System.out.println("In ce format ati dori sa o modificati?\n  A3/A4\n\nOpt dumneavoastra: ");
        Scanner scanner = new Scanner(System.in);
        String opt = scanner.nextLine();
        if(opt.compareTo("A3")==0)
            this.format= FormatCopiere.A3;
        else if  (opt.compareTo("A4")==0) {
            this.format=FormatCopiere.A4;
        }
        else
            System.out.println("\nSchimbarea nu poate fi efectuatata");


    }

    public static void SearchandModify(List<Echipament> echipamente)
    {
        Scanner keyboard=new Scanner(System.in);
        String nume_cautat;
        System.out.println("Introduceti numele dupa care cautati: ");
        nume_cautat=keyboard.nextLine();
        for (Echipament e: echipamente)
        {
            if(e.checkName(nume_cautat))
            {
                Copiator cop;
                cop=(Copiator) e;
                cop.modifyFormat();
                break;
            }
        }
    }
}
