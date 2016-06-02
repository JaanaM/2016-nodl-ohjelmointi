import java.util.Random;

public class SalasananArpoja {
    private int pituus;
    private Random random;
    // Määrittele muuttuja tässä

    public SalasananArpoja(int salasananPituus) {
        // Alusta muuttujat tässä
        this.pituus = salasananPituus;
        this.random = new Random();
    }

    public String luoSalasana() {
        // Kirjoita tähän koodi, joka palauttaa uuden salasanan
        String salasana= "";
        while (salasana.length()< this.pituus) {
            int merkki = random.nextInt(26);
            char kirjain = "abcdefghijklmnopqrstuvwxyz".charAt(merkki);
            salasana = salasana + kirjain;
        }
        return salasana;
    }
}
