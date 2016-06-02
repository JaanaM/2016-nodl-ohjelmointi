
import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testauskoodia tänne
        int[] alkuperainen = {1, 2, 3, 4};
        int[] kopio = kaanna(alkuperainen);


        // tulostetaan molemmat
        System.out.println("alkup: " + Arrays.toString(alkuperainen));
        System.out.println("kopio: " + Arrays.toString(kopio));
        
    }

    public static int[] kopioi(int[] taulukko) {
        int[] kopio = new int[taulukko.length];
        for (int i = 0; i < taulukko.length; i++) {
            kopio[i] = taulukko[i];
        }
        return kopio;
    }

    public static int[] kaanna(int[] taulukko) {
        int[] kopio = new int[taulukko.length];
        for (int i = 0; i < taulukko.length; i++) {
            kopio[i] = taulukko[taulukko.length -1 - i];
        }

        return kopio;
    }

}
