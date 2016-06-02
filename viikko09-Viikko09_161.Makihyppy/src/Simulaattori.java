
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Simulaattori {

    private Scanner lukija;
    private ArrayList<Kilpailija> kilpailijat;

    public Simulaattori(Scanner lukija) {
        this.lukija = lukija;
        kilpailijat = new ArrayList<>();
    }

    public void kaynnista() {
        Kierros makihyppy = new Kierros();
        System.out.print("Kumpulan mäkiviikot");
        System.out.println("");
        System.out.println("");
        System.out.println("Syötä kilpailun osallistujat yksi kerrallaan, tyhjällä merkkijonolla siirtyy hyppyvaiheeseen.");
        // add competitioners until false
        while (lisaaOsallistuja(makihyppy)) {
        }
        kilpailijat.addAll(makihyppy.getOsallistujat());    // add competitioners to object
        System.out.println("");
        System.out.println("Kilpailu alkaa!");
        int kierros = 0;    // rounds for competition

        while (hyppataan()) {

            kierros++; // lisätään kierroksia
            System.out.println(kierros + ". kierros");
            System.out.println("");
            // list competitioners and points
            jarjestaHyppaajat();
            // results
            kierrostulokset(makihyppy, kierros);
        }
        System.out.println("Kiitos!");
        System.out.println("");
        lopetaKierros();

    }

    /* get competitiors names until typed empty string 
     */
    private boolean lisaaOsallistuja(Kierros makihyppy) {
        System.out.print("  Osallistujan nimi: ");
        String osallistuja = lukija.nextLine();
        if (osallistuja.isEmpty()) {
            return false; // jos tyhjä ei enää osallistujia siirytään kisaan
        }
        // kasaa osallistujat kierrokselle
        makihyppy.lisaaOsallistuja(osallistuja);
        return true;
    }

    private boolean hyppataan() {
        System.out.println("");
        System.out.print("Kirjoita \"hyppaa\" niin hypätään, muuten lopetetaan: ");
        String komento = lukija.nextLine();
                System.out.println("");
        if (komento.equals("hyppaa")) {
            return true;
        } else {
            return false;
        }

    }

    private void jarjestaHyppaajat() {
        System.out.println("Hyppyjärjestys:");
        Collections.sort(kilpailijat);
        Collections.reverse(kilpailijat);
        int laskuri = 1;
        // hae hyppääjät ja pisteet
        for (Kilpailija kilpailija : kilpailijat) {
            System.out.print("  "+ laskuri + ". " + kilpailija.getNimi());
            System.out.println(" (" + kilpailija.getYhteisPisteet() + " pistettä)");
            laskuri++;
        }
        System.out.println("");
    }

    private void kierrostulokset(Kierros makihyppy, int kierros) {
        System.out.println("Kierroksen " + kierros + " tulokset");
        // listaa osallistujan nimi 
        for (Kilpailija kilpailija : kilpailijat) {
            System.out.println("  " +kilpailija.getNimi());
            // hypyn pituus
            int pituus = makihyppy.hyppaa(kilpailija.getNimi());
            System.out.println("    pituus: " + pituus);
            
            // pisteet
            System.out.print("    tuomaripisteet: ");
            makihyppy.laskePisteet(kilpailija.getNimi(),pituus);
            System.out.println(makihyppy.getPisteet());
            kilpailija.setYhteisPisteet(makihyppy.getYhteispisteet());
        }

    }
    private void lopetaKierros() {

        System.out.println(""
                + "Kilpailun lopputulokset:");
        // listaa tulokset ja järjestys
        int laskuri = 0;
        Collections.sort(kilpailijat);
        for (Kilpailija kilpailijat1 : kilpailijat) {
            laskuri++;
            System.out.print("Sija    Nimi\n"
                    + laskuri + "       " + kilpailijat1.getNimi()
                    + "(" + kilpailijat1.getYhteisPisteet() + " pistettä)" + "\n"
                    + "          hyppyjen pituudet: ");
            List<Integer> hyppyPituudet = kilpailijat1.getPituudet();
            String pituudet = "";
            for (Integer pituus : hyppyPituudet) {
                pituudet += pituus + " m, ";

            }
            pituudet = pituudet.substring(0, pituudet.length() - 1);
            System.out.println(pituudet);
        }
    }
}
