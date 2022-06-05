package com.sofka.exercise7;


import java.util.logging.Logger;
import java.util.Scanner;
/**
 * Representa la clase ejercicio7
 * @author Duvan Leal
 * @version 1.0
 */
public class Exercise7 {
    Logger logger = Logger.getLogger("logger");
    Scanner sc = new Scanner(System.in);

    /**
     * Metodo validar numero , se pide el numero y si es menor a 0 el sistema vuelve a pedirlo hasta que sea
     * mayor a 0
     */
    public void validarNumero() {
        int numero;
        do {
            logger.info(() -> "Ingrese el numero ");
            numero = sc.nextInt();
        } while (numero < 0);
        int number=numero;
        logger.info(()->" el numero es " + number);
    }
}
