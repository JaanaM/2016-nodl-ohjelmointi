
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti> {

    public int compare(Kortti k1, Kortti k2) {
        int maat = maaJarjestys(k1, k2);
        if (maat == 0) {
            return kortitJarjestys(k1, k2);
        } else {
            return maat;
        }

    }

    private int maaJarjestys(Kortti k1, Kortti k2) {
        return k1.getMaa() - k2.getMaa();
    }

    private int kortitJarjestys(Kortti k1, Kortti k2) {
        return k1.getArvo() - k2.getArvo();
    }

}
