import java.util.Scanner;
import java.lang.Math;

public class math1_1 {
    public static void main(String[] args){
        //Pedir radio por pantalla.
        System.out.println("Introduzca un radio: ");
        Scanner input = new Scanner(System.in);
        double radio = input.nextDouble();
        input.close();
        //Hacer cálculo.
        double pi = Math.PI;
        double area = Math.pow(radio*pi, 2);
        //Mostrar resultado.
        System.out.println("El area del círculo cuyo radio es " +  radio + ", es " + area);
    }
}