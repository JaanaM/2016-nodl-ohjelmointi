
import kuva.Fotari;
import java.util.ArrayList;
import java.util.Collections;
import kuva.Kuva;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Yhdistin {

    private String yhdistamistapa;
    private ArrayList<Kuva> ladatutKuvat = new ArrayList<>();

    public Yhdistin(String yhdistamistapa) {
        this.yhdistamistapa = yhdistamistapa;
    }

    public ArrayList<Kuva> lataaKuvat(ArrayList<String> kuvat) {
        for (String kuva : kuvat) {
            this.ladatutKuvat.add(Fotari.lataa(kuva));
        }
        return ladatutKuvat;
    }

    public Kuva yhdistaKuvat(ArrayList<Kuva> kuvat) {
        Kuva uusiKuva = new Kuva(kuvat.get(0).getLeveys(), kuvat.get(0).getKorkeus());
        int x = 0;
        while (x < uusiKuva.getLeveys()) {
            int y = 0;
            while (y < uusiKuva.getKorkeus()) {
                
                    int punainen = haeVari("punainen", x, y, kuvat);
                    int vihrea = haeVari("vihrea", x, y, kuvat);
                    int sininen = haeVari("sininen", x, y, kuvat);

                    uusiKuva.asetaVari(x, y, punainen, vihrea, sininen);
                    
                y++;
            }
            x++;
        }

        return uusiKuva;
    }

    private int haeVari(String haettavaVari, int x, int y, ArrayList<Kuva> kuvat) {
        int vari = 0;
        ArrayList<Integer> variarvot = new ArrayList<>();
        if (haettavaVari.equals("punainen")) {
            vari = kuvat.get(0).punainen(x, y);
            for (Kuva kuva : kuvat) {
                variarvot.add(kuva.punainen(x, y));
                if (this.yhdistamistapa.equals("vaalein")) {
                    if (vari < kuva.punainen(x, y)) {
                        vari = kuva.punainen(x, y);
                    }
                }
                if (this.yhdistamistapa.equals("tummin")) {
                    if (vari > kuva.punainen(x, y)) {
                        vari = kuva.punainen(x, y);
                    }
                }
            }
        }
        if (haettavaVari.equals("vihrea")) {
            vari = kuvat.get(0).vihrea(x, y);
            for (Kuva kuva : kuvat) {
                variarvot.add(kuva.vihrea(x, y));
                if (this.yhdistamistapa.equals("vaalein")) {
                    if (vari < kuva.vihrea(x, y)) {
                        vari = kuva.vihrea(x, y);
                    }
                }
                if (this.yhdistamistapa.equals("tummin")) {
                    if (vari > kuva.vihrea(x, y)) {
                        vari = kuva.vihrea(x, y);
                    }
                }
            }
        }
        if (haettavaVari.equals("sininen")) {
            vari = kuvat.get(0).sininen(x, y);
            for (Kuva kuva : kuvat) {
                variarvot.add(kuva.sininen(x, y));
                if (this.yhdistamistapa.equals("vaalein")) {
                    if (vari < kuva.sininen(x, y)) {
                        vari = kuva.sininen(x, y);
                    }
                }
                if (this.yhdistamistapa.equals("tummin")) {
                    if (vari > kuva.sininen(x, y)) {
                        vari = kuva.sininen(x, y);
                    }
                }
            }
        }
        if (this.yhdistamistapa.equals("mediaani")) {
            Collections.sort(variarvot);
            vari = variarvot.get(variarvot.size() / 2);
        }

        return vari;
    }

}
