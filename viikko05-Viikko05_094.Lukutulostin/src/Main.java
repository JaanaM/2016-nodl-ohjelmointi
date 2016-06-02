
public class Main {

    public static void main(String[] args) {
        Lukutulostin tulostin = new Lukutulostin();
        tulostin.lukuporras(3);
        System.out.println();
        tulostin.lukuporras(5);
        System.out.println();
        tulostin.lukuporras(2);
        System.out.println();       
        tulostin.jatkuvaLukuporras(5);
        System.out.println();       
        tulostin.kertokolmio(5);
    }
}
