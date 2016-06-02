
import java.util.Scanner;

public class Kauppa {

    private Varasto varasto;
    private Scanner lukija;

    public Kauppa(Varasto varasto, Scanner lukija) {
        this.varasto = varasto;
        this.lukija = lukija;
    }

    // metodi jolla hoidetaan yhden asiakkaan asiointi kaupassa
    public void asioi(String asiakas) {
        Ostoskori kori = new Ostoskori();
        System.out.println("Tervetuloa kauppaan " + asiakas);
        System.out.println("valikoimamme:");

        for (String tuote : varasto.tuotteet()) {
            System.out.println(tuote);
        }

        while (true) {
            System.out.print("mitä laitetaan ostoskoriin (pelkkä enter vie kassalle):");
            String tuote = lukija.nextLine();
            if (tuote.isEmpty()) {
                break;
            }
            if (varasto.saldo(tuote) > 0) {
                int hinta = varasto.hinta(tuote);
                varasto.ota(tuote);
                kori.lisaa(tuote, hinta);
               
            }

        }

        System.out.println("ostoskorissasi on:");
        kori.tulosta();
        System.out.println("korin hinta: " + kori.hinta());
    }

}
