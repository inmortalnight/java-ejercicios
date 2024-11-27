import java.util.ArrayList;
import java.util.Arrays;

public class arrayList3 {
    public static void main(String[] args){
        //Definir arrayList con los datos
        ArrayList<String> nombres = new ArrayList<String>(Arrays.asList("Sofía", "Chema", "Alex", "Rosa"));
        //Mostrar tamaño del arrayList
        System.out.println("Tamaño del arrayList: " + nombres.size());
        //Comprobar si hay "Juan" en el arrayList
        if(nombres.contains("Juan") == true){
            System.out.println("Hay 'Juan' dentro del arrayList");
        } else {
            System.out.println("No hay 'Juan' dentro del arrayList");
        }
        //Borrar último elemento del arrayList
        nombres.remove(nombres.size() - 1);
        System.out.println("Después de borrar el último: " + nombres);
    }
}