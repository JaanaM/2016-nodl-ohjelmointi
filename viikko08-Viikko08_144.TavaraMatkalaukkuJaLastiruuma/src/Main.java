
public class Main {

    public static void main(String[] args) {
        // käytä tätä pääohjelmaa luokkiesi testaamiseen!
        Lastiruuma lastiruuma = new Lastiruuma(1000);
        lisaaMatkalaukutTiiliskivilla(lastiruuma);
        System.out.println(lastiruuma);
    }

    public static void lisaaMatkalaukutTiiliskivilla(Lastiruuma lastiruuma) {
        for (int i = 0; i < 100; i++) {
            Matkalaukku laukku = new Matkalaukku(100);
            Tavara tiiliskivi = new Tavara("tiiliskivi", i + 1);
            laukku.lisaaTavara(tiiliskivi);
            lastiruuma.lisaaMatkalaukku(laukku);
        }
    }

}
