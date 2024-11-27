import java.util.Scanner;

public class estructuras_control1 {
    public static void main(String[] args) {
        //Pedir dos números por pantalla y guardarlos.
        System.out.println("Introduce un número:");
        Scanner number_1 = new Scanner(System.in);
        int number1 = number_1.nextInt();
        System.out.println("Introduce otro número:");
        Scanner number_2 = new Scanner(System.in);
        int number2 = number_2.nextInt();
        
        //Comparar y mostrar por pantalla
        if(number1 > number2) {
            System.out.println("El número " + number1 + " es mayor que el número " + number2);
        } 
        else {
            System.out.println("El número " + number2 + " es mayor que el número " + number1);
        }
        number_1.close();
        number_2.close();
    } 
}