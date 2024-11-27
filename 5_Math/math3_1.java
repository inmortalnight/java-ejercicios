import java.util.Scanner;
import java.lang.Math;

public class math1 { 
    public static void main(String[] args) {
        //Conseguir radio por pantalla.
        System.out.println("Introduzca el radio de su esfera: ");
        Scanner input = new Scanner(System.in);
        Double radio = input.nextDouble();
        input.close();
        //Calcular el volumen usando la fórmula v = (4/3)*PI*r^3 e imprimir.
        Double step = Math.pow(radio, 3.0);
        Double pi = Math.PI;
        Double volume = (4/3)*pi*step;
        System.out.println("El volumen de la esfera dado el radio " + radio + " es " + volume);
    }
}