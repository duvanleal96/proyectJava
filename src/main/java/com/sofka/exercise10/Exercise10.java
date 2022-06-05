package com.sofka.exercise10;

import java.util.Scanner;
import java.util.logging.Logger;
/**
 * Representa la clase ejercicio9
 * @author Duvan Leal
 * @version 1.0
 */
public class Exercise10 {
    Logger log = Logger.getLogger("log");
    Scanner sc = new Scanner(System.in);

    /**
     * Metodo eliminar espacios, pide una frase por consolo y verifica los espacios y los elimina
     */
    public void removeSpaces(){
        log.info("ingrese la frase");
        String mesagge = sc.nextLine();
        mesagge=mesagge.replace(" ","");
        log.info(mesagge);
    }
}