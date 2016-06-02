
import java.util.ArrayList;
import java.util.Collections;
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
class Pisteet implements Comparable <Pisteet>{
    private int yhteisPisteet;
    private List<Integer> pisteet;

    public Pisteet() {
        this.yhteisPisteet = 0;
        
    }

    public void asetaPisteet( int pituus) {
        pisteet = new ArrayList<>(); // laske jokaiselle osallistujalle omat pisteet
        for (int i = 0; i < 5; i++) {
            Random rnd = new Random();
            this.pisteet.add(rnd.nextInt(20 - 10 + 1) + 10);
        }
        laskeYhteispisteet(pisteet, pituus);
    }

    public void laskeYhteispisteet(List<Integer> pisteet, int pituus) {
        //sorting
        Collections.sort(pisteet);
        // then removing the smallest and biggest point to take the three middle ones and count them togheter
        // make copy of the points
        List <Integer> jarjestetytPisteet = new ArrayList<>();
        jarjestetytPisteet.addAll(pisteet);
        jarjestetytPisteet.remove(0);
        jarjestetytPisteet.remove(jarjestetytPisteet.size()-1);
        
        for (int piste : jarjestetytPisteet) {
            yhteisPisteet += piste;
        }
        // add the jump lenght to te points
        yhteisPisteet += pituus;
    }

    public int getYhteisPisteet() {
        return yhteisPisteet;
    }

    public List<Integer> getPisteet() {
        return this.pisteet;
    }

    
    @Override
    public int compareTo(Pisteet p) {
        if (this.yhteisPisteet == p.getYhteisPisteet()) {
            return 0;
        } else if(this.yhteisPisteet < p.getYhteisPisteet()){
            return 1;
        } else {
            return -1;
        }
    }
    
    
}
