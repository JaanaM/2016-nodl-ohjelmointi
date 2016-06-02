
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    public boolean suurempi(Asunto verrattava){
        if (this.nelioita > verrattava.nelioita) {
            return true;
        }
        return false;
    }
    public int hintaero (Asunto verrattava) {
        
        int hinta = this.neliohinta * this.nelioita;
        int vertailuhinta = verrattava.neliohinta * verrattava.nelioita;
        if (hinta > vertailuhinta) {
            hinta = hinta - vertailuhinta;
        }else {
            hinta = vertailuhinta - hinta;
        }
        return hinta;
    }
    public boolean kalliimpi (Asunto verrattava){
        if ((this.neliohinta* this.nelioita) > (verrattava.neliohinta * verrattava.nelioita)) {
            return true;
        }
        return false;
    }
}
