
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
public class NumeroTiedustelu {

    private Map<String, List<Tiedot>> tiedotNimella;
    private Map<String, Tiedot> tiedotNumerolla;
    private Map<String, Tiedot> numeroTiedot;

    public NumeroTiedustelu() {
        this.tiedotNimella = new HashMap<>();
        this.tiedotNumerolla = new HashMap<>();
        this.numeroTiedot = new HashMap<>();
    }
    // add new
    public void lisaaUusi(String nimi, String numero, String katu, String kaupunki) {

        Tiedot uusiHenkilo = new Tiedot(nimi, numero, katu, kaupunki);
        if (uusiHenkilo.getKatu() != null) {
            lisaaOsoite(nimi, uusiHenkilo);
        } else if (uusiHenkilo.getNumero() != null) {
            lisaaNimitieto(nimi, uusiHenkilo);
            lisaaNumero(numero, uusiHenkilo);
        }

    }
    // add address
    public void lisaaOsoite(String nimi, Tiedot uusiHenkilo) {
        if (!numeroTiedot.containsKey(nimi)) {
            this.numeroTiedot.put(nimi, uusiHenkilo);
        } else {
            numeroTiedot.get(nimi).setKatu(uusiHenkilo.getKatu());
            numeroTiedot.get(nimi).setKaupunki(uusiHenkilo.getKaupunki());
        }
    }
    // get number by name
    public List<Tiedot> haeNumero(String nimi) {

        try {
            tiedotNimella.get(nimi);
        } catch (Exception e) {
            return null;
        }
        return tiedotNimella.get(nimi);
    }
    // get name by number
    public Tiedot haeNimi(String numero) {
        try {
            tiedotNumerolla.get(numero);
        } catch (Exception e) {
            return null;
        }
        return tiedotNumerolla.get(numero);
    }
    // get address by name
    public Tiedot haeOsoite(String nimi) {
        try {
            numeroTiedot.get(nimi);
        } catch (Exception e) {
            return null;
        }
        return numeroTiedot.get(nimi);
    }
    // delete data by name
    public boolean poistaTiedot(String nimi) {

        if (numeroTiedot.containsKey(nimi)) {
            String numero = numeroTiedot.get(nimi).getNumero();
            numeroTiedot.remove(nimi);
            tiedotNimella.remove(nimi);
            tiedotNumerolla.remove(numero);
            return true;
        } else {
            return false;
        }
    }
    // search by term
    public ArrayList<String> hakuSanalla(String hakusana) {
        HashMap<String, String> hakutiedot = new HashMap<>();
        ArrayList<String> tulokset = new ArrayList<>();
        hakutiedot = hakuTiedoista(hakusana);
        if (!hakutiedot.isEmpty()) {
            ArrayList<String> nimiJarjestys = new ArrayList(hakutiedot.keySet());
            Collections.sort(nimiJarjestys);
            // järjestä ja lisaa numerot

            for (String key : nimiJarjestys) {
                String tiedot = "";
                tiedot = hakutiedot.get(key) + "\n";

                List<Tiedot> numerot = haeNumero(key);
                if (numerot == null) {
                    tiedot += "  ei puhelinta \n";
                } else {
                    tiedot += tulostaNumerot(numerot);
                }
                tulokset.add(tiedot);
            }
        }

        return tulokset;

    }
    // add new information
    private void lisaaNimitieto(String nimi, Tiedot uusiHenkilo) {
        // if not containing the key
        // make new list 
        if (!tiedotNimella.containsKey(nimi)) {
            this.tiedotNimella.put(nimi, new ArrayList<>());
            if (!numeroTiedot.containsKey(nimi)) {
                numeroTiedot.put(nimi, uusiHenkilo);
            }
        }
        // add to the list
        this.tiedotNimella.get(nimi).add(uusiHenkilo);
    }
    // set number to list
    private void lisaaNumero(String numero, Tiedot uusiHenkilo) {
        this.tiedotNumerolla.put(numero, uusiHenkilo);
    }
    // search from data
    private HashMap<String, String> hakuTiedoista(String hakusana) {
        HashMap<String, String> hakutiedot = new HashMap<>();
        String tiedot = "";
        for (Tiedot osoite : numeroTiedot.values()) {
            if (osoite.getKatu() != null) { // if contains address do search
                if (!hakusana.isEmpty()) {
                    if (osoite.getKatu().contains(hakusana) || osoite.getKaupunki().contains(hakusana) || osoite.getNimi().contains(hakusana)) {
                        tiedot = " " + osoite.getNimi() + "\n" + tulostaOsoite(osoite);
                        hakutiedot.put(osoite.getNimi(), tiedot);
                    }
                } else {
                    tiedot = " " + osoite.getNimi() + "\n" + tulostaOsoite(osoite);
                    hakutiedot.put(osoite.getNimi(), tiedot);
                }

            } else {
                if (!hakusana.isEmpty()) {
                    if (osoite.getNimi().contains(hakusana)) {
                        tiedot = osoite.getNimi() + "\n" + "  osoite ei tiedossa";
                        hakutiedot.put(osoite.getNimi(), tiedot);
                    }
                } else {
                    tiedot = osoite.getNimi() + "\n" + "  osoite ei tiedossa";
                    hakutiedot.put(osoite.getNimi(), tiedot);
                }

            }

        }
        return hakutiedot;
    }
    // print address
    public String tulostaOsoite(Tiedot osoite) {
        return "  osoite: " + osoite.getKatu() + " " + osoite.getKaupunki();
    }
    // print numbers
    public String tulostaNumerot(List<Tiedot> numerot) {
        String tuloste = "  puhelinnumerot: \n";
        for (Tiedot numero : numerot) {
            if (!numero.getNumero().isEmpty()) {
                tuloste += "   " + numero.getNumero() + "\n";
            }
        }
        return tuloste;
    }
}
