package sanakirja;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // Testaa sanakirjaa täällä
//        MuistavaSanakirja sanakirja = new MuistavaSanakirja();

        MuistavaSanakirja sanakirja = new MuistavaSanakirja("src/sanat.txt");
        boolean onnistui = false;
        onnistui = sanakirja.lataa();

        if (onnistui) {
            System.out.println("sanakirjan lataaminen onnistui");
        }
        sanakirja.lisaa("monkey", "apina");
        sanakirja.lisaa("banaani", "banana");
        sanakirja.lisaa("ohjelmointi", "programming");
        sanakirja.lisaa("kissa", "cat");

        System.out.println(sanakirja.kaanna("apina"));
        System.out.println(sanakirja.kaanna("ohjelmointi"));
        System.out.println(sanakirja.kaanna("alla oleva"));

        onnistui = sanakirja.tallenna();

        if (onnistui) {
            System.out.println("sanakirjan tallentaminen onnistui");
        }
    }
}
