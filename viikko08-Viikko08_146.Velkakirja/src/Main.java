
public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmaasi täällä
        Velkakirja matinVelkakirja = new Velkakirja();
        matinVelkakirja.asetaLaina("Arto", 51.5);
        matinVelkakirja.asetaLaina("Arto", 10.5);

        System.out.println(matinVelkakirja.paljonkoVelkaa("Arto"));
    }
}
