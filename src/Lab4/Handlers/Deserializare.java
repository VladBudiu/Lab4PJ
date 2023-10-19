package Lab4.Handlers;
/**
 * Clasa care are rolul de a se ocupa de procesul de DESERIALIZARE
 * @author Vlad Budiu
 * @version 1
 * @since 2023
 * */
import Lab4.MainClasses.Echipament;

import java.io.*;
import java.util.List;

public class Deserializare {
    /**
     * Functia care executa deserializarea obiectelor
     * @return lista de obiecte
     */
    public static List<Echipament> deserializare() {
        List<Echipament> echipamente = null;

        try (FileInputStream fileIn = new FileInputStream("echip.bin");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            echipamente = (List<Echipament>) objectIn.readObject();
            System.out.println("Deserializare reușită din echip.bin");
            System.out.println("Noua lista este: \n");
            for(Echipament e: echipamente)
            {
                System.out.println(e.toString());
            }
            objectIn.close();
            fileIn.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return echipamente;
    }
}
