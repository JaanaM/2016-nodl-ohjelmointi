/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanatutkimus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sanatutkimus {

    private ArrayList<String> sanat;
    private File tiedosto;

    public Sanatutkimus(File tiedosto) {
        this.tiedosto = tiedosto;
        lueTiedosto();
    }

    public int sanojenMaara() {
        return sanat.size();

    }

    public List<String> kirjaimenZSisaltavatSanat() {
        List<String> zSanat = new ArrayList<>();
        for (String sana : sanat) {
            if (sana.contains("z")) {
                zSanat.add(sana);
            }
        }
        return zSanat;
    }

    public List<String> kirjaimeenLPaattyvatSanat() {
        List<String> lSanat = new ArrayList<>();
        for (String sana : sanat) {
            if (sana.endsWith("l")) {
                lSanat.add(sana);
            }
        }
        return lSanat;
    }

    public List<String> palindromit() {
        List<String> palidromit = new ArrayList<>();
        for (String sana : sanat) {
            String kaannos = kaannaSana(sana);
            if (sana.equals(kaannos)) {
                palidromit.add(sana);
            }
        }
        return palidromit;
    }

    public List<String> kaikkiVokaalitSisaltavatSanat() { // check all vovels
        List<String> vokaaliSanat = new ArrayList<>();
        char[] merkit = {'a', 'e', 'i', 'o', 'u','y', 'ä', 'ö'};
        for (String sana : sanat) {
            int i = 0;
            for (char merkki : merkit) {
                i++;
                if (sana.indexOf(merkki) >= 0) { // continue if char is in the string
                    if (merkit.length == i) { // if it was the last char of the vovels add it to the list
                        vokaaliSanat.add(sana);
                    }
                } else {
                    break;
                }

            }
        }
        return vokaaliSanat;
    }

    private void lueTiedosto() {
        sanat = new ArrayList<>();
        try {
            Scanner lukija = new Scanner(tiedosto, "UTF-8");
            while (lukija.hasNext()) {
                sanat.add(lukija.nextLine());
            }
        } catch (FileNotFoundException ex) {

        }
    }

    private String kaannaSana(String sana) {
        String kaannetty = "";
        int i = 0;
        while (i < sana.length()) {
            char merkki = sana.charAt(i);
            kaannetty = merkki + kaannetty;
            i++;
        }
        return kaannetty;
    }

}
