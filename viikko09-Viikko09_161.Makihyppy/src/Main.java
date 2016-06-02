
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on erittäin hyödyllistä.
        Scanner lukija = new Scanner(System.in);
        new Simulaattori(lukija).kaynnista();
    }
}
