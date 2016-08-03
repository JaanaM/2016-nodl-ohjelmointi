
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class NumeroTiedustelu {
    private Map<String, List <Tiedot>> tiedotNimella;
    private Map<String, Tiedot> tiedotNumerolla;
    private Map<String, Tiedot> numeroTiedot;
    public NumeroTiedustelu() {
        this.tiedotNimella = new HashMap<>();
        this.tiedotNumerolla = new HashMap<>();
    }
    public void lisaaUusi(String nimi, String numero) {
        Tiedot uusiHenkilo = new Tiedot(nimi, numero);
        if (!tiedotNimella.containsKey(nimi)) {
            this.tiedotNimella.put(nimi, new ArrayList<>());
        }
        numeroTiedot.put(nimi, uusiHenkilo);
        tiedotNumerolla.put(numero, uusiHenkilo);
        tiedotNimella.get(nimi).add(uusiHenkilo);
    }
    public void lisaaOsoite(String nimi, String katu, String kaupunki){
        Tiedot uusiHenkilo = new Tiedot(nimi, katu, kaupunki);
        if (!numeroTiedot.containsKey(nimi)) {
            this.numeroTiedot.put(nimi, uusiHenkilo);
        } else {
            numeroTiedot.get(nimi).setKatu(katu);
            numeroTiedot.get(nimi).setKaupunki(kaupunki);
        }
    }
    public List<Tiedot> haeNumero(String nimi){
        return tiedotNimella.get(nimi);
    }
    public Tiedot haeNimi(String numero){
        return tiedotNumerolla.get(numero);
    }
    public Tiedot haeOsoite(String nimi){
        return numeroTiedot.get(nimi);
    }
    
    
}
