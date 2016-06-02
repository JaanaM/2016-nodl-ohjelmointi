
import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
        // indeksit:    0  1  2  3   4
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        jarjesta(luvut);
    }

    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];

        for (int luku : taulukko) {
            if (luku < pienin) {
                pienin = luku;
            }
        }
        return pienin;
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        // kirjoita koodia tähän
        int pienin = pienin(taulukko);
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] == pienin) {
                return i;
            }
        }
        return -1;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int pienin = taulukko[aloitusIndeksi];
        int indeksi = aloitusIndeksi;
        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                indeksi = i;
                pienin = taulukko[i];
            }
        }
        return indeksi;
    }

    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int apu = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = apu;
    }

    public static void jarjesta(int[] taulukko) {

        int indeksi = 0;
        System.out.println(Arrays.toString(taulukko));
        // katsotaan seuraavaksi pienin indeksi
        for (int i = 0; i < taulukko.length; i++) {
            // haetaan indeksi
            indeksi = pienimmanIndeksiAlkaen(taulukko, i);
            // vaihdetaan indeksi
            vaihda(taulukko, i, indeksi);
            System.out.println(Arrays.toString(taulukko));
        }

    }
}
