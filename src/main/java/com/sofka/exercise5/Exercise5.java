package com.sofka.exercise5;


import java.util.logging.Logger;
/**
 * Representa la clase ejercicio4
 * @author Duvan Leal
 * @version 1.0
 */

public class Exercise5
{
    Logger logger = Logger.getLogger("logger");
   public boolean impar(int numero){
       return numero % 2 != 0;
    }

    /**
     * metodo calcular impar , muestra los numero impares del 1 al 100 se implementa usando el ciclo while
     */
    public void calculateImpar(){
       int contador=0;
       int incremento=1;
       while(contador != 50){
           if (impar(incremento)){
               int incrementoFinal=incremento;
               logger.info(()->" impares --->" + incrementoFinal);
               contador++;
           }
           incremento++;
       }
    }
}
