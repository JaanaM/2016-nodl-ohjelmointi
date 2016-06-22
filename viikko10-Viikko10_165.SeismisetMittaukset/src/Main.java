
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        ArrayList <MittausData> data = new ArrayList<>();
        data.add(new MittausData(20151004, mittaa()));
        data.add(new MittausData(20151005, mittaa()));
        
        
        MittausRaportoija1 rap1 = new MittausRaportoija1();
        for (MittausData mittaus : data) {
            List raportti = rap1.paivittaisetMaksimit(mittaus.getMittaus(), mittaus.getPaivays());
            // somehow to print the daily maximum
            System.out.println(raportti.get(0)); // not working
        }
        
        
        
    }

    private static ArrayList<Double> mittaa() {
       ArrayList <Double> mittaukset = new ArrayList<>(); // get measurements to the list
        for (int i = 0; i < 3; i++) {
            Random rnd = new Random();
            double mittaus = (rnd.nextDouble() * (500 - 0) + 0);
            mittaukset.add(mittaus);
            
        }
        return mittaukset;
    }

}
