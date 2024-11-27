import java.lang.Math;
import java.util.Scanner;

public class math1_4 {
    public static void main(String[] args){
        //Pedir a,b,c por pantalla.
        System.out.println("Dado la siguiente ecuación de segundo grado ax^2+bx+c, indica a, b y c:");
        Scanner input1 = new Scanner(System.in);
        double a = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        double b = input2.nextDouble();
        Scanner input3 = new Scanner(System.in);
        double c = input3.nextDouble();
        input1.close();
        input2.close();
        input3.close();
        //Calcular.
        double part1 = Math.pow(b,2)-(4*a*c);
        double part2 = Math.sqrt(part1);
        double part3 = 2*a;
        //Calcular e imprimir resultado.
        if(part2 > -1) {
            double an1 = (-b + part2)/part3;
            double an2 = (-b - part2)/part3;
            if(an1 == an2){
                System.out.println("x = " + an1);
            } else{
                System.out.println("x = " + an1 + " y x =" + an2);
            }
        } else{ //Condicion especial, raiz negativa.
            System.out.println("x = (-"+ b + " + (" + part1 + "^1/2)) /" + part3);
            System.out.println("x = (-"+ b + " - (" + part1 + "^1/2)) /" + part3);
        }
        //Mostrar resultado.
    }
}