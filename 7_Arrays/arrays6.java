import java.util.Scanner;

public class arrays {
    public static void main(String[] args){
        //Pedir por pantalla num celdas.
        System.out.println("Introduzca el número de celdas deseadas: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        int[] array = new int[number];
        int i = 0;
        for(int count = number; count >=1; count--){
            array[i] = i;
            i++;
        }
        //Imprimir el array usando bucle for. Añadir apoyo visual.
        for(int count2 = 0; count2 < number; count2++){
            System.out.println("---");
            System.out.println("|" + array[count2] + "|");

        }
        //Imprimir el array usando bucle while. Añadir apoyo visual.
        int j = 1;
        int count3 = 0;
        while(j > 0){
            System.out.println("---");
            System.out.println("|" + array[count3] + "|");
            count3++;
            if(count3 == number){
                j = 0;
            }
        }
    }
}