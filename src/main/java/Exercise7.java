import java.util.logging.Logger;
import java.util.Scanner;

public class Exercise7 {
    Logger logger = Logger.getLogger("logger");
    Scanner sc = new Scanner(System.in);

    public void validarNumero() {
        int numero;
        do {
            logger.info(() -> "Ingrese el numero ");
            numero = sc.nextInt();
        } while (numero < 0);
        int number=numero;
        logger.info(()->" el numero es " + number);
    }
}
