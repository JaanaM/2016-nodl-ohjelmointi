
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
public class Pakkaus {

    private ArrayList<Lahja> lahjat;

    public Pakkaus() {
        lahjat = new ArrayList<>();
    }

    public void lisaaLahja(Lahja lahja) {
        lahjat.add(lahja);
    }

    public int getPaino() {
        int paino = 0;
        for (Lahja lahja : lahjat) {
            paino += lahja.getPaino();
        }
        return paino;
    }
}
