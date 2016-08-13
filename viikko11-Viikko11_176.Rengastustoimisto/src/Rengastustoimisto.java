
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saria
 */
public class Rengastustoimisto {

    private Map<Lintu, List<String>> lintulista;

    public Rengastustoimisto() {
        this.lintulista = new HashMap<>();
    }

    public void havaitse(Lintu lintu, String paikka) {
        if (!lintulista.containsKey(lintu)) {
            lintulista.put(lintu, new ArrayList<>());
        }
        lintulista.get(lintu).add(paikka);
    }

    public void havainnot(Lintu lintu) {

        List<String> havainnot = lintulista.get(lintu);
        if (havainnot == null) {
            System.out.println(lintu.toString() + " havaintoja: " + 0);
        } else {
            System.out.println(lintu.toString() + " havaintoja: " + havainnot.size());
            for (String havainto : havainnot) {
                System.out.println(havainto);
            }
        }

    }

}
