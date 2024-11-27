import java.util.Scanner;

public class math2_1 {
    public static void main(String[] args){
        //Definir condición auxiliar para salir.
        boolean aux = true;
        //Bucle para imprimir la secuencia hasta que el valor sea "n".
        do{
            //Pedir cantidad de segundos por pantalla y calcular cuántos minutos (reales) son.
            System.out.println("Introduzca el valor de segundos: ");
            Scanner input = new Scanner(System.in);
            int secs = input.nextInt();
            int min = secs/60;
            //Imprimir los minutos en forma de partido (empezando con 1).
            System.out.println("El minuto es el " + (min+1));
            //Preguntar si seguir el bucle, cuando se teclee "n", se termina el código.
            System.out.println("¿Otro valor (s/n)?");
            Scanner input2 = new Scanner(System.in);
            String next = input2.nextLine();
            if(next.equalsIgnoreCase("n")){
                aux = false;
            }
        } while(aux == true);
    }
}