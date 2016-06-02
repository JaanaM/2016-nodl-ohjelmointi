
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
public class Arvosanat {

    private ArrayList<Integer> arvosanat;
    private int hylatyt;

    public Arvosanat() {
        this.arvosanat = new ArrayList<>();
        this.hylatyt = 0;
    }

    public ArrayList<Integer> muutaPisteetArvosanoiksi(int pisteet) {
        int arvosana = 0;
        if (pisteet >= 0 && pisteet < 61) {
            if (pisteet < 30) {
                arvosana = 0;
                this.hylatyt++;
            } else if (pisteet < 35) {
                arvosana = 1;
            } else if (pisteet < 40) {
                arvosana = 2;
            } else if (pisteet < 45) {
                arvosana = 3;
            } else if (pisteet < 50) {
                arvosana = 4;
            } else {
                arvosana = 5;
            }
            arvosanat.add(arvosana);
        }

        return arvosanat;
    }

    public void tulostaArvosanat() {
        double hyvaksyttyja = laskeHyvaksymisprosentti();
        System.out.println("Arvosanajakauma: ");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + tulostaTahdet(i));
        }
        System.out.println("Hyvaksymisprosentti: " + String.format("%.2f", hyvaksyttyja));

    }

    private double laskeHyvaksymisprosentti() {
        int arvosanojenMaara = arvosanat.size();
        int hyvaksytyt = arvosanojenMaara - this.hylatyt;
        double prosenttiarvo = (double) hyvaksytyt / arvosanojenMaara;
        prosenttiarvo = prosenttiarvo * 100;

        return prosenttiarvo;
    }

    private String tulostaTahdet(int tahdet) {
        String merkkijono = "";
        for (int arvosana : this.arvosanat) {
            if (arvosana == tahdet) {
                merkkijono += "*";
            }
        }
        return merkkijono;
    }

}
