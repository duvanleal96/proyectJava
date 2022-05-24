/**
 * representa el importe de la clase scanner, permite capturar por teclado el dato
 */

import java.util.Scanner;

/**
 * Representa la clase ejercicio2 consiste en capturar por teclado 2 valores y decir cual es el mayor o si
 * son iguales
 */
public class Exercise2 {
    /**
     * representa el primer valor
     */
    int value1;
    /**
     * representa el segundo valor
     */
    int value2;

    /**
     * Representa el metodo definir numero, realiza una comparacion de los 2 numeros
     * e imprime en pantalla cual es el mayor . Dado el caso sean iguales , imprime los 2
     */
    public void definirNumero(){
    Scanner sc = new Scanner(System.in);
        /**
         * representa pedir al usuario el primer valor por teclado
         */
        System.out.println("ingrese el primer numero");
        value1=sc.nextInt();
        /**
         * representa pedir al usuario el segundo valor por teclado
         */
        System.out.println("ingrese el segundo numero");
        value2=sc.nextInt();
        /**
         * condicion1 , si el primer numero es mayor el segundo , imprime el primer valor
         */
        if (value1>value2)
        {
            System.out.println("el numero mayor es " + value1);
        }
        /**
         * condicion2 , si el primer numero es menor al segundo numero , imprime el segundo valor
         */
        else if (value1<value2)
        {
            System.out.println("el numero mayor es " + value2);
        }
        /**
         * condicion3 , si la condicion 1 y 2 no son ciertas , ambos valores son iguales
         */
        else
        {
            System.out.println("los numeros " + value2 +" y " + value2 + " son iguales");
        }
    }
}
