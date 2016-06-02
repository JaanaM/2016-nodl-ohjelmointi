
import java.util.ArrayList;
import java.util.Random;

public class LottoRivi {

    private ArrayList<Integer> numerot;
    private Random random;
    public LottoRivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.random = new Random();
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        // Kirjoita numeroiden arvonta tänne käyttämällä metodia sisaltaaNumeron()
        while (numerot.size() <7) {            
            int numero = random.nextInt(39) + 1;
            while (sisaltaaNumeron(numero)) {
                numero = random.nextInt(39) + 1;
            }
            numerot.add(numero);    
        }
        
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        if (!numerot.contains(numero)) {
            return false;
        }
        return true;
    }
}
