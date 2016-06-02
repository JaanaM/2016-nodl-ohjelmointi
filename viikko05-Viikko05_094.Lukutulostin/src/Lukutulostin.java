/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saria
 */
public class Lukutulostin {
    
    public Lukutulostin() {
    
    }
    
    public void lukuporras(int luku){
        int rivi = 1;
        while (rivi <= luku) {
            //System.out.print(rivinumero + ": ");

            int i = 1;
            while (i <= rivi) {
                System.out.print(i + " ");
                i++;
            }

            System.out.println();
            rivi++;
        }
    }
    public void jatkuvaLukuporras(int luku){
        int rivi = 1;
        int jatkuvaluku = 1;
        while (rivi <= luku) { // rivien määrä
            int sarake = 1;
            while (sarake <= rivi) { // luvujen määrä sarakkeella
                System.out.print(jatkuvaluku + " ");
                jatkuvaluku++;
                sarake++;
            }

            System.out.println();
            rivi++;
        }
    }
    public void kertokolmio(int luku){
        int rivi = 1;
        while (rivi <= luku) { // rivien määrä
            int sarake = 1;
            while (sarake <= rivi) { // luvujen määrä sarakkeella
                System.out.print(rivi * sarake + " ");
                sarake++;
            }

            System.out.println();
            rivi++;
        }
    }
}
