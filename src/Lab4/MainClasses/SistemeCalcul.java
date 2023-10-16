package Lab4.MainClasses;

import Lab4.Enums.SistemOperare;
import Lab4.MainClasses.Echipament;

public class SistemeCalcul extends Echipament {
    private String monitor;
    private double vitezaProcesor;
    private int capacitate;
    private SistemOperare sistem;


    public SistemeCalcul() {}
    public SistemeCalcul(String monitor, double vitezaProcesor, int capacitate, SistemOperare sistem)
    {
        this.monitor=monitor;
        this.vitezaProcesor=vitezaProcesor;
        this.capacitate=capacitate;
        this.sistem=sistem;
    }
}
