
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tästä ohjelmasi käynnistyspiste
        // HUOM: ohjelmassa saa luoda Scanner-olion vain kertaalleen

        Scanner lukija = new Scanner(System.in);
        NumeroTiedustelu numerotiedustelu = new NumeroTiedustelu();
        new Kayttoliittyma(lukija,numerotiedustelu).kaynnista();
    }

   
}
