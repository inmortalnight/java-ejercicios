import java.util.*;

public class arrayList2 {
    public static void main(String[] args){
        //Crear arrayList int y Scanner
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        //Pedir por pantalla 5 números
        for(int i = 0; i < 5; i++){
            System.out.println("Introduzca un número: ");
            int number = input.nextInt();
            numeros.add(number);
        }
        //Preguntar si imprimir datos o no
        System.out.println("¿Quieres imprimir los números introducidos? (s = 1/n = 0)");
        int answer = input.nextInt();
        if(answer == 1){
            System.out.println(numeros);
        }
        input.close();
    }
}