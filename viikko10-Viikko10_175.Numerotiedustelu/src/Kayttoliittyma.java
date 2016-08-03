
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
                poisteTiedot();
                break;
            case "7":
                filtteroi();
                break;
            default:
                System.out.println("Vaara syote");

        }
    }

    private void haeNumero() {
        System.out.print("kenen: ");
        String nimi = lukija.nextLine();
        List<Tiedot> numerot = numerotiedot.haeNumero(nimi);
        for (Tiedot numero : numerot) {
            System.out.println("  " + numero.getNumero());
        }
    }

    private void lisaaNumero() {
        System.out.print("kenelle: ");
        String nimi = lukija.nextLine();
        System.out.print("numero: ");
        String numero = lukija.nextLine();
        numerotiedot.lisaaUusi(nimi, numero);
    }

    private void haeHenkilo() {
        System.out.print("numero: ");
        String numero = lukija.nextLine();
        Tiedot nimi = numerotiedot.haeNimi(numero);
        if (nimi != null) {
            System.out.println(" " + nimi.getNimi());
        } else {
            System.out.println(" Ei löytynyt");
        }
    }

    private void lisaaOsoite() {
        System.out.print("kenelle: ");
        String nimi = lukija.nextLine();
        System.out.print("katu; ");
        String osoite = lukija.nextLine();
        System.out.print("kaupunki: ");
        String kaupunki = lukija.nextLine();
        numerotiedot.lisaaOsoite(nimi, nimi, kaupunki);
    }

    private void haeTiedot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void poisteTiedot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void filtteroi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
