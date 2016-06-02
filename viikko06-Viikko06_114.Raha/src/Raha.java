
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa += senttia / 100;
            senttia %= 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return euroa;
    }

    public int sentit() {
        return senttia;
    }

    public String toString() {
        String nolla = "";
        if (senttia < 10) {
            nolla = "0";
        }

        return euroa + "." + nolla + senttia + "e";
    }

    public Raha plus(Raha lisattava) {
        int eurojenSumma = this.eurot() + lisattava.eurot();
        int senttienSumma = this.sentit() + lisattava.sentit();

        while (senttienSumma > 100) {
            eurojenSumma++;
            senttienSumma -= 100;
        }
        Raha uusi = new Raha(eurojenSumma, senttienSumma);

        return uusi;
    }

    public boolean vahemman(Raha verrattava) {
        if (this.eurot() < verrattava.eurot()) {
            return true;
        } else if (this.eurot() == verrattava.eurot() && this.sentit() < verrattava.sentit()) {
            return true;
        } else {
            return false;
        }
    }
    
    public Raha miinus(Raha vahentaja){
        int eurojenSumma = this.eurot() - vahentaja.eurot();
        int senttienSumma = this.sentit() - vahentaja.sentit();
        
        if (eurojenSumma < 0) {
            eurojenSumma = 0;
            senttienSumma = 0;
        }else if (eurojenSumma > 0 && senttienSumma < 0) {
            eurojenSumma --;
            senttienSumma += 100;
        }
        Raha uusi = new Raha(eurojenSumma, senttienSumma);

        return uusi;
    }
}
