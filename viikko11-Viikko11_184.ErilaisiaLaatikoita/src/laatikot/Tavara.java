package laatikot;

public class Tavara {

    private String nimi;
    private int paino;

    public Tavara(String nimi, int paino) {
        if (paino < 0) {
            throw new IllegalArgumentException();
        }
        this.nimi = nimi;
        this.paino = paino;

    }

    public Tavara(String nimi) {
        this(nimi, 0);
    }

    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
