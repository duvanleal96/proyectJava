import java.util.logging.Logger;
import java.util.Scanner;
public class Exercise7 {
    Logger logger = Logger.getLogger("logger");
    Scanner sc = new Scanner(System.in);
    public void validarNumero(){
        logger.info(()->"Ingrese el numero ");
        int numero = sc.nextInt();
        do{

        }while(numero>=0);
    }
}
