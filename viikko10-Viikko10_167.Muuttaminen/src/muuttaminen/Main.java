package muuttaminen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import muuttaminen.domain.Esine;
import muuttaminen.domain.Muuttolaatikko;
import muuttaminen.domain.Tavara;
import muuttaminen.logiikka.Pakkaaja;

public class Main {

    public static void main(String[] args) {
        // testaa ohjelmasi toimintaa täällä

// tavarat jotka haluamme pakata 
// items that we need to pack
        List<Tavara> tavarat = new ArrayList<>();
        tavarat.add(new Esine("passi", 2));
        tavarat.add(new Esine("hammasharja", 1));
        tavarat.add(new Esine("kirja", 4));
        tavarat.add(new Esine("sirkkeli", 8));

// luodaan pakkaaja, joka käyttää tilavuudeltaan 10:n kokoisia muuttolaatikoita
// packing assistant that adds the items to the moving boxes
        Pakkaaja pakkaaja = new Pakkaaja(5);

// pyydetään pakkaajaa pakkaamaan tavarat laatikoihin
// let's ask the assistant to pack the items to the boxes
        List<Muuttolaatikko> laatikot = pakkaaja.pakkaaTavarat(tavarat);

        System.out.println("laatikoita: " + laatikot.size());

        for (Muuttolaatikko laatikko : laatikot) {
            System.out.println("  laatikossa tavaraa: " + laatikko.getTilavuus() + " dm^3");
            System.out.println(laatikko);
        }
    }
}
