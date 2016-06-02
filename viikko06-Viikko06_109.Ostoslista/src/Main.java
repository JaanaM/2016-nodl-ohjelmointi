
public class Main {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä!

        Ostoslista lista = new Ostoslista();
        lista.lisaa("porkkana");
        lista.lisaa("porkkana");
        lista.lisaa("nauris");
        lista.lisaa("porkkana");
        lista.lisaa("satsuma");
        System.out.println("Porkkanaa: " + lista.kappalemaara("porkkana") + " kpl");
        System.out.println("Tomaatteja: " + lista.kappalemaara("tomaatti") + " kpl");

        lista.poista("porkkana");

        System.out.println();

        System.out.println("Porkkanaa: " + lista.kappalemaara("porkkana") + " kpl");
        System.out.println("Tomaatteja: " + lista.kappalemaara("tomaatti") + " kpl");

    }
}
