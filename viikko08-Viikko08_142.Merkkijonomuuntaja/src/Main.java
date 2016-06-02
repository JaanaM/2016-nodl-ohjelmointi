
public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmaasi täällä
        Muuntaja skanditPois = new Muuntaja();
        skanditPois.lisaaMuunnos(new Muunnos('ä', 'a'));
        skanditPois.lisaaMuunnos(new Muunnos('ö', 'o'));
        System.out.println(skanditPois.muunna("ääliö älä lyö, ööliä läikkyy"));
    }
}
