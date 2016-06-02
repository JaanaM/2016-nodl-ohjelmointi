/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saria
 */
public class StringUtils {

    public static boolean sisaltaa(String sana, String haettava) {
        sana = sana.trim().toUpperCase();
        haettava = haettava.trim().toUpperCase();
        if (sana.contains(haettava)) {
            return true;
        } else {
            return false;
        }
    }
}
