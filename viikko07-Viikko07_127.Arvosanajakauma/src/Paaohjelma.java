
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Arvosanat arvosanapisteet = new Arvosanat();

        // kysy pisteet
        System.out.println("Syötä koepisteet, -1 lopettaa:");
        while (true) {
            int pisteet = Integer.parseInt(lukija.nextLine());
            if (pisteet == -1) {
                break;
            }
            // tallenna pisteet
            arvosanapisteet.muutaPisteetArvosanoiksi(pisteet);
        }
        // näytä arvosanat
        arvosanapisteet.tulostaArvosanat();

    }
}
