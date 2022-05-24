import java.lang.Math;
import java.util.Scanner;
public class Exercise3 {

    int radio;
    double result;
    public void Radio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("pon el valor del radio");
        radio= sc.nextInt();
        result=Math.PI*Math.pow(radio,2);
        System.out.println(" el area del circulo es " + result);
    }
}
