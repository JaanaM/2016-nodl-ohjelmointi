
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TiedostonKasittelija {

    public ArrayList<String> lue(String tiedosto) throws FileNotFoundException {
        File tiedostoSisalto = new File(tiedosto);
        ArrayList<String> rivit = new ArrayList<>();
        Scanner lukija = new Scanner(tiedostoSisalto);

        while (lukija.hasNextLine()) {
            rivit.add(lukija.nextLine());
        }

        return rivit;
    }

    public void tallenna(String tiedosto, String teksti) throws IOException {
        FileWriter kirjoittaja = new FileWriter(tiedosto);
        kirjoittaja.write(teksti);
        kirjoittaja.close();
    }

    public void tallenna(String tiedosto, ArrayList<String> tekstit) throws IOException {
        FileWriter kirjoittaja = new FileWriter(tiedosto);
        for (String string : tekstit) {
            kirjoittaja.write(string);
            kirjoittaja.write("\n");
        }
        kirjoittaja.close();
    }
}
