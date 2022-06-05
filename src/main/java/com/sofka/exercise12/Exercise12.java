package com.sofka.exercise12;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Representa la clase ejercicio12
 * @author Duvan Leal
 * @version 1.0
 */
public class Exercise12 {
    Scanner sc = new Scanner(System.in);
    Logger log = Logger.getLogger("log");

    /**
     * Metodo comparar palabra , captura las palabras por teclado y verifica si son iguales o no
     */
    public  void compare(){
        log.info("inserte la palabra sin espacios");
       String mesagge=sc.nextLine();
       log.info("inserte la segunda palabra sin espacios");
       String message2=sc.nextLine();
       if(mesagge.equals(message2)){
           log.log(Level.SEVERE, "Something went wrong: {0} ", "la palabra " + mesagge + " y la palabra " + message2 + " son iguales");
       }else
           log.log(Level.SEVERE, "Something went wrong: {0} ", "la palabra " + mesagge + " y la palabra " + message2 + " NO son iguales");
    }
}
