
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Lentokentta {

    private ArrayList<Lentokone> lentokoneet;
    private ArrayList<Lento> lennot;

    public Lentokentta() {
        this.lennot = new ArrayList<>();
        this.lentokoneet = new ArrayList<>();
    }

    public void lisaaLento(String tunnus, String lahtopaikka, String kohdepaikka) {
        for (Lentokone lentokone : lentokoneet) {
            if (lentokone.getTunnus().equals(tunnus)) {
                lennot.add(new Lento(lahtopaikka, kohdepaikka, lentokone));
                break;
            } else {
                System.out.println("lentokonetta ei löytynyt");
            }
        }

    }

    public void lisaaLentokone(String tunnus, int kapasiteetti) {
        if (!this.lentokoneet.contains(tunnus)) {
            this.lentokoneet.add(new Lentokone(tunnus, kapasiteetti));
        }
    }

    public void tulostaLennot() {
        for (Lento lento : this.lennot) {
            System.out.println(lento.getLentokone() + " (" + lento.getLahtopaikka() + "-" + lento.getKohdepaikka() + ")");
        }
    }

    public void tulostaLentokoneet() {
        for (Lentokone lentokone : this.lentokoneet) {
            System.out.println(lentokone);
        }
    }

    public void tulostaLentokoneenTiedot(String tunnus) {
        for (Lentokone lentokone: this.lentokoneet) {
            if (lentokone.getTunnus().equals(tunnus)) {
                System.out.println(lentokone);
                break;
            }
        }
    }
}
