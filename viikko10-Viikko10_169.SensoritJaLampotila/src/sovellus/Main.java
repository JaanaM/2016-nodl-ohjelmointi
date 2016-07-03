/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;


public class Main {

    public static void main(String[] args) {
        
        Sensori kumpula = new Lampomittari(); // remperature sensor in Kumpula
        kumpula.paalle();
        System.out.println("lämpötila Kumpulassa " + kumpula.mittaa() + " astetta"); // temperature today....

        Sensori kaisaniemi = new Lampomittari();
        Sensori helsinkiVantaa = new Lampomittari();

        Keskiarvosensori paakaupunki = new Keskiarvosensori(); // average temperatures
        paakaupunki.lisaaSensori(kumpula);
        paakaupunki.lisaaSensori(kaisaniemi);
        paakaupunki.lisaaSensori(helsinkiVantaa);

        paakaupunki.paalle();
        System.out.println("lämpötila Pääkaupunkiseudulla " + paakaupunki.mittaa() + " astetta");
        System.out.println("lämpötila Pääkaupunkiseudulla " + paakaupunki.mittaa() + " astetta");
        System.out.println("lämpötila Pääkaupunkiseudulla " + paakaupunki.mittaa() + " astetta");
        System.out.println("lämpötila Pääkaupunkiseudulla " + paakaupunki.mittaa() + " astetta");

        System.out.println("mittaukset: " + paakaupunki.mittaukset()); // all average temperatures
    }
}
