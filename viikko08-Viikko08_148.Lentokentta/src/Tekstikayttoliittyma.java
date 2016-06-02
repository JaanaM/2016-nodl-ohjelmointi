
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
class Tekstikayttoliittyma {

    private Scanner lukija;
    private Lentokentta lentokentta;

    Tekstikayttoliittyma(Scanner lukija, Lentokentta lentokentta) {
        this.lentokentta = lentokentta;
        this.lukija = lukija;
    }

    void kaynnista() {
        System.out.println("Lentokentän hallinta");
        System.out.println("--------------------");
        while (true) {
            String komento = hallinta();
            if (komento.equals("x")) {
                break;
            }
            if (komento.equals("1")) {
                lisaaLentokone();
            } else if (komento.equals("2")) {
                lisaaLento();
            } else {
                System.out.println("Komentoa ei tunnistettu!");
            }
        }
        System.out.println("Lentopalvelu\n"
                + "------------");
        while (true) {
            String komento = lentopalvelu();
            if (komento.equals("x")) {
                break;
            }
            if (komento.equals("1")) {
                lentokentta.tulostaLentokoneet();
            } else if (komento.equals("2")) {
                lentokentta.tulostaLennot();
            }else if (komento.equals("3")){
                System.out.print("Mikä kone: ");
                String tunnus = lukija.nextLine();
                lentokentta.tulostaLentokoneenTiedot(tunnus);
            } else {
                System.out.println("Komentoa ei tunnistettu!");
            }
        }
    }

    private String hallinta() {
        System.out.println("Valitse toiminto:\n"
                + "[1] Lisää lentokone\n"
                + "[2] Lisää lento\n"
                + "[x] Poistu hallintamoodista");

        System.out.print("> ");
        return lukija.nextLine();
    }

    private void lisaaLentokone() {
        System.out.print("Anna lentokoneen tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.print("Anna lentokoneen kapasiteetti: ");
        int kapasiteetti = Integer.parseInt(lukija.nextLine());
        lentokentta.lisaaLentokone(tunnus, kapasiteetti);
    }

    private void lisaaLento() {
        System.out.print("Anna lentokoneen tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.print("Anna lähtöpaikan tunnus: ");
        String lahtopaikka = lukija.nextLine();
        System.out.print("Anna kohdepaikan tunnus: ");
        String kohdepaikka = lukija.nextLine();
        lentokentta.lisaaLento(tunnus, lahtopaikka, kohdepaikka);
    }

    private String lentopalvelu() {
        System.out.println("Valitse toiminto:\n"
                + "[1] Tulosta lentokoneet\n"
                + "[2] Tulosta lennot\n"
                + "[3] Tulosta lentokoneen tiedot\n"
                + "[x] Lopeta");
        System.out.print("> ");
        return lukija.nextLine();
    }

}
