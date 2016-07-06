/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiedosto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Analyysi {
    private ArrayList<String> rivit;

    public Analyysi(File tiedosto) throws Exception {
        rivit = new ArrayList<>();
        Scanner lukija = new Scanner(tiedosto);
        while(lukija.hasNextLine()){
            rivit.add(lukija.nextLine());
        }
        lukija.close();
    }
    
    public int rivimaara() { // get line count
        return rivit.size();     
    }
    public int merkkeja() { // count all chars
        int merkkienMaara = 0; // char amount
        for (String rivi : rivit) {
            merkkienMaara += rivi.length();
        }
        
        return merkkienMaara += rivit.size(); // add linespaces too 
    }
    
}
