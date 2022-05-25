
import java.util.Scanner;
public class Exercise4 {

    private final int iva;

    public Exercise4() {
        this.iva = 21;
    }
    public void valorProducto(){
        Scanner sc= new Scanner(System.in);
        int precio;
        int result;
        System.out.println("digite el valor del producto");
        precio=sc.nextInt();
        result=precio*(iva/100);
        System.out.println("el precio del producto con iva es : " + result);
    }
}
