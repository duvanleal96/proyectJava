import java.util.logging.Logger;
public class Exercise6 {
    Logger logger = Logger.getLogger("logger");
    public void hallarImpar(){
        for (int i=0;i<=100;i++){
            if (i%2!=0){
                int numero=i;
                logger.info(()->"impares -> "+numero);
            }
        }
    }
}
