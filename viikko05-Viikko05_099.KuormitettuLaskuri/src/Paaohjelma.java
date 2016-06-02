public class Paaohjelma {
    public static void main(String[] args) {
        Laskuri normaali = new Laskuri(10);
        normaali.lisaa();
        System.out.println("Arvo : " + normaali.arvo());
        normaali.vahenna(5);
        System.out.println("Arvo : " + normaali.arvo());
        
        Laskuri pluslaskuri = new Laskuri(10, true);
        pluslaskuri.lisaa();
        System.out.println("Arvo : " + pluslaskuri.arvo());
        pluslaskuri.vahenna(10);
        System.out.println("Arvo : " + pluslaskuri.arvo());
        pluslaskuri.vahenna(5);
        System.out.println("Arvo : " + pluslaskuri.arvo());
        
        Laskuri laskuri = new Laskuri();
        laskuri.lisaa();
        System.out.println("Arvo : " + laskuri.arvo());
        laskuri.vahenna(5);
        System.out.println("Arvo : " + laskuri.arvo());
        // tee tänne testikoodia
    }
}
