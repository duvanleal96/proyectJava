package com.sofka.exercise9;

import java.util.logging.Logger;
import java.util.Scanner;
/**
 * Representa la clase ejercicio9
 * @author Duvan Leal
 * @version 1.0
 */
public class Exercise9 {
    Logger logger = Logger.getLogger("logger");
    Scanner sc = new Scanner(System.in);

    String frase= "La sonrisa sera la mejor arma contra la tristeza";

    /**
     * Metodo frase , de una frase permite remplazar la letra a por la e y concatenar con la nueva frase que
     * ingrese el usuario
     */
    public void frase(){
        String newFrase = frase.replace("a","e");
        logger.info(()->"la frase remplazada es -------- " + newFrase);
        logger.info(()->" inserte nueva frase ");
        String nueva = sc.nextLine();
        logger.info(()->" " + newFrase.concat(nueva));
    }
}
