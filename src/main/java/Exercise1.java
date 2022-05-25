/**
 * Representa la clase ejercicio1 donde se mostrara en pantalla el numero mayor y si son iguales
 */
import java.util.logging.Level;
import java.util.logging.Logger;
public class Exercise1 {
    /*
     * representa el primer valor
     */
    int number;
    /*
     * representa el segundo valor
     */
    int number1;

    /*
     * constructor ejercicio1 donde se inicializa las variables
     */
    public Exercise1() {
       number  = 30;
       number1 = 30;
    }

    /*
     * Representa el metodo calcular el valor, realiza una comparacion de los 2 numeros
     * e imprime en pantalla cual es el mayor . Dado el caso sean iguales , imprime los 2
     */
    public void calcularMayor()
    {
        Logger logger= Logger.getLogger("logger");
        /*
         * condicion1 , si el primer numero es mayor el segundo , imprime el primer valor
         */
        if(number1>number)
        {
            logger.info(()->"el numero mayor es " + number1);
        }
        /*
         *  condicion2 , si el segundo valor es mayor al primero , imprime el segundo valor
         */
        else if (number>number1)
        {
            logger.info(()->"el numero mayor es " + number);
        }
        /*
         * condicion3 si ninguna de las 2condiciones primeras se cumple , los 2 valores son iguales
         */
        else
        {
            logger.info(()->"los números " + number + " y " + number1 + " son iguales");
        }
    }
}
