package lek1.Enkeltsammenhaenge;

import javax.swing.*;
import java.util.ArrayList;

public class Kollegie {
    private String navn;
    private String adresse;
    private ArrayList<Bolig> boliger = new ArrayList<>(); // en arraylist bliver brugt når multipliciteterne er 0 *

    //

    public Kollegie(String navn, String adresse) {
        this.navn = navn;
        this.adresse = adresse;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }


    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Bolig> getBoliger() {
        return boliger;
    }


    public void addBolig(Bolig bolig) {
        if (!boliger.contains(bolig)) {
            boliger.add(bolig);
        }
    }
    /**
     * Removes the person from this group,
     * if they are connected.
     */
    public void removeBolig(Bolig bolig) {
        boliger.remove(bolig);
    }

    public Bolig createBolig(int kvm, String adresse, int prisPrMåned) { //opretter bolig
        Bolig bolig = new Bolig(kvm, adresse, prisPrMåned);
        boliger.add(bolig);
        return bolig;
    }
}