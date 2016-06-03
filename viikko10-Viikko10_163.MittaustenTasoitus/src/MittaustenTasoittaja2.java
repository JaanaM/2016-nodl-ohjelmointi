
import java.util.ArrayList;
import java.util.List;

public class MittaustenTasoittaja2 implements Tasoittava {

    MittaustenTasoittaja2() {
    }

    @Override
    public List<Double> tasoita(List<Henkilo> henkilotiedot) {
        // average values of before and after values (if there is)
        List<Double> tasoitettuLista = new ArrayList<>();
        // list of original values
        List<Double> tasoitettavaLista = new ArrayList<>();
        // get values from persons and make them double
        for (Henkilo henkilo : henkilotiedot) {
            tasoitettavaLista.add((double)henkilo.getSyke());
        }
        // add original values to edit
        tasoitettuLista.addAll(tasoitettavaLista);
        for (int i = 0; i < tasoitettuLista.size(); i++) {

            if (i > 0 && i < tasoitettuLista.size()-1) {
                double keskiarvo = (tasoitettavaLista.get(i -1) + tasoitettavaLista.get(i) + tasoitettavaLista.get(i + 1)) / 3;
                tasoitettuLista.set(i, keskiarvo);
            }
        }
        return tasoitettuLista;
    }
}
