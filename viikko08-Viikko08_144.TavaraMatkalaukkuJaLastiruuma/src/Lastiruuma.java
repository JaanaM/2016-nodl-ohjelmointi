
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
public class Lastiruuma {

    private int maksimiPaino;
    private ArrayList<Matkalaukku> laukut;

    public Lastiruuma(int maksimiPaino) {
        this.maksimiPaino = maksimiPaino;
        laukut = new ArrayList<>();
    }

    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if (yhteispaino() + laukku.yhteispaino() <= maksimiPaino) {
            laukut.add(laukku);
        }
    }

    public int yhteispaino() {
        int paino = 0;
        for (Matkalaukku l : this.laukut) {
            paino += l.yhteispaino();
        }
        return paino;
    }

    public void tulostaTavarat() {
        for (Matkalaukku laukku : this.laukut) {
            laukku.tulostaTavarat();
        }
    }

    @Override
    public String toString() {
        return laukut.size() + " matkalaukkua (" + yhteispaino() + " kg)";
    }

}
