/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varastot;

/**
 *
 * @author Saria
 */
public class MuistavaTuotevarasto extends Tuotevarasto {

    private Muutoshistoria muutoshistoria = new Muutoshistoria();

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        muutoshistoria.lisaa(alkuSaldo);
        super.lisaaVarastoon(alkuSaldo);
    }

    public String historia() {
        return muutoshistoria.toString();
    }

    public void lisaaVarastoon(double maara) {
        super.lisaaVarastoon(maara);
        muutoshistoria.lisaa(getSaldo());

    }

    public double otaVarastosta(double maara) {
        double tilanne = super.otaVarastosta(maara);
        muutoshistoria.lisaa(tilanne);
        return tilanne;
    }

    public void tulostaAnalyysi() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tuote: ").append(super.getNimi()).append("\n");
        sb.append("Historia: ").append(historia()).append("\n");
        sb.append("Suurin tuotemäärä: ").append(muutoshistoria.maxArvo()).append("\n");
        sb.append("Pienin tuotemäärä: ").append(muutoshistoria.minArvo()).append("\n");
        sb.append("Keskiarvo: ").append(muutoshistoria.keskiarvo()).append("\n");
        sb.append("Suurin muutos: ").append(muutoshistoria.suurinMuutos()).append("\n");
        sb.append("Varianssi: ").append(muutoshistoria.varianssi()).append("\n");
        System.out.println(sb);

    }

}
