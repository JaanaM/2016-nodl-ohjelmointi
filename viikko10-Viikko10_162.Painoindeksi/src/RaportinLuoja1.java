
import java.util.ArrayList;
import java.util.List;

public class RaportinLuoja1 implements Raportoiva {

    public RaportinLuoja1() {
    }

    @Override
    public PainoindeksiRaportti painoindeksiRaportti(List<Henkilo> henkilotiedot) {
        PainoindeksiRaportti praportti;
        List<String> alipainoiset = new ArrayList<>();
        List<String> normaalipainoiset = new ArrayList<>();;
        List<String> ylipainoiset = new ArrayList<>();
        List<String> merkittavastiYlipainoiset = new ArrayList<>();
        for (Henkilo henkilo : henkilotiedot) {
           double indeksi= laskePainoindeksi(henkilo.getPaino(), henkilo.getPituus());
            if (indeksi < 18.5) {
                alipainoiset.add(henkilo.getNimi());
            } else if(indeksi < 25 && indeksi >=18.5){
                normaalipainoiset.add(henkilo.getNimi());
            } else if (indeksi < 30 && indeksi >= 25){
                ylipainoiset.add(henkilo.getNimi());
            } else if (indeksi >= 30) {
                merkittavastiYlipainoiset.add(henkilo.getNimi());
            }
        }
        praportti = new PainoindeksiRaportti(alipainoiset, normaalipainoiset, ylipainoiset, merkittavastiYlipainoiset);
        return praportti;
    }

    private double laskePainoindeksi(double paino, double pituus) {
       return  paino / (pituus * pituus);
    }
}
