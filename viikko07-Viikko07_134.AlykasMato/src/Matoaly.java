
import matopeli.Matopeli;

public class Matoaly {

    public String annaSiirto(Matopeli matopeli) {
        // vaihtoehtoja ovat: YLOS, ALAS, VASEN, OIKEA
        int[][] pelialue = matopeli.annaAlusta();

        // voit käyttää allaolevaa tulostusta pelialueen tulostamiseen konsoliin
        for (int y = pelialue[0].length - 1; y >= 0; y--) {
            for (int x = 0; x < pelialue.length; x++) {
                if (pelialue[x][y] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(pelialue[x][y]);
            }

            System.out.println("");
        }
        System.out.println("");

        String siirto = laskeSiirto(pelialue, matopeli.matoX(), matopeli.matoY(), matopeli.omenaX(), matopeli.omenaY());
        return siirto;
    }

    private String laskeSiirto(int[][] pelialue, int matoX, int matoY, int omenaX, int omenaY) {
        int sivulla = omenaX - matoX;
        int ylhaalla = omenaY - matoY;
        String siirto = "";
        int laskuri = 0;
        while (true) {
            if (ylhaalla > 0) {
                if (siirtoMahdollinen(matoX, matoY, pelialue, "ylos")) {
                    siirto = "YLOS";
                } else if (sivulla > 0 && siirtoMahdollinen(matoX, matoY, pelialue, "oikea")) {
                    siirto = "OIKEA";
                } else if (sivulla < 0 && siirtoMahdollinen(matoX, matoY, pelialue, "vasen")) {
                    siirto = "VASEN";
                }
            } else if (ylhaalla < 0) {
                if (siirtoMahdollinen(matoX, matoY, pelialue, "alas")) {
                    siirto = "ALAS";
                } else if (sivulla > 0 && siirtoMahdollinen(matoX, matoY, pelialue, "oikea")) {
                    siirto = "OIKEA";
                } else if (sivulla < 0 && siirtoMahdollinen(matoX, matoY, pelialue, "vasen")) {
                    siirto = "VASEN";
                }
            } else if (sivulla > 0) {
                if (siirtoMahdollinen(matoX, matoY, pelialue, "oikea")) {
                    siirto = "OIKEA";
                } else if (ylhaalla > 0 && siirtoMahdollinen(matoX, matoY, pelialue, "ylos")) {
                    siirto = "YLOS";
                } else if (ylhaalla < 0 && siirtoMahdollinen(matoX, matoY, pelialue, "alas")) {
                    siirto = "ALAS";
                }
            } else if (sivulla < 0) {
                if (siirtoMahdollinen(matoX, matoY, pelialue, "vasen")) {
                    siirto = "VASEN";
                } else if (ylhaalla > 0 && siirtoMahdollinen(matoX, matoY, pelialue, "ylos")) {
                    siirto = "YLOS";
                } else if (ylhaalla < 0 && siirtoMahdollinen(matoX, matoY, pelialue, "alas")) {
                    siirto = "ALAS";
                }
            }
            laskuri++;
            if (!siirto.isEmpty()) {
                return siirto;
            } else if (laskuri > 3) {
                break;
            }
        }
        return "ALAS";
    }

    private boolean siirtoMahdollinen(int matoX, int matoY, int[][] pelialue, String siirto) {
        int uusiX = matoX;
        int uusiY = matoY;
        if (siirto.equalsIgnoreCase("ylos")) {
            uusiY = matoY + 1;
        }
        if (siirto.equalsIgnoreCase("alas")) {
            uusiY = matoY - 1;
        }
        if (siirto.equalsIgnoreCase("oikea")) {
            uusiX = matoX + 1;
        }
        if (siirto.equalsIgnoreCase("vasen")) {
            uusiX = matoX - 1;
        }
        int tilanne = pelialue[uusiX][uusiY];
        if (tilanne == 0 || tilanne == 8) {
            return true;
        } else {
            return false;
        }
    }
}
