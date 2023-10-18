package Lab4.MainClasses;

import Lab4.Handlers.EchipamentHandler;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    public Menu() {}

    public static void menuAppear(List<Echipament> echipamente)
    {int opt=-1;
        do {
            System.out.println("1.Afişarea tuturor echipamentelor\n2.Afişarea imprimantelor\n3.Afişarea copiatoarelor\n4.Afişarea sistemelor de calcul\n5.Modificarea stării în care se află un echipament\n6.Setarea unui anumit mod de scriere pentru o imprimantă\n7.Setarea unui format de copiere pentru copiatoare\n8.Instalarea unui anumit sistem de operare pe un sistem de calcul\n9.Afişarea echipamentelor vândute\n10.Să se realizeze două metode statice pentru serializarea / deserializarea colecției de obiecte în fișierul echip.bin\n");
            System.out.println("Optiunea dorita: ");
            Scanner keyboard = new Scanner(System.in);

            opt = keyboard.nextInt();
            String nume_cautat;
            switch (opt) {
                case 0: exit(0);
                    break;
                case 1:
                    EchipamentHandler.afisare(echipamente);
                    break;
                case 2:
                    for(Echipament e: echipamente)
                    {
                        if(e.checkType(0))
                            System.out.println(e.toString());
                    }
                    break;
                case 3:
                    for(Echipament e: echipamente)
                    {
                        if(e.checkType(1))
                            System.out.println(e.toString());
                    }
                    break;
                case 4:
                    for(Echipament e: echipamente)
                    {
                        if(e.checkType(2))
                            System.out.println(e.toString());
                    }
                    break;
                case 5:
                 System.out.println("Introduceti numele dupa care cautati: ");
                    keyboard.nextLine();
                    nume_cautat=keyboard.nextLine();
                    //System.out.println(nume_cautat);
                    for (Echipament e: echipamente)
                    {
                        if(e.checkName(nume_cautat))
                        {
                            e.modifyStare();
                            break;
                        }
                    }
                    System.out.println("Nu a fost gasit produsul!");
                    break;
                case 6:
                    System.out.println("Introduceti numele dupa care cautati: ");
                    keyboard.nextLine();
                    nume_cautat=keyboard.nextLine();
                    for (Echipament e: echipamente)
                    {
                        if(e.checkName(nume_cautat)) {
                            Imprimanta impr;
                            impr = (Imprimanta) e;
                            impr.modifyMod();
                            break;
                        }
                    }
                    System.out.println("Nu a fost gasit produsul!");
                    break;
                case 7:System.out.println("Introduceti numele dupa care cautati: ");
                    keyboard.nextLine();
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
                    System.out.println("Nu a fost gasit produsul!");
                    break;
                case 8: System.out.println("Introduceti numele dupa care cautati: ");
                    keyboard.nextLine();
                    nume_cautat=keyboard.nextLine();
                    for (Echipament e: echipamente) {
                        if (e.checkName(nume_cautat)) {
                            SistemeCalcul sistemeCalcul;
                            sistemeCalcul = (SistemeCalcul) e;
                            sistemeCalcul.modifySystem();
                            break;
                        }
                    }
                    System.out.println("Nu a fost gasit produsul!");
                    break;
                case 9: for (Echipament e: echipamente)
                {
                    if (e.checkStare("vandut"))
                    {
                        System.out.println(e.toString());
                    }
                }
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Optiunea aleasa este invalida\n");
                    break;

            }
        }while(opt!=0);


    }

}
