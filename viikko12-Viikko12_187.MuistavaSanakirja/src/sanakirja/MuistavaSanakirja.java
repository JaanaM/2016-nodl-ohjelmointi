/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saria
 */
public class MuistavaSanakirja {

    private HashMap<String, String> kaannokset;
    private String tiedostopolku;

    public MuistavaSanakirja() {
        kaannokset = new HashMap<>();
    }

    public MuistavaSanakirja(String tiedosto) {
        this();
        this.tiedostopolku = tiedosto;
    }

    // load
    public boolean lataa() {
        
        Scanner tiedostonLukija;
        try {
            tiedostonLukija = new Scanner(new File(tiedostopolku));
        } catch (FileNotFoundException ex) {
            System.out.println("Tiedostoa ei löydy");
            return false;
        }
        kaannokset = new HashMap<>(); // clear list for info from the file
        while (tiedostonLukija.hasNextLine()) {
            String rivi = tiedostonLukija.nextLine();
            String[] osat = rivi.split(":");   // pilkotaan rivi :-merkkien kohdalta
            lisaa(osat[0], osat[1]);
        }
        return true;
    }

    // add
    public void lisaa(String sana, String kaannos) {
        if (!kaannokset.containsKey(sana) && !kaannokset.containsValue(sana)) { // do not add if there is already same pair in the list
            kaannokset.put(sana, kaannos);
        }
    }

    // translate
    public String kaanna(String sana) {
        String kaannos = null;
        if (kaannokset.isEmpty()) {
            return null;
        }
        if (kaannokset.containsKey(sana)) {
            kaannos = kaannokset.get(sana);
        } else if (kaannokset.containsValue(sana)) {
            for (String avain : this.kaannokset.keySet()) {
                if (this.kaannokset.get(avain).equals(sana)) {
                    kaannos = avain;
                }
            }
        }
        return kaannos;
    }

    public void poista(String sana) {
        if (kaannokset.containsKey(sana)) {
            kaannokset.remove(sana);
        } else if (kaannokset.containsValue(sana)) {
            for (String avain : this.kaannokset.keySet()) {
                if (this.kaannokset.get(avain).equals(sana)) {
                    kaannokset.remove(avain);
                    break;
                }
            }
        }
    }

    public boolean tallenna() {
        FileWriter kirjoittaja;
        try {
            kirjoittaja = new FileWriter(tiedostopolku);
            for (String avain : this.kaannokset.keySet()) {
                kirjoittaja.write(avain + ":" + this.kaannokset.get(avain) + "\n");
            }
            kirjoittaja.close();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }

}
