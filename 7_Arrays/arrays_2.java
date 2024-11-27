import java.util.Scanner;

public class arrays_2 {
    public static void main(String[] args){
        //Crear array. Pedir por pantalla el número de celdas y datos.
        System.out.println("Introduzca el número de celdas deseadas: ");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();
        String[] array1 = new String[number1];
        for(int count = 0; count < number1; count++){
            System.out.println("Introduzca un dato: ");
            Scanner input2 = new Scanner(System.in);
            array1[count] = input2.nextLine();
        }
        //Crear array. Pedir por pantalal el número de celdas y datos con for.
        System.out.println("Introduzca el número de celdas deseadas: ");
        Scanner input3 = new Scanner(System.in);
        int number2 = input3.nextInt();
        String[] array2 = new String[number2];
        for(int count = 0; count < number2; count++){
            System.out.println("Introduzca un dato: ");
            Scanner input4 = new Scanner(System.in);
            array2[count] = input4.nextLine();
        }
        //Crear array fusionando los dos arrays anteriores.
        int length = number1 +  number2;
        String[] array3 = new String[length];
        System.arraycopy(array1, 0, array3, 0, number1);
        System.arraycopy(array2, 0, array3, number1, number2);
        System.out.println("Los dos arrays fusionados: ");
        for(int count = 0; count < array3.length; count++){
            System.out.println(array3[count]);
        }
    }
}