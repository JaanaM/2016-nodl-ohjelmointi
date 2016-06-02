
import java.util.Scanner;

public class Paaohjelma {

    // tee ohjelmaasi VAIN YKSI Scanner-olio
    // jos joudut käyttämään Scanneria muualta kuin luontipaikasta, välitä se parametrina
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Lintutietokanta lintutietokanta = new Lintutietokanta();
        System.out.println("Tervetuloa Lintutietokantaan !");
        System.out.println("Komennot: Lisaa, Havainto, Tilasto, Nayta Lopeta");
        String komento = "";
        while (!komento.equals("Lopeta")) {
            System.out.print("? ");
            komento = lukija.nextLine();
            String nimi = "";
            switch (komento.toLowerCase()) {
                case "lisaa":
                    // lisaa lintu
                    System.out.print("Nimi: ");
                    nimi = lukija.nextLine();
                    System.out.print("Latinakielinen nimi: ");
                    String toinenNimi = lukija.nextLine();
                    lintutietokanta.lisaaLintu(nimi, toinenNimi);
                    continue;
                case "havainto":
                    // lisaa havainto
                    System.out.print("Mikä havaittu? ");
                    nimi = lukija.nextLine();
                    lintutietokanta.lisaaHavainto(nimi);
                    continue;
                case "tilasto":
                    // nayta tilasto
                    lintutietokanta.naytaTilasto();
                    continue;
                case "nayta":
                    System.out.println("Mikä? ");
                    nimi = lukija.nextLine();
                    lintutietokanta.naytaTiedot(nimi);
                    // nayta tietty lintu
                    continue;
                case "lopeta":
                    break;
                default:
                    System.out.println("Komentoa ei löydy");
                    break;
            }
        }

    }

}
