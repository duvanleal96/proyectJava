package com.sofka.exercise11;

import java.util.Scanner;
import java.util.logging.Logger;
/**
 * Representa la clase ejercicio11
 * @author Duvan Leal
 * @version 1.0
 */
public class Exercise11 {

    /**
     * Metodo leer frase ,
     */
    public void readPhrase() {
        Scanner sc = new Scanner(System.in);
        Logger log = Logger.getLogger("log");
        log.info("inserte la frase por favor");
        String mesagge = sc.nextLine();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        char cont;
        for (int j = 0; j < mesagge.length(); j++) {
            cont = mesagge.charAt(j);
            if (cont == 'a') {
                a++;
            }
            if (cont == 'e') {
                e++;
            }
            if (cont == 'i') {
                i++;
            }
            if (cont == 'o') {
                o++;
            }
            if (cont == 'u') {
                u++;
            }
        }
        log.info("de la frase hay una longitud de " + mesagge.length() + " ademas tiene \n" + a + " letras a \n" +
                e + " letras e \n " + i + " letras i \n " + o + " letras o \n " + u + " letras u ");
    }
}
