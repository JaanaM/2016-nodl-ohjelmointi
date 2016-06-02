
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Ostoslista {

    HashMap<String, Integer> ostoslista;

    public Ostoslista() {
        ostoslista = new HashMap<>();
    }

    public void lisaa(String tuote) {
        if (!ostoslista.containsKey(tuote)) {
            ostoslista.put(tuote, 1);
        }else {
            ostoslista.put(tuote,  ostoslista.get(tuote)+ 1);
        }
    }

    public int kappalemaara(String tuote) {
       if (ostoslista.containsKey(tuote)) {
       return ostoslista.get(tuote);
       }
       return 0;
    }
    public void poista(String tuote){
            if (ostoslista.containsKey(tuote) && ostoslista.get(tuote) > 0) {
                ostoslista.put(tuote,  ostoslista.get(tuote)- 1);
            }
    }
}
