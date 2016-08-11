
import java.util.ArrayList;
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
public class Kayttoliittyma {

    private Scanner lukija;
    private NumeroTiedustelu numerotiedot;

    public Kayttoliittyma(Scanner lukija, NumeroTiedustelu numerotiedot) {
        this.lukija = lukija;
        this.numerotiedot = numerotiedot;
    }
    // start
    public void kaynnista() {
        naytaValinnat();

        while (true) {
            System.out.print("komento: ");
            String syote = lukija.nextLine();
            if (syote.equals("x")) {
                break;
            }
            syotteenKasittely(syote);
        }
    }
    // show choises
    public void naytaValinnat() {
        System.out.println("numerotiedustelu\n"
                + " käytettävissä olevat komennot:\n"
                + " 1 lisää numero\n"
                + " 2 hae numerot\n"
                + " 3 hae puhelinnumeroa vastaava henkilö\n"
                + " 4 lisää osoite\n"
                + " 5 hae henkilön tiedot\n"
                + " 6 poista henkilön tiedot\n"
                + " 7 filtteröity listaus\n"
                + " x lopeta");
        System.out.println("");
    }
    
    private void syotteenKasittely(String syote) {
        switch (syote) {
            case "1":
                lisaaNumero();
                break;
            case "2":
                haeNumero();
                break;
            case "3":
                haeHenkilo();
                break;
            case "4":
                lisaaOsoite();
                break;
            case "5":
                haeTiedot();
                break;
            case "6":
                poistaTiedot();
                break;
            case "7":
                filtteroi();
                break;
            default: // wrong input
                System.out.println("Vaara syote");

        }
    }
    // search number by name
    private void haeNumero() {
        System.out.print("kenen: ");
        String nimi = lukija.nextLine();
        List<Tiedot> numerot = numerotiedot.haeNumero(nimi);
        if (numerot != null) {
            for (Tiedot numero : numerot) {
                System.out.println("  " + numero.getNumero());
            }
        } else {
            System.out.println(" ei löytynyt");
        }

    }
    // add number
    private void lisaaNumero() {
        System.out.print("kenelle: ");
        String nimi = lukija.nextLine();
        System.out.print("numero: ");
        String numero = lukija.nextLine();
        numerotiedot.lisaaUusi(nimi, numero, null, null);
    }
    // search person by phone
    private void haeHenkilo() {
        System.out.print("numero: ");
        String numero = lukija.nextLine();
        Tiedot nimi = numerotiedot.haeNimi(numero);
        if (nimi != null) {
            System.out.println(" " + nimi.getNimi());
        } else {
            System.out.println(" ei löytynyt");
        }
    }
    // add address
    private void lisaaOsoite() {
        System.out.print("kenelle: ");
        String nimi = lukija.nextLine();
        System.out.print("katu: ");
        String osoite = lukija.nextLine();
        System.out.print("kaupunki: ");
        String kaupunki = lukija.nextLine();
        numerotiedot.lisaaUusi(nimi, null, osoite, kaupunki);
    }
    // get all data by name
    private void haeTiedot() {
        System.out.print("kenen: ");
        String nimi = lukija.nextLine();
        // first address

        Tiedot osoitetiedot = numerotiedot.haeOsoite(nimi);
        if (osoitetiedot != null) {
            if (osoitetiedot.getKatu() != null) {
                System.out.println(numerotiedot.tulostaOsoite(osoitetiedot));
            } else {
                System.out.println(" osoite ei tiedossa");
            }
            // then phone number/s
            List<Tiedot> numerot = numerotiedot.haeNumero(nimi);
            if (numerot != null) {
                System.out.println(numerotiedot.tulostaNumerot(numerot));
            } else {
                System.out.println(" ei puhelinta");
            }
        } else {
            System.out.println(" ei löytynyt");
        }

    }
    // delete data
    private void poistaTiedot() {
        System.out.print("kenet: ");
        String nimi = lukija.nextLine();
        // check if name is found on the list
        if (!numerotiedot.poistaTiedot(nimi)) {
            // not found
            System.out.println(" ei löytynyt");
        }
    }
    // search with search term
    private void filtteroi() {
        System.out.println("hakusana (jost tyhjä, listataan kaikki): ");
        String hakusana = lukija.nextLine();
        ArrayList<String> tulokset = numerotiedot.hakuSanalla(hakusana);
        if (!tulokset.isEmpty()) {
            for (String tulos : tulokset) {
                System.out.println("");
                System.out.println(tulos);
            }
        } else {
            System.out.println(" ei löytynyt");
        }
    }

}
