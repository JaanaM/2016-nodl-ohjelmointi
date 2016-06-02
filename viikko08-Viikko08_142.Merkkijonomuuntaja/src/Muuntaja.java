
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Muuntaja {

    private ArrayList<Muunnos> muunnokset;

    public Muuntaja() {
        muunnokset = new ArrayList<>();
    }

    public void lisaaMuunnos(Muunnos muunnos) {
        muunnokset.add(muunnos);
    }

    public String muunna(String merkkijono) {
        for (Muunnos muunnos : muunnokset) {
            merkkijono = muunnos.muunna(merkkijono);
        }
        return merkkijono;
    }

}
