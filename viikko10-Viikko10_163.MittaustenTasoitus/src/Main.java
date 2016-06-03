
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        // add persons to the list with name, height, weight and pulse
        ArrayList<Henkilo> henkilot = new ArrayList<>();
        henkilot.add(new Henkilo("Esko", 1.75, 999, 120));
        henkilot.add(new Henkilo("Markku", 1.90, 80, 80));
        henkilot.add(new Henkilo("Perkko", 1.90, 80, 110));
        henkilot.add(new Henkilo("Henkka", 1.90, 80, 80));
        henkilot.add(new Henkilo("Liisa", 150, 65, 90));
        henkilot.add(new Henkilo("Kaisa", 164, 62, 75));
        // remove odds from the list of pulses two different solutions
        MittaustenTasoittaja1 tasaaja1 = new MittaustenTasoittaja1();
        MittaustenTasoittaja2 tasaaja2 = new MittaustenTasoittaja2();

        // return average pulses
        tasaaja1.tasoita(henkilot);
        List<Double> tasatut = tasaaja2.tasoita(henkilot);
        // print them
        System.out.println(tasaaja1);

        for (Double tasattu : tasatut) {
            NumberFormat nf = new DecimalFormat("##.##");
            System.out.print(nf.format(tasattu) + " ");
        }

    }

}
