/*Este ejercicio se hizo anteriormente*/

package arraylist1;
import java.util.*;

public class arraylist2 {
    public static void main(String[] args){
        //Definir arrayList, crear Scanner y definir condición de salida.
        ArrayList<String> animales = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        boolean salir = false;
        //Bucle para introducir valores hasta obtener "salir"
        System.out.println("Necesita introducir 'salir' para terminar a continuación.");
        while(salir == false){
            System.out.println("Introduzca un nombre de animal: ");
            String value = input.nextLine();
            if(value.equals("salir")){
                salir = true;
            } else {
                animales.add(value);
            }
        }
        input.close();
        //Mostrar valores y cantidad total
        System.out.println(animales);
        System.out.println("Cantidad de valores: " + animales.size());
    }
}