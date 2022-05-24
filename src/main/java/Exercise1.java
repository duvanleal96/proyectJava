

public class Exercise1 {

    int number;
    int number1;
    public Exercise1() {
       number  = 30;
       number1 = 30;
    }

    public void calcularMayor()
    {
        if(number1>number){
            System.out.println("el numero mayor es " + number1);
        }else if (number>number1){
            System.out.println("el numero mayor es " + number);
        }else {
            System.out.println("los números " + number + " y " + number1 + " son iguales");
        }
    }
}
