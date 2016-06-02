
import java.util.HashMap;

public class Lempinimet {

    public static void main(String[] args) {
        // Tee tehtävänannossa pyydetyt operaatiot täällä!
        HashMap<String, String> lempinimet = new HashMap<>();
        lempinimet.put("matti", "mage");
        lempinimet.put("mikael", "mixu");
        lempinimet.put("arto", "arppa");
        
        System.out.println(lempinimet.get("mikael"));
        
    }

}
