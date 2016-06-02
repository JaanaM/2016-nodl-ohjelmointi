public class Kasvatuslaitos {
    private int punnitus;
    
    public Kasvatuslaitos () {
        this.punnitus = 0;
    }

    public int punnitse(Henkilo henkilo) {
        // lisätään punnituksia
        this.punnitus++;
        int paino = henkilo.getPaino();
        // palautetaan parametrina annetun henkilön paino
        return paino;
    }
    public void syota (Henkilo henkilo){
        int paino = henkilo.getPaino();
        henkilo.setPaino(paino + 1);
    }
    public int punnitukset(){
        return this.punnitus;
    }

}
