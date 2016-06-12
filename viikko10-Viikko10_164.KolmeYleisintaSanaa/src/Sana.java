
import java.util.ArrayList;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Sana implements Comparable<Sana> {

    private String sisalto;
    private int toistuvuus;

    public Sana(String sisalto, int toistuvuus) {
        this.sisalto = sisalto;
        this.toistuvuus = toistuvuus;
    }

    public String getSisalto() {
        return sisalto;
    }

    public int getToistuvuus() {
        return toistuvuus;
    }

    @Override
    public int compareTo(Sana toinen) {
        if (this.toistuvuus == toinen.toistuvuus) {
            return 0;
        } else if (this.toistuvuus < toinen.toistuvuus) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object olio) {
        if (olio == null) {
            return false;
        }
        Sana verrattava = (Sana) olio;
        if (this.sisalto == null || !this.sisalto.equals(verrattava.getSisalto())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.sisalto);
        return hash;
    }

}
