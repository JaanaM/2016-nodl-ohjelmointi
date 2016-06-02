
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Kasi implements Comparable<Kasi> {

    private ArrayList<Kortti> kadessa;

    public Kasi() {
        kadessa = new ArrayList<>();
    }

    public void lisaa(Kortti kortti) {
        kadessa.add(kortti);
    }

    public void tulosta() {
        for (Kortti kortti : kadessa) {
            System.out.println(kortti);
        }
    }

    public void jarjesta() {
        Collections.sort(kadessa);
    }

    public void jarjestaMaittain() {
        Collections.sort(kadessa, new SamatMaatVierekkainArvojarjestykseen());
    }

    @Override
    public int compareTo(Kasi kasi) {
        if (this.kadenSumma() == kasi.kadenSumma()) {
            return 0;
        } else if (this.kadenSumma() > kasi.kadenSumma()) {
            return 1;
        } else {
            return -1;
        }
    }

    public int kadenSumma() {
        int summa = 0;
        for (Kortti kortti : kadessa) {
            summa = summa + kortti.getArvo();
        }
        return summa;
    }

}
