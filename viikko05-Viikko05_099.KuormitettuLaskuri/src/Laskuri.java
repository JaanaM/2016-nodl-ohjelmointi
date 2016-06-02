/**
 *
 * @author Saria
 */
public class Laskuri {
    private int arvo;
    private boolean tarkistus;
    
    public Laskuri(int alkuarvo, boolean tarkistus){
        this.arvo = alkuarvo;
        this.tarkistus = tarkistus;
    }
    public Laskuri(int alkuarvo){
        this(alkuarvo, false);
    }
    public Laskuri (boolean tarkistus){
        this(0, tarkistus);
    }
    public Laskuri () {
        this(0,false);
    }
    
    public int arvo() {
        return this.arvo;
    }
    public void lisaa() {
        this.lisaa(1);
    }
    public void lisaa(int lisays){
        if (lisays > 0) {
            this.arvo = this.arvo + lisays;   
        }
    }
    public void vahenna(){
        this.vahenna(1);
    }
    public void vahenna(int vahennys){
        if (vahennys > 0) {
            if (tarkistus) {
                this.arvo = this.arvo - vahennys;
                if (this.arvo < 0) {
                    this.arvo = 0;
                }
            }else{
                this.arvo = this.arvo - vahennys;
            }
        }
    }
    
}
