package Lab4.Handlers;
/**
 * Clasa care are rolul de a se ocupa de procesul de SERIALIZARE
 * @author Vlad Budiu
 * @version 1
 * @since 2023
 * */
import Lab4.MainClasses.Echipament;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serializare {
    /**
     * Functia care executa serializarea obiectelor
     * @param echipamente lista de obiecte
     * @return void
     */
    public static void serializare(List<Echipament> echipamente) {
        try (FileOutputStream fileOut = new FileOutputStream("echip.bin");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(echipamente);
            objectOut.close();
            fileOut.close();
            System.out.println("Serializare reușită în echip.bin");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
