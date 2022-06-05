package com.sofka.exercise8;

import java.util.logging.Logger;
import java.util.Scanner;
/**
 * Representa la clase ejercicio7
 * @author Duvan Leal
 * @version 1.0
 */

public class Exersice8 {
    Logger logger = Logger.getLogger("logger");
    Scanner sc = new Scanner(System.in);

    /**
     * Metodo calcular dia , pide por pantalla el dia a consultar , e imprime si ese dia es laboral o no
     */
    public void consultDay(){
        logger.info(()->"ingrese el dia a consultar \n 1. lunes \n 2. martes \n 3. miercoles" +
                "\n 4. jueves \n 5. viernes \n 6. sabado \n 7. domingo");
        String dia = sc.nextLine();
        switch (dia){
            case ("lunes"):
                logger.info(()-> "el dia lunes se trabaja");
                break;
            case "martes":
                logger.info(()-> "el dia martes se trabaja");
                break;
            case "miercoles":
                logger.info(()-> "el dia miercoles se trabaja");
                break;
            case "jueves":
                logger.info(()-> "el dia jueves se trabaja");
                break;
            case "viernes":
                logger.info(()-> "el dia viernes se trabaja");
                break;
            case "sabado":
                logger.info(()-> "el dia sabado no se trabaja");
                break;
            case "domingo":
                logger.info(()-> "el dia domingo no se trabaja");
                break;
            default:
                logger.info(()-> "caracter no valido , intente nuevamente");
        }
    }
}
