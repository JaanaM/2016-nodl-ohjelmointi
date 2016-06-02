
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
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
public class Kierros {

    private ArrayList<Kilpailija> osallistujat;
    private List<Integer> pisteet;
    private int yhteispisteet;
    private int pituus;

    public Kierros() {
        this.osallistujat = new ArrayList<>();
        this.pisteet = new ArrayList<>();
    }
    
    public void lisaaOsallistuja (String nimi) {
        osallistujat.add(new Kilpailija(nimi));
    }
    
    public void haeOsallistuja (String nimi) {
        for (Kilpailija o : osallistujat) {
            if (o.getNimi().equals(nimi)) {
                
            }
        }
    }

    public ArrayList<Kilpailija> getOsallistujat() {
        return osallistujat;
    } 
    
    public void laskePisteet (String nimi, int hyppy){
        Pisteet kierrospisteet = new Pisteet();
        // all players points are different
        pisteet.clear();
        // set points to the compatitioner
        kierrospisteet.asetaPisteet(hyppy);
        yhteispisteet = kierrospisteet.getYhteisPisteet();
        
        // add points to the list so we can print them.
        pisteet.addAll(kierrospisteet.getPisteet());
    }

    public int getYhteispisteet() {
        return yhteispisteet;
    }


    
    public int hyppaa(String nimi) {
        Random rnd = new Random();
        pituus = rnd.nextInt(120 - 60 + 1) + 60;
        
        for (Kilpailija kilpailija : osallistujat) {
            if (kilpailija.getNimi().equals(nimi)) {
                kilpailija.setPituudet(pituus);
            }
        }
        return pituus;
    }
    
    private void jarjestaKierros () {
        int i = 0; // jarjestysnumero
        
        }

    public List<Integer> getPisteet() {
        return pisteet;
    }
    
    
}
