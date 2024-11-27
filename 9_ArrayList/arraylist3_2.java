package arraylist2;
import java.util.*;
import java.lang.Math;

public class arraylist2 {
    public static void main(String[] args){
        //Preguntar n por pantalla.
        Scanner input = new Scanner(System.in);
        System.out.print("¿Cúantos números quieres para la lista?: ");
        int n = input.nextInt();
        //Crear arraylist que almacena n números aleatorios positivos.
        ArrayList<Double> list = new ArrayList<Double>();
        for(int i = 0; i < n; i++){
            double random = Math.floor(Math.random() * (100-0)+0);
            list.add(random);
        }
        //Mostrar valores.
        System.out.println("Lista: "+ list);
        //Mostrar primer valor.
        System.out.println("Primer valor " + list.get(0));
        //Mostrar último valor.
        System.out.println("Último valor " + list.get(list.size()-1));
        //Pedir por pantalla si se desea almacenar algún valor, si es positivo, almacenar el valor introducido por teclado en el arraylist.
        boolean exception = true; //Parche bug.
        while(exception == true){
            System.out.println("¿Desea almacenar algún valor? (si = 1/no = 2)");
            int answer = input.nextInt();
            if(answer == 1){
                System.out.print("Introduzca el valor a añadir: ");
                Double number = input.nextDouble();
                list.add(number);
                System.out.println(list);
                exception = false;
            } else if(answer == 2) {
                exception = false;
            } else {
                System.out.println("Respuesta no válida.");
            }
        }
        input.close();
    }
}
