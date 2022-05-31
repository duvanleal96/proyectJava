package com.sofka.exercise3;

import java.util.Scanner;
import java.util.logging.Logger;
public class Exercise3 {
    Logger logger = Logger.getLogger("logger");
    int radio;
    double result;
    public void radio(){
        Scanner sc = new Scanner(System.in);
        logger.info("pon el valor del radio");
        radio= sc.nextInt();
        result=Math.PI*Math.pow(radio,2);
        logger.info(()->" el area del circulo es " + result);
    }
}
