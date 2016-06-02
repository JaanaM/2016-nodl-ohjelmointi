/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saria
 */
public class Laskin {

    private Lukija lukija = new Lukija();
    private int laskuja;

    public void kaynnista() {
        this.laskuja = 0;
        while (true) {

            System.out.print("komento: ");
            String komento = lukija.lueMerkkijono();
            if (komento.equals("lopetus")) {
                break;
            }

            if (komento.equals("summa")) {
                summa();
                laskuja++;
            } else if (komento.equals("erotus")) {
                erotus();
                laskuja++;
            } else if (komento.equals("tulo")) {
                tulo();
                laskuja++;
            }
        }

        statistiikka();
    }

    private void summa() {
        int[] luvut = kysyLuvut();
        System.out.println("lukujen summa " + (luvut[0] + luvut[1]));

    }

    private void erotus() {
        int[] luvut = kysyLuvut();
        System.out.println("lukujen erotus " + (luvut[0] - luvut[1]));

    }

    private void tulo() {
        int[] luvut = kysyLuvut();
        System.out.println("lukujen tulo " + (luvut[0] * luvut[1]));
    }

    private void statistiikka() {
        System.out.println("lukuja laskettiin " + this.laskuja);
    }

    private int[] kysyLuvut() {
        System.out.print("luku1: ");
        int luku1 = lukija.lueKokonaisluku();
        System.out.print("luku2: ");
        int luku2 = lukija.lueKokonaisluku();
        int[] luvut = new int[]{luku1, luku2};
        return luvut;
    }
}
