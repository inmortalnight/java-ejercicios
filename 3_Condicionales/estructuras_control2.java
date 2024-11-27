import java.util.Scanner;

public class estructuras_control2 {
    public static void main(String[] args) {
        //Pedir número y guardar.
        System.out.println("Introduzca un número: ");
        Scanner number = new Scanner(System.in);
        int number1 = number.nextInt();

        //Ver si es par o impar, mostrar resultado
        if (number1%2 == 0) {
            System.out.println("El número es par");
        }
        else {
            System.out.println("El número es impar");
        }
        
        number.close();
    }
}
