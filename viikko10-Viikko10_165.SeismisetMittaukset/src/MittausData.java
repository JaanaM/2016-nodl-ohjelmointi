
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saria
 */
public class MittausData {
    private int paivays;
    private List <Double> mittaus; 

    public MittausData(int paivays, List<Double> mittaus) {
        this.paivays = paivays;
        this.mittaus = mittaus;
    }

    public void setMittaus(List<Double> mittaus) {
        this.mittaus = mittaus;
    }

    public void setPaivays(int paivays) {
        this.paivays = paivays;
    }

    public List<Double> getMittaus() {
        return mittaus;
    }

    public int getPaivays() {
        return paivays;
    }

    @Override
    public String toString() {
        String mittaukset = "";
        for (int i = 0; i < mittaus.size(); i++) {
             mittaukset += mittaus.get(i);
        }
        return paivays + " " + mittaukset ;
    }
    
    
}
