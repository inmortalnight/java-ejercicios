import java.util.Scanner;

public class bucles4 {
    public static void main(String[] args) {
        int number = 1;
        do{
            //Pedir número
            System.out.println("Introduce un número: ");
            Scanner number1 = new Scanner(System.in);
            number = number1.nextInt();
            
            //Identificar y decir los dígitos. Restringir a los números mayores que 999.
            if(0 < number && number < 10) {
                System.out.println("El número tiene 1 dígito.");
            } else if(10 < number && number < 100 ) {
                System.out.println("El número tiene 2 dígitos.");
            } else if(100 < number && number < 1000) {
                System.out.println("El número tiene 3 dígitos.");
            } else {
                System.out.println("Número no válido");
            }
        } while(number != 0);
    }
}
