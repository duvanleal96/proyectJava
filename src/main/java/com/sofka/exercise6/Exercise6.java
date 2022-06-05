package com.sofka.exercise6;

import java.util.logging.Logger;
/**
 * Representa la clase ejercicio6
 * @author Duvan Leal
 * @version 1.0
 */

public class Exercise6 {
    Logger logger = Logger.getLogger("logger");
    /**
     * metodo calcular impar , muestra los numero impares del 1 al 100 se implementa usando el ciclo for
     */
    public void hallarImpar(){
        for (int i=0;i<=100;i++){
            if (i%2!=0){
                int numero=i;
                logger.info(()->"impares -> "+numero);
            }
        }
    }
}
