
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
public class Kirjasto {

    private ArrayList<Kirja> kirjasto;

    public Kirjasto() {
        kirjasto = new ArrayList<>();
    }

    public void lisaaKirja(Kirja uusiKirja) {
        kirjasto.add(uusiKirja);
    }

    public void tulostaKirjat() {
        if (!kirjasto.isEmpty()) {
            for (Kirja kirja : this.kirjasto) {
                System.out.println(kirja);
            }
        }
    }

    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja kirja : this.kirjasto) {
            if (StringUtils.sisaltaa(kirja.nimeke(), nimeke)) {
                loydetyt.add(kirja);
            }
        }

        return loydetyt;
    }

    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja kirja : this.kirjasto) {
            if (StringUtils.sisaltaa(kirja.julkaisija(), julkaisija)) {
                loydetyt.add(kirja);
            }
        }

        return loydetyt;
    }

    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja kirja : this.kirjasto) {
            if (kirja.julkaisuvuosi() == julkaisuvuosi) {
                loydetyt.add(kirja);
            }
        }

        return loydetyt;
    }
//     public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke) {
//        return haeKirja(nimeke, null, -1);
//    }
// 
//    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
//        return haeKirja(null, julkaisija, -1);
//    }
// 
//    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
//        return haeKirja(null, null, julkaisuvuosi);
//    }
// 
//    // apumetodi
//    public ArrayList<Kirja> haeKirja(String nimeke, String julkaisija, int julkaisuvuosi) {
//        ArrayList<Kirja> loydetyt = new ArrayList<>();
//        for (Kirja kirja : this.kirjat) {
//            if (StringUtils.sisaltaa(kirja.nimeke(), nimeke)
//                    || StringUtils.sisaltaa(kirja.julkaisija(), julkaisija)
//                    || kirja.julkaisuvuosi() == julkaisuvuosi) {
//                loydetyt.add(kirja);
//            }
//        }
// 
//        return loydetyt;
//    }
}
