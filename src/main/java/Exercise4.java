
import java.util.Scanner;
import java.util.logging.Logger;
public class Exercise4 {

    private final int iva;

    public Exercise4() {
        this.iva = 21;
    }
    public void valorProducto(){
        Logger logger = Logger.getLogger("looger");
        Scanner sc= new Scanner(System.in);
        int precio;
        int result;
        logger.info(()->"digite el valor del producto");
        precio=sc.nextInt();
        result=precio*(iva/100);
        logger.info(()->"el precio del producto con iva es : " + result);
    }
}
