
import java.util.Scanner;

public class SalasanaTahtina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Toteuta tänne tehtävä "Salasana tähtinä"
        System.out.println("Syötä merkkijono: ");
        String merkkijono = lukija.nextLine();
        System.out.print("Salasanasi on siis ");
        int tahtia = 0;
        while (tahtia< merkkijono.length()) {            
            System.out.print("*");
            tahtia++;
        }
        System.out.println("");
        
    }
}
