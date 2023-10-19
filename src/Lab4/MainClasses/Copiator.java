package Lab4.MainClasses;
/**
 * Clasa de obiecte de tip Copiator care mosteneste clasa principala Echipament
 * @author Vlad Budiu
 * @version 1
 * @since 2023
 * */
import Lab4.Enums.FormatCopiere;
import Lab4.Enums.ModTIparire;
import Lab4.Enums.StareEchipament;

import java.util.List;
import java.util.Scanner;

public class Copiator extends Echipament {

    private int pagToner;
    private FormatCopiere format;

    public Copiator() {}

    /**
     * Constructorul cu parametrii ai clasei Copiator
     * @param denumire
     * @param nr_inventar
     * @param pret
     * @param zona_mag
     * @param stare
     * @param pagToner
     * @param format
     */
    public Copiator(String denumire, int nr_inventar, float pret, String zona_mag, StareEchipament stare, int pagToner, FormatCopiere format)
    {
        super(denumire,nr_inventar,pret, zona_mag, stare);
        this.pagToner=pagToner;
        this.format=format;
    }

    /**
     * Redefinirea functiei toString pentru clasa Copiator
     * @return
     */
    public String toString()
    {
        return super.toString()+" "+pagToner+" "+format.toString();
    }

    /**
     * Functie care modifica formatul unui copiator
     */
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
