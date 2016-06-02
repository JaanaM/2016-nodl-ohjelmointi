
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Ajoneuvorekisteri {

    private HashMap<Rekisterinumero, String> omistajat;

    public Ajoneuvorekisteri() {
        omistajat = new HashMap<>();
    }

    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if (!omistajat.containsKey(rekkari)) {
            omistajat.put(rekkari, omistaja);
            return true;
        }
        if (omistajat.containsKey(rekkari)) {
            return false;
        }
        return false;
    }

    public String hae(Rekisterinumero rekkari) {
        if (this.omistajat.containsKey(rekkari)) {
            return this.omistajat.get(rekkari);
        }
        return null;
    }

    public boolean poista(Rekisterinumero rekkari) {
        if (omistajat.containsKey(rekkari)) {
            this.omistajat.remove(rekkari);
            return true;
        }
        return false;
    }

    public void tulostaRekisterinumerot() {
        for (Rekisterinumero avain : this.omistajat.keySet()) {
            System.out.println(avain);
        }
    }

    public void tulostaOmistajat() {
        ArrayList<String> nimet = new ArrayList();
        for (String value : omistajat.values()) {
            if (!nimet.contains(value)) {
                nimet.add(value);
            }
        }
        for (String nimi : nimet) {
            System.out.println(nimi);
        }
    }
}
