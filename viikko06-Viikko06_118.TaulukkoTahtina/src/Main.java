
public class Main {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        for (int i = 0; i < taulukko.length; i++) {
            tulostaTahtia(taulukko[i]);
        }
        // Kirjoita tulostuskoodi tänne
    }
    public static void tulostaTahtia (int maara) {
        int i= 0;
        while (i < maara) {            
            System.out.print("*");   
            i++;
        }
        System.out.println("");
    }
}
