/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saria
 */
public class Main {

    public static void main(String[] args) {
        Rengastustoimisto kumpulanRengas = new Rengastustoimisto();

        kumpulanRengas.havaitse(new Lintu("punakottarainen", "Sturnus roseus", 2012), "Arabia");
        kumpulanRengas.havaitse(new Lintu("rusokottarainen", "Sturnus roseus", 2012), "Vallila");
        kumpulanRengas.havaitse(new Lintu("harmaalokki", "Larus argentatus", 2008), "Kumpulanmäki");
        kumpulanRengas.havaitse(new Lintu("punakottarainen", "Sturnus roseus", 2008), "Mannerheimintie");

        kumpulanRengas.havainnot(new Lintu("rusokottarainen", "Sturnus roseus", 2012));
        System.out.println("--");
        kumpulanRengas.havainnot(new Lintu("harmaalokki", "Larus argentatus", 2008));
        System.out.println("--");
        kumpulanRengas.havainnot(new Lintu("harmaalokki", "Larus argentatus", 1980));
    }
}
