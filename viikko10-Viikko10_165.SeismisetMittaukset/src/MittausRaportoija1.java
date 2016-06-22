
import java.util.ArrayList;
import java.util.List;

class MittausRaportoija1 implements SeismisenToiminnanMittaaja {

    MittausRaportoija1() {
    }

    public List<SuurinTaajuusRaportti> paivittaisetMaksimit(List<Double> mittausData,
            int kuukausi) {
        ArrayList <SuurinTaajuusRaportti> suurinRaportti = new ArrayList<>();
        double suurempi = mittausData.get(0);
        for (Double mittaus : mittausData) { // find biggest
            if (suurempi > mittaus) {
                suurempi = mittaus;
            }
        }
        // get day
        // days always in format YYYYMMDD
        String paiva = Integer.toString(kuukausi);
        paiva = paiva.substring(5, paiva.length());
        int paivanumeroina = Integer.parseInt(paiva);
        
        suurinRaportti.add(new SuurinTaajuusRaportti(paivanumeroina, suurempi));
        
        return suurinRaportti;
    }

}
