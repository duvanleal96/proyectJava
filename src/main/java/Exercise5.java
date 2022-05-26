
import java.util.logging.Logger;
public class Exercise5
{
    Logger logger = Logger.getLogger("logger");
   public boolean impar(int numero){
       return numero % 2 != 0;
    }
    public void calculateImpar(){
       int contador=0;
       int incremento=1;
       while(contador != 50){
           if (impar(incremento)){
               int incrementoFinal=incremento;
               logger.info(()->" impares --->" + incrementoFinal);
               contador++;
           }
           incremento++;
       }
    }
}
