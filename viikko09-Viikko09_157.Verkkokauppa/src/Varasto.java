
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Varasto {

    private Map<String, Integer> hinnat;
    private Map<String, Integer> saldot;

    public Varasto() {
        hinnat = new HashMap<>();
        saldot = new HashMap<>();

    }

    public void lisaaTuote(String tuote, int hinta, int saldo) {
        hinnat.put(tuote, hinta);
        saldot.put(tuote, saldo);
    }

    public Set<String> tuotteet() {
        Set<String> tuotteet = new HashSet<>();
        for (String nimi : saldot.keySet()) {
            tuotteet.add(nimi);
        }
        return tuotteet;
    }

    public int hinta(String tuote) {
        for (String nimi : hinnat.keySet()) {
            if (nimi.equals(tuote)) {
                return hinnat.get(nimi);
            }
        }
        return -99;

    }

    public int saldo(String tuote) {
        for (String nimi : saldot.keySet()) {
            if (nimi.equals(tuote)) {
                return saldot.get(nimi);
            }
        }
        return 0;
    }

    public boolean ota(String tuote) {
        for (String nimi : saldot.keySet()) {
            if (nimi.equals(tuote)) {
                if (saldot.get(nimi) > 0) {
                    saldot.put(tuote, saldot.get(nimi) - 1);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

}
