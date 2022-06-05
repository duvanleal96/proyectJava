package com.sofka.Exercise11;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise11 {
    public void readPhrase(){
        Scanner sc = new Scanner(System.in);
        Logger log = Logger.getLogger("log");
        log.info("inserte la frase por favor");
        sc.nextLine();

    }
}
