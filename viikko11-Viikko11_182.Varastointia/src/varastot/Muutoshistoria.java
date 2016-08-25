/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varastot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Saria
 */
public class Muutoshistoria {

    private ArrayList<Double> historia;

    public Muutoshistoria() {

        historia = new ArrayList<>();
    }

    public void lisaa(double tilanne) {
        historia.add(tilanne);
    }

    public void nollaa() {
        historia.clear();
    }

    @Override
    public String toString() {

        return historia.toString();
    }

    public double maxArvo() {
        double suurempi = 0;
        if (!historia.isEmpty()) {
            suurempi = historia.get(0);
            for (Double arvo : historia) {
                if (suurempi < arvo) {
                    suurempi = arvo;
                }

            }
        }
        return suurempi; 
        // better way
        //Collections.max(historia);
    }

    public double minArvo() {
        double pienin = 0;
        if (!historia.isEmpty()) {
            pienin = historia.get(0);
            for (Double arvo : historia) {
                if (pienin > arvo) {
                    pienin = arvo;
                }

            }
        }
        return pienin;
        // better way
        //Collections.min(historia);
    }

    public double keskiarvo() {
        if (!historia.isEmpty()) {
            double summa = 0;
            for (Double arvo : historia) {
                summa += arvo;
            }
            return summa / historia.size();

        } else {
            return 0;
        }
    }

    public double suurinMuutos() {
        double muutos = 0;
        List<Double> muutokset = new ArrayList<>();
        if (!historia.isEmpty() && historia.size() > 1) {

            for (int i = 0; i < historia.size(); i++) {
                try {
                    double verrattava = historia.get(i);
                    double arvo = historia.get(i + 1);
                    muutos = Math.abs(verrattava - arvo);
                    muutokset.add(muutos);
                } catch (IndexOutOfBoundsException e) {
                    break;
                }
            }
            Collections.sort(muutokset);
            Collections.reverse(muutokset);

            return muutokset.get(0);
        } else {
            return 0.0;
        }
    }

    public double varianssi() {
        if (!historia.isEmpty() && historia.size() > 1) {
            double varianssi = 0;
            for (Double arvo : historia) {
                varianssi += Math.pow((keskiarvo() - arvo), 2);
            }
            varianssi = varianssi / (historia.size() - 1);
            return varianssi;
        }
        return 0;
    }

}
