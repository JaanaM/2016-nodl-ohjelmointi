public class BinaariHaku {

    public static boolean hae(int[] taulukko, int etsittavaLuku) {
        int alku = 0;
        int loppu = taulukko.length - 1;

        // tarvitset ainakin toistolauseen, missä katsotaan aina taulukon
        // keskimmäistä alkiota, sekä jonkinlaisen toiminnallisuuden
        int keskimmainen = haeKeskimmainen(alku, loppu);
        while (alku <= loppu) {  
            if (taulukko[keskimmainen] == etsittavaLuku) {
                return true;
            } else if ( etsittavaLuku > taulukko[keskimmainen]) {
                alku = keskimmainen + 1;
            } else if (etsittavaLuku < taulukko[keskimmainen]) { 
                loppu = keskimmainen -1;
            }else {
                break;
            }
            keskimmainen = haeKeskimmainen(alku, loppu);
        }
        
        // hakualueen jatkuvaan pienentämiseen
        return false;
    }

    private static int haeKeskimmainen(int alku, int loppu) {
        return (alku + loppu) / 2;
    }
    
}
