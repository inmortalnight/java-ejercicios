import java.util.Scanner;
import java.lang.Math;

public class matrices1 {
    public static void main(String[] args){
        //Pedir cant. columnas por pantalla.
        System.out.println("Ingresa el número de columnas que quiere:");
        Scanner input = new Scanner(System.in);
        int column = input.nextInt();
        //Crear matriz según los datos (filas 5, columnas por pantalla)
        int matriz[][] = new int[5][column];
        //Rellenar matriz con números aleatorios del 0 al 10.
        int numAleatorio;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < column; j++){
                numAleatorio =(int)Math.floor(Math.random()*(10-0+1)+0);
                matriz [i][j] = numAleatorio;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}