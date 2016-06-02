
import java.util.ArrayList;
import java.util.List;

public class RaportinLuoja2 implements Raportoiva {

    RaportinLuoja2() {
    }

    @Override
    public PainoindeksiRaportti painoindeksiRaportti(List<Henkilo> henkilotiedot) {
        PainoindeksiRaportti praportti;
        List<String> alipainoiset = new ArrayList<>();
        List<String> normaalipainoiset = new ArrayList<>();;
        List<String> ylipainoiset = new ArrayList<>();
        List<String> merkittavastiYlipainoiset = new ArrayList<>();
        for (Henkilo henkilo : henkilotiedot) {
            String tulos = laskePainoindeksi(henkilo.getPaino(), henkilo.getPituus());
            switch (tulos) {
                case "alipaino":
                    alipainoiset.add(henkilo.getNimi());
                    break;
                case "normaalipaino":
                    normaalipainoiset.add(henkilo.getNimi());
                    break;
                case "ylipaino":
                    ylipainoiset.add(henkilo.getNimi());
                    break;
                default:
                    merkittavastiYlipainoiset.add(henkilo.getNimi());
            }
        }
        return praportti = new PainoindeksiRaportti(alipainoiset, normaalipainoiset, ylipainoiset, merkittavastiYlipainoiset);
    }

    private String laskePainoindeksi(double paino, double pituus) {

        String tulos = "";
        double painoIndeksi = paino / (pituus * pituus);
        if (painoIndeksi < 18.5) {
            tulos = "alipaino";
        } else if (painoIndeksi < 25 && painoIndeksi >= 18.5) {
            tulos = "normaalipaino";
        } else if (painoIndeksi < 30 && painoIndeksi >= 25) {
            tulos = "ylipaino";
        } else if (painoIndeksi >= 30) {
            tulos = "merkittava";
        }
        return tulos;
    }
}
