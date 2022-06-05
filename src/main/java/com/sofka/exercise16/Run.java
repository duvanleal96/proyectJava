package com.sofka.exercise16;

import java.util.Scanner;
import java.util.logging.Logger;

public class Run {

    static Scanner sc = new Scanner(System.in);
    static Logger log = Logger.getLogger("log");

    /**
     * Clase main , ejecuta el proyecto , pide parametros para calcular el imc y mostrar la informacion
     * @param args
     */

    public static void main(String[] args) {
        log.info("ingrese el nombre ");
        String nombre = sc.nextLine();
        log.info("ingrese la edad ");
        int edad = sc.nextInt();
        log.info("ingrese el sexo H/M");
        char sexo = sc.next().charAt(0);
        log.info("ingrese el peso ");
        int peso = sc.nextInt();
        log.info("ingrese la altura ");
        int altura = sc.nextInt();
        int dni = 0;

        Persona pedro = new Persona(nombre,edad,sexo,dni,peso,altura);
        Persona duvan = new Persona(nombre,edad,sexo);
        Persona lola = new Persona();
        lola.setNombre("esperanza");
        lola.setEdad(17);
        lola.setSexo('M');
        lola.setPeso(65);
        lola.setAltura(155);

        log.info(pedro.toString()+"\n"+ duvan.toString()+"\n"+ lola.toString());


    }

}
