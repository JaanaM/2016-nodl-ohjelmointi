
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        TiedostonKasittelija t = new TiedostonKasittelija();

        for (String rivi : t.lue("src/koesyote1.txt")) {
            System.out.println(rivi);
        }
        t.tallenna("src/testi.txt", "tama on testi");
        t.tallenna("src/testi.txt", t.lue("src/koesyote2.txt"));
    }
}
