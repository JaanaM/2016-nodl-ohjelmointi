
import java.util.Scanner;

public class EipasJuupas {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Toteuta tänne tehtävä "Eipäs Juupas"
        System.out.println("Anna merkkijono 1: ");
        String merkkijono = lukija.nextLine();
        System.out.println("Anna merkkijono 2: ");
        String merkkijono2 = lukija.nextLine();

        if (merkkijono.equals(merkkijono2)) {
            System.out.println("Olipas!\n"
                    + "No eipäs ollut!\n"
                    + "Juupas!");
        } else {
            System.out.println("Eipäs ollut!\n"
                    + "Juupas!\n"
                    + "Eipäs!");
        }
    }
}
