package com.sofka.exercise17;

import java.lang.reflect.Array;
import java.util.logging.Logger;


public class Run {

    static double priceTotalTv;
    static double priceWashingMachine;
    static double priceElectronic;
    public static void main(String[] args) {
        Logger log = Logger.getLogger("log");
        Appliance[] electronic = new Appliance[10];
        electronic[0] = new Tv(30, true, 150, "negro", 'C', 20);
        electronic[1] = new Tv(41, true, 100, "negro", 'C', 20);
        electronic[2] = new Tv(40, false, 120, "azul", 'E', 20);
        electronic[3] = new Tv(29, true, 300, "amarillo", 'P', 20);
        electronic[4] = new Tv(35, false, 250, "rojo", 'A', 25);
        electronic[5] = new WashingMachine(40, 125, "blanco", 'E', 80);
        electronic[6] = new WashingMachine(40, 200, "negro", 'D', 35);
        electronic[7] = new WashingMachine(18, 205, "negro", 'A', 35);
        electronic[8] = new WashingMachine(50, 200, "azul", 'D', 50);
        electronic[9] = new WashingMachine(40, 200, "negro", 'D', 80);


        String messageTv = "precio Tv \n";
        String messageW = "precio lavadora \n";
        for (int i = 0; i < electronic.length; i++) {
            double price = 0;

            if (electronic[i] instanceof Tv) {
                price = electronic[i].priceFinal();
                priceTotalTv += price;
                messageTv += "Tv " + i + " " + price +" \n";

            } else if (electronic[i] instanceof WashingMachine) {
                price = electronic[i].priceFinal();
                priceWashingMachine += price;
                messageW += "lavadora " + i + " " + price + "\n";

            }
        }
        log.info(messageTv);
        log.info(messageW);
        priceElectronic = priceTotalTv + priceWashingMachine;
        log.info(" Precio total electrodomesticos " + priceElectronic);


    }
}
