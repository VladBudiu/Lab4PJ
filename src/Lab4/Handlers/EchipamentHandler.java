package Lab4.Handlers;

import Lab4.Enums.FormatCopiere;
import Lab4.Enums.ModTIparire;
import Lab4.Enums.SistemOperare;
import Lab4.Enums.StareEchipament;
import Lab4.MainClasses.Copiator;
import Lab4.MainClasses.Echipament;
import Lab4.MainClasses.Imprimanta;
import Lab4.MainClasses.SistemeCalcul;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EchipamentHandler {
   // private List<Echipament> echipamente;
    public EchipamentHandler() {}

    public List loadList() throws FileNotFoundException {
        List<Echipament> echipamente = new ArrayList<>();
        File file = new File("echipament.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext())
        {
            String line = scanner.nextLine();
        String[] attributes = line.split(";");  // Presupunem că atributele sunt separate prin virgulă


        // Atribuim atributele corespunzătoare și creăm obiectul în funcție de tipul de echipament
        String denumire = attributes[0];
        int nrInventar = Integer.parseInt(attributes[1]);
        float pret = Float.parseFloat(attributes[2]);
        String zona_mag = attributes[3];
        StareEchipament stare = StareEchipament.valueOf(attributes[4]);
        // Alegeți tipul de echipament în funcție de atribute și creați obiectul corespunzător
        Echipament echipament = null;
        switch (attributes[5]) {
            case "Imprimanta":
                int ppm =Integer.parseInt(attributes[6]);
                String dpi=attributes[7];
                int pagCartus=Integer.parseInt(attributes[8]);
                ModTIparire modTiparire= ModTIparire.valueOf(attributes[9]);
                echipament=new Imprimanta(denumire,nrInventar,pret,zona_mag,stare,0,ppm,dpi,pagCartus, modTiparire);
                break;
            case "Copiator":
                int  pag= Integer.parseInt(attributes[6]);
                FormatCopiere format= FormatCopiere.valueOf(attributes[7]);
                echipament = new Copiator(denumire,nrInventar,pret,zona_mag,stare,1,pag,format);

                break;
            case "SistemCalcul":
                String monitor=attributes[6];
               double vitezaProcesor=Double.parseDouble(attributes[7]);
                int capacitate=Integer.parseInt(attributes[8]);;
                SistemOperare sistem=SistemOperare.valueOf(attributes[9]);
                echipament=new SistemeCalcul(denumire,nrInventar,pret,zona_mag,stare,2,monitor,vitezaProcesor,capacitate,sistem);
                break;
            default:
                System.err.println("Tip de echipament necunoscut: " + attributes[4]);
                continue;
            }

        // Adăugăm echipamentul la lista de echipamente
            echipamente.add(echipament);
       }
        return echipamente;
    }

    public static void afisare(List<Echipament> echipamente)
    {
      echipamente.forEach(System.out::println);
    }
}
