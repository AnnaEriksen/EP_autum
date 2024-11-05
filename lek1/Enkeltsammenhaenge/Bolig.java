package lek1.Enkeltsammenhaenge;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bolig {
    private int kvm;
    private String adresse;
    private int prisPrMåned;
    private ArrayList<Lejeaftale> lejeaftaler = new ArrayList<>(); // en arraylist bliver brugt når multipliciteterne er 0 *


    public Bolig(int kvm, String adresse, int prisPrMåned) { //opskrift på hvordan man laver en bolig
        this.kvm = kvm;
        this.adresse = adresse;
        this.prisPrMåned = prisPrMåned;
    }



    public int getKvm() {
        return kvm;
    }

    public void setKvm(int kvm) {
        this.kvm = kvm;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPrisPrMåned() {
        return prisPrMåned;
    }

    public void setPrisPrMåned(int prisPrMåned) {
        this.prisPrMåned = prisPrMåned;
    }

    public ArrayList<Lejeaftale> getLejeAftaler(){
        return new ArrayList<>(lejeaftaler);
    }


    public Lejeaftale createLejeAftale(LocalDate fraDato){
        Lejeaftale lejeaftale = new Lejeaftale(fraDato);
        lejeaftaler.add(lejeaftale);
        return lejeaftale;
    }



}
