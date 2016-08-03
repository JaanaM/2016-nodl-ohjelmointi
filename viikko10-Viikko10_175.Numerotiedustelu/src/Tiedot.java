/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saria
 */
public class Tiedot {

    private String nimi;
    private String numero;
    private String katu;
    private String kaupunki;

    public Tiedot() {
        this(null,null,null,null);
    }
    public Tiedot (String nimi, String numero) {
        this(nimi,numero, null, null);
    }
    public Tiedot (String nimi, String katu, String kaupunki) {
        this(nimi,null, katu, kaupunki);
    }
    public Tiedot(String nimi, String numero, String katu, String kaupunki) {
        this.nimi = nimi;
        this.numero = numero;
        this.katu = katu;
        this.kaupunki = kaupunki;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setKaupunki(String kaupunki) {
        this.kaupunki = kaupunki;
    }

    public String getKaupunki() {
        return kaupunki;
    }

    public void setKatu(String osoite) {
        this.katu = osoite;
    }

    public String getKatu() {
        return katu;
    }

    public String getNimi() {
        return nimi;
    }

    public String getNumero() {
        return numero;
    }

}
