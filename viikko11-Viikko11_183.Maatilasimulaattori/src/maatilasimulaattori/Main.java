package maatilasimulaattori;

public class Main {

    public static void main(String[] args) {
        Maitosailio sailio = new Maitosailio();
        sailio.otaSailiosta(100);
        sailio.lisaaSailioon(25);
        sailio.otaSailiosta(5);
        System.out.println(sailio);

        sailio = new Maitosailio(50);
        sailio.lisaaSailioon(100);
        System.out.println(sailio);

        Lypsyrobotti lypsyrobotti = new Lypsyrobotti();
        Lehma lehma = new Lehma();
        lypsyrobotti.lypsa(lehma);
    }
}
