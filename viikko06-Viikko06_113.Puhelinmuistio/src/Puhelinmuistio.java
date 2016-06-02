
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Puhelinmuistio {

    private ArrayList<Henkilo> muistio;

    public Puhelinmuistio() {
        this.muistio = new ArrayList<>();
    }

    public void lisaa(String nimi, String numero) {
        Henkilo uusiNumero = new Henkilo(nimi, numero);
        this.muistio.add(uusiNumero);
    }

    public void tulostaKaikki() {
        for (Henkilo henkilo : muistio) {
            System.out.println(henkilo);
        }
    }

    public String haeNumero(String nimi) {
        for (Henkilo henkilo : muistio) {
            if (henkilo.haeNimi().equals(nimi)) {
                return henkilo.haeNumero();
            }
        }
        return "numero ei tiedossa";

    }

}
