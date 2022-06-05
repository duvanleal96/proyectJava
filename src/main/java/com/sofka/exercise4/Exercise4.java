package com.sofka.exercise4;

import java.util.Scanner;
import java.util.logging.Logger;
/**
 * Representa la clase ejercicio4
 * @author Duvan Leal
 * @version 1.0
 */
public class Exercise4 {

    private final int iva;
    public Exercise4() {
        this.iva = 21;
    }

    /**
     * Metodo calcular valor producto , pide por consola el valor del producto al cliente
     * y muestra el costo total del producto con el agregado del 21% dek IVA
     */
    public void valorProducto(){
        Logger logger = Logger.getLogger("looger");
        Scanner sc= new Scanner(System.in);
        int precio;
        int result;
        logger.info(()->"digite el valor del producto");
        precio=sc.nextInt();
        result=precio*(iva/100);
        logger.info(()->"el precio del producto con iva es : " + result);
    }
}
