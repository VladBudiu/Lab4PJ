package Lab4.Handlers;

import Lab4.MainClasses.Echipament;

import java.util.List;
import java.util.Scanner;

public class EchipamentHandler {
    private List<Echipament> echipamente;
    public EchipamentHandler() {}

    public List loadList(List<Echipament> echipamente)
    {
        Scanner scanner = new Scanner("echipament.txt");
        while (scanner.hasNext())
        {String line = scanner.nextLine();
        String[] attributes = line.split(",");  // Presupunem că atributele sunt separate prin virgulă

        if (attributes.length < 5) {
            System.err.println("Linie invalidă: " + line);
            continue;
        }

        // Atribuim atributele corespunzătoare și creăm obiectul în funcție de tipul de echipament
        String denumire = attributes[0];
        int nrInventar = Integer.parseInt(attributes[1]);
        double pret = Double.parseDouble(attributes[2]);
        String zonaMagazie = attributes[3];

        // Alegeți tipul de echipament în funcție de atribute și creați obiectul corespunzător
        Echipament echipament = null;
        switch (attributes[4]) {
            case "Imprimanta":
                // Parsare atribute specifice imprimantei
                // ...
                // echipament = new Imprimanta(...);
                break;
            case "Copiator":
                // Parsare atribute specifice copiatorului
                // ...
                // echipament = new Copiator(...);

                break;
            case "SistemCalcul":
                // Parsare atribute specifice sistemului de calcul
                // ...
                // echipament = new SistemCalcul(...);
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
}
