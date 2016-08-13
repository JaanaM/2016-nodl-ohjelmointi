
public class PalindrominTunnistus {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        System.out.println(onPalindromi("a man, a plan, a canal: Panama")); // true
        System.out.println(onPalindromi("not a bird, not a plane, superman!")); // false
        System.out.println(onPalindromi("saippuakauppias")); // true
        System.out.println(onPalindromi("porkkanakauppias")); // false
    }
// check if palindrome
    public static boolean onPalindromi(String merkkijono) {
        merkkijono = trimmaaMerkkijono(merkkijono);
        if (merkkijono.length() > 0) {
            String kaannetty = kaannaMerkkijono(merkkijono);
            if (merkkijono.equalsIgnoreCase(merkkijono)) {
                return true;
            }
        }
        // toteuta metodi tänne
        return false;
    }
// flip string
    private static String kaannaMerkkijono(String merkkijono) {
        String kaannetty = "";
        int i = merkkijono.length() - 1;
        while (i >= 0) {
            kaannetty += merkkijono.charAt(i);
            i--;
        }
        return kaannetty;
    }
// ingore other chars than normal letters and numbers
    private static String trimmaaMerkkijono(String merkkijono) {
        String trimmattu = "";
        trimmattu = merkkijono.replaceAll("[^A-Za-z0-9]", "");
        return trimmattu;
    }
}
