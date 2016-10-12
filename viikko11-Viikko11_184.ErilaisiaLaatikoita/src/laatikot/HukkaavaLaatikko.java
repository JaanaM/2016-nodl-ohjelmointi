/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laatikot;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saria
 */
public class HukkaavaLaatikko extends Laatikko {

    private List<Tavara> tavarat;

    public HukkaavaLaatikko() {
        tavarat = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        tavarat.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }

}
