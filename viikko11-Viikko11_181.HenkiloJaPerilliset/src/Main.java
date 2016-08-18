
import henkilot.Henkilo;
import henkilot.Opettaja;
import henkilot.Opiskelija;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // teachers
        Opettaja ada = new Opettaja("Ada Lovelace", "Korsontie 1 03100 Vantaa", 1200);
        Opettaja esko = new Opettaja("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);
        // students
        Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
        for (int i = 0; i < 25; i++) {
            olli.opiskele();
        }
        System.out.println(olli);
        // all persons
        List<Henkilo> henkilot = new ArrayList<Henkilo>();
        henkilot.add(new Opettaja("Ada Lovelace", "Korsontie 1 03100 Vantaa", 1200));
        henkilot.add(new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki"));
        // print all persons with their own tostring()
        tulostaLaitoksenHenkilot(henkilot);
    }

    public static void tulostaLaitoksenHenkilot(List<Henkilo> henkilot) {
        for (Henkilo henkilo : henkilot) {
            System.out.println(henkilo);
        }
    }
}
