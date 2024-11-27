import java.util.Scanner;
import java.lang.Math;

public class math2 {
    public static void main(String[] args) {
        //Conseguir lados del triángulo.
        System.out.println("Introduzca los lados de su triángulo: ");
        System.out.println("Lado 1: ");
        Scanner input = new Scanner(System.in);
        Double a = input.nextDouble();
        System.out.println("Lado 1: ");
        Scanner input2 = new Scanner(System.in);
        Double b = input2.nextDouble();
        System.out.println("Lado 1: ");
        Scanner input3 = new Scanner(System.in);
        Double c = input3.nextDouble();
        //Calcular Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c)) y perímetro p =  (a+b+c)/2 e imprimir.
        Double perimeter = (a+b+c)/2;
        Double area = Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
        System.out.println("El área de su triangulo es " + area);
        input.close();
        input2.close();
        input3.close();
    }
}