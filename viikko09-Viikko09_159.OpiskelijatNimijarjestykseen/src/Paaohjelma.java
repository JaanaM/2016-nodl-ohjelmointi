
import java.util.ArrayList;
import java.util.Collections;


public class Paaohjelma {

    
    public static void main(String[] args){
        Opiskelija eka = new Opiskelija("jamo");
        Opiskelija toka = new Opiskelija("jamo1");
        System.out.println(eka.compareTo(toka));
        ArrayList<Opiskelija> opiskelijoita = new ArrayList<>();
        opiskelijoita.add(new Opiskelija("Matti"));
        opiskelijoita.add(new Opiskelija("Pekka"));
        opiskelijoita.add(new Opiskelija("Mikko"));
        opiskelijoita.add(new Opiskelija("Arto"));
        opiskelijoita.add(new Opiskelija("Merja"));
        opiskelijoita.add(new Opiskelija("Pertti"));
        
        System.out.println(opiskelijoita);
        
        /*
         * Poista alla olevat kommentit, kun olet tehnyt compareTo metodin.
         */
        Collections.sort(opiskelijoita);
        System.out.println(opiskelijoita);
    }
}
