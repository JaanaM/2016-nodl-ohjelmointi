package luola;

import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        new Luola(5, 5, 3, 8, true).run(lukija);
    }
}