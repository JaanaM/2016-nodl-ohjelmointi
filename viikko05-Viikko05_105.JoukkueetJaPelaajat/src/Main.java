
public class Main {

    public static void main(String[] args) {
        // testaa luokkiesi toimintaa täällä

        Joukkue tapiiri = new Joukkue("FC Tapiiri");
        
        Pelaaja matti = new Pelaaja("Matti");
        Pelaaja pekka = new Pelaaja("Pekka", 39);
        tapiiri.lisaaPelaaja(matti);
        tapiiri.lisaaPelaaja(pekka);
        tapiiri.lisaaPelaaja(new Pelaaja("Mikael", 1)); //vaikutus on sama kuin edellisillä

        System.out.println("Maaleja yhteensä: " + tapiiri.maalit());
    }
}
