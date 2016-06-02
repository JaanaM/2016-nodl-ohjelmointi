
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
       ArrayList<Henkilo> henkilot = new ArrayList<>();
        henkilot.add(new Henkilo("Esko", 1.75, 999, 120));
        henkilot.add(new Henkilo("Markku", 1.90, 80, 80));
        henkilot.add(new Henkilo("Perkko", 1.90, 80, 110));
        henkilot.add(new Henkilo("Henkka", 1.90, 80, 80));
        henkilot.add(new Henkilo("Liisa", 150, 65,90));
        
        RaportinLuoja1 raportointi1 = new RaportinLuoja1();
        PainoindeksiRaportti raportti = raportointi1.painoindeksiRaportti(henkilot);
        
        System.out.println("Alipainoiset:" + raportti.getAlipainoiset());
        System.out.println("Normaalipainoiset:" + raportti.getNormaalipainoiset());
        System.out.println("Ylipainoiset:" + raportti.getYlipainoiset());
        System.out.println("Merkittavasti ylipainoiset:" + raportti.getMerkittavastiYlipainoiset());

    }

}
