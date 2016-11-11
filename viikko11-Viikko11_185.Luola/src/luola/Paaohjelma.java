package luola;

import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        new Luola(3, 3, 2, 10, true).run(lukija);
    }
}