
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Tulostaja {

    private ArrayList<String> rivit; 

    public Tulostaja(String tiedostonimi) throws Exception {
        File tiedosto = new File(tiedostonimi);
        Scanner lukija = new Scanner(tiedosto, "UTF-8"); 
        rivit = new ArrayList<>();
        
        while (lukija.hasNext()) {
           rivit.add(lukija.nextLine()); 
        
        }
        lukija.close();
    }

    public void tulostaRivitJoilla(String sana) { // prints lines that contains "sana" = word

        for (String rivi : rivit) {
            if(sana.isEmpty() || rivi.contains(sana)){
                System.out.println(rivi);
            }
        }
    }

}
