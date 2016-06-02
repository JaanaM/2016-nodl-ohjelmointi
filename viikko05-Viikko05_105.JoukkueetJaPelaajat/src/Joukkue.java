
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
public class Joukkue {

    private String nimi;
    private ArrayList<Pelaaja> pelaajat;
    private int maksimiKoko;

    public Joukkue(String nimi) {
        this.nimi = nimi;
        this.pelaajat = new ArrayList<>();
        this.maksimiKoko = 16;
    }

    public String haeNimi() {
        return nimi;
    }

    public void asetaMaksimikoko(int maksimi){
        this.maksimiKoko = maksimi;
    }
    public void lisaaPelaaja(Pelaaja pelaaja) {
        if (!(this.koko() == this.maksimiKoko)) {
            this.pelaajat.add(pelaaja);   
        }
    }
    
    public int koko(){
        return this.pelaajat.size();
    }

    public void tulostaPelaajat() {

        for (Pelaaja pelaaja : this.pelaajat) {
            System.out.println(pelaaja);
        }
    }
    public int maalit (){
        int maalit= 0;
        for (Pelaaja pelaaja : this.pelaajat) {
            maalit += pelaaja.maalit();
        }
        return maalit;
    }
}
