import java.util.Scanner;
import java.lang.Math;

public class math1_2 {
    public static void main(String[] args) {
        //Pedir cantidad de numeros aleatorios.
        System.out.println("Número de aleatorios:");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        input.close();
        //Imprimir un número random hasta acabar la cantidad de veces deseadas.
        while(count > 0) {
            System.out.println(Math.random());
            count--;
        }
    }
}