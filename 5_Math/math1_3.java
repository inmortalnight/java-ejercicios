import java.util.Scanner;
import java.lang.Math;

public class math1_3{
    public static void main(String[] args) {
        //Pedir dos números por pantalla.
        System.out.println("Introduce un número:");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        System.out.println("Introduce otro número:");
        Scanner input2 = new Scanner(System.in);
        double num2 = input2.nextDouble();
        input.close();
        input2.close();
        //Generar números aleatorios entre los dos números.
        int numAleatorio = (int)Math.floor(Math.random()*(num2-num1+1)+num1);
        System.out.println(numAleatorio);
    }
}