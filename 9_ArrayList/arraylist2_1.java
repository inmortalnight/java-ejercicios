package arraylist1;
import java.util.*;

public class arraylist1 {
    public static void main(String[] args){
        //Crear arrayList con 5 valores interger
        ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(2,3,8,4,9));
        //Calcular media
        Integer total = 0;
        for(int i:values){
            total = total + i;
        }
        int media = total/values.size();
        //Imprimir valores y media
        System.out.println("Con los valores: " + values + " existe una media de " + media + ".");
    }
}