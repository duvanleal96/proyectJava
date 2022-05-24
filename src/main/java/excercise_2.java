

import java.util.Scanner;
public class excercise_2 {
    int value1;
    int value2;

    public void definirNumero(){
    Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        value1=sc.nextInt();
        System.out.println("ingrese el segundo numero");
        value2=sc.nextInt();
        if (value1>value2)
        {
            System.out.println("el numero mayor es " + value1);
        } else if (value1<value2) {
            System.out.println("el numero mayor es " + value2);
        }else {
            System.out.println("los numeros " + value2 +" y " + value2 + " son iguales");
        }
    }
}
