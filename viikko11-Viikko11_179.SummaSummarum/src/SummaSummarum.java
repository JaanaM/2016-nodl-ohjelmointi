
import java.util.ArrayList;
import java.util.List;

public class SummaSummarum {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(0);
        lista.add(7);
        lista.add(0);
        lista.add(5);
        lista.add(4);
        lista.add(1);
        lista.add(0);
        lista.add(0);
        lista.add(6);

        List<Integer> summat = summaSummarum(lista);
        for (int luku : summat) {
            System.out.println(luku);
        }
    }

    public static List<Integer> summaSummarum(List<Integer> luvut) {
        ArrayList<Integer> summat = new ArrayList<>();
        int summa = 0;
        for (Integer luku : luvut) {
            if (luku == 0 && summa == 0 ) { // two zeros let's break
                break;
            }
            else if (luku != 0) {
                summa += luku;
            } else { // there is 0 but last one wasn't 0
                summat.add(summa);
                summa = 0;
            }
        }

        return summat;
    }
}
