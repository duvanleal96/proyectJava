package com.sofka.exercise1;

import java.util.logging.Logger;
/**
 * Representa la clase ejercicio1
 * @author Duvan Leal
 * @version 1.0
 */
public class Exercise1 {
    Logger logger = Logger.getLogger("logger");
    int number;
    int number1;

    /**
     * constructor ejercicio1 donde se inicializa las variables
     */
    public Exercise1() {
        this.number = 30;
        this.number1 = 30;
    }

    /**
     * Representa el metodo calcular el valor, realiza una comparacion de los 2 numeros
     * e imprime en pantalla cual es el mayor . Dado el caso sean iguales , imprime los 2
     */
    public void calculateHigher() {

        if (number1 > number) {
            logger.info(() -> "el numero mayor es " + number1);
        } else if (number > number1) {
            logger.info(() -> "el numero mayor es " + number);
        } else {
            logger.info(() -> "los números " + number + " y " + number1 + " son iguales");
        }
    }


}
