import java.util.logging.Logger;
import java.util.Scanner;
public class Exercise9 {
    Logger logger = Logger.getLogger("logger");
    Scanner sc = new Scanner(System.in);

    String frase= "La sonrisa sera la mejor arma contra la tristeza";
    public void frase(){
        String newFrase = frase.replace("a","e");
        logger.info(()->"la frase remplazada es -------- " + newFrase);
        logger.info(()->" inserte nueva frase ");
        String nueva = sc.nextLine();
        logger.info(()->" " + newFrase.concat(nueva));
    }
}
