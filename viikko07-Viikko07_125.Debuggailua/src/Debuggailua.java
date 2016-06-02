
import java.util.Scanner;

public class Debuggailua {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna merkkijono:");
        String merkkijono = lukija.nextLine();

        System.out.println("Anna luku:");
        int luku = Integer.parseInt(lukija.nextLine());
        int moneskoKirjain = 0;

        for (int i = 0; i < merkkijono.length(); i++) { // kunnes merkkijono tuleevastaan
            for (int k = 1; k <= luku; k++) { // tulosta kirjain
                for (int p = 1; p < k; p++) { // tulosta tyhjää
                    System.out.print(" ");
                }
                if (moneskoKirjain > merkkijono.length() -1) {
                    break;
                }else {
                System.out.println(merkkijono.charAt(moneskoKirjain));
                moneskoKirjain++;
                }
            }
        }
        
    }
}
