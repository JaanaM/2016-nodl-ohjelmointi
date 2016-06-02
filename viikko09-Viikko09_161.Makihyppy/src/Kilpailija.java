
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Kilpailija implements Comparable<Kilpailija> {

    private String nimi;
    private int yhteisPisteet;
    private List<Integer> pituudet;

    public Kilpailija(String nimi) {
        this.nimi = nimi;
        this.yhteisPisteet = 0;
        this.pituudet = new ArrayList<>();
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setPituudet(int pituus) {
        pituudet.add(pituus);
    }

    public List<Integer> getPituudet() {
        return pituudet;
    }

    public void setYhteisPisteet(int yhteispisteet) {
        if (this.yhteisPisteet == 0) {
            this.yhteisPisteet = yhteispisteet;
        } else {
            this.yhteisPisteet += yhteispisteet;
        }

    }

    public int getYhteisPisteet() {
        return yhteisPisteet;
    }

    @Override
    public int compareTo(Kilpailija k) {
        if (this.yhteisPisteet == k.getYhteisPisteet()) {
            return 0;
        } else if (this.yhteisPisteet < k.getYhteisPisteet()) {
            return 1;
        } else {
            return -1;
        }
    }

}
