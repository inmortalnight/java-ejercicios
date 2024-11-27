//NOTA: calcular el factorial de 15 no es posible por la limitada capacidad de int permitido en el ordenador.
import java.util.Scanner;

public class bucles3 {
    public static void main(String[] args) {
        //Introducir el número a calcular el factorial.
        System.out.println("Introduce un número, por ejemplo, el 4 o 15: ");
        Scanner number1 = new Scanner(System.in);
        int number = number1.nextInt(); 
        int initial_number = number;
        int factorial = 1;
        //Caso especial, parche.
        if(initial_number > 13){
            System.out.println("Advertencia: los números mayores a 13 no se pueden calcular.");
        }
        //Cálculo del factorial(el número se multiplica por sí mismo y el n-1 de sí mismo sucesivamente hasta llegar a n==0)
        for(int count = 0; count < initial_number; count++) {
            factorial = factorial * number;
            if(number > 1){
                number = number - 1;
            }
        }
        System.out.println("El factorial de " + initial_number + " es " + factorial);
    }
}
