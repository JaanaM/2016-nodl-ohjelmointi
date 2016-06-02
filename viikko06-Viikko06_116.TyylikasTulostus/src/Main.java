
public class Main {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
        String tyylikasTulostus = "";
        for (int i = 0; i < taulukko.length; i++) {
            tyylikasTulostus += taulukko[i] + ", ";
        }
        tyylikasTulostus = tyylikasTulostus.substring(0, tyylikasTulostus.length()-2);
        System.out.println(tyylikasTulostus);
    }
}
