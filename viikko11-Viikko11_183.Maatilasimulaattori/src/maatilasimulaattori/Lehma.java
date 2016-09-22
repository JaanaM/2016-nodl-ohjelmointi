/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatilasimulaattori;

import java.util.Random;

/**
 *
 * @author Saria
 */
public class Lehma implements Lypsava, Eleleva {

    private String nimi;
    private Double utareet;
    private Double maara;
    private static final String[] NIMIA = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    @Override
    public double lypsa() {
        this.maara = 0.0;
        return maara;
    }

    @Override
    public void eleleTunti() {
        this.maara +=  0.7 + (2 - 0.7) * new Random().nextDouble();
    }

    public Lehma() {
        this("nimeton");
    }

    private String arvoNimi() {
        int arvoNimi = 0 + new Random().nextInt(30);
        return NIMIA[arvoNimi];
    }

    public Lehma(String nimi) {
        if (nimi.equals("nimeton")) {
            this.nimi = arvoNimi();
        } else {
            this.nimi = nimi;
        }
        this.utareet = 15 + (40 - 15) * new Random().nextDouble();
        this.maara = 0.0;
    }

    public String getNimi() {
        return nimi;
    }

    public double getTilavuus() {
        return utareet;
    }

    public double getMaara() {
        return maara;
    }

    @Override
    public String toString() {
        return nimi + " " + Math.ceil(maara) + "/" + Math.ceil(utareet);
    }

}
