package Lab4.MainClasses;

import Lab4.Enums.ModTIparire;
import Lab4.Enums.SistemOperare;
import Lab4.Enums.StareEchipament;
import Lab4.MainClasses.Echipament;

import java.util.List;
import java.util.Scanner;

public class SistemeCalcul extends Echipament {
    private String monitor;
    private double vitezaProcesor;
    private int capacitate;
    private SistemOperare sistem;


    public SistemeCalcul() {}
    public SistemeCalcul(String denumire, int nr_inventar, float pret, String zona_mag, StareEchipament stare,int tip, String monitor, double vitezaProcesor, int capacitate, SistemOperare sistem)
    {
        super(denumire,nr_inventar,pret, zona_mag, stare,tip);
        this.monitor=monitor;
        this.vitezaProcesor=vitezaProcesor;
        this.capacitate=capacitate;
        this.sistem=sistem;
    }

    public String toString()
    {
        return denumire.toString()+" " +nr_inventar+ " "+pret + " "+zona_mag.toString()+ " "+ stare.toString()+" "+ monitor.toString()+ " "+ vitezaProcesor  +" "+ capacitate+" "+sistem.toString();
    }

    public void modifySystem()
    {
        System.out.println("Sistemul de operare curent a echipamentului este: "+this.sistem.toString());
        System.out.println("Ce sistem de operare ati dori sa o instalati?\n  windows/linux\n\nOpt dumneavoastra: ");
        Scanner scanner = new Scanner(System.in);
        String opt = scanner.nextLine();
        if(opt.compareTo("windows")==0)
            this.sistem= SistemOperare.windows;
        else if  (opt.compareTo("linux")==0) {
            this.sistem=SistemOperare.linux;
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
        for (Echipament e: echipamente) {
            if (e.checkName(nume_cautat)) {
                SistemeCalcul sistemeCalcul;
                sistemeCalcul = (SistemeCalcul) e;
                sistemeCalcul.modifySystem();
                break;
            }
        }
    }
}
