package Lab4.MainClasses;

import Lab4.Enums.ModTIparire;
import Lab4.Enums.StareEchipament;
import Lab4.MainClasses.Echipament;

import java.util.Scanner;

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

    public void modifyMod()
    {
        System.out.println("Modul curent a echipamentului este: "+this.modTiparire.toString());
        System.out.println("In ce mod ati dori sa o modificati?\n  alb_negru/color\n\nOpt dumneavoastra: ");
        Scanner scanner = new Scanner(System.in);
        String opt = scanner.nextLine();
        if(opt.compareTo("alb_negru")==0)
            this.modTiparire=ModTIparire.alb_negru;
        else if  (opt.compareTo("color")==0) {
            this.modTiparire=ModTIparire.color;
        }
        else
            System.out.println("\nSchimbarea nu poate fi efectuatata");


    }


}
