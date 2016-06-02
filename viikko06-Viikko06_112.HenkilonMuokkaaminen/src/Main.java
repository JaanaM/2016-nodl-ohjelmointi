
public class Main {

    public static void main(String[] args) {
        // voit kopioida tänne testikoodia materiaalista
        Henkilo verna = new Henkilo("Verna", 15, 1, 1993);
        Henkilo leo = new Henkilo("Leo", 1, 1, 1990);
        Henkilo mina = new Henkilo("Mina", 25, 11, 1986);
        Henkilo pekka = new Henkilo("Pekka", new Paivays(15, 2, 1983));
        Henkilo venla = new Henkilo("Venla", 22, 7, 2015);
        Henkilo h1 = new Henkilo("Helga", 30, 12, 2009);
        Henkilo h2 = new Henkilo("Janika", 1, 1, 2010);

//        System.out.println(venla.getNimi() + " vanhempi kuin " + pekka.getNimi() + ": " + venla.vanhempiKuin(pekka));
//        System.out.println(pekka.getNimi() + " vanhempi kuin " + venla.getNimi() + ": " + pekka.vanhempiKuin(venla));
        System.out.println(h1.getNimi() + " vanhempi kuin " + h2.getNimi() + ": " + h1.vanhempiKuin(h2));

        System.out.println(verna.getNimi() + " ikä " + verna.ika() + " vuotta");
        System.out.println(leo.getNimi() + " ikä " + leo.ika() + " vuotta");
        System.out.println(pekka.getNimi() + " ikä " + pekka.ika() + " vuotta");
        System.out.println(mina.getNimi() + " ikä " + mina.ika() + " vuotta");

        Henkilo iina = new Henkilo("Iina");

        System.out.println(pekka);
        System.out.println(iina);
    }
}
