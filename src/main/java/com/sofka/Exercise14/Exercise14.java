package com.sofka.Exercise14;

import java.util.Scanner;
import java.util.logging.Logger;
/**
 * Representa la clase ejercicio12
 * @author Duvan Leal
 * @version 1.0
 */
public class Exercise14 {
    Scanner sc = new Scanner(System.in);
    Logger log = Logger.getLogger("log");
    int numero;

    /**
     * Metodo calcular numero,
     * imprime por pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
     */
    public void calcularNumero(){
        log.info("ingrese el numero");
        numero = sc.nextInt();
        for (int i = 0; i <=1000 ; i+=2) {
            numero=i;
            log.info("la serie par "+numero);
        }

    }
}
