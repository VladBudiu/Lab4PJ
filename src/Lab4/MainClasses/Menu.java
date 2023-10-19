package Lab4.MainClasses;
/**
 * Clasa pentru afisare si executarea optiunilor din meniu
 * @author Vlad Budiu
 * @version 1
 * @since 2023
 * */
import Lab4.Handlers.Deserializare;
import Lab4.Handlers.EchipamentHandler;
import Lab4.Handlers.Serializare;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    public Menu() {}

    /**
     * Functia care se ocupa de afisare optiunilor posibile din meniu si de navigarea acestora
     * @param echipamente
     */
    public static void menuAppear(List<Echipament> echipamente)
    {int opt;
        do {
            System.out.println("1.Afişarea tuturor echipamentelor\n2.Afişarea imprimantelor\n3.Afişarea copiatoarelor\n4.Afişarea sistemelor de calcul\n5.Modificarea stării în care se află un echipament\n6.Setarea unui anumit mod de scriere pentru o imprimantă\n7.Setarea unui format de copiere pentru copiatoare\n8.Instalarea unui anumit sistem de operare pe un sistem de calcul\n9.Afişarea echipamentelor vândute\n10.Să se realizeze două metode statice pentru serializarea / deserializarea colecției de obiecte în fișierul echip.bin\n");
            System.out.println("Optiunea dorita: ");
            Scanner keyboard = new Scanner(System.in);

            opt = keyboard.nextInt();
            String nume_cautat;
            switch (opt) {
                case 0 -> exit(0);
                case 1 -> EchipamentHandler.afisare(echipamente);
                case 2 -> Echipament.showImprimanta(echipamente);
                case 3 -> Echipament.showCopiator(echipamente);
                case 4 -> Echipament.showSistemCalcul(echipamente);
                case 5 -> Echipament.SearchandModify(echipamente);
                case 6 -> Imprimanta.SearchandModify(echipamente);
                case 7 -> Copiator.SearchandModify(echipamente);
                case 8 -> SistemeCalcul.SearchandModify(echipamente);
                case 9 -> Echipament.showByState(echipamente, "vandut");
                case 10 -> {
                    String opt2;
                    keyboard.nextLine();
                    System.out.println("1. Serializare\n2.Deserializare\nOpt: ");
                    opt2 = keyboard.nextLine();
                    switch (opt2) {
                        case "1":
                            Serializare.serializare(echipamente);
                            break;
                        case "Serializare":
                            Serializare.serializare(echipamente);
                            break;
                        case "2":
                            Deserializare.deserializare();
                            break;
                        case "Deserializare":
                            Deserializare.deserializare();
                            break;
                    }
                }
                default -> System.out.println("Optiunea aleasa este invalida\n");
            }
        }while(opt!=0);


    }

}
