/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laatikot;

/**
 *
 * @author Saria
 */
public class YhdenTavaranLaatikko extends Laatikko {

    private Tavara laatikonTavara;

    public YhdenTavaranLaatikko() {
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (laatikonTavara == null) {
            laatikonTavara = new Tavara(tavara.getNimi(), tavara.getPaino());
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        if (laatikonTavara != null) {
            return laatikonTavara.equals(tavara);
        }
        return false;
    }

}
