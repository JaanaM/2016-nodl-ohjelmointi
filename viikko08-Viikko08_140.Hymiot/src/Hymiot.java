
public class Hymiot {

    public static void main(String[] args) {
        // Testaa metodisi toimintaa ainakin seuraavilla kutsuilla
        tulostaHymioityna("Metodi");
        tulostaHymioityna("Hajautustaulu");
        tulostaHymioityna("Rajapinta");
    }

    private static void tulostaHymioityna(String merkkijono) {
        String hymio = ":)";
        if (merkkijono.length() % 2 == 1) {
            merkkijono = merkkijono + " ";
        }
        // luo keskimmäinen merkkijono
        String hymiojono = "";
        merkkijono = hymio + " " + merkkijono + " " + hymio;
        for (int i = 0; i < merkkijono.length() / 2; i++) {
            hymiojono += hymio;
        }
        System.out.println(hymiojono);
        System.out.println(merkkijono);
        System.out.println(hymiojono);
        System.out.println("");
    }
}
