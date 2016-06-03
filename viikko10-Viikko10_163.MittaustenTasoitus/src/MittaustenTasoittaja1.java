
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class MittaustenTasoittaja1 implements Tasoittava {

    // average value of before and after values (if there is)

    private List<Double> tasoitettuLista;

    MittaustenTasoittaja1() {
        tasoitettuLista = new ArrayList<>();
    }

    @Override
    public List<Double> tasoita(List<Henkilo> henkilotiedot) {

        // all original values
        List<Integer> tasoitettavaLista = new ArrayList<>();
        // get pulse values from persons 
        for (Henkilo henkilo : henkilotiedot) {
            tasoitettavaLista.add(henkilo.getSyke());
        }
        // go through values
        for (int i = 0; i < tasoitettavaLista.size(); i++) {

            if (i > 0 && i < tasoitettavaLista.size() - 1) {
                double keskiarvo = (tasoitettavaLista.get(i - 1) + tasoitettavaLista.get(i) + tasoitettavaLista.get(i + 1)) / 3.0;
                tasoitettuLista.add(keskiarvo);
            } else {
                tasoitettuLista.add((double) tasoitettavaLista.get(i));
            }
        }

        return tasoitettuLista;
    }

    @Override
    public String toString() {
        // make results nicely printed
        String tulokset = "";
        NumberFormat nf = new DecimalFormat("##.##");
        for (Double tasoitettu : tasoitettuLista) {
            tulokset += nf.format(tasoitettu) + " ";
        }
        return tulokset;
    }

}
