
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
public class Matkalaukku {

    private int maksimiPaino;
    private ArrayList<Tavara> tavarat;

    public Matkalaukku(int maksimiPaino) {
        this.maksimiPaino = maksimiPaino;
        this.tavarat = new ArrayList<>();
    }

    public void lisaaTavara(Tavara tavara) {

        if ((yhteispaino() + tavara.getPaino()) <= this.maksimiPaino) {
            tavarat.add(tavara);
        }
    }

    public void tulostaTavarat() {
        for (Tavara tavara : this.tavarat) {
            System.out.println(tavara);
        }
    }

    public int yhteispaino() {
        int paino = 0;
        for (Tavara t : this.tavarat) {
            paino += t.getPaino();
        }
        return paino;
    }

    public Tavara raskainTavara() {
        if (tavarat.size() == 0) {
            return null;
        } else {
            Tavara painavin = tavarat.get(0);
            for (Tavara tavara : tavarat) {
                if (painavin.getPaino() < tavara.getPaino()) {
                    painavin = tavara;
                }
            }
            return painavin;
        }
    }

    @Override
    public String toString() {
        int paino = yhteispaino();
        if (tavarat.size() == 0) {
            return "ei tavaroita (" + paino + " kg)";
        } else if (tavarat.size() == 1) {
            return tavarat.size() + " tavara (" + paino + " kg)";
        } else {
            return tavarat.size() + " tavaraa (" + paino + " kg)";
        }
    }

}
