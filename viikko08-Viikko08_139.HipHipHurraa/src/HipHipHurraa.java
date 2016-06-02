
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Toteuta tänne tehtävä "Hip Hip Hurraa"
        System.out.print("Kirjoita merkkijono: ");
        String merkkijono = lukija.nextLine();
        int rivi = 1;
        for (int i = 0; i < merkkijono.length(); i++) {
            
            System.out.print(merkkijono.charAt(i));
            if (rivi %2 == 0 ) {
                System.out.print(" hip");
            }
            if (rivi %5 == 0) {
                System.out.print(" hurraa");
            }
            System.out.print("\n");
            rivi++;
        }
    }
}
