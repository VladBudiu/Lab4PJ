package Lab4.MainClasses;

import Lab4.Enums.StareEchipament;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Echipament implements Serializable {

    protected String denumire;
    protected int nr_inventar;
    protected float pret;
    protected String zona_mag;
    protected StareEchipament stare;
    int tip;

    public Echipament(){}
    public Echipament(String denumire, int nr_inventar, float pret, String zona_mag, StareEchipament stare, int tip)
    {
        this.denumire=denumire;
        this.nr_inventar=nr_inventar;
        this.pret=pret;
        this.zona_mag=zona_mag;
        this.stare=stare;
        this.tip=tip;
    }
    public String toString()
    {
        return denumire.toString()+" " +nr_inventar+ " "+pret + " "+zona_mag.toString()+ " "+ stare.toString();
    }

    public String getDenumire()
    {
        return denumire;
    }

    public boolean checkType(int tip)
    {
        if(this.tip==tip)
            return true;
        else
            return false;

    }
    public boolean checkName(String nume) {
        String aux = getDenumire();
        int comparisonResult = aux.compareTo(nume);

        if (comparisonResult == 0)
            return true;

        else return false;

    }

    public boolean checkStare(String stare_dorita)
    {
        if(stare.toString().compareTo(stare_dorita)==0)
            return true;
        else return false;
    }


    public void modifyStare()
    {
        System.out.println("Starea curenta a echipamentului este: "+stare.toString());
        System.out.println("In ce stare ati dori sa o modificati?\n  achizitionat/expus/vandut\n\nOpt dumneavoastra: ");
        Scanner scanner = new Scanner(System.in);
        String opt = scanner.nextLine();
        if(opt.compareTo("achizitionat")==0)
            stare=StareEchipament.achizitionat;
        else if  (opt.compareTo("expus")==0) {
            stare=StareEchipament.expus;
        }
        else if (opt.compareTo("vandut")==0) {
            stare=StareEchipament.vandut;
        }
        else
            System.out.println("\nSchimbarea nu poate fi efectuatata");


    }

    public static void showCopiator(List<Echipament> echipamente)
    {
        for(Echipament e: echipamente)
        {
            if(e instanceof Copiator)
                System.out.println(e.toString());
        }
    }


    public static void showImprimanta(List<Echipament> echipamente)
    {
        for(Echipament e: echipamente)
        {
            if(e instanceof Imprimanta)
                System.out.println(e.toString());
        }
    }

    public static void showSistemCalcul(List<Echipament> echipamente)
    {

        SistemeCalcul x= new SistemeCalcul();
        for(Echipament e: echipamente)
        {
            if(e.getClass()==x.getClass())
                System.out.println(e.toString());
        }
    }
    public static void SearchandModify(List<Echipament> echipamente) {
        Scanner keyboard = new Scanner(System.in);
        String nume_cautat;
        System.out.println("Introduceti numele dupa care cautati: ");
        nume_cautat = keyboard.nextLine();
        for (Echipament e : echipamente) {
            if (e.checkName(nume_cautat)) {
                e.modifyStare();
                break;
            }
        }
    }

    public static void showByState(List<Echipament> echipamente,String stare)
    {
        for (Echipament e: echipamente)
        {
            if (e.checkStare(stare))
            {
                System.out.println(e.toString());
            }
        }
    }
}
