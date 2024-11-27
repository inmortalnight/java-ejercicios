package arraylist2;
import java.util.*;

public class arraylist1 {
    public static void main(String[] args){
        //Crear arraylist tipo integer e iniciar scanner.
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        //Pedir por teclado números hasta introducir -99, el cual no se guarda en el arraylist.
        boolean out = false;
        while(out == false){
            System.out.println("Introduzca números hasta introducir (-99):");
            int subject = input.nextInt();
            if(subject == -99){
                out = true;
            } else {
                list.add(subject);
            }
        }
        //Mostrar valores, suma, media.
        System.out.println("Cantidad de números en la lista: " + list.size());
        int total = 0;
        for(int i:list){
            total = total + i;
        }
        System.out.println("La suma de los números de la lista es " + total);
        int mean = total/list.size();
        System.out.println("La media de los números de la lista es " + mean);
        //Mostrar valores, cantidad de números mayor que la media.
        System.out.println("Lista de números: " + list);
        int biggernum = 0;
        for(int i:list){
            if(i>mean){
                biggernum++;
            }
        }
        System.out.println("Cantidad de números mayores que la media: " + biggernum);
        input.close();
    }
}
