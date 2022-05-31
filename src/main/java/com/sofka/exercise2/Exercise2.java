package com.sofka.exercise2;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 * Representa la clase ejercicio2 consiste en capturar por teclado 2 valores y decir cual es el mayor o si
 * son iguales
 * @author Duvan Leal
 * @version 1.0
 */
public class Exercise2 {
    /**
     * representa el primer valor
     */
    int value1;
    /**
     * representa el segundo valor
     */
    int value2;

    /**
     * Representa el metodo definir numero, realiza una comparacion de los 2 numeros
     * e imprime en pantalla cual es el mayor . Dado el caso sean iguales , imprime los 2
     */
    public void definirNumero(){
        Logger logger = Logger.getLogger("logger");
        Scanner sc = new Scanner(System.in);
        logger.log(Level.INFO,"ingrese el primer numero");
        value1=sc.nextInt();
        logger.log(Level.INFO,"ingrese el segundo numero");
        value2=sc.nextInt();

        if (value1>value2)
        {
            logger.info(()->"el numero mayor es " + value1);
        }

        else if (value1<value2)
        {
            logger.info(()->"el numero mayor es " + value2);
        }
        else
        {
            logger.info(()->"los numeros " + value2 +" y " + value2 + " son iguales");
        }
    }
}
