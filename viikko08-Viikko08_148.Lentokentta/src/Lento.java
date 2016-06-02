/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saria
 */
class Lento {
    private String lahtopaikka;
    private String kohdepaikka;
    private Lentokone lentokone;

    public Lento(String lahtopaikka, String kohdepaikka, Lentokone lentokone) {
        this.lahtopaikka = lahtopaikka;
        this.kohdepaikka = kohdepaikka;
        this.lentokone = lentokone;
    }

    public String getKohdepaikka() {
        return kohdepaikka;
    }

    public String getLentokone() {
        return this.lentokone.toString();
    }

    public String getLahtopaikka() {
        return lahtopaikka;
    }
    
    
}
