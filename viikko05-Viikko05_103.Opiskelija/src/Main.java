
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // tee tänne pääohjelma
        ArrayList<Opiskelija> lista = new ArrayList<>();
        while (true) {
            System.out.print("Nimi : ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty() || nimi.length() == 0) {
                break;
            }
            System.out.print("Opiskelijanumero: ");
            String opiskelijanro = lukija.nextLine();
            lista.add(new Opiskelija(nimi, opiskelijanro));
        }
        for (Opiskelija opiskelija : lista) {
            System.out.println(opiskelija);
        }
        System.out.println("");

        System.out.println("Anna hakusana");
        String haku = lukija.nextLine();
        System.out.println("Tulokset: ");
        for (Opiskelija opiskelija : lista) {
            if (opiskelija.haeNimi().contains(haku)) {
                System.out.println(opiskelija);
            }
        }
    }
}
