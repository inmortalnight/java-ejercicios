package arraylist2;
import java.util.*;

public class arraylist4 {
    public static void main(String[] args){
        //Iniciar scanner, crear array & arraylist de números y añadir números.
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuántos números desea introducir?");
        int size = input.nextInt();
        int[] list1 = new int[size];
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < size; i++){ 
            System.out.print("Introduzca su número: ");
            int number = input.nextInt(); 
            list1[i] = number; //array
            list2.add(number); //arraylist
        }
        System.out.print("Lista array: ");
        for(int i:list1){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Lista arraylist: " + list2);
        //Calcular suma.
        int total1 = 0; 
        int total2 = 0;
        for(int i:list1){ //array
            total1 = total1 + i;
        }
        for(int i:list2){ //arraylist
            total2 = total2 + i;
        }
        System.out.println("La suma de los números de la lista es " + total1 + " usando arraylist.");
        System.out.println("La suma de los números de la lista es " + total2 + " usando arraylist.");
        //Encontrar max. valor.
        int max1 = 0;
        int max2 = 0;
        for(int i:list1){ //array
            if(i>max1){
                max1 = i;
            }
        }
        for(int i:list2){ //arraylist
            if(i>max2){
                max2 = i;
            }
        }
        System.out.println("El mayor número de la lista es " + max1 + " usando array.");
        System.out.println("El mayor número de la lista es " + max2 + " usando arraylist.");
        input.close();
    }
}
