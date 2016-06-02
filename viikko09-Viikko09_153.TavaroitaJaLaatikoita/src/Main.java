
public class Main {

    public static void main(String[] args) {
        // testaa täällä luokkiesi toimintaa
        Laatikko kirjaLaatikko = new Laatikko(5);

        kirjaLaatikko.lisaa(new Kirja("Fedor Dostojevski", "Rikos ja Rangaistus", 3));
        kirjaLaatikko.lisaa(new Kirja("Robert Martin", "Clean Code", 2));
        kirjaLaatikko.lisaa(new Kirja("Kent Beck", "Test Driven Development", 0.7));

        Laatikko cDLaatikko = new Laatikko(10);

        cDLaatikko.lisaa(new CDLevy("Pink Floyd", "Dark Side of the Moon", 1973));
        cDLaatikko.lisaa(new CDLevy("Wigwam", "Nuclear Nightclub", 1975));
        cDLaatikko.lisaa(new CDLevy("Rendezvous Park", "Closer to Being Here", 2012));

        Laatikko muuttoLaatikko = new Laatikko(50);
        muuttoLaatikko.lisaa(cDLaatikko);
        muuttoLaatikko.lisaa(kirjaLaatikko);

        System.out.println(muuttoLaatikko);
    }

}
