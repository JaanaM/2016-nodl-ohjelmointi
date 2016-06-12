
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        List <String> sanat = new ArrayList<>();
        sanat.add("mansikka");
        sanat.add("mustikka");
        sanat.add("mansikka");
        sanat.add("puolukka");
        sanat.add("vatukka");
        sanat.add("juolukka");
        sanat.add("manstikka");
        sanat.add("mustikka");
        
        YleisimmatSanat1 yleisimmat1 = new YleisimmatSanat1();
        YleisimmatSanat2 yleisimmat2 = new YleisimmatSanat2();
        System.out.println(yleisimmat1.yleisetSanat(sanat));
        System.out.println("");
        List <String> sanatTop = yleisimmat2.yleisetSanat(sanat);
        for (String sana : sanatTop) {
            System.out.print(sana+ " " );
        }
         
    }

}
