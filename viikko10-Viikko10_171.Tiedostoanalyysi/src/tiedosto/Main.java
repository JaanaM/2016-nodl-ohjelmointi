package tiedosto;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä

        File tiedosto = new File("src/testitiedosto.txt");
        Analyysi analyysi;
        try {
            analyysi = new Analyysi(tiedosto);
            System.out.println("Rivejä: " + analyysi.rivimaara());
            System.out.println("Merkkejä: " + analyysi.merkkeja());
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
