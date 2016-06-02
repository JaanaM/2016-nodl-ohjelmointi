
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
public class Laatikko implements Talletettava {

    private double maksimiPaino;
    private ArrayList<Talletettava> talletettavat;

    public Laatikko(double maksimiPaino) {
        talletettavat = new ArrayList<>();
        this.maksimiPaino = maksimiPaino;
    }

    public void lisaa(Talletettava talletettava) {
        if (this.paino() + talletettava.paino() < maksimiPaino) {
            this.talletettavat.add(talletettava);
        }
    }

    @Override
    public double paino() {
        double paino = 0;
        for (Talletettava t : talletettavat) {
            paino = paino + t.paino();
        }
        return paino;
    }

    @Override
    public String toString() {
        return "Laatikko: " + talletettavat.size() + " esinettä, paino yhteensä " + paino() + " kiloa";
    }

}
