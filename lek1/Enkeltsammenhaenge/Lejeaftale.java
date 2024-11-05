package lek1.Enkeltsammenhaenge;

import java.time.LocalDate;

public class Lejeaftale {
    private LocalDate fraDato;
    private LocalDate tilDato;
    private Lejer lejer;

    public Lejeaftale(LocalDate fraDato) {
        this.fraDato = fraDato;
        this.tilDato = null;
    }

    public LocalDate getFraDato() {
        return fraDato;
    }

    public void setFraDato(LocalDate fraDato) {
        this.fraDato = fraDato;
    }

    public LocalDate getTilDato() {
        return tilDato;
    }

    public void setTilDato(LocalDate tilDato) {
        this.tilDato = tilDato;
    }

    public void setLejer(){
        if (this.lejer != lejer){
            this.lejer = lejer;
        }
    }
    
}
