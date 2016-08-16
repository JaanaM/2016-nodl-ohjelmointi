/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siirrettava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saria
 */
public class Lauma implements Siirrettava {

    private List<Siirrettava> lauma;

    public Lauma() {
        this.lauma = new ArrayList<>();
    }
    // add object to group
    public void lisaaLaumaan(Siirrettava siirrettava) {
        lauma.add(siirrettava);
    }

    @Override
    // return object positions on own lines
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Siirrettava siirrettava: lauma) {
            sb.append(siirrettava.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public void siirra(int dx, int dy) {
        for (Siirrettava siirrettava: lauma) {
            siirrettava.siirra(dx, dy);
        }
    }

}
