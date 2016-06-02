
public class AioobVirheOhjelma {

    public static void main(String[] args) {
        // Toteuta tänne ohjelma, jossa tapahtuu ArrayIndexOutOfBoundsException -virhe
        int[] testi = new int[2];
        for (int i = 0; i < 10; i++) {
            System.out.println(testi[i]);
        }
    }
}
