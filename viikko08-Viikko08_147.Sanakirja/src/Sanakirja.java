
import java.util.ArrayList;
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
public class Sanakirja {

    private HashMap<String, String> sanat;
    
    public Sanakirja() {
        sanat = new HashMap<>();
    }
    public String kaanna(String sana){
        if (sanat.containsKey(sana)) {
            return sanat.get(sana);
        }else {
            return null;
        }
    }
    public void lisaa (String sana, String kaannos) {
        sanat.put(sana, kaannos);
    }
    public int sanojenLukumaara() {
        return sanat.size();
    }
    
    public ArrayList<String> kaannoksetListana(){
        ArrayList<String> sanalista = new ArrayList<>();
        for (String avain: this.sanat.keySet()){
            sanalista.add(avain + " = " + sanat.get(avain));
        }
        return sanalista;
    }
}
