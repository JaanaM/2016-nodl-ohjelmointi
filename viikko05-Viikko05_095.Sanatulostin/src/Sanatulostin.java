/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saria
 */
public class Sanatulostin {
    String merkkijono;
    
    public Sanatulostin(String merkkijono){
        this.merkkijono = merkkijono;
    }
    public void sanaporras(int luku){
        int rivi = 1;
        int kirjain = 0;
        while (rivi <= luku) {

            int i = 1;
            while (i <= rivi) {
                if (kirjain > merkkijono.length() -1) {
                    kirjain = 0;
                }
                System.out.print(merkkijono.charAt(kirjain));
                i++;
                kirjain++;
            }

            System.out.println();
            rivi++;
        }
    }
    public void laskevaSanaporras(int luku){
        int rivi = 0;
        int kirjain = 0;
        while (rivi <= luku) { //rivit
            
            int i = luku;
            while (rivi < i) {
                if (kirjain > merkkijono.length() -1) {
                    kirjain = 0;
                }
                System.out.print(merkkijono.charAt(kirjain));
                i--;
                kirjain++;
            }

            System.out.println();
            rivi++;
        }
    }
    public void sanapyramidi(int luku){
        int rivi = 0;
        int kirjain = 0;
        while (rivi < luku) {

            int i = 0;
            while (i <= rivi) {
                if (kirjain == merkkijono.length()) {
                    kirjain = 0;
                }
                System.out.print(merkkijono.charAt(kirjain));
                i++;
                kirjain++;
            }

            System.out.println();
            rivi++;
        }
            rivi = 1;
            while (rivi < luku) { //rivit
            
            int i = luku;
            while (rivi < i) {
                if (kirjain == merkkijono.length()) {
                    kirjain = 0;
                }
                System.out.print(merkkijono.charAt(kirjain));
                i--;
                kirjain++;
            }

            System.out.println();
            rivi++;
        }
    }
}
