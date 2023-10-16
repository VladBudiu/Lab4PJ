package Lab4;

import Lab4.Handlers.EchipamentHandler;
import Lab4.MainClasses.Echipament;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<Echipament> echipamente= new ArrayList<Echipament>();
        EchipamentHandler ech = new EchipamentHandler();
        echipamente=ech.loadList(echipamente);
        ech.afisare(echipamente);

    }
}