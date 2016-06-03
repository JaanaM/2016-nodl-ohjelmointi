
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
        
        System.out.println(yleisimmat1.yleisetSanat(sanat));
        
    }

}
